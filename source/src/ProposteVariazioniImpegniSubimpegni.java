// **********************************************
// Proposte Variazioni Impegni Subimpegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProposteVariazioniImpegniSubimpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_PERIODORIAC1 = 0;
  private static int PFL_PARS_ESERCIZIORIF = 1;
  private static int PFL_PARS_UO = 2;
  private static int PFL_PARS_PERIODORIAC2 = 3;
  private static int PFL_PARS_MISSIONE1 = 4;
  private static int PFL_PARS_PROGRAMMA1 = 5;
  private static int PFL_PARS_TITOLO1 = 6;
  private static int PFL_PARS_CAPITOLO1 = 7;
  private static int PFL_PARS_ARTICOLO1 = 8;
  private static int PFL_PARS_ETICSCELCAPI = 9;
  private static int PFL_PARS_INFOCAPITOL1 = 10;
  private static int PFL_PARS_TIPODISP = 11;
  private static int PFL_PARS_ES1 = 12;
  private static int PFL_PARS_ETICINDIPERE = 13;

  private static int PPQRY_PARS84 = 0;

  private static int PPQRY_PERIODRIACCE = 1;

  private static int PPQRY_DUAL2 = 2;
  private static int PPQRY_VISTMISSPRO1 = 3;
  private static int PPQRY_VISTMISSPROG = 4;
  private static int PPQRY_VISTSTRURICL = 5;


  IDPanel PAN_PARS;
  private static int GRP_ELENCOIMPSUB_IMPEGNPROVEN = 0;
  private static int GRP_ELENCOIMPSUB_SUBIMPPROVEN = 1;

  private static int PFL_ELENCOIMPSUB_CAPITOLO = 0;
  private static int PFL_ELENCOIMPSUB_ARTICOLO = 1;
  private static int PFL_ELENCOIMPSUB_INFOCAPITOLO = 2;
  private static int PFL_ELENCOIMPSUB_DESCRIZIONE = 3;
  private static int PFL_ELENCOIMPSUB_NUMEROIMP = 4;
  private static int PFL_ELENCOIMPSUB_ANNOIMP = 5;
  private static int PFL_ELENCOIMPSUB_INFOIMPEGNO = 6;
  private static int PFL_ELENCOIMPSUB_NUMEROSUBIM1 = 7;
  private static int PFL_ELENCOIMPSUB_ANNOSUBIMP1 = 8;
  private static int PFL_ELENCOIMPSUB_INFOSUBIMPEG = 9;
  private static int PFL_ELENCOIMPSUB_DESCRIMPSUBI = 10;
  private static int PFL_ELENCOIMPSUB_IMPATTUALE = 11;
  private static int PFL_ELENCOIMPSUB_VARIAZIONI = 12;
  private static int PFL_ELENCOIMPSUB_LIQCONESERIF = 13;
  private static int PFL_ELENCOIMPSUB_MANDATI = 14;
  private static int PFL_ELENCOIMPSUB_INFOMAN = 15;
  private static int PFL_ELENCOIMPSUB_DISPAL3112 = 16;
  private static int PFL_ELENCOIMPSUB_DISPONIBIFIN = 17;
  private static int PFL_ELENCOIMPSUB_DISPEFFETTIV = 18;
  private static int PFL_ELENCOIMPSUB_PROPOSVARIMP = 19;
  private static int PFL_ELENCOIMPSUB_PROPOSVARSUB = 20;
  private static int PFL_ELENCOIMPSUB_DISPFINARISU = 21;
  private static int PFL_ELENCOIMPSUB_DISPFINAEFFE = 22;
  private static int PFL_ELENCOIMPSUB_NUMERIMPPROV = 23;
  private static int PFL_ELENCOIMPSUB_ANNOIMPPROVE = 24;
  private static int PFL_ELENCOIMPSUB_NUMESUBIPROV = 25;
  private static int PFL_ELENCOIMPSUB_ANNOSUBIPROV = 26;
  private static int PFL_ELENCOIMPSUB_ORDANNOSUBIM = 27;
  private static int PFL_ELENCOIMPSUB_IMPDAREISSTN = 28;
  private static int PFL_ELENCOIMPSUB_VIESRIIMCRID = 29;
  private static int PFL_ELENCOIMPSUB_ORDINI = 30;
  private static int PFL_ELENCOIMPSUB_DISPOSIZIONI = 31;
  private static int PFL_ELENCOIMPSUB_DISTLIQ = 32;
  private static int PFL_ELENCOIMPSUB_PROGRUO = 33;
  private static int PFL_ELENCOIMPSUB_DESCRIZIONUO = 34;
  private static int PFL_ELENCOIMPSUB_ORDNUMERSUBI = 35;
  private static int PFL_ELENCOIMPSUB_MISSIONE = 36;
  private static int PFL_ELENCOIMPSUB_PROGRAMMA = 37;
  private static int PFL_ELENCOIMPSUB_TITOLO = 38;
  private static int PFL_ELENCOIMPSUB_CODLIVELLO4 = 39;
  private static int PFL_ELENCOIMPSUB_CODLIVELLO5 = 40;
  private static int PFL_ELENCOIMPSUB_ETICHEIMPEGN = 41;
  private static int PFL_ELENCOIMPSUB_ETICHESUBIMP = 42;

  private static int PPQRY_VISESTRIAIM1 = 0;

  private static int PPQRY_DUAL3 = 1;
  private static int PPQRY_DUAL1 = 2;


  IDPanel PAN_ELENCOIMPSUB;
  private static int GRP_PROPOSVARIAZ_VARIAZCRONOP = 0;

  private static int PFL_PROPOSVARIAZ_PROGRESSIVO = 0;
  private static int PFL_PROPOSVARIAZ_PERIODORIACC = 1;
  private static int PFL_PROPOSVARIAZ_ESERCIZIO = 2;
  private static int PFL_PROPOSVARIAZ_ES = 3;
  private static int PFL_PROPOSVARIAZ_ANNOIMPACC = 4;
  private static int PFL_PROPOSVARIAZ_NUMEROIMPACC = 5;
  private static int PFL_PROPOSVARIAZ_ANNOSUBIMP = 6;
  private static int PFL_PROPOSVARIAZ_NUMEROSUBIMP = 7;
  private static int PFL_PROPOSVARIAZ_IMPORTOUFF = 8;
  private static int PFL_PROPOSVARIAZ_TIPOVARIAZIO = 9;
  private static int PFL_PROPOSVARIAZ_ANNOESIGIBIL = 10;
  private static int PFL_PROPOSVARIAZ_ANNOENTRATA = 11;
  private static int PFL_PROPOSVARIAZ_FINOPERA = 12;
  private static int PFL_PROPOSVARIAZ_TIPOAVANZO = 13;
  private static int PFL_PROPOSVARIAZ_NOTEUFF = 14;
  private static int PFL_PROPOSVARIAZ_DUALNOTAUFF = 15;
  private static int PFL_PROPOSVARIAZ_IMPORTORAG = 16;
  private static int PFL_PROPOSVARIAZ_NOTERAG = 17;
  private static int PFL_PROPOSVARIAZ_DUALNOTARAG = 18;
  private static int PFL_PROPOSVARIAZ_CRONOPROGRAM = 19;
  private static int PFL_PROPOSVARIAZ_ANNOESIGCRON = 20;
  private static int PFL_PROPOSVARIAZ_ANNOENTRCRON = 21;
  private static int PFL_PROPOSVARIAZ_FINANZDESTIN = 22;
  private static int PFL_PROPOSVARIAZ_GESTIOAVANZO = 23;
  private static int PFL_PROPOSVARIAZ_T55MOTIVO = 24;

  private static int PPQRY_PROPOSTRIAC1 = 0;

  private static int PPQRY_DUAL = 1;
  private static int PPQRY_T55 = 2;
  private static int PPQRY_CRONOPROGRAM = 3;

  private static int PPQRY_T56 = 4;
  private static int PPQRY_IMPFIN = 5;
  private static int PPQRY_TIPIAVANZO = 6;
  private static int PPQRY_TESTATCRONOP = 7;
  private static int PPQRY_FINANZIAMENT = 8;


  IDPanel PAN_PROPOSVARIAZ;

  // Definition of Global Variables
  private IDVariant RIGAATTUALER = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS85(IMDB);
    //
    //
    Init_PQRY_PARS84(IMDB);
    Init_PQRY_PARS84_RS(IMDB);
    Init_PQRY_VISESTRIAIM1(IMDB);
    Init_PQRY_PROPOSTRIAC1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS85(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS85, 13);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS85, "TBL_PARS85");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGETITO,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMOGGTIPDIS, "NOMOGGTIPDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMOGGTIPDIS,5,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMOGGDIDAGE, "NOMOGGDIDAGE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMOGGDIDAGE,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEQUAL, "NOMEOGGEQUAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOMEOGGEQUAL,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOOGTICADIFI, "NOOGTICADIFI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS85,IMDBDef5.FLD_PARS85_NOOGTICADIFI,5,50,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS85, 0);
  }

  private static void Init_PQRY_PARS84(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARS84, 9);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARS84, "PQRY_PARS84");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGETITO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84,IMDBDef14.PQSL_PARS84_NOMEOGGETTES,5,1,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARS84, 0);
  }

  private static void Init_PQRY_PARS84_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARS84_RS, 9);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARS84_RS, "PQRY_PARS84_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGETITO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGETTUO, "NOMEOGGETTUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGETTUO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS84_RS,IMDBDef14.PQSL_PARS84_NOMEOGGETTES,5,1,0);
  }

  private static void Init_PQRY_VISESTRIAIM1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_VISESTRIAIM1, 36);
    IMDB.set_TblCode(IMDBDef14.PQRY_VISESTRIAIM1, "PQRY_VISESTRIAIM1");
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIMPU, "REVIESRIIMPU");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIMPU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_DESCRIZIONUO, "DESCRIZIONUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_DESCRIZIONUO,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDARTICO, "RECORDARTICO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, "RECORNUMEIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, "RECORANNOIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, "RECONUMESUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, "RECOANNOSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECDESIMPSUB, "RECDESIMPSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECDESIMPSUB,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORIMPATTU, "RECORIMPATTU");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORIMPATTU,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDVARIAZ, "RECORDVARIAZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDVARIAZ,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDISPFIN, "RECORDISPFIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDISPFIN,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECODISPEFFE, "RECODISPEFFE");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECODISPEFFE,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_ORDANNOSUBIM, "ORDANNOSUBIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_ORDANNOSUBIM,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_ORDNUMERSUBI, "ORDNUMERSUBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_ORDNUMERSUBI,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_LIQCONESERIF, "LIQCONESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_LIQCONESERIF,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDMANDAT, "RECORDMANDAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDMANDAT,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_INFOMAN, "INFOMAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_INFOMAN,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECOCODLIVE4, "RECOCODLIVE4");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECOCODLIVE4,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECOCODLIVE5, "RECOCODLIVE5");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECOCODLIVE5,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_MISSIONE, "MISSIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_MISSIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_PROGRAMMA,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDTITOLO, "RECORDTITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECORDTITOLO,5,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_PROPOSVARIMP, "PROPOSVARIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_PROPOSVARIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_PROPOSVARSUB, "PROPOSVARSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_PROPOSVARSUB,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_ORDINI, "ORDINI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_ORDINI,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_DISPOSIZIONI, "DISPOSIZIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_DISPOSIZIONI,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_DISTLIQ, "DISTLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_DISTLIQ,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECODISPAL31, "RECODISPAL31");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_RECODISPAL31,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIINIP, "REVIESRIINIP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIINIP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIAIP, "REVIESRIIAIP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIAIP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIINSP, "REVIESRIINSP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIINSP,1,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIASP, "REVIESRIIASP");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIASP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIDRS, "REVIESRIIDRS");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIDRS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIMCI, "REVIESRIIMCI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISESTRIAIM1,IMDBDef14.PQSL_VISESTRIAIM1_REVIESRIIMCI,5,99,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_VISESTRIAIM1, 0);
  }

  private static void Init_PQRY_PROPOSTRIAC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PROPOSTRIAC1, 20);
    IMDB.set_TblCode(IMDBDef14.PQRY_PROPOSTRIAC1, "PQRY_PROPOSTRIAC1");
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_PERIODO_RIACC, "PERIODO_RIACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_PERIODO_RIACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA, "ANNO_ENTRATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, "IMPORTO_UFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_UFF, "NOTE_UFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_UFF,5,2000,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG, "IMPORTO_RAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_RAG, "NOTE_RAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_RAG,5,2000,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_OPERA, "FINANZIAMENTO_OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA_CRONO, "ANNO_ESIGIBILITA_CRONO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA_CRONO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA_CRONO, "ANNO_ENTRATA_CRONO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA_CRONO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_DESTINAZIONE, "FINANZIAMENTO_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PROPOSTRIAC1,IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_DESTINAZIONE,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PROPOSTRIAC1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProposteVariazioniImpegniSubimpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProposteVariazioniImpegniSubimpegni()
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
    FormIdx = MyGlb.FRM_PROVARIMPSUB;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4E49FDB9-3158-44AF-8F60-DB12AC0B6559";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1196;
    DesignHeight = 974;
    set_Caption(new IDVariant("Proposte Variazioni Impegni/Subimpegni"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1196;
    Frames[1].Height = 948;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0886076;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1196;
    Frames[2].Height = 84;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 84;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1196-MyGlb.PAN_OFFS_X, 84-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9457B137-8B23-431D-BAD8-5719C48AF408");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 956, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    Frames[3].Width = 1196;
    Frames[3].Height = 864;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.541667;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 1196;
    Frames[4].Height = 468;
    Frames[4].Caption = "Impegni/SubImpegni";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 468;
    PAN_ELENCOIMPSUB = new IDPanel(w, this, 4, "PAN_ELENCOIMPSUB");
    Frames[4].Content = PAN_ELENCOIMPSUB;
    PAN_ELENCOIMPSUB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOIMPSUB.VS = MainFrm.VisualStyleList;
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1196-MyGlb.PAN_OFFS_X, 468-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "077F532D-96BD-49C1-AA33-2FA24E66E723");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2954, 376, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOIMPSUB.InitStatus = 2;
    PAN_ELENCOIMPSUB_Init();
    PAN_ELENCOIMPSUB_InitFields();
    PAN_ELENCOIMPSUB_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 1196;
    Frames[5].Height = 396;
    Frames[5].Caption = "Proposte Variazione";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 396;
    PAN_PROPOSVARIAZ = new IDPanel(w, this, 5, "PAN_PROPOSVARIAZ");
    Frames[5].Content = PAN_PROPOSVARIAZ;
    PAN_PROPOSVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROPOSVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1196-MyGlb.PAN_OFFS_X, 396-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E30885CE-F5C7-4486-805E-F61AA1FE289E");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2088, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROPOSVARIAZ.InitStatus = 2;
    PAN_PROPOSVARIAZ_Init();
    PAN_PROPOSVARIAZ_InitFields();
    PAN_PROPOSVARIAZ_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_EXPORTEXCEL+BaseCmdLinIdx)
      {
        ExportExcel();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NASILPANDEPA+BaseCmdLinIdx)
      {
        NascondiilpannellodeiParametri();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZAGG+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUPFUNZAGG+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FA+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUPROPRIAC+BaseCmdSetIdx, "M" + (MyGlb.CMD_FA+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIVALOCOM2+BaseCmdLinIdx)
      {
        Aggiornavaloricomuni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIVALOCOM4+BaseCmdLinIdx)
      {
        AggiornaValoriComuni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIMPRADASU+BaseCmdLinIdx)
      {
        ShowAgg();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAVARIAZ+BaseCmdLinIdx)
      {
        GenerazioneVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINVARIAZ+BaseCmdLinIdx)
      {
        EliminazioneVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx)
      {
        ProposteDaSubimpegni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUSUORDINI+BaseCmdLinIdx)
      {
        ChiusuraOrdini();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DIFFIMPESUBI+BaseCmdLinIdx)
      {
        DifferenzeImpegniSubimpegni();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARS85, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PROVARIMPSUB_PARS84();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_ELENCOIMPSUB.UpdatePanel(MainFrm);
      PAN_PROPOSVARIAZ.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_ETICSCELCAPI) {
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
    return (obj instanceof ProposteVariazioniImpegniSubimpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProposteVariazioniImpegniSubimpegni.class.getName() : (Glb.ClassWithPackage(ProposteVariazioniImpegniSubimpegni.class) ? ProposteVariazioniImpegniSubimpegni.class.getName().substring(ProposteVariazioniImpegniSubimpegni.class.getPackage().getName().length() + 1) : ProposteVariazioniImpegniSubimpegni.class.getName()));
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
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Proposte Variazioni "));
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        v_CAPTION = IDL.Add(v_CAPTION, (new IDVariant("Impegni/Subimpegni")));
      }
      else
      {
        v_CAPTION = IDL.Add(v_CAPTION, (new IDVariant("Accertamenti")));
      }
      if (Column.equals((new IDVariant(PFL_PARS_PERIODORIAC2)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0))))
        {
          IDVariant v_VTIPO = new IDVariant(0,IDVariant.STRING);
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
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VTIPO = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
            v_VDAL = QV.Get("PERRIADATINI", IDVariant.DATETIME) ;
            v_VAL = QV.Get("PERRIADATFIN", IDVariant.DATETIME) ;
            v_VPERRIAFILDI = QV.Get("IINPRFDEIPRF", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VTIPO.equals((new IDVariant("CONS")), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
          }
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Disp. Fin. 31/12/"));
          v_S1 = IDL.Add(((IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOOGTICADIFI, 0),(new IDVariant("C"))).equals((new IDVariant("C")), true))?IDL.Left(v_S1, (new IDVariant(11))):v_S1), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0)));
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPAL3112, new IDVariant(v_S1).stringValue());
          IDVariant v_FASEESEFINOK = null;
          v_FASEESEFINOK = MainFrm.ControlloFaseEsefin(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
          if ((IDL.Today().compareTo(v_VDAL, true)>=0 && IDL.Today().compareTo(v_VAL, true)<=0) && v_FASEESEFINOK.compareTo((new IDVariant(0)), true)>=0)
          {
            set_Caption(new IDVariant(v_CAPTION));
            PAN_PROPOSVARIAZ.set_Locked((new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
          else
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant(" - PERIODO RIACCERTAMENTO CHIUSO"));
            IDVariant K = new IDVariant(0,IDVariant.STRING);
            K = (new IDVariant(" - GESTIONE MOVIMENTI NON AMMESSA PER ESERCIZIO RIF."));
            set_Caption(IDL.Add(IDL.Add(v_CAPTION, ((!((IDL.Today().compareTo(v_VDAL, true)>=0 && IDL.Today().compareTo(v_VAL, true)<=0)))?S:(new IDVariant("")))), ((v_FASEESEFINOK.compareTo((new IDVariant(0)), true)<0)?K:(new IDVariant("")))));
            if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0 || v_FASEESEFINOK.compareTo((new IDVariant(0)), true)<0)
            {
              PAN_PROPOSVARIAZ.set_Locked((new IDVariant(-1)).booleanValue());
              MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            }
          }
          if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGTIPDIS, 0, (new IDVariant("FIN")));
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGTIPDIS, 0, IDL.NullValue(v_VPERRIAFILDI,(new IDVariant("EFF"))));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_ESERCIZIORIF)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ESEFIN A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0, (new IDVariant()));
          }
          else
          {
            IDVariant v_VDAL = null;
            v_VDAL = (new IDVariant());
            IDVariant v_VAL = null;
            v_VAL = (new IDVariant());
            IDVariant v_FASEESEFINOK = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DATA_INIZIO as PERRIADATINI, ");
            SQL.append("  A.DATA_FINE as PERRIADATFIN ");
            SQL.append("from ");
            SQL.append("  PERIODI_RIACCERTAMENTI A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VDAL = QV.Get("PERRIADATINI", IDVariant.DATETIME) ;
              v_VAL = QV.Get("PERRIADATFIN", IDVariant.DATETIME) ;
            }
            QV.Close();
            v_FASEESEFINOK = MainFrm.ControlloFaseEsefin(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
            if ((IDL.Today().compareTo(v_VDAL, true)>=0 && IDL.Today().compareTo(v_VAL, true)<=0) && v_FASEESEFINOK.compareTo((new IDVariant(0)), true)>=0)
            {
              set_Caption(new IDVariant(v_CAPTION));
              PAN_PROPOSVARIAZ.set_Locked((new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            }
            else
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant(" - PERIODO RIACCERTAMENTO CHIUSO"));
              IDVariant K = new IDVariant(0,IDVariant.STRING);
              K = (new IDVariant(" - GESTIONE MOVIMENTI NON AMMESSA PER ESERCIZIO RIF."));
              set_Caption(IDL.Add(IDL.Add(v_CAPTION, ((!((IDL.Today().compareTo(v_VDAL, true)>=0 && IDL.Today().compareTo(v_VAL, true)<=0)))?S:(new IDVariant("")))), ((v_FASEESEFINOK.compareTo((new IDVariant(0)), true)<0)?K:(new IDVariant("")))));
              if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0 || v_FASEESEFINOK.compareTo((new IDVariant(0)), true)<0)
              {
                PAN_PROPOSVARIAZ.set_Locked((new IDVariant(-1)).booleanValue());
                MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
              else
              {
                PAN_PROPOSVARIAZ.set_Locked((new IDVariant(0)).booleanValue());
              }
            }
          }
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Disp. Fin. 31/12/"));
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPAL3112, IDL.Add(((IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOOGTICADIFI, 0),(new IDVariant("C"))).equals((new IDVariant("C")), true))?IDL.Left(v_S1, (new IDVariant(11))):v_S1), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))).stringValue());
          IDVariant v_IMPATTUALE = new IDVariant(0,IDVariant.STRING);
          v_IMPATTUALE = (new IDVariant("Imp. Attuale"));
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_IMPATTUALE, IDL.Add(IDL.Add(v_IMPATTUALE, (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))).stringValue());
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MANDATI, IDL.Add(IDL.Add((new IDVariant("Mandati")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))).stringValue());
          PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_LIQCONESERIF, IDL.Add(IDL.Add((new IDVariant("Liquidazioni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))).stringValue());
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARS_CAPITOLO1)), true) || Column.equals((new IDVariant(PFL_PARS_ARTICOLO1)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGEARTI, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            S = (new IDVariant("Capitolo inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGECAPI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGEARTI, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_MISSIONE1)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGEPROG, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ParsOnUpdatingRow", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGECAPI, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGEARTI, 0)))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0)))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ParsOnDynamicProperties", _e);
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
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ParsAfterFind", _e);
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
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Proposte Variazioni "));
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Impegni/Subimpegni"));
        v_CAPTION = IDL.Add(v_CAPTION, S);
        PAN_ELENCOIMPSUB.set_FixedCols((new IDVariant(10)).intValue());
        // MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZAGG+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIMPRADASU+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENERAVARIAZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIAZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUSUORDINI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DIFFIMPESUBI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMEROIMP, (new IDVariant("Numero Imp.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMP, (new IDVariant("Anno Imp.")).stringValue());
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Accertamenti"));
        v_CAPTION = IDL.Add(v_CAPTION, S);
        PAN_ELENCOIMPSUB.set_FixedCols((new IDVariant(7)).intValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMEROIMP, (new IDVariant("Numero Acc.")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMP, (new IDVariant("Anno Acc.")).stringValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
        {
          // MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZAGG+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIMPRADASU+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENERAVARIAZ+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIAZ+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENERAVARIAZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIAZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUSUORDINI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DIFFIMPESUBI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      set_Caption(new IDVariant(v_CAPTION));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0))))
      {
        // 
        // controlli
        // 
        {
          IDVariant v_VDAL = null;
          v_VDAL = (new IDVariant());
          IDVariant v_VAL = null;
          v_VAL = (new IDVariant());
          IDVariant v_FASEESEFINOK = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DATA_INIZIO as PERRIADATINI, ");
          SQL.append("  A.DATA_FINE as PERRIADATFIN ");
          SQL.append("from ");
          SQL.append("  PERIODI_RIACCERTAMENTI A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VDAL = QV.Get("PERRIADATINI", IDVariant.DATETIME) ;
            v_VAL = QV.Get("PERRIADATFIN", IDVariant.DATETIME) ;
          }
          QV.Close();
          v_FASEESEFINOK = MainFrm.ControlloFaseEsefin(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
          if ((IDL.Today().compareTo(v_VDAL, true)>=0 && IDL.Today().compareTo(v_VAL, true)<=0) && v_FASEESEFINOK.compareTo((new IDVariant(0)), true)>=0)
          {
            set_Caption(new IDVariant(v_CAPTION));
            PAN_PROPOSVARIAZ.set_Locked((new IDVariant(0)).booleanValue());
          }
          else
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant(" - PERIODO RIACCERTAMENTO CHIUSO"));
            IDVariant K = new IDVariant(0,IDVariant.STRING);
            K = (new IDVariant(" - GESTIONE MOVIMENTI NON AMMESSA PER ESERCIZIO RIF."));
            set_Caption(IDL.Add(IDL.Add(v_CAPTION, ((!((IDL.Today().compareTo(v_VDAL, true)>=0 && IDL.Today().compareTo(v_VAL, true)<=0)))?S:(new IDVariant("")))), ((v_FASEESEFINOK.compareTo((new IDVariant(0)), true)<0)?K:(new IDVariant("")))));
            if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0 || v_FASEESEFINOK.compareTo((new IDVariant(0)), true)<0)
            {
              PAN_PROPOSVARIAZ.set_Locked((new IDVariant(-1)).booleanValue());
            }
            else
            {
              PAN_PROPOSVARIAZ.set_Locked((new IDVariant(0)).booleanValue());
            }
          }
        }
      }
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        PAN_ELENCOIMPSUB.set_FieldText(PFL_ELENCOIMPSUB_ETICHEIMPEGN, (new IDVariant("Accertamento")).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione Accertamento"));
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRIMPSUBI, new IDVariant(S).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MANDATI, IDL.Add(IDL.Add((new IDVariant("Ordinativi")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0))).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_LIQCONESERIF, IDL.Add(IDL.Add((new IDVariant("Liquidazioni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MISSIONE, (new IDVariant("Titolo")).stringValue());
        PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_MISSIONE1, (new IDVariant("Titolo")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_PROGRAMMA, (new IDVariant("Tipologia")).stringValue());
        PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_PROGRAMMA1, (new IDVariant("Tipologia")).stringValue());
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Accertamenti"));
        Frames[PAN_ELENCOIMPSUB.FrIndex].set_Caption(new IDVariant(v_S1).stringValue());
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIMPRADASU+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_PROPOSVARIAZ.set_Header(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_FINOPERA, (new IDVariant("Opera")).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMERIMPPROV, (new IDVariant("Acc. Provenienza")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_GROUP,GRP_ELENCOIMPSUB_IMPEGNPROVEN,(new IDVariant("Acc. Provenienza")).stringValue()); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ELENCOIMPSUB.set_FieldText(PFL_ELENCOIMPSUB_ETICHEIMPEGN, (new IDVariant("Impegno")).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione Impegno/SubImpegno"));
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DESCRIMPSUBI, new IDVariant(S).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MANDATI, IDL.Add(IDL.Add((new IDVariant("Mandati")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0))).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_LIQCONESERIF, IDL.Add(IDL.Add((new IDVariant("Liquidazioni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MISSIONE, (new IDVariant("Missione")).stringValue());
        PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_MISSIONE1, (new IDVariant("Missione")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_PROGRAMMA, (new IDVariant("Programma")).stringValue());
        PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_PROGRAMMA1, (new IDVariant("Programma")).stringValue());
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Impegni/SubImpegni"));
        Frames[PAN_ELENCOIMPSUB.FrIndex].set_Caption(new IDVariant(v_S1).stringValue());
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFAES")), true)!=0)
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIMPRADASU+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        PAN_PROPOSVARIAZ.set_Header(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_FINOPERA, (new IDVariant("Finanziamento")).stringValue());
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMERIMPPROV, (new IDVariant("Imp. Provenienza")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_GROUP,GRP_ELENCOIMPSUB_IMPEGNPROVEN,(new IDVariant("Imp. Provenienza")).stringValue()); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "VisibilitàECaptionInBaseAES", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta cApitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltacApitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta cApitolo Body
      // Corpo Procedura
      // 
      if (PAN_PARS.Locked())
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "EtichettaSceltacApitolo", _e);
      return -1;
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORDCAPITO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORDARTICO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "InfoCapitolo", _e);
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
      MainFrm.VALORICOMUNI = (IDArray)new IDArray();
      IDVariant v_SREG = new IDVariant(0,IDVariant.STRING);
      v_SREG = (new IDVariant("Filtro Disp. 31/12"));
      IDVariant v_SRIACC = new IDVariant(0,IDVariant.STRING);
      v_SRIACC = (new IDVariant("RIACCERTAMENTI"));
      IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOOGTICADIFI, 0, MainFrm.AFC.GetRegistro(v_SREG, IDL.Add(IDL.Add((new IDVariant("CFA")), (new IDVariant("/"))), v_SRIACC)));
      PAN_PARS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VMAX = new IDVariant(0,IDVariant.INTEGER);
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
        IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_CODICE, 0, new IDVariant(v_VMAX));
        IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0, new IDVariant(v_VMAX));
        if (v_VTIPO.equals((new IDVariant("CONS")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
          IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
        }
        if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGTIPDIS, 0, (new IDVariant("FIN")));
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGTIPDIS, 0, IDL.NullValue(v_VPERRIAFILDI,(new IDVariant("EFF"))));
        }
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Disp. Fin. 31/12/"));
        v_S1 = IDL.Add(((IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOOGTICADIFI, 0),(new IDVariant("C"))).equals((new IDVariant("C")), true))?IDL.Left(v_S1, (new IDVariant(11))):v_S1), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0)));
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPAL3112, new IDVariant(v_S1).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_IMPATTUALE, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_IMPATTUALE))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0))).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MANDATI, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_MANDATI))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0))).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_LIQCONESERIF, IDL.Add(IDL.Add((new IDVariant("Liquidazioni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0))).stringValue());
      }
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPONIBIFIN, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPONIBIFIN))), (new IDVariant(" "))), IDL.Format(IDL.Today(), (new IDVariant("dd/mm/yyyy")), MainFrm)).stringValue());
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPEFFETTIV, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPEFFETTIV))), (new IDVariant(" "))), IDL.Format(IDL.Today(), (new IDVariant("dd/mm/yyyy")), MainFrm)).stringValue());
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINARISU, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINARISU))), (new IDVariant(" "))), IDL.Format(IDL.Today(), (new IDVariant("dd/mm/yyyy")), MainFrm)).stringValue());
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINAEFFE, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINAEFFE))), (new IDVariant(" "))), IDL.Format(IDL.Today(), (new IDVariant("dd/mm/yyyy")), MainFrm)).stringValue());
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSVARIAZ.set_Header(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_IMPORTOUFF, (new IDVariant("Importo Ufficio")).stringValue());
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSVARIAZ.set_Header(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_NOTEUFF, (new IDVariant("Note Ufficio")).stringValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIMPRADASU+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENERAVARIAZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIAZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        // 
        // CFAES ---------
        // 
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIMPRADASU+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_GENERAVARIAZ+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIAZ+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PROPODASUBIM+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true) || MainFrm.TIPOORDINATI.equals((new IDVariant(3)), true) || MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGDIDAGE, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGDIDAGE, 0, (new IDVariant("NO")));
      }
      PAN_PROPOSVARIAZ.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENCOIMPSUB.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENCOIMPSUB.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PROPOSVARIAZ.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENCOIMPSUB.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENCOIMPSUB.Freezed = (new IDVariant(-1)).booleanValue();
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ELENCOIMPSUB.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "Load", _e);
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
      MainFrm.VALORICOMUNI.Clear();
      MainFrm.VALORICOMUNI = null;
      PAN_PARS.set_Collapsed((new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_CODICE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEPROG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETITO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGTIPDIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGDIDAGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEQUAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOOGTICADIFI, 0, new IDVariant());
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPERIRIAC)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0, IMDB.Value(IMDBDef8.PQRY_PERIODRIACC1, IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true))
        {
          if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEQUAL, 0).equals((new IDVariant(1)), true))
          {
            if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFAES")), true))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_UFF, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
            }
          }
          if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEQUAL, 0).equals((new IDVariant(2)), true))
          {
            if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_RAG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
            }
          }
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGGIVALOCOM1)), true))
        {
          PAN_PROPOSVARIAZ.PanelCommand(Glb.PCM_REQUERY);
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGGIMPRADASU)), true))
        {
          AggiornaImportoRagDaSubimpegni1();
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_PROPODASUBIM)), true))
        {
          DOProposteDaSubimpegni(IMDB.Value(IMDBDef14.PQRY_P1, IMDBDef14.PQSL_P1_NOMOGGELPRES, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Info Man
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoMan ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Man Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0)))
      {
        return 0;
      }
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMANNOIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMNUMEIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAANNOSUBI, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARANUMESUBI, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARESEANNMAN, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
        MainFrm.Show(MyGlb.FRM_MANDATEMESSI, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMESERCIN, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
        MainFrm.Show(MyGlb.FRM_ORDINAEMESSI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "InfoMan", _e);
      return -1;
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
      MainFrm.Collapseexpandparampanel(new IDVariant(MainFrm.CmdObj.GetCmdCode(MyGlb.CMDS_CS10+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_NASILPANDEPA+BaseCmdLinIdx].GetIndex()).intValue())), PAN_PARS);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "NascondiilpannellodeiParametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Valori Comuni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornaValoriComuni ()
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
      // Aggiorna Valori Comuni Body
      // Corpo Procedura
      // 
      MainFrm.VALORICOMUNI.Clear();
      if (PAN_PROPOSVARIAZ.Locked())
      {
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare Periodo ed Esercizio Rif."));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGPROPRIAC ");
      SQL.append("from ");
      SQL.append("  PROPOSTE_RIACC A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PERIODO_RIACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.TIPO_VAR IS NULL)) ");
      SQL.append("and   (NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGETTUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1) = -1 OR (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  IMP B ");
      SQL.append("where (A.E_S = 'S') ");
      SQL.append("and   (B.ANNO_IMP = A.ANNO_IMPACC) ");
      SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMPACC) ");
      SQL.append("and   (B.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGETTUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  ACC C ");
      SQL.append("where (A.E_S = 'E') ");
      SQL.append("and   (C.ANNO_ACC = A.ANNO_IMPACC) ");
      SQL.append("and   (C.NUMERO_ACC = A.NUMERO_IMPACC) ");
      SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGETTUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append(")))) ");
      C6 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C6.EOF()) C6.MoveNext();
      while (!C6.EOF())
      {
        MainFrm.VALORICOMUNI.add_Value(C6.Get("PROGPROPRIAC")); 
        C6.MoveNext();
      }
      C6.Close();
      IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMEOGGETTES, 0, IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGVAESDI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGMOSLAB, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_AGGIVALOCOM1, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "AggiornaValoriComuni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco impSubAcc On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco impSubAcc On Updating Row Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ElencoimpSubAccOnUpdatingRow", _e);
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
      if (IDL.ToFloat((new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_DISPFINARISU)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_ELENCOIMPSUB.set_VisualStyle(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINARISU,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_ELENCOIMPSUB.set_VisualStyle(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINARISU,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.ToFloat((new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_DISPFINAEFFE)))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_ELENCOIMPSUB.set_VisualStyle(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINAEFFE,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_ELENCOIMPSUB.set_VisualStyle(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINAEFFE,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ElencoimpSubAccOnDynamicProperties", _e);
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
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ElencoimpSubAccOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Elenco impSubAcc On Change Selection
  // Evento notificato dal pannello quando in un pannello
  // con multi-selezione le righe selezionate cambiano.
  // Selected - Input
  // Final - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_OnChangeSelection(IDVariant Selected, IDVariant Final, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Elenco impSubAcc On Change Selection Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        if (Final.booleanValue())
        {
          C4 = PAN_ELENCOIMPSUB.MasterRS();
          if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
          if (!C4.Bof()) PAN_ELENCOIMPSUB.GotoFirst();
          while (!PAN_ELENCOIMPSUB.RSEOF())
          {
            if (IDL.NullValue(C4.Get("RECOANNOSUBI"),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
            {
              PAN_ELENCOIMPSUB.SetRowSelected((new IDVariant(0)).booleanValue(), I.intValue()); 
            }
            I = IDL.Add(I, (new IDVariant(1)));
            PAN_ELENCOIMPSUB.GotoNext();
          }
          if (CurPos>0) C4.absolute(CurPos);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ElencoimpSubAccOnChangeSelection", _e);
    }
  }

  // **********************************************************************
  // Elenco impSubAcc On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco impSubAcc On Change Row Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_ELENCOIMPSUB.SelectedRow(true))).compareTo(RIGAATTUALER, true)!=0)
      {
        if (new IDVariant(PAN_PROPOSVARIAZ.Status()).equals((new IDVariant(3)), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Ci sono modifiche in sospeso sulle Proposte Riaccertamento. Confermare o annullare le modifiche prima di continuare"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          PAN_ELENCOIMPSUB.set_SelectedRow(true, new IDVariant(RIGAATTUALER).intValue());
        }
        else
        {
          RIGAATTUALER = (new IDVariant(PAN_ELENCOIMPSUB.SelectedRow(true)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ElencoimpSubAccOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Elenco impSubAcc On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco impSubAcc On Change Status Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ElencoimpSubAccOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Elenco impSubAcc On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ELENCOIMPSUB_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco impSubAcc On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ELENCOIMPSUB.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Periodo di riaccertamento obbligatorio"))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        PAN_ELENCOIMPSUB.Freezed = (new IDVariant(0)).booleanValue();
        PAN_ELENCOIMPSUB_InitQueries();
      }
      if (Command.equals((new IDVariant(131072)), true) && UserOperation.booleanValue())
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ElencoimpSubAccOnCommand", _e);
    }
  }

  // **********************************************************************
  // Info Subimpegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoSubimpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Subimpegno Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0));
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "InfoSubimpegno", _e);
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
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0));
        if (IMDB.Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMESERCIZ, 0).equals(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo 1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCapitolo1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Capitolo 1 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORDCAPITO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORDARTICO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0));
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "InfoCapitolo1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Show Agg
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ShowAgg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Show Agg Body
      // Corpo Procedura
      // 
      IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
      v_ERR = (new IDVariant("Selezionare almeno un record"));
      if (PAN_PROPOSVARIAZ.Locked())
      {
        return 0;
      }
      if (!(PAN_ELENCOIMPSUB.ShowMultipleSel()))
      {
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (new IDVariant(PAN_PROPOSVARIAZ.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_NUM = new IDVariant(0,IDVariant.INTEGER);
      C8 = PAN_ELENCOIMPSUB.MasterRS();
      if (C8.size()>0) CurPos = C8.getRow(); else CurPos = 0;
      if (!C8.Bof()) PAN_ELENCOIMPSUB.GotoFirst();
      while (!PAN_ELENCOIMPSUB.RSEOF())
      {
        if (PAN_ELENCOIMPSUB.IsRowSelected(I.intValue()))
        {
          v_NUM = IDL.Add(v_NUM, (new IDVariant(1)));
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ELENCOIMPSUB.GotoNext();
      }
      if (CurPos>0) C8.absolute(CurPos);
      if (v_NUM.equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      MainFrm.Show(MyGlb.FRM_AGGIMPRADASU, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ShowAgg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proposte Da Subimpegni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ProposteDaSubimpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C6;

    try
    {
      TransCount = 0;
      // 
      // Proposte Da Subimpegni Body
      // Corpo Procedura
      // 
      IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
      v_ERR = (new IDVariant("Selezionare almeno un record"));
      if (!(PAN_ELENCOIMPSUB.ShowMultipleSel()))
      {
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (new IDVariant(PAN_PROPOSVARIAZ.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_NUM = new IDVariant(0,IDVariant.INTEGER);
      C6 = PAN_ELENCOIMPSUB.MasterRS();
      if (C6.size()>0) CurPos = C6.getRow(); else CurPos = 0;
      if (!C6.Bof()) PAN_ELENCOIMPSUB.GotoFirst();
      while (!PAN_ELENCOIMPSUB.RSEOF())
      {
        if (PAN_ELENCOIMPSUB.IsRowSelected(I.intValue()))
        {
          v_NUM = IDL.Add(v_NUM, (new IDVariant(1)));
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ELENCOIMPSUB.GotoNext();
      }
      if (CurPos>0) C6.absolute(CurPos);
      if (v_NUM.equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      MainFrm.Show(MyGlb.FRM_PROPODASUBIM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteDaSubimpegni", _e);
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

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES, 0, IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEESER, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGETTUO, 0));
      MainFrm.Show(MyGlb.FRM_GENVARPROVAR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "GenerazioneVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Importo Rag Da Subimpegni 1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornaImportoRagDaSubimpegni1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Importo Rag Da Subimpegni 1 Body
      // Corpo Procedura
      // 
      // 
      // -------- Controlli
      // 
      IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
      v_ERR = (new IDVariant("Selezionare almeno un record"));
      if (!(PAN_ELENCOIMPSUB.ShowMultipleSel()))
      {
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_NUM = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NUMAGGIORNAT = new IDVariant(0,IDVariant.INTEGER);
      C4 = PAN_ELENCOIMPSUB.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_ELENCOIMPSUB.GotoFirst();
      while (!PAN_ELENCOIMPSUB.RSEOF())
      {
        if (PAN_ELENCOIMPSUB.IsRowSelected(I.intValue()))
        {
          v_NUM = IDL.Add(v_NUM, (new IDVariant(1)));
          // 
          // Controllo per evitare sub checkati per errore
          // 
          if (IDL.IsNull(C4.Get("RECOANNOSUBI")))
          {
            IDCachedRowSet v_RW = new IDCachedRowSet();
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.ANNO_ESIGIBILITA as ANNO_ESIG, ");
            SQL.append("  A.ANNO_ENTRATA as ANNO_ENTRATA, ");
            SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
            SQL.append("  A.FINANZIAMENTO_OPERA as FINANZIAMENTO_OPERA, ");
            SQL.append("  MAX(A.PROGRESSIVO) as PROGRESSIVO ");
            SQL.append("from ");
            SQL.append("  PROPOSTE_RIACC A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.PERIODO_RIACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_IMPACC = " + IDL.CSql(C4.Get("RECORANNOIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_IMPACC = " + IDL.CSql(C4.Get("RECORNUMEIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.ANNO_SUBIMP IS NULL)) ");
            SQL.append("and   (EXISTS(");
            SQL.append("( ");
            SQL.append("select ");
            SQL.append("  1 ");
            SQL.append("from ");
            SQL.append("  PROPOSTE_RIACC PS2 ");
            SQL.append("where (PS2.ESERCIZIO = A.ESERCIZIO) ");
            SQL.append("and   (PS2.E_S = A.E_S) ");
            SQL.append("and   (PS2.PERIODO_RIACC = A.PERIODO_RIACC) ");
            SQL.append("and   (PS2.ANNO_IMPACC = A.ANNO_IMPACC) ");
            SQL.append("and   (PS2.NUMERO_IMPACC = A.NUMERO_IMPACC) ");
            SQL.append("and   (NOT ((PS2.ANNO_SUBIMP IS NULL))) ");
            SQL.append("and   (NOT ((PS2.IMPORTO_RAG IS NULL))) ");
            SQL.append("))) ");
            SQL.append("group by ");
            SQL.append("  A.ANNO_ESIGIBILITA, ");
            SQL.append("  A.ANNO_ENTRATA, ");
            SQL.append("  A.TIPO_VAR, ");
            SQL.append("  A.FINANZIAMENTO_OPERA ");
            v_RW = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!v_RW.EOF()) v_RW.MoveNext();
            v_RW.MoveFirst();
            while (!(v_RW.EOF()))
            {
              IDVariant v_ANNOENTRA1 = new IDVariant(0,IDVariant.STRING);
              v_ANNOENTRA1 = (new IDVariant("ANNO_ENTRATA"));
              IDVariant v_ANNOESIG1 = new IDVariant(0,IDVariant.STRING);
              v_ANNOESIG1 = (new IDVariant("ANNO_ESIG"));
              IDVariant v_TIPOVAR1 = new IDVariant(0,IDVariant.STRING);
              v_TIPOVAR1 = (new IDVariant("TIPO_VAR"));
              IDVariant v_FINANZIAM1 = new IDVariant(0,IDVariant.STRING);
              v_FINANZIAM1 = (new IDVariant("FINANZIAMENTO_OPERA"));
              IDVariant v_ANNOESIG = null;
              v_ANNOESIG = (new IDVariant());
              v_ANNOESIG = ((IDL.NullValue(v_RW.Get(v_ANNOESIG1.stringValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToInteger(v_RW.Get(v_ANNOESIG1.stringValue())):(new IDVariant()));
              IDVariant v_ANNOENTRATA = null;
              v_ANNOENTRATA = (new IDVariant());
              v_ANNOENTRATA = ((IDL.NullValue(v_RW.Get(v_ANNOENTRA1.stringValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToInteger(v_RW.Get(v_ANNOENTRA1.stringValue())):(new IDVariant()));
              IDVariant v_TIPOVAR = null;
              v_TIPOVAR = (new IDVariant());
              v_TIPOVAR = ((IDL.NullValue(v_RW.Get(v_TIPOVAR1.stringValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToInteger(v_RW.Get(v_TIPOVAR1.stringValue())):(new IDVariant()));
              IDVariant v_FINANZIAMENT = null;
              v_FINANZIAMENT = (new IDVariant());
              v_FINANZIAMENT = ((IDL.NullValue(v_RW.Get(v_FINANZIAM1.stringValue()),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.ToInteger(v_RW.Get(v_FINANZIAM1.stringValue())):(new IDVariant()));
              IDVariant v_VSUM = null;
              v_VSUM = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  SUM(NVL(A.IMPORTO_RAG, A.IMPORTO_UFF)) as SUNVPRIRPRIU ");
              SQL.append("from ");
              SQL.append("  PROPOSTE_RIACC A ");
              SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.PERIODO_RIACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ANNO_IMPACC = " + IDL.CSql(C4.Get("RECORANNOIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_IMPACC = " + IDL.CSql(C4.Get("RECORNUMEIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NOT ((A.ANNO_SUBIMP IS NULL))) ");
              SQL.append("and   (NVL(A.ANNO_ENTRATA, -1) = NVL(" + IDL.CSql(v_ANNOENTRATA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.ANNO_ENTRATA, -1))) ");
              SQL.append("and   (NVL(A.ANNO_ESIGIBILITA, -1) = NVL(" + IDL.CSql(v_ANNOESIG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.ANNO_ESIGIBILITA, -1))) ");
              SQL.append("and   (NVL(A.TIPO_VAR, -1) = NVL(" + IDL.CSql(v_TIPOVAR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.TIPO_VAR, -1))) ");
              SQL.append("and   (NVL(A.FINANZIAMENTO_OPERA, -1) = NVL(" + IDL.CSql(v_FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.FINANZIAMENTO_OPERA, -1))) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VSUM = QV.Get("SUNVPRIRPRIU", IDVariant.DECIMAL) ;
              }
              QV.Close();
              try
              {
                IDVariant v_JPROGR = null;
                v_JPROGR = new IDVariant(IDL.ToInteger(v_RW.Get((new IDVariant("PROGRESSIVO")).stringValue())),IDVariant.DECIMAL);
                SQL = new StringBuffer();
                SQL.append("update PROPOSTE_RIACC set ");
                SQL.append("  IMPORTO_RAG = " + IDL.CSql(v_VSUM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_JPROGR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                v_NUMAGGIORNAT = IDL.Add(v_NUMAGGIORNAT, (new IDVariant(1)));
              }
              catch (Exception e) {}
              v_RW.MoveNext();
            }
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ELENCOIMPSUB.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      if (v_NUM.equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Numero di proposte di variazione impegni aggiornate: "));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<br/>"))), S), IDL.ToString(v_NUMAGGIORNAT))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "AggiornaImportoRagDaSubimpegni1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Eliminazione Variazioni
  // **********************************************************************
  public int EliminazioneVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Eliminazione Variazioni Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES, 0, IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEESER, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMEOGGETTUO, 0));
      MainFrm.Show(MyGlb.FRM_ELIMINVARIAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "EliminazioneVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DO Proposte Da Subimpegni
  // CANCELLA:  - Input
  // **********************************************************************
  public int DOProposteDaSubimpegni (IDVariant CANCELLA)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C6;

    try
    {
      TransCount = 0;
      // 
      // DO Proposte Da Subimpegni Body
      // Corpo Procedura
      // 
      IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
      v_ERR = (new IDVariant("Selezionare almeno un record"));
      if (!(PAN_ELENCOIMPSUB.ShowMultipleSel()))
      {
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (new IDVariant(PAN_PROPOSVARIAZ.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_NUM = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.BeginTrans();
      C6 = PAN_ELENCOIMPSUB.MasterRS();
      if (C6.size()>0) CurPos = C6.getRow(); else CurPos = 0;
      if (!C6.Bof()) PAN_ELENCOIMPSUB.GotoFirst();
      while (!PAN_ELENCOIMPSUB.RSEOF())
      {
        if (PAN_ELENCOIMPSUB.IsRowSelected(I.intValue()))
        {
          // 
          // Controllo per evitare sub checkati per errore
          // 
          if (IDL.IsNull(C6.Get("RECOANNOSUBI")))
          {
            IDVariant v_TMP = new IDVariant(0,IDVariant.INTEGER);
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.PROPOSTEVARIMPDASUB(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0), IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0), IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0), C6.Get("RECORNUMEIMP"), C6.Get("RECORANNOIMP"), CANCELLA, v_TMP);
            if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.Cf4armDBObject.RollbackTrans();
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              return 0;
            }
            v_NUM = IDL.Add(v_NUM, v_TMP);
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ELENCOIMPSUB.GotoNext();
      }
      if (CurPos>0) C6.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Sono state generate "));
      MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<br/>"))), v_S1), IDL.ToString(v_NUM)), (new IDVariant(" "))), (new IDVariant("variazioni")))); 
      PAN_ELENCOIMPSUB.PanelCommand(Glb.PCM_REQUERY);
      PAN_PROPOSVARIAZ.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "DOProposteDaSubimpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Chiusura Ordini
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ChiusuraOrdini ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Chiusura Ordini Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANNVAR, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUIMOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANIMOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_RONANUSUIMOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_RONAANSUIMOL, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0));
      MainFrm.Show(MyGlb.FRM_CHIUSUORDINI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ChiusuraOrdini", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Differenze Impegni Subimpegni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DifferenzeImpegniSubimpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Differenze Impegni Subimpegni Body
      // Corpo Procedura
      // 
      if (IDL.IsNull((new IDVariant(PAN_PARS.FieldText(PFL_PARS_PERIODORIAC1)))) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Definire il periodo di riaccertamento"))); 
      }
      else
      {
        // IMDB.set_Value(IMDBDef5.TBL_PARAMEDIFFER, IMDBDef5.FLD_PARAMEDIFFER_NOMEOGGEESER, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
        // IMDB.set_Value(IMDBDef5.TBL_PARAMEDIFFER, IMDBDef5.FLD_PARAMEDIFFER_NOMOGGPERRIA, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0));
        // IMDB.set_Value(IMDBDef5.TBL_PARAMEDIFFER, IMDBDef5.FLD_PARAMEDIFFER_NOMOGGTIPCON, 0, (new IDVariant("T")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON, 0, (new IDVariant("T")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMEOGGEESER, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGPERRIA, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0));
        MainFrm.Show(MyGlb.FRM_DIFFIMPESUBI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "DifferenzeImpegniSubimpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DUAL Nota Rag
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALNotaRag ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Nota Rag Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEQUAL, 0, (new IDVariant(2)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_RAG, 0), (new IDVariant("Note")), (new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "DUALNotaRag", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DUAL Nota Uff
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALNotaUff ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Nota Uff Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEQUAL, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_UFF, 0), (new IDVariant("Note")), (new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFAES")), true))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "DUALNotaUff", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna valori comuni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Aggiornavaloricomuni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C6;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna valori comuni Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_DISABILIESIG = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.VALORICOMUNI.Clear();
      if (PAN_PROPOSVARIAZ.Locked())
      {
        return 0;
      }
      if (!(PAN_PROPOSVARIAZ.ShowMultipleSel()))
      {
        MainFrm.VALORICOMUNI.add_Value(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_PROGRESSIVO, 0)); 
        v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
      }
      else
      {
        C6 = PAN_PROPOSVARIAZ.MasterRS();
        if (C6.size()>0) CurPos = C6.getRow(); else CurPos = 0;
        if (!C6.Bof()) PAN_PROPOSVARIAZ.GotoFirst();
        while (!PAN_PROPOSVARIAZ.RSEOF())
        {
          if (PAN_PROPOSVARIAZ.IsRowSelected(I.intValue()))
          {
            MainFrm.VALORICOMUNI.add_Value(C6.Get("PROGRESSIVO")); 
            if (C6.Get("ANNO_IMPACC").compareTo(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0), true)!=0)
            {
              v_DISABILIESIG = (new IDVariant(-1));
            }
            v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_PROPOSVARIAZ.GotoNext();
        }
        if (CurPos>0) C6.absolute(CurPos);
      }
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare almeno un record"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMEOGGETTES, 0, IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0));
      if (v_DISABILIESIG.booleanValue() && v_COUNT.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_TIPOVAR, IMDBDef5.FLD_TIPOVAR_NOMOGGVAESDI, 0, (new IDVariant("SI")));
      }
      MainFrm.Show(MyGlb.FRM_AGGIVALOCOM1, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "Aggiornavaloricomuni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proposte Variazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROPOSVARIAZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROPOSVARIAZ);
      // 
      // Proposte Variazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_PROPOSVARIAZ.set_ToolTip(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_FINANZDESTIN,(new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_FINANZDESTIN))).stringValue()); 
      PAN_PROPOSVARIAZ.set_ToolTip(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_TIPOVARIAZIO,(new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_TIPOVARIAZIO))).stringValue()); 
      PAN_PROPOSVARIAZ.set_ToolTip(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_FINOPERA,(new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_FINOPERA))).stringValue()); 
      PAN_PROPOSVARIAZ.set_ToolTip(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_CRONOPROGRAM,(new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_CRONOPROGRAM))).stringValue()); 
      if (IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0).equals(IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA, 0))))
        {
          PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_PROPOSVARIAZ.set_VisualStyle(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_IMPORTOUFF,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_PROPOSVARIAZ.set_VisualStyle(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_IMPORTOUFF,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_PROPOSVARIAZ.set_VisualStyle(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_IMPORTORAG,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_PROPOSVARIAZ.set_VisualStyle(Glb.OBJ_FIELD,PFL_PROPOSVARIAZ_IMPORTORAG,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IDL.NullValue((new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_GESTIOAVANZO))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0)))
      {
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      if (IDL.NullValue((new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_CRONOPROGRAM))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0)))
      {
        if ((new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_T55MOTIVO))).equals((new IDVariant("RCP")), true) || (new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_T55MOTIVO))).equals((new IDVariant("RCA")), true))
        {
          PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if ((new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_T55MOTIVO))).equals((new IDVariant("CFC")), true))
        {
          PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PROPOSVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteVariazioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Proposte Variazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PROPOSVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte Variazione On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_ANNOESIGIBIL)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_ANNOENTRATA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA, 0))))
        {
          if (IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'anno entrata deve essere minore o uguale all'ann"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA, 0, (new IDVariant()));
          }
        }
      }
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_NOTEUFF)), true) && FieldWasModified.booleanValue())
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_UFF, 0))))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          }
        }
        if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_NOTERAG)), true) && FieldWasModified.booleanValue())
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NOTE_RAG, 0))))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          }
        }
        if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_IMPORTOUFF)), true) && FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0))))
          {
            if (((MainFrm.IMPOUFFSZERO.equals((new IDVariant())))?(new IDVariant("NO")):MainFrm.IMPOUFFSZERO).equals((new IDVariant("SI")), true))
            {
              if (IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0).compareTo((new IDVariant(0)), true)>0)
              {
                IDVariant S = null;
                S = (new IDVariant("L'importo deve essere negativo o uguale a 0"));
                MainFrm.set_AlertMessage(S); 
                IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0, (new IDVariant()));
              }
            }
            else
            {
              if (IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0).compareTo((new IDVariant(0)), true)>=0)
              {
                IDVariant S = new IDVariant(0,IDVariant.STRING);
                S = (new IDVariant("L'importo deve essere negativo"));
                MainFrm.set_AlertMessage(S); 
                IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_UFF, 0, (new IDVariant()));
              }
            }
          }
        }
        if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_IMPORTORAG)), true) && FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG, 0))))
          {
            if (IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG, 0).compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("L'importo deve essere negativo o uguale a 0"));
              MainFrm.set_AlertMessage(S); 
              IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_IMPORTO_RAG, 0, (new IDVariant()));
            }
          }
        }
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_PERIODO_RIACC, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_PROGRESSIVO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_PERIODO_RIACC, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_CODICE, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ESERCIZIO, 0, IMDB.Value(IMDBDef14.PQRY_PARS84, IMDBDef14.PQSL_PARS84_NOMOGGESERIF, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_E_S, 0, IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_IMPACC, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NUMERO_IMPACC, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0));
        }
        if (MainFrm.FINANZIAMENT.booleanValue())
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_OPERA, 0)) && IDL.NullValue(PAN_PROPOSVARIAZ.GetLastValue(PFL_PROPOSVARIAZ_FINOPERA),(new IDVariant(""))).equals((new IDVariant("")), true))
          {
            if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
            {
              IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
              IDVariant v_VMAX = null;
              v_VMAX = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1, ");
              SQL.append("  MAX(A.OPERA) as MAXACCOPEOPE ");
              SQL.append("from ");
              SQL.append("  ACC_OPE A ");
              SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                v_VMAX = QV.Get("MAXACCOPEOPE", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_VCOUNT.equals((new IDVariant(1)), true))
              {
                IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_OPERA, 0, new IDVariant(v_VMAX));
              }
            }
            else
            {
              IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
              IDVariant v_VMAX = null;
              v_VMAX = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1, ");
              SQL.append("  MAX(A.FINANZIAMENTO) as MAXIMPFINFIN ");
              SQL.append("from ");
              SQL.append("  IMP_FIN A ");
              SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                v_VMAX = QV.Get("MAXIMPFINFIN", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_VCOUNT.equals((new IDVariant(1)), true))
              {
                IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_OPERA, 0, new IDVariant(v_VMAX));
              }
            }
          }
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_VAR, 0)))
        {
          if (IDL.NullValue(PAN_PROPOSVARIAZ.GetLastValue(PFL_PROPOSVARIAZ_TIPOVARIAZIO),(new IDVariant(""))).equals((new IDVariant("")), true) && IDL.NullValue(PAN_PROPOSVARIAZ.GetOrgValue(PFL_PROPOSVARIAZ_TIPOVARIAZIO),(new IDVariant(""))).equals((new IDVariant("")), true))
          {
            IDVariant v_TIPOVAR = new IDVariant(0,IDVariant.STRING);
            try
            {
              v_TIPOVAR = PAN_PROPOSVARIAZ.GetValueAt(PFL_PROPOSVARIAZ_TIPOVARIAZIO,(new IDVariant(PAN_PROPOSVARIAZ.SelectedRow(true))).intValue());
            }
            catch (Exception e) {}
            if (IDL.NullValue(v_TIPOVAR,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
            {
              IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_VAR, 0, IDL.ToInteger(v_TIPOVAR));
            }
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_TIPOVARIAZIO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_VT55GESTAVAN = null;
        v_VT55GESTAVAN = (new IDVariant());
        IDVariant v_VT55MOTIVO = new IDVariant(0,IDVariant.STRING);
        if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(A.GESTIONE_AVANZO, 'NO') as NUVAT5GEAVNO, ");
          SQL.append("  A.MOTIVO as T55MOTIVO ");
          SQL.append("from ");
          SQL.append("  T55 A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_VAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VT55GESTAVAN = QV.Get("NUVAT5GEAVNO", IDVariant.STRING) ;
            v_VT55MOTIVO = QV.Get("T55MOTIVO", IDVariant.STRING) ;
          }
          QV.Close();
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(A.GESTIONE_AVANZO, 'NO') as NUVAT5GEAVNO, ");
          SQL.append("  A.MOTIVO as T56MOTIVO ");
          SQL.append("from ");
          SQL.append("  T56 A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_VAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VT55GESTAVAN = QV.Get("NUVAT5GEAVNO", IDVariant.STRING) ;
            v_VT55MOTIVO = QV.Get("T56MOTIVO", IDVariant.STRING) ;
          }
          QV.Close();
        }
        if (v_VT55GESTAVAN.equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_TIPO_AVANZO, 0, (new IDVariant()));
        }
        if (v_VT55MOTIVO.equals((new IDVariant("CFC")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA_CRONO, 0, (new IDVariant()));
        }
        else if (v_VT55MOTIVO.equals((new IDVariant("RCP")), true) || v_VT55MOTIVO.equals((new IDVariant("RCA")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_DESTINAZIONE, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_DESTINAZIONE, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PROPOSVARIAZ_FINOPERA)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue((new IDVariant(PAN_PROPOSVARIAZ.FieldText(PFL_PROPOSVARIAZ_CRONOPROGRAM))),(new IDVariant(""))).equals((new IDVariant("")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_ANNO_ENTRATA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PROPOSTRIAC1, IMDBDef14.PQSL_PROPOSTRIAC1_FINANZIAMENTO_DESTINAZIONE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteVariazioneOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Proposte Variazione On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_PROPOSVARIAZ_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte Variazione On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_PROPOSVARIAZ.Status()).equals((new IDVariant(3)), true))
      {
        PAN_PARS.set_Locked((new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_PARS.set_Locked((new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteVariazioneOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Proposte Variazione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PROPOSVARIAZ_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte Variazione Before Insert Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteVariazioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Proposte Variazione On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_PROPOSVARIAZ_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Proposte Variazione On Command Body
      // Corpo Procedura
      // 
      if (UserOperation.booleanValue())
      {
        if (Command.equals((new IDVariant(16)), true))
        {
          IDVariant I = null;
          I = (new IDVariant(1));
          IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
          C4 = PAN_PROPOSVARIAZ.MasterRS();
          if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
          if (!C4.Bof()) PAN_PROPOSVARIAZ.GotoFirst();
          while (!PAN_PROPOSVARIAZ.RSEOF())
          {
            if (PAN_PROPOSVARIAZ.IsRowSelected(I.intValue()))
            {
              v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
            }
            I = IDL.Add(I, (new IDVariant(1)));
            PAN_PROPOSVARIAZ.GotoNext();
          }
          if (CurPos>0) C4.absolute(CurPos);
          if (v_COUNT.equals((new IDVariant(0)), true) && PAN_PROPOSVARIAZ.ShowMultipleSel())
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Attenzione, multiselezione attiva. Non è stata selezionata nessuna riga da cancellare!"));
            MainFrm.set_AlertMessage(S); 
            Cancel.set((new IDVariant(-1)));
          }
        }
        if (Command.equals((new IDVariant(128)), true))
        {
          IDVariant I = new IDVariant(0,IDVariant.INTEGER);
          for (I = (new IDVariant(1)); I.compareTo((new IDVariant(PAN_PROPOSVARIAZ.NumRows)), true)<=0; I = IDL.Add(I, (new IDVariant(1))))
          {
            if (!(IDL.IsNull(PAN_PROPOSVARIAZ.GetValueAt(PFL_PROPOSVARIAZ_PERIODORIACC,I.intValue()))))
            {
              if (IDL.NullValue(MainFrm.TIPOVAROBBLI,(new IDVariant("NO"))).equals((new IDVariant("SI")), true) && IDL.NullValue(PAN_PROPOSVARIAZ.GetValueAt(PFL_PROPOSVARIAZ_TIPOVARIAZIO,I.intValue()),(new IDVariant(""))).equals((new IDVariant("")), true))
              {
                IDVariant v_TIPOVARIOBBL = new IDVariant(0,IDVariant.STRING);
                v_TIPOVARIOBBL = (new IDVariant("Tipo Variazione obbligatoria"));
                MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant(":"))), (new IDVariant(" "))), v_TIPOVARIOBBL)); 
                Cancel.set((new IDVariant(-1)));
                return;
              }
              if (IDL.IsNull(PAN_PROPOSVARIAZ.GetValueAt(PFL_PROPOSVARIAZ_IMPORTOUFF,I.intValue())) && IDL.IsNull(PAN_PROPOSVARIAZ.GetValueAt(PFL_PROPOSVARIAZ_IMPORTORAG,I.intValue())))
              {
                IDVariant v_IMPORTOBBLIG = new IDVariant(0,IDVariant.STRING);
                v_IMPORTOBBLIG = (new IDVariant("Importo obbligatorio"));
                MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant(":"))), (new IDVariant(" "))), v_IMPORTOBBLIG)); 
                Cancel.set((new IDVariant(-1)));
                return;
              }
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteVariazioneOnCommand", _e);
    }
  }

  // **********************************************************************
  // Proposte Variazione After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_PROPOSVARIAZ_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proposte Variazione After Commit Body
      // Corpo Procedura
      // 
      if (RowsUpdated.compareTo((new IDVariant(0)), true)>0 && RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_PROPOSVARIAZ.PanelCommand(Glb.PCM_REQUERY);
      }
      PAN_ELENCOIMPSUB.PanelCommand(Glb.PCM_REQUERY);
      IDVariant v_VREGISTVALOR = new IDVariant(0,IDVariant.STRING);
      // 
      // controllo il parametro di registro
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.VALORE, 'NO') as NULVALREVANO ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/CFA/RIACCERTAMENTI') ");
      SQL.append("and   (A.STRINGA = 'SEGNALA_DISP_NEGATIVA') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VREGISTVALOR = QV.Get("NULVALREVANO", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_MESSAGGIO = null;
      v_MESSAGGIO = (new IDVariant());
      if (v_VREGISTVALOR.equals((new IDVariant("SI")), true))
      {
        if (IDL.ToInteger((new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_DISPFINARISU)))).compareTo((new IDVariant(0)), true)<0)
        {
          if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0)))
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(" - Le proposte variazione rendono negativa la ")), (new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINARISU)))), (new IDVariant(" dell'impegno "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0))), IDL.CHR((new IDVariant(10))));
            }
            else
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(" - Le proposte variazione rendono negativa la ")), (new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINARISU)))), (new IDVariant(" del subimpegno "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0))), IDL.CHR((new IDVariant(10))));
            }
          }
          else
          {
            v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(" - Le proposte variazione rendono negativa la ")), (new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINARISU)))), (new IDVariant(" dell'accertamento "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0))), IDL.CHR((new IDVariant(10))));
          }
        }
        if (IDL.ToInteger((new IDVariant(PAN_ELENCOIMPSUB.FieldText(PFL_ELENCOIMPSUB_DISPFINAEFFE)))).compareTo((new IDVariant(0)), true)<0)
        {
          if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0)))
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(" - Le proposte variazione rendono negativa la "))), (new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINAEFFE)))), (new IDVariant(" dell'impegno "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0))), IDL.CHR((new IDVariant(10))));
            }
            else
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(" - Le proposte variazione rendono negativa la "))), (new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINAEFFE)))), (new IDVariant(" del subimpegno "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECONUMESUBI, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECOANNOSUBI, 0))), IDL.CHR((new IDVariant(10))));
            }
          }
          else
          {
            v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(" - Le proposte variazione rendono negativa la "))), (new IDVariant(PAN_ELENCOIMPSUB.Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_DISPFINAEFFE)))), (new IDVariant(" dell'accertamento "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORNUMEIMP, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_VISESTRIAIM1, IMDBDef14.PQSL_VISESTRIAIM1_RECORANNOIMP, 0))), IDL.CHR((new IDVariant(10))));
          }
        }
        if (!(IDL.IsNull(v_MESSAGGIO)))
        {
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteVariazioneAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Proposte Variazione On Database Error
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
  private void PAN_PROPOSVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PROPOSVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Proposte Variazione On Database Error Body
      // Corpo Procedura
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ProposteVariazioneOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Export Excel
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ExportExcel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Export Excel Body
      // Corpo Procedura
      // 
      IDVariant B = null;
      B = (new IDVariant((PAN_ELENCOIMPSUB.bFields(PFL_ELENCOIMPSUB_INFOSUBIMPEG).IsVisible(PAN_ELENCOIMPSUB.AttR) && PAN_ELENCOIMPSUB.bFields(PFL_ELENCOIMPSUB_INFOSUBIMPEG).IsPresent())));
      IDVariant v_MULTIPLESELE = new IDVariant(0,IDVariant.INTEGER);
      if (PAN_ELENCOIMPSUB.ShowMultipleSel())
      {
        v_MULTIPLESELE = (new IDVariant(-1));
        PAN_ELENCOIMPSUB.set_ShowMultipleSel((new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      if (IMDB.Value(IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMERIMPPROV, (new IDVariant("Numero Accertamento Provenienza")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMPPROVE, (new IDVariant("Anno Accertamento Provenienza")).stringValue());
      }
      else
      {
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMERIMPPROV, (new IDVariant("Numero Impegno Provenienza")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMPPROVE, (new IDVariant("Anno Impegno Provenienza")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMESUBIPROV, (new IDVariant("Numero SubImpegno Provenienza")).stringValue());
        PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOSUBIPROV, (new IDVariant("Anno SubImpegno Provenienza")).stringValue());
      }
      new IDVariant(PAN_ELENCOIMPSUB.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, (B.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPSUB.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMERIMPPROV, (new IDVariant("Numero")).stringValue());
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOIMPPROVE, (new IDVariant("Anno")).stringValue());
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_NUMESUBIPROV, (new IDVariant("Numero")).stringValue());
      PAN_ELENCOIMPSUB.set_Header(Glb.OBJ_FIELD,PFL_ELENCOIMPSUB_ANNOSUBIPROV, (new IDVariant("Anno")).stringValue());
      PAN_ELENCOIMPSUB.set_ShowMultipleSel(v_MULTIPLESELE.booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteVariazioniImpegniSubimpegni", "ExportExcel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PROVARIMPSUB_PARS84() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARS84_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARS85, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARS85, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARS84_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARS84_RS, 0, IMDBDef5.TBL_PARS85, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 0, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_CODICE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 1, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMOGGESERIF, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 2, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 3, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 4, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETITO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 5, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTUO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 6, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 7, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS84_RS, 8, 0, IMDBDef5.TBL_PARS85, IMDBDef5.FLD_PARS85_NOMEOGGETTES, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARS85, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARS85, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARS85, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARS84_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARS_PERIODORIAC1)
    {
      IdxPanelActived = PAN_PARS.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_SCELPERIRIAC, 1, this);
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICSCELCAPI)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltacApitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_INFOCAPITOL1)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
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
    if (ColIndex.intValue() == PFL_ELENCOIMPSUB_INFOCAPITOLO)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPSUB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOIMPSUB_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPSUB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOIMPSUB_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPSUB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubimpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOIMPSUB_INFOMAN)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPSUB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMan();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOIMPSUB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ELENCOIMPSUB_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROPOSVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROPOSVARIAZ, Cancel);
    // Stub
  }

  private void PAN_PROPOSVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PROPOSVARIAZ_DUALNOTAUFF)
    {
      this.IdxPanelActived = this.PAN_PROPOSVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALNotaUff();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROPOSVARIAZ_DUALNOTARAG)
    {
      this.IdxPanelActived = this.PAN_PROPOSVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALNotaRag();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PROPOSVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PROPOSVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PROPOSVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROPOSVARIAZ_IntValidateRow(Cancel);
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
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, "D1770EC6-D8B4-4C6B-8259-85A6478A10D0");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, "Periodo Riacc.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, "2734B916-5390-46AA-95A9-CD4AB756CE04");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, "Esercizio Rif.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UO, "E397B1AB-F430-4945-8FB5-AAAA77051D5B");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UO, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, "CFAB59A8-8DCD-4390-8017-DE66D1D7D8AE");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, "Periodo Riacc.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, "21D80E07-1C78-4882-9F86-2FD587ED2F97");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, "Missione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, "4D8C93F0-A1E7-477D-8D58-72181BA153BF");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, "Programma");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, "E02F2056-8332-41E0-8291-639178338494");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, "Titolo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, "5C9AC09A-E0A9-4BE5-97A9-F8ECDB5E02FB");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, "Capitolo/Art.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, "F146ABAB-7FAD-4F71-8114-2BA6FE5750F2");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, "6B38FBCB-3778-4FE4-8899-F7F3DB1D2E4B");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, "07A40A9D-E943-4B70-BD28-AE2DDA9910A4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, 0, "info.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, "F85FF658-62AC-4DDD-B67F-4514D5682C69");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, "Tipo_Disp");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPODISP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "2B8085BF-3B3E-4A49-A7E5-6767F4867728");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "ES");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ES1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, "90453921-1BCD-4BED-8CA1-592076E09B14");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, "Indicare Periodo e Esercizio rif per procedere");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, 236);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, 8, 4, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC1, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARS.SetFieldPage(PFL_PARS_PERIODORIAC1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PERIODORIAC1, PPQRY_PERIODRIACCE, "A.DESCRIZIONE", "PERIRIACDESC", 5, 100, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_LIST, "Esercizio Rif.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, 376, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIZIORIF, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_PARS.SetFieldPage(PFL_PARS_ESERCIZIORIF, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ESERCIZIORIF, PPQRY_PARS84, "A.NOMOGGESERIF", "NOMOGGESERIF", 1, 9, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_LIST, "Un. Org.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 508, 4, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_UO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UO, PPQRY_PARS84, "A.NOMEOGGETTUO", "NOMEOGGETTUO", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, 84);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_LIST, "Per. Riacc");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, 12, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PERIODORIAC2, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARS.SetFieldPage(PFL_PARS_PERIODORIAC2, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PERIODORIAC2, PPQRY_PARS84, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_LIST, "Missione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_FORM, 4, 28, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_FORM, 96);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONE1, MyGlb.PANEL_FORM, "Missione");
    PAN_PARS.SetFieldPage(PFL_PARS_MISSIONE1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_MISSIONE1, PPQRY_PARS84, "A.NOMEOGGEMISS", "NOMEOGGEMISS", 5, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_LIST, "Programma");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_FORM, 4, 52, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_FORM, 96);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMA1, MyGlb.PANEL_FORM, "Programma");
    PAN_PARS.SetFieldPage(PFL_PARS_PROGRAMMA1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PROGRAMMA1, PPQRY_PARS84, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 5, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_LIST, 40);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_LIST, "Titolo");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_FORM, 408, 28, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_FORM, 48);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TITOLO1, MyGlb.PANEL_FORM, "Titolo");
    PAN_PARS.SetFieldPage(PFL_PARS_TITOLO1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TITOLO1, PPQRY_PARS84, "A.NOMEOGGETITO", "NOMEOGGETITO", 1, 1, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo Art");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_FORM, 372, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_FORM, 84);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARS.SetFieldPage(PFL_PARS_CAPITOLO1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CAPITOLO1, PPQRY_PARS84, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 1, 16, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_FORM, 564, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO1, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ARTICOLO1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ARTICOLO1, PPQRY_PARS84, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_LIST, 640, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_FORM, 608, 56, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICSCELCAPI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICSCELCAPI, -1, "", "ETICSCELCAPI", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, MyGlb.PANEL_LIST, 648, 48, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, MyGlb.PANEL_FORM, 628, 56, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOCAPITOL1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_INFOCAPITOL1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_INFOCAPITOL1, -1, "", "INFOCAPITOL1", 0, 0, 0, -13997);
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
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, "ES");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 4, 76, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, "ES");
    PAN_PARS.SetFieldPage(PFL_PARS_ES1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ES1, PPQRY_PARS84, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant()), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, MyGlb.PANEL_LIST, 688, 56, 164, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, MyGlb.PANEL_FORM, 880, 4, 164, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICINDIPERE, MyGlb.PANEL_FORM, 2);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICINDIPERE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICINDIPERE, -1, "", "ETICINDIPERE", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 6);
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
    SQL.append("and   (C.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
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
    SQL.append("where (C.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA') ");
    SQL.append("order by 3, 2 ");
    PAN_PARS.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_PARS_UO, "");
    PAN_PARS.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPRDEMI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~NOMEOGGEMISS~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TITOLO, ");
    SQL.append("  B.TITOLO || ' - ' || B.DES_TITOLO ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TITOLO = ~~NOMEOGGEMISS~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPRO1, 0, SQL, PFL_PARS_MISSIONE1, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPRDEMI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.TITOLO, ");
    SQL.append("  B.TITOLO || ' - ' || B.DES_TITOLO ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPRO1, 1, SQL, PFL_PARS_MISSIONE1, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTMISSPRO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  SUBSTR(A.PROGRAMMA, 3, 2) as VISMISPROPRO, ");
    SQL.append("  SUBSTR(A.PROGRAMMA, 3, 2) || ' - ' || A.DES_PROGRAMMA as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.PROGRAMMA = ~~NOMEOGGEPROG~~) ");
    SQL.append("and   (A.MISSIONE = NVL(~~NOMEOGGEMISS~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  SUBSTR(B.TIPOLOGIA, 2, 4), ");
    SQL.append("  SUBSTR(B.TIPOLOGIA, 2, 4) || ' - ' || B.DES_TIPOLOGIA ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TIPOLOGIA = ~~NOMEOGGEPROG~~) ");
    SQL.append("and   (B.TITOLO = NVL(~~NOMEOGGEMISS~~, B.TITOLO)) ");
    SQL.append("and   (B.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPROG, 0, SQL, PFL_PARS_PROGRAMMA1, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  SUBSTR(A.PROGRAMMA, 3, 2) as VISMISPROPRO, ");
    SQL.append("  SUBSTR(A.PROGRAMMA, 3, 2) || ' - ' || A.DES_PROGRAMMA as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = NVL(~~NOMEOGGEMISS~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  SUBSTR(B.TIPOLOGIA, 2, 4), ");
    SQL.append("  SUBSTR(B.TIPOLOGIA, 2, 4) || ' - ' || B.DES_TIPOLOGIA ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE B ");
    SQL.append("where (B.TITOLO = NVL(~~NOMEOGGEMISS~~, B.TITOLO)) ");
    SQL.append("and   (B.ESERCIZIO = ~~NOMOGGESERIF~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPROG, 1, SQL, PFL_PARS_PROGRAMMA1, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTMISSPROG, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as \"+\" ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGETITO~~) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~NOMOGGESERIF~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, PFL_PARS_TITOLO1, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as \"+\" ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~NOMOGGESERIF~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_VISTSTRURICL, 1, SQL, PFL_PARS_TITOLO1, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS84", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS84, IMDBDef14.PQRY_PARS84_RS, IMDBDef5.TBL_PARS85);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ESERCIZIORIF, IMDBDef5.FLD_PARS85_NOMOGGESERIF);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UO, IMDBDef5.FLD_PARS85_NOMEOGGETTUO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PERIODORIAC2, IMDBDef5.FLD_PARS85_CODICE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_MISSIONE1, IMDBDef5.FLD_PARS85_NOMEOGGEMISS);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PROGRAMMA1, IMDBDef5.FLD_PARS85_NOMEOGGEPROG);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TITOLO1, IMDBDef5.FLD_PARS85_NOMEOGGETITO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CAPITOLO1, IMDBDef5.FLD_PARS85_NOMEOGGECAPI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ARTICOLO1, IMDBDef5.FLD_PARS85_NOMEOGGEARTI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ES1, IMDBDef5.FLD_PARS85_NOMEOGGETTES);
    PAN_PARS.SetMasterTable(0, "PARS85");
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
    PAN_ELENCOIMPSUB.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, "BC410CD5-6973-4574-9935-DB357D15196E");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, "Imp. Prov.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, MyGlb.PANEL_LIST, 1796, -9999, 108, 16, 0, 0);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, MyGlb.PANEL_FORM, 0, 1152, 232, 28, 0, 0);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, 0, 124);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, 1, 13);
    PAN_ELENCOIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, 0, 4);
    PAN_ELENCOIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, 1, 1);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_IMPEGNPROVEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, "9E784A27-E34A-45E5-B073-EB069B699C7C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, "SubImp. Prov.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, MyGlb.PANEL_LIST, 1904, -9999, 108, 16, 0, 0);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, 0, 145);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, 1, 13);
    PAN_ELENCOIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, 0, 4);
    PAN_ELENCOIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, 1, 1);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOIMPSUB_SUBIMPPROVEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOIMPSUB.SetSize(MyGlb.OBJ_FIELD, 43);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, "D6F0867E-3592-4039-A84B-621841088C96");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, "Capitolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, "CA1BBB7A-EAAC-4A3B-A9CB-D1943ED2DA20");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, "Articolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, "EAF4D8F2-0690-47C6-9564-B25B9711328D");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, " ");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, "4818531F-784E-4898-A38C-08EC546B4E82");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, "Descrizione Capitolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, "8664489B-4607-46C3-B595-D4807631586C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, "Numero Imp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, "F24C8D86-CF48-4796-8F55-BE3244372C7C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, "Anno Imp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, "0238FD8F-6D0C-4E61-8906-EE8EB9CC3E4C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, "Info Impegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, "9B7D33DD-3355-485A-9FF7-156A5E21FAF6");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, "Numero SubImp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, "5318228B-C6E1-42D7-A8A7-86AE8083D332");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, "Anno SubImp.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, "EFC2188D-7162-489A-91FA-72EC23EAEB8D");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, "Info Subimpegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, "1A982715-6C46-4580-A5D1-54A1E3578B83");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, "Descrizione Impegno/SubImpegno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, "A6CAB07B-0E15-4227-A547-BD7E4E039B5D");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, "Imp. Attuale");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, "5735EE95-1A4E-41AC-8AEA-F952504DE676");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, "Variazioni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, "CFEE6506-0B94-4C3D-8612-0583A79811DE");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, "Liquidazioni con Esercizio Rif.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, "Liquidazioni non ancora emesse in mandato o emesse in mandato in anni successivi all'esercizio rif.");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, "0BAD3307-4CD0-40C6-9F79-F0D46F57ED2E");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, "Mandati");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, "FC4F151E-AFF8-4AF9-928F-B084C5ED6D32");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, " ");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, "F90BBC3A-4AE2-4760-8E72-9FC0AE2E1524");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, "Disp. Fin. 31/12/");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, "45A9B0E3-A600-4780-B9CD-B18D22D9FD19");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, "Disp. Fin.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, "3C5A5C03-F348-474C-9DA6-753B37B49F75");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, "Disp. Eff.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, "A2EF875F-A7E3-4C46-9DDA-DD9BB81EFC89");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, "Proposte Variazioni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, "3474A854-0BD2-4827-9CEF-5C6E9022A82C");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, "Proposte Variazioni Subimpegni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, "756F6FAE-20BC-4807-BB43-8539BFAD9312");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, "Disp. Fin. Ris.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, "43F69275-E7E5-4FBF-B630-B02C8BA4A87B");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, "Disp. Eff. Ris.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, "FBCFE7EE-A8B5-442B-A95C-04B5A1BA99F3");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, "Numero");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, "4CCFC5ED-5A79-4BC6-B2FD-D18C87D103FA");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, "Anno");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, "7FB44C36-69CB-453C-9A67-BAD326E3D2DF");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, "Numero");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, "CBFDCEF5-5A7A-4E29-86E8-BBEC9ED4B188");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, "Anno ");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, "0B7646AA-4844-4E1C-96F3-A3890A12EFE7");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, "Ord Anno Subimp");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDANNOSUBIM, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, "10EABB7E-F78B-418B-A24D-437E6B0137D7");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, "Reiscrizione da Stn.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, "6F3207D4-7F31-4FD1-8CBD-A334844B7634");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, "Imp. Da Crono");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, "A24CECC3-E366-44EA-9E41-1B125B0B72E4");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, "Ordini");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, "Indica se ci sono ordini o porzioni di ordini associati non liquidati");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, "237D1CE2-75F3-4B52-8ABF-48B861FC86E3");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, "Disposizioni");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, "Indica se ci sono disposizioni associate non liquidate");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, "007DCF3D-3C46-4E94-ADC6-D5120A72E9DA");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, "Dist. Liq.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, "Distinte di Liquidazioni Extra Buoni");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, "A4F647C6-88D9-45CA-AE13-07EEE036B551");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, "Codice UO");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, "5F8CCB09-C2A8-4D7A-B0EA-3AE3C87B77C7");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, "Descrizione U.O.");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, "75F4D5F0-24A3-4EA8-B9A0-38C8642F85F9");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, "Ord NUmero Subimp");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDNUMERSUBI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, "DE534D26-872D-4184-AC51-FB85364B5BA1");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, "Missione");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, "BC3B32BB-108D-44AC-82A5-E45536CB5A44");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, "Programma");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, "240543F9-A2C9-400A-BB1D-27671E457B09");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, "Titolo");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, "7A3B26E1-1D29-49F7-9872-260F3D8659BF");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, "Livello IV");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, "C66DA86B-F42A-4B57-812B-0CC2F3AF563A");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, "Livello V");
    PAN_ELENCOIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, "");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, "9F6A984D-7A2B-4EC4-9B93-1F8C4F0410CB");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, "Impegno");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, "CC6532B5-C700-42C3-A1F0-195A53E391DB");
    PAN_ELENCOIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, "SubImpegno");
    PAN_ELENCOIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ELENCOIMPSUB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CAPITOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CAPITOLO, PPQRY_VISESTRIAIM1, "A.CAPITOLO", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 124, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ARTICOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ARTICOLO, PPQRY_VISESTRIAIM1, "A.ARTICOLO", "RECORDARTICO", 1, 2, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_LIST, 156, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_FORM, 4, 868, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOCAPITOLO, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_INFOCAPITOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_INFOCAPITOLO, PPQRY_DUAL3, "'I'", "INFOCAPITOLO", 5, 1, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOCAPITOLO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOCAPITOLO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOCAPITOLO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, 176, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 244, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRIZIONE, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRIZIONE, PPQRY_VISESTRIAIM1, "A.DESCRIZIONE", "RECORDDESCRI", 5, 140, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 328, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, "Num. Imp");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 4, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, "Numero Imp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NUMEROIMP, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NUMEROIMP, PPQRY_VISESTRIAIM1, "A.NUMERO_IMP", "RECORNUMEIMP", 1, 5, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 364, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, "Ann. Imp");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 4, 304, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOIMP, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOIMP, PPQRY_VISESTRIAIM1, "A.ANNO_IMP", "RECORANNOIMP", 1, 4, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_LIST, 396, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_LIST, 120);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 892, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_FORM, 120);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOIMPEGNO, MyGlb.PANEL_FORM, "Info Impegno");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_INFOIMPEGNO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_INFOIMPEGNO, PPQRY_DUAL3, "'I'", "INFOIMPEGNO", 5, 1, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOIMPEGNO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 416, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, "Num. Sub.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 4, 328, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, "Numero SubImp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NUMEROSUBIM1, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NUMEROSUBIM1, PPQRY_VISESTRIAIM1, "A.NUMERO_SUBIMP", "RECONUMESUBI", 1, 15, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 452, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, "Ann. Sub.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 4, 352, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, "Anno SubImp.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOSUBIMP1, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOSUBIMP1, PPQRY_VISESTRIAIM1, "A.ANNO_SUBIMP", "RECOANNOSUBI", 1, 4, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_LIST, 484, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_LIST, 140);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 916, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_FORM, 140);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Subimpegno");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_INFOSUBIMPEG, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_INFOSUBIMPEG, PPQRY_DUAL3, "CASE WHEN NOT ((~~RECOANNOSUBI~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOSUBIMPEG", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOSUBIMPEG, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, 504, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_LIST, "Descrizione Impegno/SubImpegno");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, 4, 376, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIMPSUBI, MyGlb.PANEL_FORM, "Descr. Imp. SubImpegno");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRIMPSUBI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRIMPSUBI, PPQRY_VISESTRIAIM1, "A.DESCR_IMPSUB", "RECDESIMPSUB", 5, 140, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_LIST, 656, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_LIST, "Imp. Attuale");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_FORM, 4, 412, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPATTUALE, MyGlb.PANEL_FORM, "Imp Att.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPATTUALE, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_IMPATTUALE, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPATTUALE, PPQRY_VISESTRIAIM1, "A.SALDO_INI + NVL(A.VARIAZIONI, 0)", "RECORIMPATTU", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, 760, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, 4, 652, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_VARIAZIONI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_VARIAZIONI, PPQRY_VISESTRIAIM1, "A.VARIAZIONI", "RECORDVARIAZ", 3, 14, 2, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, 768, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_LIST, "Liquidazioni con Esercizio Rif.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, 4, 1132, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, 112);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_LIQCONESERIF, MyGlb.PANEL_FORM, "Liq. con Eser. Rif");
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
  SQL.append("and   (A.E_S = 'S') ");
  SQL.append("and   (NVL(B.ANNO_MAND, 9999) > A.ESERCIZIO) ");
  SQL.append(")");
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_LIQCONESERIF, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_LIQCONESERIF, PPQRY_VISESTRIAIM1, SQL.toString(), "LIQCONESERIF", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, 880, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, 4, 676, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_MANDATI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_MANDATI, PPQRY_VISESTRIAIM1, "A.MANDATI", "RECORDMANDAT", 3, 14, 2, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, 992, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, 4, 700, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_INFOMAN, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_INFOMAN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_INFOMAN, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_INFOMAN, PPQRY_VISESTRIAIM1, "'I'", "INFOMAN", 5, 1, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOMAN, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOMAN, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_INFOMAN, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENCOIMPSUB.set_Watermark(PFL_ELENCOIMPSUB_INFOMAN, " ");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, 1012, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_LIST, "Disp. Fin. 31/12/");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, 4, 1108, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPAL3112, MyGlb.PANEL_FORM, "Dsp. Fn. 3. 1.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPAL3112, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPAL3112, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPAL3112, PPQRY_VISESTRIAIM1, "A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TO_DATE((31)||'/'||(12)||'/'||(~~PQRY_PARS84.NOMOGGESERIF~~),'dd/mm/yyyy'))", "RECODISPAL31", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, 1124, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_LIST, "Disp. Fin.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, 4, 436, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPONIBIFIN, MyGlb.PANEL_FORM, "Disp. Fin.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPONIBIFIN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPONIBIFIN, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPONIBIFIN, PPQRY_VISESTRIAIM1, "CASE WHEN A.E_S = 'E' THEN A_GET_DISP_ACC_AL(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,TRUNC( SYSDATE )) ELSE A_GET_DISP_IMPSUB_AL(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TRUNC( SYSDATE ),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS85.NOMOGGDIDAGE~~) END", "RECORDISPFIN", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, 1236, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Eff.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 724, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Eff.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPEFFETTIV, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPEFFETTIV, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPEFFETTIV, PPQRY_VISESTRIAIM1, "CASE WHEN A.E_S = 'S' THEN A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'EFF',TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0)),'dd/mm/yyyy'),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS85.NOMOGGDIDAGE~~) ELSE to_number(NULL) END", "RECODISPEFFE", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARIMP, MyGlb.PANEL_LIST, 1348, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
  SQL.append("and   (C.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
  SQL.append("and   (C.PERIODO_RIACC = ~~PQRY_PARS84.CODICE~~) ");
  SQL.append("and   (C.ANNO_IMPACC = A.ANNO_IMP) ");
  SQL.append("and   (C.NUMERO_IMPACC = A.NUMERO_IMP) ");
  SQL.append("and   ((A.ANNO_SUBIMP IS NULL)) ");
  SQL.append("and   ((C.ANNO_SUBIMP IS NULL)) ");
  SQL.append("), 0)");
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROPOSVARIMP, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROPOSVARIMP, PPQRY_VISESTRIAIM1, SQL.toString(), "PROPOSVARIMP", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROPOSVARSUB, MyGlb.PANEL_LIST, 1460, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
  SQL.append("  SUM(DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', NVL(E.IMPORTO_RAG, E.IMPORTO_UFF), E.IMPORTO_UFF)) ");
  SQL.append("from ");
  SQL.append("  PROPOSTE_RIACC E ");
  SQL.append("where (E.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (E.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
  SQL.append("and   (E.PERIODO_RIACC = ~~PQRY_PARS84.CODICE~~) ");
  SQL.append("and   (E.ANNO_IMPACC = A.ANNO_IMP) ");
  SQL.append("and   (E.NUMERO_IMPACC = A.NUMERO_IMP) ");
  SQL.append("and   (NOT ((E.ANNO_SUBIMP IS NULL))) ");
  SQL.append("and   ((A.ANNO_SUBIMP IS NULL) OR (NOT ((A.ANNO_SUBIMP IS NULL)) AND E.NUMERO_SUBIMP = A.NUMERO_SUBIMP AND E.ANNO_SUBIMP = A.ANNO_SUBIMP)) ");
  SQL.append("), 0)");
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROPOSVARSUB, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROPOSVARSUB, PPQRY_VISESTRIAIM1, SQL.toString(), "PROPOSVARSUB", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, 1572, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_LIST, "Disp. Fin. Ris.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, 4, 1036, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINARISU, MyGlb.PANEL_FORM, "Disp. Fin. Ris.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPFINARISU, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPFINARISU, PPQRY_DUAL1, "~~RECORDISPFIN~~ + NVL(~~PROPOSVARIMP~~, 0) - (NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END)", "DISPFIPROPO1", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, 1684, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_LIST, "Disp. Eff. Ris.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, 4, 1060, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, 320);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPFINAEFFE, MyGlb.PANEL_FORM, "Disp. Eff. Ris.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPFINAEFFE, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPFINAEFFE, PPQRY_DUAL1, "~~RECODISPEFFE~~ + NVL(~~PROPOSVARIMP~~, 0) - (NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END)", "DISPFIPROPOS", 3, 28, 6, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_LIST, 1796, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_LIST, 156);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_FORM, 4, 1156, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_FORM, 160);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMERIMPPROV, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NUMERIMPPROV, -1, GRP_ELENCOIMPSUB_IMPEGNPROVEN);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NUMERIMPPROV, PPQRY_VISESTRIAIM1, "A.NUMERO_IMP_PROVENIENZA", "REVIESRIINIP", 1, 5, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1852, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_LIST, 144);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_FORM, 4, 1180, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_FORM, 144);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOIMPPROVE, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOIMPPROVE, -1, GRP_ELENCOIMPSUB_IMPEGNPROVEN);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOIMPPROVE, PPQRY_VISESTRIAIM1, "A.ANNO_IMP_PROVENIENZA", "REVIESRIIAIP", 1, 4, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_LIST, 1904, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_LIST, 184);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_FORM, 4, 1156, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_FORM, 184);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_NUMESUBIPROV, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_NUMESUBIPROV, -1, GRP_ELENCOIMPSUB_SUBIMPPROVEN);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_NUMESUBIPROV, PPQRY_VISESTRIAIM1, "A.NUMERO_SUBIMP_PROVENIENZA", "REVIESRIINSP", 1, 10, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1956, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_LIST, 164);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_LIST, "Anno ");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_FORM, 4, 1180, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_FORM, 164);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ANNOSUBIPROV, MyGlb.PANEL_FORM, "Anno ");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ANNOSUBIPROV, -1, GRP_ELENCOIMPSUB_SUBIMPPROVEN);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ANNOSUBIPROV, PPQRY_VISESTRIAIM1, "A.ANNO_SUBIMP_PROVENIENZA", "REVIESRIIASP", 1, 4, 0, -13997);
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
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ORDANNOSUBIM, PPQRY_VISESTRIAIM1, "DECODE(A.ANNO_SUBIMP, to_number(NULL), -1, A.ANNO_SUBIMP)", "ORDANNOSUBIM", 1, 19, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 2012, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 120);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, "Reiscr. da Stn");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 4, 1156, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 120);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, "Reiscrizione da Stn.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_IMPDAREISSTN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_IMPDAREISSTN, PPQRY_VISESTRIAIM1, "A.IMP_DA_REISCR_STN", "REVIESRIIDRS", 5, 2, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_IMPDAREISSTN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_IMPDAREISSTN, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_LIST, 2072, 36, 56, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_LIST, 280);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_LIST, "Imp. Da Crono");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_FORM, 4, 1156, 816, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_FORM, 308);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_VIESRIIMCRID, MyGlb.PANEL_FORM, "Imp. Da Crono");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_VIESRIIMCRID, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_VIESRIIMCRID, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_VIESRIIMCRID, PPQRY_VISESTRIAIM1, "DECODE(A.CRONOPROGRAMMA_ID, to_number(NULL), 'NO', 'SI')", "REVIESRIIMCI", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_VIESRIIMCRID, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_VIESRIIMCRID, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, 2128, 36, 44, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, 44);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_LIST, "Ordini");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, 4, 988, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, 44);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ORDINI, MyGlb.PANEL_FORM, "Ordini");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ORDINI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_ORDINI, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ORDINI, PPQRY_VISESTRIAIM1, "NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'ORD'), 'NO')", "ORDINI", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_ORDINI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_ORDINI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, 2172, 36, 76, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_LIST, "Disposizioni");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, 4, 1012, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISPOSIZIONI, MyGlb.PANEL_FORM, "Disposizioni");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISPOSIZIONI, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISPOSIZIONI, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISPOSIZIONI, PPQRY_VISESTRIAIM1, "NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DISP'), 'NO')", "DISPOSIZIONI", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISPOSIZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISPOSIZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, 2248, 36, 36, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_LIST, "Dist. Liq.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, 4, 1084, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DISTLIQ, MyGlb.PANEL_FORM, "Dist Liq");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DISTLIQ, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DISTLIQ, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DISTLIQ, PPQRY_VISESTRIAIM1, "NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DLIQ'), 'NO')", "DISTLIQ", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISTLIQ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPSUB.SetValueListItem(PFL_ELENCOIMPSUB_DISTLIQ, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, 2284, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_LIST, "Codice UO");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, 4, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRUO, MyGlb.PANEL_FORM, "Codice UO");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_PROGRUO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROGRUO, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROGRUO, PPQRY_VISESTRIAIM1, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UO,TRUNC( SYSDATE ))", "REVIESRIIMPU", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, 2352, 36, 250, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_LIST, "Descrizione U.O.");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 28, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_DESCRIZIONUO, MyGlb.PANEL_FORM, "Descrizione U.O.");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_DESCRIZIONUO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_DESCRIZIONUO, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_DESCRIZIONUO, PPQRY_VISESTRIAIM1, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UO,TRUNC( SYSDATE ))", "DESCRIZIONUO", 5, 99, 0, -13997);
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
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ORDNUMERSUBI, PPQRY_VISESTRIAIM1, "DECODE(A.NUMERO_SUBIMP, to_number(NULL), -1, A.NUMERO_SUBIMP)", "ORDNUMERSUBI", 1, 19, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, 2602, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_LIST, "Missione");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, 4, 748, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_MISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_MISSIONE, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_MISSIONE, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_MISSIONE, PPQRY_VISESTRIAIM1, "SUBSTR(A.CODICE_STRUTTURA, 1, CASE WHEN A.E_S = 'S' THEN 2 ELSE 1 END)", "MISSIONE", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, 2662, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, 4, 772, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_PROGRAMMA, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldUnbound(PFL_ELENCOIMPSUB_PROGRAMMA, true);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_PROGRAMMA, PPQRY_VISESTRIAIM1, "CASE WHEN A.E_S = 'S' THEN SUBSTR(A.CODICE_STRUTTURA, 3, 2) ELSE SUBSTR(A.CODICE_STRUTTURA, 2, 4) END", "PROGRAMMA", 5, 99, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, 2738, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, 4, 796, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_TITOLO, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_TITOLO, PPQRY_VISESTRIAIM1, "A.TITOLO_RICL", "RECORDTITOLO", 5, 9, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, 2778, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_LIST, "Livello IV");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, 4, 820, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO4, MyGlb.PANEL_FORM, "Livello IV");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CODLIVELLO4, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CODLIVELLO4, PPQRY_VISESTRIAIM1, "A.COD_LIVELLO_4", "RECOCODLIVE4", 1, 9, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, 2854, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_LIST, "Livello V");
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 844, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_CODLIVELLO5, MyGlb.PANEL_FORM, "Livello V");
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_CODLIVELLO5, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_CODLIVELLO5, PPQRY_VISESTRIAIM1, "A.COD_LIVELLO_5", "RECOCODLIVE5", 1, 9, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, MyGlb.PANEL_LIST, 328, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, MyGlb.PANEL_FORM, 560, 384, 132, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHEIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ETICHEIMPEGN, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ETICHEIMPEGN, -1, "", "ETICHEIMPEGN", 0, 0, 0, -13997);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, MyGlb.PANEL_LIST, 416, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, MyGlb.PANEL_FORM, 568, 392, 132, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPSUB_ETICHESUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPSUB.SetFieldPage(PFL_ELENCOIMPSUB_ETICHESUBIMP, -1, -1);
    PAN_ELENCOIMPSUB.SetFieldPanel(PFL_ELENCOIMPSUB_ETICHESUBIMP, -1, "", "ETICHESUBIMP", 0, 0, 0, -13997);
  }

  private void PAN_ELENCOIMPSUB_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOIMPSUB.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOCAPITOLO, ");
    SQL.append("  'I' as INFOIMPEGNO, ");
    SQL.append("  CASE WHEN NOT ((~~RECOANNOSUBI~~ IS NULL)) THEN 'I' ELSE NULL END as INFOSUBIMPEG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORDCAPITO~~ IS NULL))) ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_DUAL3, 0, SQL, -1, "");
    PAN_ELENCOIMPSUB.SetQueryDB(PPQRY_DUAL3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPSUB.SetMasterTable(PPQRY_DUAL3, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~RECORDISPFIN~~ + NVL(~~PROPOSVARIMP~~, 0) - (NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END) as DISPFIPROPO1, ");
    SQL.append("  ~~RECODISPEFFE~~ + NVL(~~PROPOSVARIMP~~, 0) - (NVL(~~PROPOSVARSUB~~, 0) * CASE WHEN (~~RECOANNOSUBI~~ IS NULL) THEN 1 ELSE -1 END) as DISPFIPROPOS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_ELENCOIMPSUB.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPSUB.SetMasterTable(PPQRY_DUAL1, "DUAL");
    PAN_ELENCOIMPSUB.SetIMDB(IMDB, "PQRY_VISESTRIAIM1", true);
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
    SQL.append("  A.SALDO_INI + NVL(A.VARIAZIONI, 0) as RECORIMPATTU, ");
    SQL.append("  A.VARIAZIONI as RECORDVARIAZ, ");
    SQL.append("  CASE WHEN A.E_S = 'E' THEN A_GET_DISP_ACC_AL(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,TRUNC( SYSDATE )) ELSE A_GET_DISP_IMPSUB_AL(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TRUNC( SYSDATE ),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS85.NOMOGGDIDAGE~~) END as RECORDISPFIN, ");
    SQL.append("  CASE WHEN A.E_S = 'S' THEN A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'EFF',TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0)),'dd/mm/yyyy'),~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS85.NOMOGGDIDAGE~~) ELSE to_number(NULL) END as RECODISPEFFE, ");
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
    SQL.append("and   (A.E_S = 'S') ");
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
    SQL.append("and   (C.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
    SQL.append("and   (C.PERIODO_RIACC = ~~PQRY_PARS84.CODICE~~) ");
    SQL.append("and   (C.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   ((A.ANNO_SUBIMP IS NULL)) ");
    SQL.append("and   ((C.ANNO_SUBIMP IS NULL)) ");
    SQL.append("), 0) as PROPOSVARIMP, ");
    SQL.append("  NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', NVL(E.IMPORTO_RAG, E.IMPORTO_UFF), E.IMPORTO_UFF)) ");
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC E ");
    SQL.append("where (E.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (E.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
    SQL.append("and   (E.PERIODO_RIACC = ~~PQRY_PARS84.CODICE~~) ");
    SQL.append("and   (E.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (E.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (NOT ((E.ANNO_SUBIMP IS NULL))) ");
    SQL.append("and   ((A.ANNO_SUBIMP IS NULL) OR (NOT ((A.ANNO_SUBIMP IS NULL)) AND E.NUMERO_SUBIMP = A.NUMERO_SUBIMP AND E.ANNO_SUBIMP = A.ANNO_SUBIMP)) ");
    SQL.append("), 0) as PROPOSVARSUB, ");
    SQL.append("  NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'ORD'), 'NO') as ORDINI, ");
    SQL.append("  NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DISP'), 'NO') as DISPOSIZIONI, ");
    SQL.append("  NVL(GET_SE_ORD_DISP_NON_LIQ(A.NUMERO_IMP,A.ANNO_IMP,A.NUMERO_SUBIMP,A.ANNO_SUBIMP,'DLIQ'), 'NO') as DISTLIQ, ");
    SQL.append("  A_GET_DISP_IMP_SUB_ACC(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0),A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,'FIN',TO_DATE((31)||'/'||(12)||'/'||(~~PQRY_PARS84.NOMOGGESERIF~~),'dd/mm/yyyy')) as RECODISPAL31, ");
    SQL.append("  A.NUMERO_IMP_PROVENIENZA as REVIESRIINIP, ");
    SQL.append("  A.ANNO_IMP_PROVENIENZA as REVIESRIIAIP, ");
    SQL.append("  A.NUMERO_SUBIMP_PROVENIENZA as REVIESRIINSP, ");
    SQL.append("  A.ANNO_SUBIMP_PROVENIENZA as REVIESRIIASP, ");
    SQL.append("  A.IMP_DA_REISCR_STN as REVIESRIIDRS, ");
    SQL.append("  DECODE(A.CRONOPROGRAMMA_ID, to_number(NULL), 'NO', 'SI') as REVIESRIIMCI ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIM1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_ESTRAZ_RIACC_IMPSUBACC A ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIM1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARS84.NOMOGGESERIF~~) ");
    SQL.append("and   (A_GET_DISP_IMP_SUB_ACC(CASE WHEN NVL(~~TBL_PARS85.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0) ELSE ~~TBL_DATISESSIONE.SESSIOESERCI~~ END,A.E_S,A.ANNO_IMP,A.NUMERO_IMP,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,NVL(~~TBL_PARS85.NOMOGGTIPDIS~~, 'EFF'),CASE WHEN NVL(~~TBL_PARS85.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0)),'dd/mm/yyyy') ELSE TRUNC( SYSDATE ) END,~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS85.NOMOGGDIDAGE~~) > 0 OR ((A.ANNO_SUBIMP IS NULL) AND EXISTS(");
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
    SQL.append("and   (A_GET_DISP_IMP_SUB_ACC(CASE WHEN NVL(~~TBL_PARS85.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0) ELSE ~~TBL_DATISESSIONE.SESSIOESERCI~~ END,SUB.E_S,SUB.ANNO_IMP,SUB.NUMERO_IMP,SUB.ANNO_SUBIMP,SUB.NUMERO_SUBIMP,NVL(~~TBL_PARS85.NOMOGGTIPDIS~~, 'EFF'),CASE WHEN NVL(~~TBL_PARS85.NOMOGGTIPDIS~~, 'EFF') = 'FIN' THEN TO_DATE((31)||'/'||(12)||'/'||(NVL(~~PQRY_PARS84.NOMOGGESERIF~~, 0)),'dd/mm/yyyy') ELSE TRUNC( SYSDATE ) END,~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS85.NOMOGGDIDAGE~~) > 0) ");
    SQL.append(")) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC prop2 ");
    SQL.append("where (prop2.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (prop2.E_S = A.E_S) ");
    SQL.append("and   (prop2.PERIODO_RIACC = ~~PQRY_PARS84.CODICE~~) ");
    SQL.append("and   (prop2.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (prop2.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (NVL(prop2.ANNO_SUBIMP, 0) = NVL(A.ANNO_SUBIMP, NVL(prop2.ANNO_SUBIMP, 0))) ");
    SQL.append("and   (NVL(prop2.NUMERO_SUBIMP, 0) = NVL(A.NUMERO_SUBIMP, NVL(prop2.NUMERO_SUBIMP, 0))) ");
    SQL.append(")))) ");
    SQL.append("and   (NVL(SUBSTR(A.CODICE_STRUTTURA, 1, CASE WHEN A.E_S = 'S' THEN 2 ELSE 1 END), '00') = NVL(~~PQRY_PARS84.NOMEOGGEMISS~~, NVL(SUBSTR(A.CODICE_STRUTTURA, 1, CASE WHEN A.E_S = 'S' THEN 2 ELSE 1 END), '00'))) ");
    SQL.append("and   (NVL(LPAD(CASE WHEN A.E_S = 'S' THEN SUBSTR(A.CODICE_STRUTTURA, 3, 2) ELSE SUBSTR(A.CODICE_STRUTTURA, 2, 4) END, 2, SUBSTR('0', 1, 1)), '00') = NVL(~~PQRY_PARS84.NOMEOGGEPROG~~, NVL(LPAD(CASE WHEN A.E_S = 'S' THEN SUBSTR(A.CODICE_STRUTTURA, 3, 2) ELSE SUBSTR(A.CODICE_STRUTTURA, 2, 4) END, 2, SUBSTR('0', 1, 1)), '00'))) ");
    SQL.append("and   (NVL(TRUNC(TO_NUMBER(A.TITOLO_RICL)), -1) = NVL(~~PQRY_PARS84.NOMEOGGETITO~~, NVL(TRUNC(TO_NUMBER(A.TITOLO_RICL)), -1))) ");
    SQL.append("and   (NVL(A.PROGR_UO, DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', -1, A.PROGR_UO)) = CASE WHEN NVL(~~PQRY_PARS84.NOMEOGGETTUO~~, -1) = -1 THEN NVL(A.PROGR_UO, -1) ELSE ~~PQRY_PARS84.NOMEOGGETTUO~~ END) ");
    SQL.append("and   (((NVL(~~PQRY_PARS84.NOMEOGGETTUO~~, -1) = -1 AND (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA D ");
    SQL.append("where (D.PROGR_UNITA_ORGANIZZATIVA = A.PROGR_UO) ");
    SQL.append("and   (D.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.TIPO_STRUTTURA = 'LG') ");
    SQL.append(")))) OR A.PROGR_UO = ~~PQRY_PARS84.NOMEOGGETTUO~~)) ");
    SQL.append("and   (A.CAPITOLO = NVL(~~PQRY_PARS84.NOMEOGGECAPI~~, A.CAPITOLO)) ");
    SQL.append("and   (A.ARTICOLO = NVL(~~PQRY_PARS84.NOMEOGGEARTI~~, A.ARTICOLO)) ");
    SQL.append("and   (NOT ((~~PQRY_PARS84.NOMOGGESERIF~~ IS NULL))) ");
    SQL.append("and   (A.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIM1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIM1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIM1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 3, 4, 7, 6, 15, 16 ");
    PAN_ELENCOIMPSUB.SetQuery(PPQRY_VISESTRIAIM1, 5, SQL, -1, "");
    PAN_ELENCOIMPSUB.SetQueryDB(PPQRY_VISESTRIAIM1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPSUB.SetMasterTable(0, "VISTA_ESTRAZ_RIACC_IMPSUBACC");
    PAN_ELENCOIMPSUB.AddToSortList(PFL_ELENCOIMPSUB_CAPITOLO, true);
    PAN_ELENCOIMPSUB.AddToSortList(PFL_ELENCOIMPSUB_ARTICOLO, true);
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

  private void PAN_PROPOSVARIAZ_Init()
  {

    PAN_PROPOSVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROPOSVARIAZ.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, "97CE9723-007B-43C4-948F-3D9EB042527E");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, "Variazioni Cronoprogramma");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, MyGlb.VIS_GROUPSTYLE);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, MyGlb.PANEL_LIST, 1408, -9999, 680, 16, 0, 0);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, MyGlb.PANEL_FORM, 8, 223, 680, 97, 0, 0);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, 0, 158);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, 1, 13);
    PAN_PROPOSVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, 0, 4);
    PAN_PROPOSVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, 1, 4);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_PROPOSVARIAZ_VARIAZCRONOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROPOSVARIAZ.SetSize(MyGlb.OBJ_FIELD, 25);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, "44260C9C-A8E5-4ECE-A8D5-83F1AF0006C5");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, "PROGRESSIVO");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, "C0FBC36F-1DC5-407B-9B82-09CECEF46736");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, "PERIODO RIACC");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.VIS_NONNULLAFIEL);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, 0, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, "7CD1D017-541C-44AA-A506-085892DC93C3");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, "ESERCIZIO");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, 0, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, "BF2CF1D7-D057-4683-BD14-C1E806F2EF7A");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, "E S");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, 0, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, "E1745049-77F5-4EF1-B4F4-712DE3D25764");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, "ANNO IMPACC");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.VIS_NONNULLAFIEL);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, 0, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, "D22C4034-40CB-4024-A709-5F8FCD214B8E");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, "NUMERO IMPACC");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.VIS_NONNULLAFIEL);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, 0, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, "A574FFF6-7E3E-4E85-9A22-B92BFA990BB6");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, "9D530D9E-88ED-445C-8E0F-784923085DB1");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, "18EE865C-7512-435B-9977-588F2A02C9A1");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, "Importo");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.VIS_NORFIECF4IMP);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, "C5581289-2224-4342-A52C-AF4213015D3B");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, "Tipo Variazione");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, "4C2ADC1A-FF3E-44A2-B690-E4CCC0D49F18");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, "Anno Esig.");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, "2A1F0D3F-5049-4C30-B4DE-6098DE0791BA");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, "Anno Entrata");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, "D06E454F-CB7F-43A9-8875-928DF2DB6CB8");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, "Finanziamento");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, "9FBD4509-0C12-4D8D-8DBB-63AC69028AB0");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, "Tipo Avanzo");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, "49166C0E-1D61-48BA-955F-C402E194A2F5");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, "Note");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, "Note Uffici");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, "2699D407-08B0-4FD5-A139-D48279FD75D3");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, " ");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.VIS_HYPELINKIMMA);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, "BF14CDA3-DB0C-4252-B2F5-D858851D3E9A");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, "Importo Ragioneria");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.VIS_NORFIECF4IMP);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, "76EA5D4F-A34B-4B92-9ED3-6AB9A56462C7");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, "Note Ragioneria");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, "Note Ragioneria");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, "DB9D39FE-2251-4B34-97D9-F732AD2589E1");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, " ");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.VIS_HYPELINKIMMA);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, "B86A2F1C-982C-4E39-A5AA-5A1EFCCF95AA");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, "Cronoprogramma");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, "F56CF266-F5B4-4BF4-8225-2A50C30DB1E1");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, "Anno Esigibilità");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, "41FC341D-7C31-4BEB-B9C6-AC825FE07785");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, "Anno Entrata");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, "5D3E4B6F-AA51-4F78-9724-28B7BA107744");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, "Finanziamento di Destinazione");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, "186BCFFC-24EC-4450-B8EE-81D97FA2773B");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, "GESTIONE AVANZO");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROPOSVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, "A80B3535-BD72-42F9-8891-7FAA310A2DA7");
    PAN_PROPOSVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, "T55 MOTIVO");
    PAN_PROPOSVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, "");
    PAN_PROPOSVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PROPOSVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PROPOSVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_PROGRESSIVO, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_PROGRESSIVO, PPQRY_PROPOSTRIAC1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_LIST, 96);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_LIST, "PER. RIAC.");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_FORM, 188, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_FORM, 112);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_PERIODORIACC, MyGlb.PANEL_FORM, "PERIODO RIACC");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_PERIODORIACC, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_PERIODORIACC, PPQRY_PROPOSTRIAC1, "A.PERIODO_RIACC", "PERIODO_RIACC", 1, 5, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_FORM, 356, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ESERCIZIO, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ESERCIZIO, PPQRY_PROPOSTRIAC1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_LIST, 24);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_LIST, "E S");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ES, MyGlb.PANEL_FORM, "E S");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ES, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ES, PPQRY_PROPOSTRIAC1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_LIST, "ANN. IMP.");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOIMPACC, MyGlb.PANEL_FORM, "ANNO IMPACC");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ANNOIMPACC, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ANNOIMPACC, PPQRY_PROPOSTRIAC1, "A.ANNO_IMPACC", "ANNO_IMPACC", 1, 4, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_LIST, "NUM. IMP.");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROIMPACC, MyGlb.PANEL_FORM, "NUMERO IMPACC");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_NUMEROIMPACC, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_NUMEROIMPACC, PPQRY_PROPOSTRIAC1, "A.NUMERO_IMPACC", "NUMERO_IMPACC", 1, 5, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANNO SUBIMP");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ANNOSUBIMP, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ANNOSUBIMP, PPQRY_PROPOSTRIAC1, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 128);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUMERO SUBIMP");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_NUMEROSUBIMP, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_NUMEROSUBIMP, PPQRY_PROPOSTRIAC1, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_LIST, 84);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_LIST, "Importo");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_FORM, 104, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_FORM, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTOUFF, MyGlb.PANEL_FORM, "Importo");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_IMPORTOUFF, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_IMPORTOUFF, PPQRY_PROPOSTRIAC1, "A.IMPORTO_UFF", "IMPORTO_UFF", 3, 14, 2, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 108, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 116);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 368, 28, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 112);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_TIPOVARIAZIO, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_TIPOVARIAZIO, PPQRY_PROPOSTRIAC1, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_LIST, 292, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esig.");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_FORM, 104, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_FORM, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esig.");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ANNOESIGIBIL, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ANNOESIGIBIL, PPQRY_PROPOSTRIAC1, "A.ANNO_ESIGIBILITA", "ANNO_ESIGIBILITA", 1, 4, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_LIST, 344, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_FORM, 252, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_FORM, 84);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ANNOENTRATA, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ANNOENTRATA, PPQRY_PROPOSTRIAC1, "A.ANNO_ENTRATA", "ANNO_ENTRATA", 1, 4, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_LIST, 396, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_LIST, 100);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_FORM, 388, 52, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_FORM, 92);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINOPERA, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_FINOPERA, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_FINOPERA, PPQRY_PROPOSTRIAC1, "A.FINANZIAMENTO_OPERA", "FINANZIAMENTO_OPERA", 1, 5, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_LIST, 572, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_FORM, 88, 76, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_FORM, 104);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_TIPOAVANZO, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_TIPOAVANZO, PPQRY_PROPOSTRIAC1, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_LIST, 756, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_LIST, 80);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_LIST, "Note");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_FORM, 156, 100, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_FORM, 36);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTEUFF, MyGlb.PANEL_FORM, "Note");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_NOTEUFF, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_NOTEUFF, PPQRY_PROPOSTRIAC1, "A.NOTE_UFF", "NOTE_UFF", 5, 2000, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_LIST, 1008, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_LIST, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_LIST, " ");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_FORM, 4, 316, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_FORM, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTAUFF, MyGlb.PANEL_FORM, " ");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_DUALNOTAUFF, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_DUALNOTAUFF, PPQRY_DUAL, "CASE WHEN NOT ((~~NOTE_UFF~~ IS NULL)) THEN 'P' ELSE 'N' END", "NOTAUFF", 5, 99, 0, -13997);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTAUFF, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_LIST, 1028, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_LIST, 88);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_LIST, "Importo Ragioneria");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_FORM, 84, 148, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_FORM, 108);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_IMPORTORAG, MyGlb.PANEL_FORM, "Imp. Ragioneria");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_IMPORTORAG, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_IMPORTORAG, PPQRY_PROPOSTRIAC1, "A.IMPORTO_RAG", "IMPORTO_RAG", 3, 14, 2, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_LIST, 1136, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_LIST, 80);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_LIST, "Note Ragioneria");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_FORM, 84, 172, 600, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_FORM, 108);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_FORM, 2);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_NOTERAG, MyGlb.PANEL_FORM, "Note Ragioneria");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_NOTERAG, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_NOTERAG, PPQRY_PROPOSTRIAC1, "A.NOTE_RAG", "NOTE_RAG", 5, 2000, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_LIST, 1388, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_LIST, 92);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_LIST, " ");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_FORM, 4, 340, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_FORM, 92);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_DUALNOTARAG, MyGlb.PANEL_FORM, " ");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_DUALNOTARAG, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_DUALNOTARAG, PPQRY_DUAL, "CASE WHEN NOT ((~~NOTE_RAG~~ IS NULL)) THEN 'P' ELSE 'N' END", "NOTARAG", 5, 99, 0, -13997);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_DUALNOTARAG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_LIST, 1408, 36, 250, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_LIST, 132);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_LIST, "Cronoprogramma");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_FORM, 16, 248, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_FORM, 176);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_CRONOPROGRAM, MyGlb.PANEL_FORM, "Cronoprogramma");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_CRONOPROGRAM, -1, GRP_PROPOSVARIAZ_VARIAZCRONOP);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_CRONOPROGRAM, PPQRY_CRONOPROGRAM, "GET_DESC_OPERA_CRONO_DA_IMP(~~PQRY_VISESTRIAIM1.RECORANNOIMP~~,~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~,~~PQRY_PARS84.NOMOGGESERIF~~,~~FINANZIAMENTO_OPERA~~)", "CRONOPROGRAM", 5, 99, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_LIST, 1658, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_LIST, 152);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_FORM, 96, 272, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_FORM, 96);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOESIGCRON, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ANNOESIGCRON, -1, GRP_PROPOSVARIAZ_VARIAZCRONOP);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ANNOESIGCRON, PPQRY_PROPOSTRIAC1, "A.ANNO_ESIGIBILITA_CRONO", "ANNO_ESIGIBILITA_CRONO", 1, 4, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_LIST, 1754, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_LIST, 136);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_FORM, 484, 272, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_FORM, 136);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_ANNOENTRCRON, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_ANNOENTRCRON, -1, GRP_PROPOSVARIAZ_VARIAZCRONOP);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_ANNOENTRCRON, PPQRY_PROPOSTRIAC1, "A.ANNO_ENTRATA_CRONO", "ANNO_ENTRATA_CRONO", 1, 4, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_LIST, 1838, 36, 250, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_LIST, 184);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_LIST, "Finanziamento di Destinazione");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_FORM, 12, 296, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_FORM, 180);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_FINANZDESTIN, MyGlb.PANEL_FORM, "Finanziamento di Destinazione");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_FINANZDESTIN, -1, GRP_PROPOSVARIAZ_VARIAZCRONOP);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_FINANZDESTIN, PPQRY_PROPOSTRIAC1, "A.FINANZIAMENTO_DESTINAZIONE", "FINANZIAMENTO_DESTINAZIONE", 1, 5, 0, -13997);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_LIST, 1408, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_LIST, 136);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_LIST, "GESTIONE AVANZO");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_FORM, 4, 224, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_FORM, 136);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_GESTIOAVANZO, MyGlb.PANEL_FORM, "GESTIONE AVANZO");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_GESTIOAVANZO, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_GESTIOAVANZO, PPQRY_T55, "A.GESTIONE_AVANZO", "T55GESTIAVAN", 5, 2, 0, -13997);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_GESTIOAVANZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PROPOSVARIAZ.SetValueListItem(PFL_PROPOSVARIAZ_GESTIOAVANZO, (new IDVariant()), "Null", "", "", -1);
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_LIST, 1408, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_LIST, 80);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_LIST, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_LIST, "T55 MOTIVO");
    PAN_PROPOSVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_FORM, 4, 296, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROPOSVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_FORM, 80);
    PAN_PROPOSVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_FORM, 1);
    PAN_PROPOSVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROPOSVARIAZ_T55MOTIVO, MyGlb.PANEL_FORM, "T55 MOTIVO");
    PAN_PROPOSVARIAZ.SetFieldPage(PFL_PROPOSVARIAZ_T55MOTIVO, -1, -1);
    PAN_PROPOSVARIAZ.SetFieldPanel(PFL_PROPOSVARIAZ_T55MOTIVO, PPQRY_T55, "A.MOTIVO", "T55MOTIVO", 5, 3, 0, -13997);
  }

  private void PAN_PROPOSVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROPOSVARIAZ.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN NOT ((~~NOTE_UFF~~ IS NULL)) THEN 'P' ELSE 'N' END as NOTAUFF, ");
    SQL.append("  CASE WHEN NOT ((~~NOTE_RAG~~ IS NULL)) THEN 'P' ELSE 'N' END as NOTARAG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSVARIAZ.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.GESTIONE_AVANZO as T55GESTIAVAN, ");
    SQL.append("  A.MOTIVO as T55MOTIVO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.GESTIONE_AVANZO, ");
    SQL.append("  B.MOTIVO ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_T55, 0, SQL, -1, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSVARIAZ.SetMasterTable(PPQRY_T55, "T55");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_DESC_OPERA_CRONO_DA_IMP(~~PQRY_VISESTRIAIM1.RECORANNOIMP~~,~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~,~~PQRY_PARS84.NOMOGGESERIF~~,~~FINANZIAMENTO_OPERA~~) as CRONOPROGRAM ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("and   (A.MOTIVO IN ('RCA', 'RCP', 'CFC')) ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_CRONOPROGRAM, 0, SQL, -1, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_CRONOPROGRAM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSVARIAZ.SetMasterTable(PPQRY_CRONOPROGRAM, "T55");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("and   (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   ((~~PQRY_VISESTRIAIM1.RECOANNOSUBI~~ IS NULL) OR A.MOTIVO NOT IN ('RCA', 'RCP', 'CFC')) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("and   (B.RIACCERTAMENTO = 'SI') ");
    SQL.append("order by 1 ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_T56, 0, SQL, PFL_PROPOSVARIAZ_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("and   (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("and   ((~~PQRY_VISESTRIAIM1.RECOANNOSUBI~~ IS NULL) OR A.MOTIVO NOT IN ('RCA', 'RCP', 'CFC')) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("and   (B.RIACCERTAMENTO = 'SI') ");
    SQL.append("order by 1 ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_T56, 1, SQL, PFL_PROPOSVARIAZ_TIPOVARIAZIO, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as IMPFINFINAN1 ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = ~~FINANZIAMENTO_OPERA~~) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (A.ANNO_IMP = ~~PQRY_VISESTRIAIM1.RECORANNOIMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.OPERA, ");
    SQL.append("  TO_CHAR ( C.OPERA ) || ' - ' || D.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  OPERE D ");
    SQL.append("where (C.OPERA = ~~FINANZIAMENTO_OPERA~~) ");
    SQL.append("and   (D.CODICE = C.OPERA) ");
    SQL.append("and   (C.ANNO_ACC = ~~PQRY_VISESTRIAIM1.RECORANNOIMP~~) ");
    SQL.append("and   (C.NUMERO_ACC = ~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_IMPFIN, 0, SQL, PFL_PROPOSVARIAZ_FINOPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as IMPFINFINAN1 ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (A.ANNO_IMP = ~~PQRY_VISESTRIAIM1.RECORANNOIMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.OPERA, ");
    SQL.append("  TO_CHAR ( C.OPERA ) || ' - ' || D.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  OPERE D ");
    SQL.append("where (D.CODICE = C.OPERA) ");
    SQL.append("and   (C.ANNO_ACC = ~~PQRY_VISESTRIAIM1.RECORANNOIMP~~) ");
    SQL.append("and   (C.NUMERO_ACC = ~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~) ");
    SQL.append("and   (~~TBL_PARS85.NOMEOGGETTES~~ = 'E') ");
    SQL.append("order by 1 ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_IMPFIN, 1, SQL, PFL_PROPOSVARIAZ_FINOPERA, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_IMPFIN, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_PROPOSVARIAZ_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_PROPOSVARIAZ_TIPOAVANZO, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO_ENTRATA as TESCROESEENT, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO_ENTRATA ) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO_ENTRATA = ~~ANNO_ENTRATA_CRONO~~) ");
    SQL.append("and   (A.CRONOPROGRAMMA_ID = GET_CRONO_ID_DA_IMP(~~PQRY_VISESTRIAIM1.RECORANNOIMP~~,~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~,~~PQRY_PARS84.NOMOGGESERIF~~,~~FINANZIAMENTO_OPERA~~)) ");
    SQL.append("and   (NOT ((A.ESERCIZIO_ENTRATA IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.ESERCIZIO_PLUR, ");
    SQL.append("  TO_CHAR ( B.ESERCIZIO_PLUR ) ");
    SQL.append("from ");
    SQL.append("  ENTRATE_CRONOPROGRAMMI B ");
    SQL.append("where (B.ESERCIZIO_PLUR = ~~ANNO_ENTRATA_CRONO~~) ");
    SQL.append("and   (B.CRONOPROGRAMMA_ID_SPESA = GET_CRONO_ID_DA_IMP(~~PQRY_VISESTRIAIM1.RECORANNOIMP~~,~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~,~~PQRY_PARS84.NOMOGGESERIF~~,~~FINANZIAMENTO_OPERA~~)) ");
    SQL.append("and   (B.FINANZIAMENTO = DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, ~~FINANZIAMENTO_OPERA~~, ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.FINANZIAMENTO_LIGHT ");
    SQL.append("from ");
    SQL.append("  IMP C ");
    SQL.append("where (C.ANNO_IMP = ~~PQRY_VISESTRIAIM1.RECORANNOIMP~~) ");
    SQL.append("and   (C.NUMERO_IMP = ~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~) ");
    SQL.append("))) ");
    SQL.append("order by 1 ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_TESTATCRONOP, 0, SQL, PFL_PROPOSVARIAZ_ANNOENTRCRON, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO_ENTRATA as TESCROESEENT, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO_ENTRATA ) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A ");
    SQL.append("where (A.CRONOPROGRAMMA_ID = GET_CRONO_ID_DA_IMP(~~PQRY_VISESTRIAIM1.RECORANNOIMP~~,~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~,~~PQRY_PARS84.NOMOGGESERIF~~,~~FINANZIAMENTO_OPERA~~)) ");
    SQL.append("and   (NOT ((A.ESERCIZIO_ENTRATA IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.ESERCIZIO_PLUR, ");
    SQL.append("  TO_CHAR ( B.ESERCIZIO_PLUR ) ");
    SQL.append("from ");
    SQL.append("  ENTRATE_CRONOPROGRAMMI B ");
    SQL.append("where (B.CRONOPROGRAMMA_ID_SPESA = GET_CRONO_ID_DA_IMP(~~PQRY_VISESTRIAIM1.RECORANNOIMP~~,~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~,~~PQRY_PARS84.NOMOGGESERIF~~,~~FINANZIAMENTO_OPERA~~)) ");
    SQL.append("and   (B.FINANZIAMENTO = DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, ~~FINANZIAMENTO_OPERA~~, ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.FINANZIAMENTO_LIGHT ");
    SQL.append("from ");
    SQL.append("  IMP C ");
    SQL.append("where (C.ANNO_IMP = ~~PQRY_VISESTRIAIM1.RECORANNOIMP~~) ");
    SQL.append("and   (C.NUMERO_IMP = ~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~) ");
    SQL.append("))) ");
    SQL.append("order by 1 ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_TESTATCRONOP, 1, SQL, PFL_PROPOSVARIAZ_ANNOENTRCRON, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_TESTATCRONOP, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO_DESTINAZIONE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_PROPOSVARIAZ_FINANZDESTIN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_PROPOSVARIAZ_FINANZDESTIN, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSVARIAZ.SetIMDB(IMDB, "PQRY_PROPOSTRIAC1", true);
    PAN_PROPOSVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "PROPOSTE RIACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.PERIODO_RIACC as PERIODO_RIACC, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.ANNO_IMPACC as ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC as NUMERO_IMPACC, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_ESIGIBILITA as ANNO_ESIGIBILITA, ");
    SQL.append("  A.ANNO_ENTRATA as ANNO_ENTRATA, ");
    SQL.append("  A.IMPORTO_UFF as IMPORTO_UFF, ");
    SQL.append("  A.NOTE_UFF as NOTE_UFF, ");
    SQL.append("  A.IMPORTO_RAG as IMPORTO_RAG, ");
    SQL.append("  A.NOTE_RAG as NOTE_RAG, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.FINANZIAMENTO_OPERA as FINANZIAMENTO_OPERA, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.ANNO_ESIGIBILITA_CRONO as ANNO_ESIGIBILITA_CRONO, ");
    SQL.append("  A.ANNO_ENTRATA_CRONO as ANNO_ENTRATA_CRONO, ");
    SQL.append("  A.FINANZIAMENTO_DESTINAZIONE as FINANZIAMENTO_DESTINAZIONE ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_PROPOSTRIAC1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROPOSTE_RIACC A ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_PROPOSTRIAC1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.NUMERO_SUBIMP, -1) = NVL(~~PQRY_VISESTRIAIM1.RECONUMESUBI~~, -1)) ");
    SQL.append("and   (NVL(A.ANNO_SUBIMP, -1) = NVL(~~PQRY_VISESTRIAIM1.RECOANNOSUBI~~, -1)) ");
    SQL.append("and   (A.NUMERO_IMPACC = ~~PQRY_VISESTRIAIM1.RECORNUMEIMP~~) ");
    SQL.append("and   (A.ANNO_IMPACC = ~~PQRY_VISESTRIAIM1.RECORANNOIMP~~) ");
    SQL.append("and   (A.PERIODO_RIACC = ~~PQRY_PARS84.CODICE~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARS85.NOMEOGGETTES~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARS84.NOMOGGESERIF~~) ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_PROPOSTRIAC1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_PROPOSTRIAC1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_PROPOSTRIAC1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_PROPOSVARIAZ.SetQuery(PPQRY_PROPOSTRIAC1, 5, SQL, -1, "");
    PAN_PROPOSVARIAZ.SetQueryDB(PPQRY_PROPOSTRIAC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROPOSVARIAZ.SetMasterTable(0, "PROPOSTE_RIACC");
    PAN_PROPOSVARIAZ.AddToSortList(PFL_PROPOSVARIAZ_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROPOSVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_PROPOSVARIAZ.iUseListQBE;
      PAN_PROPOSVARIAZ.iUseListQBE = 0;
      PAN_PROPOSVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROPOSVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_PROPOSVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_ValidateRow(Cancel);
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_DynamicProperties();
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_OnChangeRow();
  }

  public void OnSelectingRow(IDPanel SrcObj)
  {
  }

  public void OnSorting(IDPanel SrcObj, IDVariant FldIdx, IDVariant Cancel)
  {
  }

  public void OnChangeSelection(IDPanel SrcObj, IDVariant NewVal, IDVariant Final, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_OnChangeSelection(NewVal, Final, Cancel);
  }
  
  public void OnChangeLocking(IDPanel SrcObj, IDVariant NewLocking, IDVariant Cancel)
  {
  }
  
  public void OnChangeStatus(IDPanel SrcObj, IDVariant OldStatus)
  {
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_OnChangeStatus(OldStatus);
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ELENCOIMPSUB) PAN_ELENCOIMPSUB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PROPOSVARIAZ) PAN_PROPOSVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
