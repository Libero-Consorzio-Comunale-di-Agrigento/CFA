// **********************************************
// Estrazione Proposte
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrazioneProposte extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_PERIODORIAC1 = 0;
  private static int PFL_PARS_ES = 1;
  private static int PFL_PARS_ANCIMPSUSEPR = 2;
  private static int PFL_PARS_ESERCIZIORIF = 3;
  private static int PFL_PARS_UO = 4;
  private static int PFL_PARS_PERIODORIAC2 = 5;
  private static int PFL_PARS_TIPODISP = 6;

  private static int PPQRY_PARS80 = 0;

  private static int PPQRY_PERIODRIACCE = 1;

  private static int PPQRY_DUAL2 = 2;


  IDPanel PAN_PARS;
  private static int GRP_ELENCOIMPSUB_BENEFICIARIO = 0;

  private static int PFL_ELENCOIMPSUB_NUMEROIMP = 0;
  private static int PFL_ELENCOIMPSUB_ANNOIMP = 1;
  private static int PFL_ELENCOIMPSUB_NUMEROSUBIM1 = 2;
  private static int PFL_ELENCOIMPSUB_ANNOSUBIMP1 = 3;
  private static int PFL_ELENCOIMPSUB_DESCRIMPSUBI = 4;
  private static int PFL_ELENCOIMPSUB_IMPORTOUFF = 5;
  private static int PFL_ELENCOIMPSUB_IMPORTSUBUFF = 6;
  private static int PFL_ELENCOIMPSUB_IMPORTORAG = 7;
  private static int PFL_ELENCOIMPSUB_IMPRAGSUBIMP = 8;
  private static int PFL_ELENCOIMPSUB_TIPOVAR = 9;
  private static int PFL_ELENCOIMPSUB_DESCRTIPOVAR = 10;
  private static int PFL_ELENCOIMPSUB_ANNOESIGIBIL = 11;
  private static int PFL_ELENCOIMPSUB_ANNOENTRATA = 12;
  private static int PFL_ELENCOIMPSUB_TIPOAVANZO = 13;
  private static int PFL_ELENCOIMPSUB_DESCTIPOAVAN = 14;
  private static int PFL_ELENCOIMPSUB_FINANZIOPERA = 15;
  private static int PFL_ELENCOIMPSUB_DESCRFINOPER = 16;
  private static int PFL_ELENCOIMPSUB_NOTEUFF = 17;
  private static int PFL_ELENCOIMPSUB_NOTERAG = 18;
  private static int PFL_ELENCOIMPSUB_CAPITOLO = 19;
  private static int PFL_ELENCOIMPSUB_ARTICOLO = 20;
  private static int PFL_ELENCOIMPSUB_DESCRIZIONE = 21;
  private static int PFL_ELENCOIMPSUB_IMPALL010120 = 22;
  private static int PFL_ELENCOIMPSUB_VARIAZIONI = 23;
  private static int PFL_ELENCOIMPSUB_LIQCONESERIF = 24;
  private static int PFL_ELENCOIMPSUB_MANDATI = 25;
  private static int PFL_ELENCOIMPSUB_DISPONIBIFIN = 26;
  private static int PFL_ELENCOIMPSUB_DISPEFFETTIV = 27;
  private static int PFL_ELENCOIMPSUB_DISPAL3112 = 28;
  private static int PFL_ELENCOIMPSUB_PROPOSVARIMP = 29;
  private static int PFL_ELENCOIMPSUB_PROPOSVARSUB = 30;
  private static int PFL_ELENCOIMPSUB_DISPFINARISU = 31;
  private static int PFL_ELENCOIMPSUB_DISPFINAEFFE = 32;
  private static int PFL_ELENCOIMPSUB_ORDANNOSUBIM = 33;
  private static int PFL_ELENCOIMPSUB_CRONOID = 34;
  private static int PFL_ELENCOIMPSUB_ORDINI = 35;
  private static int PFL_ELENCOIMPSUB_DISPOSIZIONI = 36;
  private static int PFL_ELENCOIMPSUB_DISTLIQ = 37;
  private static int PFL_ELENCOIMPSUB_PROGRUO = 38;
  private static int PFL_ELENCOIMPSUB_DESCRIZIONUO = 39;
  private static int PFL_ELENCOIMPSUB_ORDNUMERSUBI = 40;
  private static int PFL_ELENCOIMPSUB_MISSIONE = 41;
  private static int PFL_ELENCOIMPSUB_PROGRAMMA = 42;
  private static int PFL_ELENCOIMPSUB_TITOLO = 43;
  private static int PFL_ELENCOIMPSUB_CODLIVELLO4 = 44;
  private static int PFL_ELENCOIMPSUB_CODLIVELLO5 = 45;
  private static int PFL_ELENCOIMPSUB_INFOMAN = 46;
  private static int PFL_ELENCOIMPSUB_NUMEIMPAPROV = 47;
  private static int PFL_ELENCOIMPSUB_ANNOIMPAPROV = 48;
  private static int PFL_ELENCOIMPSUB_IMPDAREISSTN = 49;
  private static int PFL_ELENCOIMPSUB_CODICEBENEFI = 50;
  private static int PFL_ELENCOIMPSUB_RAGIONSOCIAL = 51;
  private static int PFL_ELENCOIMPSUB_TIPOVINCOLO = 52;

  private static int PPQRY_VISESTRIAIMP = 0;

  private static int PPQRY_DUAL1 = 1;

  private static int PPQRY_VINCOLI = 2;


  IDPanel PAN_ELENCOIMPSUB;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS32(IMDB);
    //
    //
    Init_PQRY_PARS80(IMDB);
    Init_PQRY_PARS80_RS(IMDB);
    Init_PQRY_VISESTRIAIMP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS32, 8);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS32, "TBL_PARS32");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, "NOMOGGTIPDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMOGGTIPDIS,5,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMOGGDIDAGE, "NOMOGGDIDAGE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOMOGGDIDAGE,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOOGANIMSUSP, "NOOGANIMSUSP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOOGANIMSUSP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOOGTICADIFI, "NOOGTICADIFI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS32,IMDBDef5.FLD_PARS32_NOOGTICADIFI,5,50,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS32, 0);
  }

  private static void Init_PQRY_PARS80(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARS80, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARS80, "PQRY_PARS80");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOOGANIMSUSP, "NOOGANIMSUSP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80,IMDBDef14.PQSL_PARS80_NOOGANIMSUSP,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARS80, 0);
  }

  private static void Init_PQRY_PARS80_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARS80_RS, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARS80_RS, "PQRY_PARS80_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOOGANIMSUSP, "NOOGANIMSUSP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS80_RS,IMDBDef14.PQSL_PARS80_NOOGANIMSUSP,5,2,0);
  }

  private static void Init_PQRY_VISESTRIAIMP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_VISESTRIAIMP, 51);
    IMDB.set_TblCode(IMDBDef14.PQRY_VISESTRIAIMP, "PQRY_VISESTRIAIMP");
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMPU, "REVIESRIIMPU");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMPU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_DESCRIZIONUO, "DESCRIZIONUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_DESCRIZIONUO,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDARTICO, "RECORDARTICO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORNUMEIMP, "RECORNUMEIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORANNOIMP, "RECORANNOIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECONUMESUBI, "RECONUMESUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECONUMESUBI,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOANNOSUBI, "RECOANNOSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOANNOSUBI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECDESIMPSUB, "RECDESIMPSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECDESIMPSUB,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REIMAL010120, "REIMAL010120");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REIMAL010120,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDVARIAZ, "RECORDVARIAZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDVARIAZ,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDISPFIN, "RECORDISPFIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDISPFIN,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECODISPEFFE, "RECODISPEFFE");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECODISPEFFE,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_ORDANNOSUBIM, "ORDANNOSUBIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_ORDANNOSUBIM,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_ORDNUMERSUBI, "ORDNUMERSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_ORDNUMERSUBI,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_LIQCONESERIF, "LIQCONESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_LIQCONESERIF,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDMANDAT, "RECORDMANDAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDMANDAT,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_INFOMAN, "INFOMAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_INFOMAN,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOCODLIVE4, "RECOCODLIVE4");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOCODLIVE4,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOCODLIVE5, "RECOCODLIVE5");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOCODLIVE5,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_MISSIONE, "MISSIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_MISSIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_PROGRAMMA,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDTITOLO, "RECORDTITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORDTITOLO,5,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_PROPOSVARIMP, "PROPOSVARIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_PROPOSVARIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_PROPOSVARSUB, "PROPOSVARSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_PROPOSVARSUB,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_ORDINI, "ORDINI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_ORDINI,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_DISPOSIZIONI, "DISPOSIZIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_DISPOSIZIONI,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_DISTLIQ, "DISTLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_DISTLIQ,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECODISPAL31, "RECODISPAL31");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECODISPAL31,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECIMPUFFIMP, "RECIMPUFFIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECIMPUFFIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECIMPSUBUFF, "RECIMPSUBUFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECIMPSUBUFF,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORTIPOVAR, "RECORTIPOVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORTIPOVAR,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECDESTIPVAR, "RECDESTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECDESTIPVAR,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOANNOESIG, "RECOANNOESIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOANNOESIG,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOANNOENTR, "RECOANNOENTR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECOANNOENTR,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMFO, "REVIESRIIMFO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMFO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMDF, "REVIESRIIMDF");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMDF,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORNOTEUFF, "RECORNOTEUFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORNOTEUFF,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECIMPRAGIMP, "RECIMPRAGIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECIMPRAGIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_IMPRAGSUBIMP, "IMPRAGSUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_IMPRAGSUBIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORNOTERAG, "RECORNOTERAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_RECORNOTERAG,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIINIP, "REVIESRIINIP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIINIP,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIAIP, "REVIESRIIAIP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIAIP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIDRS, "REVIESRIIDRS");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIDRS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMCB, "REVIESRIIMCB");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMCB,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMRS, "REVIESRIIMRS");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMRS,5,400,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMTA, "REVIESRIIMTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMTA,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIDTA, "REVIESRIIDTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIDTA,5,100,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_CRONOID, "CRONOID");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_CRONOID,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMTV, "REVIESRIIMTV");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIMP,IMDBDef14.PQSL_VISESTRIAIMP_REVIESRIIMTV,1,6,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_VISESTRIAIMP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrazioneProposte(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrazioneProposte()
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
    FormIdx = MyGlb.FRM_ESTRAZPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B1B48340-054C-4450-B3E7-FFB9CAB4DDE2";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1052;
    DesignHeight = 610;
    set_Caption(new IDVariant("Estrazione Proposte"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1052;
    Frames[1].Height = 584;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.10274;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1052;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1052-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "20BEE9F0-739A-4AE5-AC4D-B42A140917E0");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 900, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1052;
    Frames[3].Height = 524;
    Frames[3].Caption = "Impegni/SubImpegni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 524;
    PAN_ELENCOIMPSUB = new IDPanel(w, this, 3, "PAN_ELENCOIMPSUB");
    Frames[3].Content = PAN_ELENCOIMPSUB;
    PAN_ELENCOIMPSUB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOIMPSUB.VS = MainFrm.VisualStyleList;
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1052-MyGlb.PAN_OFFS_X, 524-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CCDFCA74-121E-4D43-98E1-1BC43766022D");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5382, 376, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOIMPSUB.InitStatus = 2;
    PAN_ELENCOIMPSUB_Init();
    PAN_ELENCOIMPSUB_InitFields();
    PAN_ELENCOIMPSUB_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_NASILPANDEPZ+BaseCmdLinIdx)
      {
        NascondiilpannellodeiParametri();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARS32, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTRAZPROPOS_PARS80();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_ELENCOIMPSUB.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELPERIRIAC && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_PERIODORIAC1) {
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
    return (obj instanceof EstrazioneProposte);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrazioneProposte.class.getName() : (Glb.ClassWithPackage(EstrazioneProposte.class) ? EstrazioneProposte.class.getName().substring(EstrazioneProposte.class.getPackage().getName().length() + 1) : EstrazioneProposte.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (Column.equals((new IDVariant(PFL_PARS_ES)), true) && FieldWasModified.booleanValue())
      {
        VisibilitàECaptionInBaseAES();
        if (IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
        {
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_GROUP,GRP_ELENCOIMPSUB_BENEFICIARIO,(new IDVariant("Beneficiario")).stringValue()); 
        }
        else
        {
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_GROUP,GRP_ELENCOIMPSUB_BENEFICIARIO,(new IDVariant("Debitore")).stringValue()); 
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_PERIODORIAC2)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_CODICE, 0))))
        {
          IDVariant v_VPERIRIACTIP = new IDVariant(0,IDVariant.STRING);
          IDVariant v_VDAL = new IDVariant(0,IDVariant.DATETIME);
          IDVariant v_VAL = new IDVariant(0,IDVariant.DATETIME);
          v_VDAL = (new IDVariant());
          v_VAL = (new IDVariant());
          IDVariant v_VPERRIAFILDI = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.TIPO as PERIRIACTIPO, ");
          SQL.append("  A.DATA_INIZIO as PERRIADATINI, ");
          SQL.append("  A.DATA_FINE as PERRIADATFIN, ");
          SQL.append("  CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END as IINPRFDEIPRF ");
          SQL.append("from ");
          SQL.append("  PERIODI_RIACCERTAMENTI A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VPERIRIACTIP = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
            v_VDAL = QV.Get("PERRIADATINI", IDVariant.DATETIME) ;
            v_VAL = QV.Get("PERRIADATFIN", IDVariant.DATETIME) ;
            v_VPERRIAFILDI = QV.Get("IINPRFDEIPRF", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VPERIRIACTIP.equals((new IDVariant("CONS")), true))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
            IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
            IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
          }
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Disp. Fin. "));
          v_S1 = IDL.Add(IDL.Add(v_S1, ((IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGTICADIFI, 0),(new IDVariant("C"))).compareTo((new IDVariant("C")), true)!=0)?(new IDVariant("31/12/")):(new IDVariant("")))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0)));
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPAL3112, new IDVariant(v_S1).stringValue());
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Proposte Variazioni Impegni/Subimpegni"));
          if ((IDL.Today().compareTo(v_VDAL, true)>=0 && IDL.Today().compareTo(v_VAL, true)<=0))
          {
            set_Caption(new IDVariant(v_CAPTION));
          }
          else
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant(" - PERIODO RIACCERTAMENTO CHIUSO"));
            set_Caption(IDL.Add(v_CAPTION, S));
            if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
            {
            }
          }
          if (IMDB.Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, 0, (new IDVariant("FIN")));
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, 0, IDL.NullValue(v_VPERRIAFILDI,(new IDVariant("EFF"))));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_ESERCIZIORIF)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ESEFIN A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
            v_S2 = (new IDVariant("Esercizio non previsto"));
            MainFrm.set_AlertMessage(v_S2); 
            IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0, (new IDVariant()));
          }
          else
          {
            PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_LIQCONESERIF, IDL.Add(IDL.Add((new IDVariant("Liquidazioni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0))).stringValue());
          }
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Disp. Fin. "));
          v_S1 = IDL.Add(IDL.Add(v_S1, ((IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGTICADIFI, 0),(new IDVariant("C"))).compareTo((new IDVariant("C")), true)!=0)?(new IDVariant("31/12/")):(new IDVariant("")))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0)));
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPAL3112, new IDVariant(v_S1).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "ParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pars After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_PARS_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars After Find Body
      // Corpo Procedura
      // 
      VisibilitàECaptionInBaseAES();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "ParsAfterFind", _e);
    }
  }

  // **********************************************************************
  // Visibilità E Caption In Base A ES
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisibilitàECaptionInBaseAES ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità E Caption In Base A ES Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMEROIMP, (new IDVariant("Numero Acc.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMP, (new IDVariant("Anno Acc.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMEIMPAPROV, IDL.Add((new IDVariant("Numero Acc.")), (new IDVariant("prov."))).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMPAPROV, IDL.Add((new IDVariant("Anno Acc.")), (new IDVariant("prov."))).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione Accertamento"));
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRIMPSUBI, new IDVariant(S).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MANDATI, (new IDVariant("Ordinativi")).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MISSIONE, (new IDVariant("Titolo")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_PROGRAMMA, (new IDVariant("Tipologia")).stringValue());
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Riaccertamento Accertamenti"));
        Frames[PAN_ELENCOIMPSUB.FrIndex].set_Caption(new IDVariant(v_S1).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_FINANZIOPERA, (new IDVariant("Opera")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRFINOPER, IDL.Add((new IDVariant("Descr. ")), (new IDVariant("Opera"))).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
        v_S2 = (new IDVariant("Anche Accertamenti senza Proposte"));
        PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ANCIMPSUSEPR, new IDVariant(v_S2).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_IMPORTOUFF, (new IDVariant("Importo Uff.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_IMPORTORAG, (new IDVariant("Importo Rag.")).stringValue());
        PAN_ELENCOIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_PROPOSVARIMP,(new IDVariant("Totale Proposte Variazioni presenti sull'Accertamento")).stringValue()); 
      }
      else
      {
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMEROIMP, (new IDVariant("Numero Imp.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMP, (new IDVariant("Anno Imp.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMEIMPAPROV, IDL.Add((new IDVariant("Numero Imp.")), (new IDVariant("prov."))).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMPAPROV, IDL.Add((new IDVariant("Anno Imp.")), (new IDVariant("prov."))).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione Impegno/SubImpegno"));
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRIMPSUBI, new IDVariant(S).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_LIQCONESERIF, IDL.Add(IDL.Add((new IDVariant("Liquidazioni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0))).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MANDATI, (new IDVariant("Mandati")).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MISSIONE, (new IDVariant("Missione")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_PROGRAMMA, (new IDVariant("Programma")).stringValue());
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Riaccertamento Impegni/SubImpegni"));
        Frames[PAN_ELENCOIMPSUB.FrIndex].set_Caption(new IDVariant(v_S1).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_FINANZIOPERA, (new IDVariant("Finanz.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRFINOPER, IDL.Add((new IDVariant("Descr. ")), (new IDVariant("Finanziamento"))).stringValue());
        IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
        v_S2 = (new IDVariant("Anche Impegni/SubImpegni senza Proposte"));
        PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ANCIMPSUSEPR, new IDVariant(v_S2).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_IMPORTOUFF, (new IDVariant("Importo Uff. Impegno")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_IMPORTORAG, (new IDVariant("Importo Rag. Impegno")).stringValue());
        PAN_ELENCOIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_PROPOSVARIMP,(new IDVariant("Totale Proposte Variazioni presenti sull'Impegno")).stringValue()); 
        PAN_ELENCOIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_PROPOSVARSUB,(new IDVariant("Totale Proposte Variazioni presenti sul Subimpegno")).stringValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "VisibilitàECaptionInBaseAES", _e);
      return -1;
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
      IDVariant v_VPERRIAFILDI = new IDVariant(0,IDVariant.STRING);
      IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGANIMSUSP, 0, (new IDVariant("NO")));
      IDVariant v_SREG = new IDVariant(0,IDVariant.STRING);
      v_SREG = (new IDVariant("Filtro Disp. 31/12"));
      IDVariant v_SRIACC = new IDVariant(0,IDVariant.STRING);
      v_SRIACC = (new IDVariant("RIACCERTAMENTI"));
      IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGTICADIFI, 0, MainFrm.AFC.GetRegistro(v_SREG, IDL.Add(IDL.Add((new IDVariant("CFA")), (new IDVariant("/"))), v_SRIACC)));
      PAN_PARS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPONIBIFIN, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPONIBIFIN))), (new IDVariant(" "))), MainFrm.Datetostring(IDL.Today())).stringValue());
      PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VMAX = null;
      v_VMAX = (new IDVariant());
      IDVariant v_VTIPO = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MAX(A.CODICE) as MAXPERRIACOD, ");
      SQL.append("  MAX(A.TIPO) as MAXPERRIATIP, ");
      SQL.append("  MAX(CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END) as MIINPRFDEIPR ");
      SQL.append("from ");
      SQL.append("  PERIODI_RIACCERTAMENTI A ");
      SQL.append("where ((TRUNC( SYSDATE ) BETWEEN A.DATA_INIZIO AND NVL(A.DATA_FINE, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_VMAX = QV.Get("MAXPERRIACOD", IDVariant.INTEGER) ;
        v_VTIPO = QV.Get("MAXPERRIATIP", IDVariant.STRING) ;
        v_VPERRIAFILDI = QV.Get("MIINPRFDEIPR", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_CODICE, 0, new IDVariant(v_VMAX));
        IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_CODICE, 0, new IDVariant(v_VMAX));
        if (v_VTIPO.equals((new IDVariant("CONS")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
          IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
        }
        if (IMDB.Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, 0, (new IDVariant("FIN")));
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Anche Accertamenti senza proposte"));
          PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ANCIMPSUSEPR, new IDVariant(S).stringValue());
        }
        else
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Anche Impegni/Subimpegni senza Proposte"));
          PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ANCIMPSUSEPR, new IDVariant(S).stringValue());
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, 0, IDL.NullValue(v_VPERRIAFILDI,(new IDVariant("EFF"))));
        }
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as PERIRIACCODI, ");
        SQL.append("  A.TIPO as PERIRIACTIPO, ");
        SQL.append("  CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END as IINPRFDEIPRF ");
        SQL.append("from ");
        SQL.append("  PERIODI_RIACCERTAMENTI A ");
        SQL.append("where (A.CODICE = ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  MAX(B.CODICE) ");
        SQL.append("from ");
        SQL.append("  PERIODI_RIACCERTAMENTI B ");
        SQL.append(")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VMAX = QV.Get("PERIRIACCODI", IDVariant.INTEGER) ;
          v_VTIPO = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
          v_VPERRIAFILDI = QV.Get("IINPRFDEIPRF", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.IsNull(v_VMAX))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è stato trovato alcun perioro riaccertamento valido"));
          MainFrm.set_AlertMessage(S); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
          return;
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.TIPO as PERIRIACTIPO, ");
        SQL.append("  CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END as IINPRFDEIPRF ");
        SQL.append("from ");
        SQL.append("  PERIODI_RIACCERTAMENTI A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(v_VMAX, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VTIPO = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
          v_VPERRIAFILDI = QV.Get("IINPRFDEIPRF", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_CODICE, 0, new IDVariant(v_VMAX));
        IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_CODICE, 0, new IDVariant(v_VMAX));
        if (v_VTIPO.equals((new IDVariant("CONS")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
          IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
        }
        if (IMDB.Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, 0, (new IDVariant("FIN")));
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Anche Accertamenti senza proposte"));
          PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ANCIMPSUSEPR, new IDVariant(S).stringValue());
        }
        else
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Anche Impegni/Subimpegni senza Proposte"));
          PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ANCIMPSUSEPR, new IDVariant(S).stringValue());
          IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, 0, IDL.NullValue(v_VPERRIAFILDI,(new IDVariant("EFF"))));
        }
      }
      if (MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true) || MainFrm.TIPOORDINATI.equals((new IDVariant(3)), true) || MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGDIDAGE, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGDIDAGE, 0, (new IDVariant("NO")));
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Disp. Fin. "));
      v_S1 = IDL.Add(IDL.Add(v_S1, ((IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGTICADIFI, 0),(new IDVariant("C"))).compareTo((new IDVariant("C")), true)!=0)?(new IDVariant("31/12/")):(new IDVariant("")))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_NOMOGGESERIF, 0)));
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPAL3112, new IDVariant(v_S1).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "Load", _e);
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
      PAN_PARS.set_Collapsed((new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_CODICE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGTIPDIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGDIDAGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGANIMSUSP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGTICADIFI, 0, new IDVariant());
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPERIRIAC)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_PERIODRIACC1, IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARS80, IMDBDef14.PQSL_PARS80_CODICE, 0, IMDB.Value(IMDBDef8.PQRY_PERIODRIACC1, IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Nascondi il pannello dei Parametri
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int NascondiilpannellodeiParametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nascondi il pannello dei Parametri Body
      // Corpo Procedura
      // 
      MainFrm.Collapseexpandparampanel(new IDVariant(MainFrm.CmdObj.GetCmdCode(MyGlb.CMDS_CS+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_NASILPANDEPZ+BaseCmdLinIdx].GetIndex()).intValue())), PAN_PARS);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "NascondiilpannellodeiParametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco impSubAcc On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOIMPSUB);
      // 
      // Elenco impSubAcc On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ELENCOIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRIZIONE,(new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_DESCRIZIONE))).stringValue()); 
      PAN_ELENCOIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRIMPSUBI,(new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_DESCRIMPSUBI))).stringValue()); 
      PAN_ELENCOIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRIZIONUO,(new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_DESCRIZIONUO))).stringValue()); 
      PAN_ELENCOIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_RAGIONSOCIAL,(new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "ElencoimpSubAccOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Elenco impSubAcc On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number - Input
  // Error Message - Input
  // Native Error Number - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ELENCOIMPSUB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Elenco impSubAcc On Database Error Body
      // Corpo Procedura
      // 
      if (IDL.Find(ErrorMessage, (new IDVariant("expected"))).compareTo((new IDVariant(0)), true)>0)
      {
        Cancel.set((new IDVariant(-1)));
        Skip.set((new IDVariant(-1)));
        return;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioneProposte", "ElencoimpSubAccOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ESTRAZPROPOS_PARS80() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARS80_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARS32, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARS32, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARS80_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARS80_RS, 0, IMDBDef5.TBL_PARS32, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS80_RS, 0, 0, IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_CODICE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS80_RS, 1, 0, IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMOGGESERIF, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS80_RS, 2, 0, IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTUO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS80_RS, 3, 0, IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS80_RS, 4, 0, IMDBDef5.TBL_PARS32, IMDBDef5.FLD_PARS32_NOOGANIMSUSP, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARS32, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARS32, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARS32, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARS80_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_PERIODORIAC1)
    {
      IdxPanelActived = PAN_PARS.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_SCELPERIRIAC, 1, this);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOIMPSUB, Cancel);
    // Stub
  }

  private void PAN_ELENCOIMPSUB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELENCOIMPSUB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOIMPSUB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOIMPSUB_IntValidateRow(Cancel);
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
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, "10C65ED1-294F-4715-A628-4E999ADE291F");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, "Periodo Riacc.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ES, "47580225-F0EF-487B-8907-A5A6632D770A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ES, "ES");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ES, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, "F50DD608-E807-496F-980D-B301D9270DA3");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, "Anche Impegni Subimpegni Senza Proposte");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, "93CA6588-0C41-4B86-B7A9-6B50F872861B");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, "Esercizio Rif.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UO, "E08B03E5-BF49-44BE-BD94-BC1D391463E5");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UO, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, "437B00B9-4D4F-4666-A90F-3C8654AAE30A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, "Periodo Riacc.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, "FA7E2226-1907-48BF-9064-7AAB677C9C68");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, "Tipo_Disp");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, 236);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, 8, 28, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARS.SetFieldPage(PFL_PARS_PERIODORIAC1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PERIODORIAC1, PPQRY_PERIODRIACCE, "A.DESCRIZIONE", "PERIRIACDESC", 5, 100, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, "ES");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, 104, 4, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, "ES");
    PAN_PARS.SetFieldPage(PFL_PARS_ES, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ES, PPQRY_PARS80, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ES, (new IDVariant("S")), "Impegni/SubImpegni", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ES, (new IDVariant("E")), "Accertamenti", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_LIST, 256);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_LIST, "Anche Impegni Subimpegni Senza Proposte");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_FORM, 372, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_FORM, 256);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANCIMPSUSEPR, MyGlb.PANEL_FORM, "Anche Impegni Subimpegni Senza Proposte");
    PAN_PARS.SetFieldPage(PFL_PARS_ANCIMPSUSEPR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANCIMPSUSEPR, PPQRY_PARS80, "A.NOOGANIMSUSP", "NOOGANIMSUSP", 5, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ANCIMPSUSEPR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ANCIMPSUSEPR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, "Esercizio Rif.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, 376, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_PARS.SetFieldPage(PFL_PARS_ESERCIZIORIF, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ESERCIZIORIF, PPQRY_PARS80, "A.NOMOGGESERIF", "NOMOGGESERIF", 1, 9, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, "Un. Org.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 508, 28, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_UO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UO, PPQRY_PARS80, "A.NOMEOGGETTUO", "NOMEOGGETTUO", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, 84);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, "Per. Riacc");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, 12, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARS.SetFieldPage(PFL_PARS_PERIODORIAC2, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PERIODORIAC2, PPQRY_PARS80, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_LIST, 216);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_LIST, "Tipo_Disp");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_FORM, 4, 108, 724, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_FORM, 216);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.PANEL_FORM, "Tipo_Disp");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPODISP, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPODISP, PPQRY_PERIODRIACCE, "CASE WHEN NVL(A.FILTRO_DISP, 'DISP_31_12') = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END", "TIPODISP", 5, 99, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PERIRIACDESC, ");
    SQL.append("  CASE WHEN NVL(A.FILTRO_DISP, 'DISP_31_12') = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END as TIPODISP ");
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    SQL.append("where (A.CODICE = ~~CODICE~~) ");
    PAN_PARS.SetQuery(PPQRY_PERIODRIACCE, 0, SQL, -1, "");
    PAN_PARS.SetQueryDB(PPQRY_PERIODRIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetMasterTable(PPQRY_PERIODRIACCE, "PERIODI_RIACCERTAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  -1 as PROGR, ");
    SQL.append("  '-1' as ORD, ");
    SQL.append("  '-1' as ORD1, ");
    SQL.append("  CASE WHEN ~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' THEN 'Tutte' ELSE 'Tutte le UO di competenza' END as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NVL(~~NOMEOGGETTUO~~, -1) = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  B.CODICE_UO, ");
    SQL.append("  LPAD(B.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGETTUO~~) ");
    SQL.append("and   (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ <> 'CFA') ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  '1', ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO C ");
    SQL.append("where (C.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGETTUO~~) ");
    SQL.append("and   (C.E_S = ~~TBL_PARS32.NOMEOGGETTES~~) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA') ");
    SQL.append("order by 3, 2 ");
    PAN_PARS.SetQuery(PPQRY_DUAL2, 0, SQL, PFL_PARS_UO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  -1 as PROGR, ");
    SQL.append("  '-1' as ORD, ");
    SQL.append("  '-1' as ORD1, ");
    SQL.append("  CASE WHEN ~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' THEN 'Tutte' ELSE 'Tutte le UO di competenza' END as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  B.CODICE_UO, ");
    SQL.append("  LPAD(B.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA B ");
    SQL.append("where (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ <> 'CFA') ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  '1', ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO C ");
    SQL.append("where (C.E_S = ~~TBL_PARS32.NOMEOGGETTES~~) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA') ");
    SQL.append("order by 3, 2 ");
    PAN_PARS.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_PARS_UO, "");
    PAN_PARS.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS80", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS80, IMDBDef14.PQRY_PARS80_RS, IMDBDef5.TBL_PARS32);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ES, IMDBDef5.FLD_PARS32_NOMEOGGETTES);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANCIMPSUSEPR, IMDBDef5.FLD_PARS32_NOOGANIMSUSP);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ESERCIZIORIF, IMDBDef5.FLD_PARS32_NOMOGGESERIF);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UO, IMDBDef5.FLD_PARS32_NOMEOGGETTUO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PERIODORIAC2, IMDBDef5.FLD_PARS32_CODICE);
    PAN_PARS.SetMasterTable(0, "PARS32");
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

  private void PAN_ELENCOIMPSUB_Init()
  {

    PAN_ELENCOIMPSUB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOIMPSUB.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, "DA389D85-3F0C-49DE-9F6C-C692D24FD754");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, "Beneficiario");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, MyGlb.PANEL_LIST, 4814, -9999, 352, 16, 0, 0);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, MyGlb.PANEL_FORM, 0, 1503, 552, 97, 0, 0);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, 0, 66);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, 1, 13);
    PAN_ELENCOIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, 0, 4);
    PAN_ELENCOIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, 1, 4);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_BENEFICIARIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOIMPSUB.SetSize(MyGlb.OBJ_FIELD, 53);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, "8F4C5F04-80D1-4EF1-AC61-AAAF2BBECE2D");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, "Numero Imp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, "577F5D63-DF30-4CF3-9285-990534638F98");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, "Anno Imp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, "006A4C8E-1149-4E3B-BE06-DC53DF2C9539");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, "Numero SubImp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, "B65CFF81-C89F-457C-B40B-87D5C88D44C7");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, "Anno SubImp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, "0387B787-3FA3-462D-913A-6A6968367D5C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, "Descrizione Impegno/SubImpegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, "D2404FC9-B080-469A-B7DE-6D351F2100D3");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, "Importo Uff. Impegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, "813C1028-5909-41E8-B75B-D710B65E21C9");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, "Importo Uff. Subimpegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, "1D220298-41B5-4BE5-908F-8A567B93BC14");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, "Importo Ragioneria Impegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, "B2C80CA2-A83A-45C7-9C35-08399F0F1870");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, "Importo Rag. Subimpegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, "D027F267-5EE9-4EC6-9519-0194B08182DA");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, "Tipo Var.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, "21938DD0-D585-4C25-B691-15314E479AF8");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, "Descrizione Tipo Variazione");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, "ABE734DF-FE4B-4C48-B097-A7F4EAAFE4A9");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, "Anno Esigilità");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, "E612AC48-5F9C-438F-A334-F6AE914E9206");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, "Anno Entrata");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, "50B20FA3-03C8-4694-8C09-A4157E82BC28");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, "Tipo Avanzo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, "CA054491-A1A2-4F94-8228-448FEC314AB4");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, "Descr. Tipo Avanzo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, "3C5BD4D1-9483-4F0A-AD65-B1BA12BA4377");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, "Finanz. Opera");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, "3C16073A-3F96-4643-81E3-404487D75D5D");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, "Descrizione Finanziamento/Opera");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, "C009C7E5-F06C-4105-8B16-803F7B58EE8F");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, "Note Ufficio");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, "3F3C84B3-B7A5-4A7F-B40B-A78D5D2C5BE7");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, "Note Ragioneria");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, "1B7BDAF9-4959-41CD-B79A-8A8436826BC4");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, "Capitolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, "064E587A-B6C5-48BF-B140-D02023104DE4");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, "Articolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, "B1C2F046-BA94-49E2-B4AB-D7218374AEC1");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, "Descrizione Capitolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, "735183E8-33E1-4B6F-9679-CA6AB42460F1");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, "Importo Attuale");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, "2F06AE74-F3C9-47AE-A4DD-97707BAA2A54");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, "Variazioni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, "7F32925B-102B-4AFD-A868-584F9D8F7E6C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, "Liquidazioni con Esercizio Rif.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, "Liquidazioni non ancora emesse in mandato o emesse in mandato in anni successivi all'esercizio rif.");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, "3E037102-93B2-4979-9DB8-DEF5A2220D78");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, "Mandati");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, "2D23505C-C51D-41F7-A2C8-8D0F7E0D0EF0");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, "Disp. Finanziaria");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, "AE7A0801-1412-44B3-AAC1-9F6FF19F6386");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, "Disp. Effettiva");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, "B8956B1A-442C-4B57-B27E-6E5C6FA13FEA");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, "Disp. Fin. 31/12/");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, "402B2BEC-595F-4CDC-B97D-B0221E74BB25");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, "Proposte Variazioni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, "36B863B1-7381-436A-AA31-1862B7C7D51E");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, "Proposte Variazioni Subimpegni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, "7907536D-F4BC-4568-88BE-0B481EF718AE");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, "Disp. Finanziaria Risultante");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, "8001F82F-5279-4F01-B61A-71A967D2E67E");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, "Disp. Finanziaria Effettiva");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, "ABA96A15-04D9-4519-8E6D-7BEF59C748C5");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, "Ord Anno Subimp");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, "54DBA104-AB0D-4A44-8FB7-B215931A85BB");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, "Imp. Da Crono");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, "20471B56-549F-4C1D-B98B-BA96ED9D9A47");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, "Ordini");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, "Indica se ci sono ordini o porzioni di ordini associati non liquidati");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, "B101B3AD-A6E5-41BE-A5C8-91C97BBF63C7");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, "Disposizioni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, "Indica se ci sono disposizioni associate non liquidate");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, "F1925139-E6C7-4F11-AC72-9BF060A99084");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, "Dist. Liq.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, "Distinte di Liquidazioni Extra Buoni");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, "DCE6FEC8-F961-405C-A613-2C077513681C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, "Codice UO");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, "12705DA3-79AF-4A4E-8AD3-5167660C473E");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, "Descrizione U.O.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, "68327CEC-68BE-4C1B-80FD-3E41C173DEF7");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, "Ord NUmero Subimp");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, "C42AB44F-B3DF-46E6-8B49-6EB761DCD587");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, "Missione");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, "744EC309-B453-430E-9BDA-7E6BE0D1DE1B");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, "Programma");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, "2189DF17-9098-4948-9F95-1881B7DA6825");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, "Titolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, "EBA71DB6-43D8-4951-A1B9-5052C67BCCCD");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, "Livello IV");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, "C2CC8700-65BF-4945-9BEA-613F9249E27F");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, "Livello V");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, "0A5680E6-3522-4286-A384-5EC0CC361199");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, "Info Man");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, "4D2E5ACD-3B0B-41CF-934B-85A05D046744");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, "Numero Imp. Prov.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, "458FB063-4EC3-4C45-84A9-19712FDCE6C2");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, "Anno Imp. Prov.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, "00F197BD-ADBC-4E71-B7E3-B1862C301A40");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, "Reiscr. da Stn.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, "0D417394-0881-4B9F-8E50-F316DF26924B");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, "Codice");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, "Codice Beneficiario");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, "01A89038-B49A-4DDA-A5D4-5AC2B8E3D36A");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, "Ragione Sociale");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, "441A8F02-D324-4350-A27B-31F58E8C0720");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, "Tipo Vincolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCOIMPSUB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, "Numero Imp.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 4, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, "Numero Imp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NUMEROIMP, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NUMEROIMP, PPQRY_VISESTRIAIMP, "A.NUMERO_IMP", "RECORNUMEIMP", 1, 5, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 4, 304, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOIMP, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOIMP, PPQRY_VISESTRIAIMP, "A.ANNO_IMP", "RECORANNOIMP", 1, 4, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 96, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, "Numero SubImp.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 4, 328, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, "Numero SubImp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NUMEROSUBIM1, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NUMEROSUBIM1, PPQRY_VISESTRIAIMP, "A.NUMERO_SUBIMP", "RECONUMESUBI", 1, 15, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 152, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, "Anno SubImp.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 4, 352, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, "Anno SubImp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOSUBIMP1, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOSUBIMP1, PPQRY_VISESTRIAIMP, "A.ANNO_SUBIMP", "RECOANNOSUBI", 1, 4, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, 208, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, "Descrizione Impegno/SubImpegno");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, 4, 376, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, "Descr. Imp. SubImpegno");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRIMPSUBI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRIMPSUBI, PPQRY_VISESTRIAIMP, "A.DESCR_IMPSUB", "RECDESIMPSUB", 5, 140, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_LIST, 360, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_LIST, "Importo Uff. Impegno");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_FORM, 4, 1132, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTOUFF, MyGlb.PANEL_FORM, "Imp. Uff Imp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPORTOUFF, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_IMPORTOUFF, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPORTOUFF, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_UFF_IMP END", "RECIMPUFFIMP", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_LIST, 468, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_LIST, 100);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_LIST, "Importo Uff. Subimpegno");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_FORM, 4, 1648, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_FORM, 100);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTSUBUFF, MyGlb.PANEL_FORM, "Imp. Uff Subimp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPORTSUBUFF, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_IMPORTSUBUFF, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPORTSUBUFF, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_UFF_SUBIMP END", "RECIMPSUBUFF", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_LIST, 576, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_LIST, "Imp. Ragioneria Impegno");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_FORM, 4, 1360, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPORTORAG, MyGlb.PANEL_FORM, "Im. Rag. Imp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPORTORAG, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_IMPORTORAG, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPORTORAG, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_RAG_IMP END", "RECIMPRAGIMP", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_LIST, 684, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_LIST, 132);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_LIST, "Importo Rag. Subimpegno");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_FORM, 4, 1648, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_FORM, 132);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPRAGSUBIMP, MyGlb.PANEL_FORM, "Imp. Rag Subimpegno");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPRAGSUBIMP, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_IMPRAGSUBIMP, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPRAGSUBIMP, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_RAG_SUBIMP END", "IMPRAGSUBIMP", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_LIST, 792, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Var.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_FORM, 4, 1156, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Var.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_TIPOVAR, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_TIPOVAR, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_TIPOVAR, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.TIPO_VAR END", "RECORTIPOVAR", 1, 19, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, 828, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, 100);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, "Descrizione Tipo Variazione");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, 4, 1180, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, 100);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, "Descr. Tp. Var.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRTIPOVAR, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DESCRTIPOVAR, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRTIPOVAR, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN NULL ELSE A.DESCR_TIPO_VAR END", "RECDESTIPVAR", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1088, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigilità");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 1204, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigilità");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOESIGIBIL, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_ANNOESIGIBIL, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOESIGIBIL, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.ANNO_ESIGIBILITA END", "RECOANNOESIG", 1, 19, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_LIST, 1140, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_FORM, 4, 1228, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOENTRATA, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_ANNOENTRATA, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOENTRATA, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.ANNO_ENTRATA END", "RECOANNOENTR", 1, 19, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_LIST, 1192, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_FORM, 4, 1600, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_TIPOAVANZO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_TIPOAVANZO, PPQRY_VISESTRIAIMP, "A.TIPO_AVANZO", "REVIESRIIMTA", 3, 10, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_LIST, 1244, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_LIST, "Descr. Tipo Avanzo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_FORM, 4, 1624, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCTIPOAVAN, MyGlb.PANEL_FORM, "Descr. Tipo Avanzo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCTIPOAVAN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCTIPOAVAN, PPQRY_VISESTRIAIMP, "A.DESC_TIPO_AVANZO", "REVIESRIIDTA", 5, 100, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_LIST, 1504, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_LIST, 140);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_LIST, "Finanz. Opera");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_FORM, 4, 1252, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_FORM, 140);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_FINANZIOPERA, MyGlb.PANEL_FORM, "Finanz. Opera");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_FINANZIOPERA, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_FINANZIOPERA, PPQRY_VISESTRIAIMP, "A.FINANZIAMENTO_OPERA", "REVIESRIIMFO", 1, 5, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_LIST, 1556, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_LIST, "Descrizione Finanziamento/Opera");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_FORM, 4, 1276, 612, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRFINOPER, MyGlb.PANEL_FORM, "Descr. Finanz. Opera");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRFINOPER, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRFINOPER, PPQRY_VISESTRIAIMP, "A.DESCR_FINOPERA", "REVIESRIIMDF", 5, 200, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_LIST, 1816, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_LIST, "Note Ufficio");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_FORM, 4, 1312, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTEUFF, MyGlb.PANEL_FORM, "Note Ufficio");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NOTEUFF, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_NOTEUFF, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NOTEUFF, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN NULL ELSE A.NOTE_UFF END", "RECORNOTEUFF", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_LIST, 2076, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_LIST, "Note Ragioneria");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_FORM, 4, 1384, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NOTERAG, MyGlb.PANEL_FORM, "Nt. Ragion.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NOTERAG, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_NOTERAG, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NOTERAG, PPQRY_VISESTRIAIMP, "CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN NULL ELSE A.NOTE_RAG END", "RECORNOTERAG", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 2336, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CAPITOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CAPITOLO, PPQRY_VISESTRIAIMP, "A.CAPITOLO", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 2460, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ARTICOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ARTICOLO, PPQRY_VISESTRIAIMP, "A.ARTICOLO", "RECORDARTICO", 1, 2, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, 2492, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 244, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRIZIONE, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRIZIONE, PPQRY_VISESTRIAIMP, "A.DESCRIZIONE", "RECORDDESCRI", 5, 140, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_LIST, 2644, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_LIST, "Importo Attuale");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_FORM, 4, 412, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPALL010120, MyGlb.PANEL_FORM, "Imp. Att.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPALL010120, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_IMPALL010120, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPALL010120, PPQRY_VISESTRIAIMP, "A.SALDO_INI + NVL(A.VARIAZIONI, 0)", "REIMAL010120", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, 760, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, 4, 652, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_VARIAZIONI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_VARIAZIONI, PPQRY_VISESTRIAIMP, "A.VARIAZIONI", "RECORDVARIAZ", 3, 14, 2, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, 2748, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, 168);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, "Liquidazioni con Esercizio Rif.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, 4, 1504, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, 168);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, "Liquidazioni con Esercizio Rif.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_LIQCONESERIF, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  SUM(B.IMPORTO) ");
  SQL.append("from ");
  SQL.append("  LIQ B ");
  SQL.append("where (B.ANNO_LIQ <= A.ESERCIZIO) ");
  SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
  SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
  SQL.append("and   (NVL(B.ANNO_SUBIMP, 0) = NVL(A.ANNO_SUBIMP, NVL(B.ANNO_SUBIMP, 0))) ");
  SQL.append("and   (NVL(B.NUMERO_SUBIMP, 0) = NVL(A.NUMERO_SUBIMP, NVL(B.NUMERO_SUBIMP, 0))) ");
  SQL.append("and   (NVL(B.ANNO_MAND, 9999) > A.ESERCIZIO) ");
  SQL.append(")");
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_LIQCONESERIF, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_LIQCONESERIF, PPQRY_VISESTRIAIMP, SQL.toString(), "LIQCONESERIF", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, 2852, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, 4, 676, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_MANDATI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_MANDATI, PPQRY_VISESTRIAIMP, "A.MANDATI", "RECORDMANDAT", 3, 14, 2, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, 2956, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, "Disp. Finanziaria");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, 4, 436, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, "Disp Finanziaria");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPONIBIFIN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPONIBIFIN, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPONIBIFIN, PPQRY_VISESTRIAIMP, "CASE WHEN A.E_S = 'E' THEN A_GET_DISP_ACC_AL(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,TRUNC( SYSDATE )) ELSE A_GET_DISP_IMPSUB_AL(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TRUNC( SYSDATE ),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS32.NOMOGGDIDAGE~~) END", "RECORDISPFIN", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, 3060, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 724, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Effettiva");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPEFFETTIV, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPEFFETTIV, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPEFFETTIV, PPQRY_VISESTRIAIMP, "CASE WHEN A.E_S = 'S' THEN A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'EFF',TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0)),'dd/mm/yyyy'),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS32.NOMOGGDIDAGE~~) ELSE to_number(NULL) END", "RECODISPEFFE", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, 3164, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, "Disp. Fin. 31/12/");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, 4, 1108, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, "Dsp. Fn. 3. 1.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPAL3112, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPAL3112, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPAL3112, PPQRY_VISESTRIAIMP, "A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TO_DATE((31)||'/'||(12)||'/'||(~~PQRY_PARS80.NOMOGGESERIF~~),'dd/mm/yyyy'))", "RECODISPAL31", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_LIST, 3268, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_LIST, "Proposte Variazioni");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_FORM, 4, 940, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_FORM, "Prop. Variazioni");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_PROPOSVARIMP, -1, -1);
    SQL = new StringBuffer();
    SQL.append("NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', NVL(C.IMPORTO_RAG, C.IMPORTO_UFF), C.IMPORTO_UFF)) ");
  SQL.append("from ");
  SQL.append("  PROPOSTE_RIACC C ");
  SQL.append("where (C.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (C.E_S = ~~TBL_PARS32.NOMEOGGETTES~~) ");
  SQL.append("and   (C.PERIODO_RIACC = ~~PQRY_PARS80.CODICE~~) ");
  SQL.append("and   (C.ANNO_IMPACC = A.ANNO_IMP) ");
  SQL.append("and   (C.NUMERO_IMPACC = A.NUMERO_IMP) ");
  SQL.append("and   ((A.ANNO_SUBIMP IS NULL)) ");
  SQL.append("and   ((C.ANNO_SUBIMP IS NULL)) ");
  SQL.append("), 0)");
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROPOSVARIMP, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROPOSVARIMP, PPQRY_VISESTRIAIMP, SQL.toString(), "PROPOSVARIMP", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_LIST, 3372, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_LIST, "Prop. Variazioni Subimpegni");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_FORM, 4, 964, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_FORM, "Prop. Var. Subimp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_PROPOSVARSUB, -1, -1);
    SQL = new StringBuffer();
    SQL.append("NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', NVL(F.IMPORTO_RAG, F.IMPORTO_UFF), F.IMPORTO_UFF)) ");
  SQL.append("from ");
  SQL.append("  PROPOSTE_RIACC F ");
  SQL.append("where (F.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (F.E_S = 'S') ");
  SQL.append("and   (F.PERIODO_RIACC = ~~PQRY_PARS80.CODICE~~) ");
  SQL.append("and   (F.ANNO_IMPACC = A.ANNO_IMP) ");
  SQL.append("and   (F.NUMERO_IMPACC = A.NUMERO_IMP) ");
  SQL.append("and   (NOT ((F.ANNO_SUBIMP IS NULL))) ");
  SQL.append("and   ((A.ANNO_SUBIMP IS NULL) OR (NOT ((A.ANNO_SUBIMP IS NULL)) AND F.NUMERO_SUBIMP = A.NUMERO_SUBIMP AND F.ANNO_SUBIMP = A.ANNO_SUBIMP)) ");
  SQL.append("), 0)");
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROPOSVARSUB, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROPOSVARSUB, PPQRY_VISESTRIAIMP, SQL.toString(), "PROPOSVARSUB", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, 3476, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, "Disp. Finanziaria Risultante");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, 4, 1036, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, "Disp. Finanziaria Risultante");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPFINARISU, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPFINARISU, PPQRY_DUAL1, "~~RECORDISPFIN~~ + NVL(~~PROPOSVARIMP~~, 0) - NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END", "DISPFIPROPO1", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, 3580, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, "Disp. Finanziaria Effettiva");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, 4, 1060, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, "Disp. Finanziaria Effettiva");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPFINAEFFE, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPFINAEFFE, PPQRY_DUAL1, "~~RECODISPEFFE~~ + NVL(~~PROPOSVARIMP~~, 0) - NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END", "DISPFIPROPOS", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, "Ord Anno Subimp");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, 4, 460, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, "Ord Anno Subimp");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ORDANNOSUBIM, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_ORDANNOSUBIM, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ORDANNOSUBIM, PPQRY_VISESTRIAIMP, "DECODE(A.ANNO_SUBIMP, to_number(NULL), -1, A.ANNO_SUBIMP)", "ORDANNOSUBIM", 1, 19, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_LIST, 3684, 36, 52, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_LIST, "Imp. Da Crono");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_FORM, 4, 1648, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CRONOID, MyGlb.PANEL_FORM, "I. D. Cr.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CRONOID, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_CRONOID, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CRONOID, PPQRY_VISESTRIAIMP, "DECODE(A.CRONOPROGRAMMA_ID, to_number(NULL), 'NO', 'SI')", "CRONOID", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_CRONOID, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_CRONOID, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, 3736, 36, 44, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, 44);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, "Ordini");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, 4, 988, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, 44);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, "Ordini");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ORDINI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_ORDINI, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ORDINI, PPQRY_VISESTRIAIMP, "NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'ORD'), 'NO')", "ORDINI", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_ORDINI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_ORDINI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, 3780, 36, 76, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, "Disposizioni");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, 4, 1012, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, "Disposizioni");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPOSIZIONI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPOSIZIONI, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPOSIZIONI, PPQRY_VISESTRIAIMP, "NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DISP'), 'NO')", "DISPOSIZIONI", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISPOSIZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISPOSIZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, 3856, 36, 36, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, "Dist. Liq.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, 4, 1084, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, "Dist Liq");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISTLIQ, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISTLIQ, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISTLIQ, PPQRY_VISESTRIAIMP, "NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DLIQ'), 'NO')", "DISTLIQ", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISTLIQ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISTLIQ, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, 3892, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, "Codice UO");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, 4, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, "Codice UO");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_PROGRUO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROGRUO, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROGRUO, PPQRY_VISESTRIAIMP, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UO,TRUNC( SYSDATE ))", "REVIESRIIMPU", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, 3960, 36, 250, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, "Descrizione U.O.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 28, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, "Descrizione U.O.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRIZIONUO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DESCRIZIONUO, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRIZIONUO, PPQRY_VISESTRIAIMP, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UO,TRUNC( SYSDATE ))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_LIST, 124);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_LIST, "Ord NUmero Subimp");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_FORM, 4, 460, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_FORM, 124);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.PANEL_FORM, "Ord NUmero Subimp");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ORDNUMERSUBI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_ORDNUMERSUBI, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ORDNUMERSUBI, PPQRY_VISESTRIAIMP, "DECODE(A.NUMERO_SUBIMP, to_number(NULL), -1, A.NUMERO_SUBIMP)", "ORDNUMERSUBI", 1, 19, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, 4210, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, "Missione");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, 4, 748, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_MISSIONE, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_MISSIONE, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_MISSIONE, PPQRY_VISESTRIAIMP, "SUBSTR(A.CODICE_STRUTTURA, 1, CASE WHEN A.E_S = 'S' THEN 2 ELSE 1 END)", "MISSIONE", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, 4270, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, 4, 772, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_PROGRAMMA, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROGRAMMA, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROGRAMMA, PPQRY_VISESTRIAIMP, "CASE WHEN A.E_S = 'S' THEN SUBSTR(A.CODICE_STRUTTURA, 3, 2) ELSE SUBSTR(A.CODICE_STRUTTURA, 2, 4) END", "PROGRAMMA", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, 4346, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, 4, 796, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_TITOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_TITOLO, PPQRY_VISESTRIAIMP, "A.TITOLO_RICL", "RECORDTITOLO", 5, 9, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, 4386, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, "Livello IV");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, 4, 820, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, "Livello IV");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CODLIVELLO4, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CODLIVELLO4, PPQRY_VISESTRIAIMP, "A.COD_LIVELLO_4", "RECOCODLIVE4", 1, 9, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, 4462, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, "Livello V");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 844, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, "Livello V");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CODLIVELLO5, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CODLIVELLO5, PPQRY_VISESTRIAIMP, "A.COD_LIVELLO_5", "RECOCODLIVE5", 1, 9, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, "Info Man");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, 4, 1432, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, "Info Man");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_INFOMAN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_INFOMAN, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_INFOMAN, PPQRY_VISESTRIAIMP, "'I'", "INFOMAN", 5, 1, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOMAN, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOMAN, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOMAN, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_LIST, 4562, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_LIST, 136);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_LIST, "Numero Imp. Prov.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_FORM, 4, 1432, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_FORM, 136);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEIMPAPROV, MyGlb.PANEL_FORM, "Numero Imp. Prov.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NUMEIMPAPROV, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NUMEIMPAPROV, PPQRY_VISESTRIAIMP, "A.NUMERO_IMPACC_PROV", "REVIESRIINIP", 1, 9, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_LIST, 4650, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_LIST, 120);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_LIST, "Anno Imp. Prov.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_FORM, 4, 1456, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_FORM, 120);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPAPROV, MyGlb.PANEL_FORM, "Anno Imp. Prov.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOIMPAPROV, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOIMPAPROV, PPQRY_VISESTRIAIMP, "A.ANNO_IMPACC_PROV", "REVIESRIIAIP", 1, 4, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 4738, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, "Reiscr. da Stn.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 4, 1480, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 112);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, "Reiscr. da Stn.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPDAREISSTN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPDAREISSTN, PPQRY_VISESTRIAIMP, "A.IMP_DA_REISCR_STN", "REVIESRIIDRS", 5, 2, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_IMPDAREISSTN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_IMPDAREISSTN, (new IDVariant()), "Null", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_LIST, 4814, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_LIST, 132);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_LIST, "Codice");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_FORM, 4, 1528, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_FORM, 132);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODICEBENEFI, MyGlb.PANEL_FORM, "Codice");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CODICEBENEFI, -1, GRP_ELENCOIMPSUB_BENEFICIARIO);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CODICEBENEFI, PPQRY_VISESTRIAIMP, "A.CODICE_BENEFICIARIO", "REVIESRIIMCB", 2, 15, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_LIST, 4886, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 1552, 544, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_RAGIONSOCIAL, -1, GRP_ELENCOIMPSUB_BENEFICIARIO);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_RAGIONSOCIAL, PPQRY_VISESTRIAIMP, "A.RAGIONE_SOCIALE", "REVIESRIIMRS", 5, 400, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_LIST, 5166, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 1648, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_TIPOVINCOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_TIPOVINCOLO, PPQRY_VISESTRIAIMP, "A.TIPO_VINCOLO", "REVIESRIIMTV", 1, 6, 0, -13997);
  }

  private void PAN_ELENCOIMPSUB_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOIMPSUB.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~RECORDISPFIN~~ + NVL(~~PROPOSVARIMP~~, 0) - NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END as DISPFIPROPO1, ");
    SQL.append("  ~~RECODISPEFFE~~ + NVL(~~PROPOSVARIMP~~, 0) - NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END as DISPFIPROPOS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_ELENCOIMPSUB.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPSUB.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~REVIESRIIMTV~~) ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_ELENCOIMPSUB_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_ELENCOIMPSUB_TIPOVINCOLO, "");
    PAN_ELENCOIMPSUB.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPSUB.SetIMDB(IMDB, "PQRY_VISESTRIAIMP", true);
    PAN_ELENCOIMPSUB.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UO,TRUNC( SYSDATE )) as REVIESRIIMPU, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UO,TRUNC( SYSDATE )) as DESCRIZIONUO, ");
    SQL.append("  A.CAPITOLO as RECORDCAPITO, ");
    SQL.append("  A.ARTICOLO as RECORDARTICO, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI, ");
    SQL.append("  A.NUMERO_IMP as RECORNUMEIMP, ");
    SQL.append("  A.ANNO_IMP as RECORANNOIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as RECONUMESUBI, ");
    SQL.append("  A.ANNO_SUBIMP as RECOANNOSUBI, ");
    SQL.append("  A.DESCR_IMPSUB as RECDESIMPSUB, ");
    SQL.append("  A.SALDO_INI + NVL(A.VARIAZIONI, 0) as REIMAL010120, ");
    SQL.append("  A.VARIAZIONI as RECORDVARIAZ, ");
    SQL.append("  CASE WHEN A.E_S = 'E' THEN A_GET_DISP_ACC_AL(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,TRUNC( SYSDATE )) ELSE A_GET_DISP_IMPSUB_AL(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TRUNC( SYSDATE ),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS32.NOMOGGDIDAGE~~) END as RECORDISPFIN, ");
    SQL.append("  CASE WHEN A.E_S = 'S' THEN A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'EFF',TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0)),'dd/mm/yyyy'),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS32.NOMOGGDIDAGE~~) ELSE to_number(NULL) END as RECODISPEFFE, ");
    SQL.append("  DECODE(A.ANNO_SUBIMP, to_number(NULL), -1, A.ANNO_SUBIMP) as ORDANNOSUBIM, ");
    SQL.append("  DECODE(A.NUMERO_SUBIMP, to_number(NULL), -1, A.NUMERO_SUBIMP) as ORDNUMERSUBI, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  SUM(B.IMPORTO) ");
    SQL.append("from ");
    SQL.append("  LIQ B ");
    SQL.append("where (B.ANNO_LIQ <= A.ESERCIZIO) ");
    SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (NVL(B.ANNO_SUBIMP, 0) = NVL(A.ANNO_SUBIMP, NVL(B.ANNO_SUBIMP, 0))) ");
    SQL.append("and   (NVL(B.NUMERO_SUBIMP, 0) = NVL(A.NUMERO_SUBIMP, NVL(B.NUMERO_SUBIMP, 0))) ");
    SQL.append("and   (NVL(B.ANNO_MAND, 9999) > A.ESERCIZIO) ");
    SQL.append(") as LIQCONESERIF, ");
    SQL.append("  A.MANDATI as RECORDMANDAT, ");
    SQL.append("  'I' as INFOMAN, ");
    SQL.append("  A.COD_LIVELLO_4 as RECOCODLIVE4, ");
    SQL.append("  A.COD_LIVELLO_5 as RECOCODLIVE5, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 1, CASE WHEN A.E_S = 'S' THEN 2 ELSE 1 END) as MISSIONE, ");
    SQL.append("  CASE WHEN A.E_S = 'S' THEN SUBSTR(A.CODICE_STRUTTURA, 3, 2) ELSE SUBSTR(A.CODICE_STRUTTURA, 2, 4) END as PROGRAMMA, ");
    SQL.append("  A.TITOLO_RICL as RECORDTITOLO, ");
    SQL.append("  NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', NVL(C.IMPORTO_RAG, C.IMPORTO_UFF), C.IMPORTO_UFF)) ");
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC C ");
    SQL.append("where (C.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (C.E_S = ~~TBL_PARS32.NOMEOGGETTES~~) ");
    SQL.append("and   (C.PERIODO_RIACC = ~~PQRY_PARS80.CODICE~~) ");
    SQL.append("and   (C.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   ((A.ANNO_SUBIMP IS NULL)) ");
    SQL.append("and   ((C.ANNO_SUBIMP IS NULL)) ");
    SQL.append("), 0) as PROPOSVARIMP, ");
    SQL.append("  NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', NVL(F.IMPORTO_RAG, F.IMPORTO_UFF), F.IMPORTO_UFF)) ");
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC F ");
    SQL.append("where (F.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (F.E_S = 'S') ");
    SQL.append("and   (F.PERIODO_RIACC = ~~PQRY_PARS80.CODICE~~) ");
    SQL.append("and   (F.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (F.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (NOT ((F.ANNO_SUBIMP IS NULL))) ");
    SQL.append("and   ((A.ANNO_SUBIMP IS NULL) OR (NOT ((A.ANNO_SUBIMP IS NULL)) AND F.NUMERO_SUBIMP = A.NUMERO_SUBIMP AND F.ANNO_SUBIMP = A.ANNO_SUBIMP)) ");
    SQL.append("), 0) as PROPOSVARSUB, ");
    SQL.append("  NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'ORD'), 'NO') as ORDINI, ");
    SQL.append("  NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DISP'), 'NO') as DISPOSIZIONI, ");
    SQL.append("  NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DLIQ'), 'NO') as DISTLIQ, ");
    SQL.append("  A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TO_DATE((31)||'/'||(12)||'/'||(~~PQRY_PARS80.NOMOGGESERIF~~),'dd/mm/yyyy')) as RECODISPAL31, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_UFF_IMP END as RECIMPUFFIMP, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_UFF_SUBIMP END as RECIMPSUBUFF, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.TIPO_VAR END as RECORTIPOVAR, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN NULL ELSE A.DESCR_TIPO_VAR END as RECDESTIPVAR, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.ANNO_ESIGIBILITA END as RECOANNOESIG, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.ANNO_ENTRATA END as RECOANNOENTR, ");
    SQL.append("  A.FINANZIAMENTO_OPERA as REVIESRIIMFO, ");
    SQL.append("  A.DESCR_FINOPERA as REVIESRIIMDF, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN NULL ELSE A.NOTE_UFF END as RECORNOTEUFF, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_RAG_IMP END as RECIMPRAGIMP, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN to_number(NULL) ELSE A.IMPORTO_RAG_SUBIMP END as IMPRAGSUBIMP, ");
    SQL.append("  CASE WHEN A.PERIODO_RIACC <> ~~PQRY_PARS80.CODICE~~ THEN NULL ELSE A.NOTE_RAG END as RECORNOTERAG, ");
    SQL.append("  A.NUMERO_IMPACC_PROV as REVIESRIINIP, ");
    SQL.append("  A.ANNO_IMPACC_PROV as REVIESRIIAIP, ");
    SQL.append("  A.IMP_DA_REISCR_STN as REVIESRIIDRS, ");
    SQL.append("  A.CODICE_BENEFICIARIO as REVIESRIIMCB, ");
    SQL.append("  A.RAGIONE_SOCIALE as REVIESRIIMRS, ");
    SQL.append("  A.TIPO_AVANZO as REVIESRIIMTA, ");
    SQL.append("  A.DESC_TIPO_AVANZO as REVIESRIIDTA, ");
    SQL.append("  DECODE(A.CRONOPROGRAMMA_ID, to_number(NULL), 'NO', 'SI') as CRONOID, ");
    SQL.append("  A.TIPO_VINCOLO as REVIESRIIMTV ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIMP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_CSV_RIACC_IMPSUBACC A ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIMP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.PROGR_UO, DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', -1, A.PROGR_UO)) = CASE WHEN NVL(~~PQRY_PARS80.NOMEOGGETTUO~~, -1) = -1 THEN NVL(A.PROGR_UO, -1) ELSE ~~PQRY_PARS80.NOMEOGGETTUO~~ END) ");
    SQL.append("and   (((NVL(~~PQRY_PARS80.NOMEOGGETTUO~~, -1) = -1 AND (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA D ");
    SQL.append("where (D.PROGR_UNITA_ORGANIZZATIVA = A.PROGR_UO) ");
    SQL.append("and   (D.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.TIPO_STRUTTURA = 'LG') ");
    SQL.append(")))) OR A.PROGR_UO = ~~PQRY_PARS80.NOMEOGGETTUO~~)) ");
    SQL.append("and   (A_GET_DISP_IMP_SUB_ACC(CASE WHEN NVL(~~TBL_PARS32.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0) ELSE ~~TBL_DATISESSIONE.SESSIOESERCI~~ END,A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,NVL(~~TBL_PARS32.NOMOGGTIPDIS~~, 'EFF'),CASE WHEN NVL(~~TBL_PARS32.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0)),'dd/mm/yyyy') ELSE TRUNC( SYSDATE ) END,~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS32.NOMOGGDIDAGE~~) > 0 OR ((A.ANNO_SUBIMP IS NULL) AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  VISTA_ESTRAZ_RIACC_IMPSUBACC SUB ");
    SQL.append("where (SUB.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (SUB.E_S = A.E_S) ");
    SQL.append("and   (NOT ((SUB.ANNO_SUBIMP IS NULL))) ");
    SQL.append("and   (SUB.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (SUB.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (A_GET_DISP_IMP_SUB_ACC(CASE WHEN NVL(~~TBL_PARS32.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0) ELSE ~~TBL_DATISESSIONE.SESSIOESERCI~~ END,SUB.E_S,SUB.ANNO_IMP,SUB.NUMERO_SUBIMP,SUB.ANNO_SUBIMP,SUB.NUMERO_SUBIMP,NVL(~~TBL_PARS32.NOMOGGTIPDIS~~, 'EFF'),CASE WHEN NVL(~~TBL_PARS32.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS80.NOMOGGESERIF~~, 0)),'dd/mm/yyyy') ELSE TRUNC( SYSDATE ) END,~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS32.NOMOGGDIDAGE~~) > 0) ");
    SQL.append(")) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC prop2 ");
    SQL.append("where (prop2.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (prop2.E_S = A.E_S) ");
    SQL.append("and   (prop2.PERIODO_RIACC = ~~PQRY_PARS80.CODICE~~) ");
    SQL.append("and   (prop2.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (prop2.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (NVL(prop2.ANNO_IMPACC, 0) = NVL(A.ANNO_IMP, NVL(prop2.ANNO_IMPACC, 0))) ");
    SQL.append("and   (NVL(prop2.NUMERO_IMPACC, 0) = NVL(A.NUMERO_IMP, NVL(prop2.NUMERO_IMPACC, 0))) ");
    SQL.append(")))) ");
    SQL.append("and   (NOT ((~~PQRY_PARS80.NOMOGGESERIF~~ IS NULL))) ");
    SQL.append("and   (NVL(A.PERIODO_RIACC, -1) = CASE WHEN ~~PQRY_PARS80.NOOGANIMSUSP~~ = 'NO' THEN ~~PQRY_PARS80.CODICE~~ ELSE DECODE(A.PERIODO_RIACC, to_number(NULL), NVL(A.PERIODO_RIACC, -1), CASE WHEN A.PERIODO_RIACC = ~~PQRY_PARS80.CODICE~~ THEN ~~PQRY_PARS80.CODICE~~ ELSE CASE WHEN NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC E ");
    SQL.append("where (E.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (E.E_S = A.E_S) ");
    SQL.append("and   (E.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (E.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (NVL(E.ANNO_SUBIMP, 0) = NVL(A.ANNO_SUBIMP, NVL(E.ANNO_SUBIMP, 0))) ");
    SQL.append("and   (NVL(E.NUMERO_SUBIMP, 0) = NVL(A.NUMERO_SUBIMP, NVL(E.NUMERO_SUBIMP, 0))) ");
    SQL.append("and   (E.PERIODO_RIACC = ~~PQRY_PARS80.CODICE~~) ");
    SQL.append("))) THEN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MIN(P.PERIODO_RIACC) ");
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC P ");
    SQL.append("where (P.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (P.E_S = A.E_S) ");
    SQL.append("and   (P.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (P.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (NVL(P.ANNO_SUBIMP, 0) = NVL(A.ANNO_SUBIMP, NVL(P.ANNO_SUBIMP, 0))) ");
    SQL.append("and   (NVL(P.NUMERO_SUBIMP, 0) = NVL(A.NUMERO_SUBIMP, NVL(P.NUMERO_SUBIMP, 0))) ");
    SQL.append(") ELSE ~~PQRY_PARS80.CODICE~~ END END) END) ");
    SQL.append("and   (A.E_S = ~~PQRY_PARS80.NOMEOGGETTES~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARS80.NOMOGGESERIF~~) ");
    SQL.append("and   (~~PQRY_PARS80.NOOGANIMSUSP~~ = 'SI' OR (~~PQRY_PARS80.NOOGANIMSUSP~~ = 'NO' AND NOT ((A.PERIODO_RIACC IS NULL)))) ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIMP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIMP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIMP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 7, 6, 15, 16 ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIMP, 5, SQL, -1, "");
    PAN_ELENCOIMPSUB.SetQueryDB(PPQRY_VISESTRIAIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPSUB.SetMasterTable(0, "VISTA_CSV_RIACC_IMPSUBACC");
    PAN_ELENCOIMPSUB.AddToSortList(PFL_ELENCOIMPSUB_ANNOIMP, true);
    PAN_ELENCOIMPSUB.AddToSortList(PFL_ELENCOIMPSUB_NUMEROIMP, true);
    PAN_ELENCOIMPSUB.AddToSortList(PFL_ELENCOIMPSUB_ORDANNOSUBIM, true);
    PAN_ELENCOIMPSUB.AddToSortList(PFL_ELENCOIMPSUB_ORDNUMERSUBI, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOIMPSUB.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOIMPSUB.iUseListQBE;
      PAN_ELENCOIMPSUB.iUseListQBE = 0;
      PAN_ELENCOIMPSUB.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOIMPSUB.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOIMPSUB.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_AfterFind(CmdFind);
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
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
