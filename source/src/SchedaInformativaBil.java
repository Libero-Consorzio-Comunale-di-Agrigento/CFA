// **********************************************
// Scheda Informativa Bil
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedaInformativaBil extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCHEINFOENTR_STANZINIPURO = 0;
  private static int PFL_SCHEINFOENTR_VARIAZPURO = 1;
  private static int PFL_SCHEINFOENTR_INFOVARIAZI1 = 2;
  private static int PFL_SCHEINFOENTR_STANZATTPURO = 3;
  private static int PFL_SCHEINFOENTR_IMPEACCEPURO = 4;
  private static int PFL_SCHEINFOENTR_INFODISPPRO1 = 5;
  private static int PFL_SCHEINFOENTR_DISPONPURO = 6;
  private static int PFL_SCHEINFOENTR_STANZINICA1 = 7;
  private static int PFL_SCHEINFOENTR_VARIAZCA1 = 8;
  private static int PFL_SCHEINFOENTR_STANZATTCA1 = 9;
  private static int PFL_SCHEINFOENTR_DISPONCA1 = 10;
  private static int PFL_SCHEINFOENTR_MANDORDRES1 = 11;
  private static int PFL_SCHEINFOENTR_MANDORDCO1 = 12;
  private static int PFL_SCHEINFOENTR_MANDORDTOT1 = 13;
  private static int PFL_SCHEINFOENTR_RESIDUI1 = 14;
  private static int PFL_SCHEINFOENTR_STAINIREIESI = 15;
  private static int PFL_SCHEINFOENTR_VARIREISESIG = 16;
  private static int PFL_SCHEINFOENTR_STAATTREIESI = 17;
  private static int PFL_SCHEINFOENTR_DISPREISESIG = 18;
  private static int PFL_SCHEINFOENTR_IMPACCREIESI = 19;
  private static int PFL_SCHEINFOENTR_ETICHETTPURO = 20;
  private static int PFL_SCHEINFOENTR_ETICREIDAES1 = 21;
  private static int PFL_SCHEINFOENTR_ETICHETCASS1 = 22;
  private static int PFL_SCHEINFOENTR_DISPONCA11 = 23;
  private static int PFL_SCHEINFOENTR_DISPONCA22 = 24;
  private static int PFL_SCHEINFOENTR_ETICHETOTAL1 = 25;
  private static int PFL_SCHEINFOENTR_TOTSTNINI = 26;
  private static int PFL_SCHEINFOENTR_TOTVAR = 27;
  private static int PFL_SCHEINFOENTR_TOTATT = 28;
  private static int PFL_SCHEINFOENTR_TOTDIS = 29;
  private static int PFL_SCHEINFOENTR_TOTACC = 30;

  private static int PPQRY_DUAL1 = 0;

  private static int PPQRY_TOTSTNINI = 1;


  IDPanel PAN_SCHEINFOENTR;
  private static int PFL_SCHEINFOSPES_STANZINICO = 0;
  private static int PFL_SCHEINFOSPES_VARIAZCO = 1;
  private static int PFL_SCHEINFOSPES_STANZATTCO = 2;
  private static int PFL_SCHEINFOSPES_IMPEGACCERT = 3;
  private static int PFL_SCHEINFOSPES_INFODISPPROV = 4;
  private static int PFL_SCHEINFOSPES_DISPONCO = 5;
  private static int PFL_SCHEINFOSPES_STANZINICA = 6;
  private static int PFL_SCHEINFOSPES_VARIAZCA = 7;
  private static int PFL_SCHEINFOSPES_STANZATTCA = 8;
  private static int PFL_SCHEINFOSPES_DISPONCA = 9;
  private static int PFL_SCHEINFOSPES_MANDORDRES = 10;
  private static int PFL_SCHEINFOSPES_MANDORDCO = 11;
  private static int PFL_SCHEINFOSPES_MANDORDTOT = 12;
  private static int PFL_SCHEINFOSPES_RESIDUI = 13;
  private static int PFL_SCHEINFOSPES_STANZINIFPV = 14;
  private static int PFL_SCHEINFOSPES_VARIAZFPV = 15;
  private static int PFL_SCHEINFOSPES_STANZATTFPV = 16;
  private static int PFL_SCHEINFOSPES_DISPONFPV = 17;
  private static int PFL_SCHEINFOSPES_IMPEGNATOFPV = 18;
  private static int PFL_SCHEINFOSPES_ETICHETTCOMP = 19;
  private static int PFL_SCHEINFOSPES_ETICHEMANDAT = 20;
  private static int PFL_SCHEINFOSPES_ETICHETCASSA = 21;
  private static int PFL_SCHEINFOSPES_ETICREIDAESI = 22;
  private static int PFL_SCHEINFOSPES_STANZINIIMP = 23;
  private static int PFL_SCHEINFOSPES_VARIMP = 24;
  private static int PFL_SCHEINFOSPES_STNATTIMP = 25;
  private static int PFL_SCHEINFOSPES_DISPIMP = 26;
  private static int PFL_SCHEINFOSPES_REISCRIMP = 27;
  private static int PFL_SCHEINFOSPES_ETICREIDASTA = 28;
  private static int PFL_SCHEINFOSPES_STNINISTN = 29;
  private static int PFL_SCHEINFOSPES_VARSTN = 30;
  private static int PFL_SCHEINFOSPES_STNATTSTN = 31;
  private static int PFL_SCHEINFOSPES_DISPSTN = 32;
  private static int PFL_SCHEINFOSPES_IMPSTN = 33;
  private static int PFL_SCHEINFOSPES_FPV = 34;
  private static int PFL_SCHEINFOSPES_IMPORTOFPV = 35;
  private static int PFL_SCHEINFOSPES_SUREISCRESI = 36;
  private static int PFL_SCHEINFOSPES_STNTOT = 37;
  private static int PFL_SCHEINFOSPES_ETICHETOTALE = 38;
  private static int PFL_SCHEINFOSPES_VARIAZIONTOT = 39;
  private static int PFL_SCHEINFOSPES_STANZATTTOT = 40;
  private static int PFL_SCHEINFOSPES_DISTOT = 41;
  private static int PFL_SCHEINFOSPES_IMPEGNATOTOT = 42;
  private static int PFL_SCHEINFOSPES_FPVTOT = 43;
  private static int PFL_SCHEINFOSPES_INFOVARIAZIO = 44;
  private static int PFL_SCHEINFOSPES_INFOPURO = 45;
  private static int PFL_SCHEINFOSPES_SUREISCSTANZ = 46;

  private static int PPQRY_DUAL4 = 0;

  private static int PPQRY_TOT = 1;


  IDPanel PAN_SCHEINFOSPES;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI416(IMDB);
    Init_TBL_PARAMEPOSIZ2(IMDB);
    Init_TBL_IMPORTIVAR(IMDB);
    //
    //
    Init_PQRY_DUAL1(IMDB);
    Init_PQRY_DUAL4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI416(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI416, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI416, "TBL_PARAMETRI416");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI416,IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI416,IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI416,IMDBDef7.FLD_PARAMETRI416_PARATIPOESPL, "PARATIPOESPL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI416,IMDBDef7.FLD_PARAMETRI416_PARATIPOESPL,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI416,IMDBDef7.FLD_PARAMETRI416_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI416,IMDBDef7.FLD_PARAMETRI416_PARAMTITOLO,5,100,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI416, 0);
  }

  private static void Init_TBL_PARAMEPOSIZ2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMEPOSIZ2, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMEPOSIZ2, "TBL_PARAMEPOSIZ2");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMEPOSIZ2,IMDBDef7.FLD_PARAMEPOSIZ2_POSTOP, "POSTOP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMEPOSIZ2,IMDBDef7.FLD_PARAMEPOSIZ2_POSTOP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMEPOSIZ2,IMDBDef7.FLD_PARAMEPOSIZ2_POSLEFT, "POSLEFT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMEPOSIZ2,IMDBDef7.FLD_PARAMEPOSIZ2_POSLEFT,1,5,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMEPOSIZ2, 0);
  }

  private static void Init_TBL_IMPORTIVAR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_IMPORTIVAR, 8);
    IMDB.set_TblCode(IMDBDef7.TBL_IMPORTIVAR, "TBL_IMPORTIVAR");
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR1, "NOMEOGGEVAR1");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR1,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR2, "NOMEOGGEVAR2");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR2,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARI,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARP, "NOMEOGGEVARP");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARP,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR3, "NOMEOGGEVAR3");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR3,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARS, "NOMEOGGEVARS");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARS,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR4, "NOMEOGGEVAR4");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR4,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARC, "NOMEOGGEVARC");
    IMDB.SetFldParams(IMDBDef7.TBL_IMPORTIVAR,IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARC,3,14,2);
    IMDB.TblAddNew(IMDBDef7.TBL_IMPORTIVAR, 0);
  }

  private static void Init_PQRY_DUAL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_DUAL1, 20);
    IMDB.set_TblCode(IMDBDef17.PQRY_DUAL1, "PQRY_DUAL1");
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZINIPURO, "STANZINIPURO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZINIPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_VARIAZPURO, "VARIAZPURO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_VARIAZPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZATTPURO, "STANZATTPURO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZATTPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_IMPEACCEPURO, "IMPEACCEPURO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_IMPEACCEPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONPURO, "DISPONPURO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_RESIDUI, "RESIDUI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_RESIDUI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZINICA, "STANZINICA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZINICA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_VARIAZCA, "VARIAZCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_VARIAZCA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZATTCA, "STANZATTCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STANZATTCA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_MANDORDCO, "MANDORDCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_MANDORDCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_MANDORDRES, "MANDORDRES");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_MANDORDRES,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_MANDORDTOT, "MANDORDTOT");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_MANDORDTOT,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONCA3, "DISPONCA3");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONCA3,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONCA1, "DISPONCA1");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONCA1,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONCA2, "DISPONCA2");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPONCA2,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STAINIREIESI, "STAINIREIESI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STAINIREIESI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_VARIREISESIG, "VARIREISESIG");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_VARIREISESIG,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STAATTREIESI, "STAATTREIESI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_STAATTREIESI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPREISESIG, "DISPREISESIG");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_DISPREISESIG,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_IMPACCREIESI, "IMPACCREIESI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL1,IMDBDef17.PQSL_DUAL1_IMPACCREIESI,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_DUAL1, 0);
  }

  private static void Init_PQRY_DUAL4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_DUAL4, 32);
    IMDB.set_TblCode(IMDBDef17.PQRY_DUAL4, "PQRY_DUAL4");
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINICO, "STANZINICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINICO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIAZCO, "VARIAZCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIAZCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZATTCO, "STANZATTCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZATTCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_IMPEGACCERT, "IMPEGACCERT");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_IMPEGACCERT,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPONCO, "DISPONCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPONCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_RESIDUI, "RESIDUI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_RESIDUI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINICA, "STANZINICA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINICA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIAZCA, "VARIAZCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIAZCA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZATTCA, "STANZATTCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZATTCA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_MANDORDCO, "MANDORDCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_MANDORDCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_MANDORDRES, "MANDORDRES");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_MANDORDRES,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_MANDORDTOT, "MANDORDTOT");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_MANDORDTOT,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPONCA3, "DISPONCA3");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPONCA3,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINIFPV, "STANZINIFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINIFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIAZFPV, "VARIAZFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIAZFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZATTFPV, "STANZATTFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZATTFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPONFPV, "DISPONFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPONFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_IMPEGNATOFPV, "IMPEGNATOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_IMPEGNATOFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINIIMP, "STANZINIIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STANZINIIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIMP, "VARIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STNATTIMP, "STNATTIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STNATTIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPIMP, "DISPIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_REISCRIMP, "REISCRIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_REISCRIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STNINISTN, "STNINISTN");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STNINISTN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARSTN, "VARSTN");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_VARSTN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STNATTSTN, "STNATTSTN");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_STNATTSTN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPSTN, "DISPSTN");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_DISPSTN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_IMPSTN, "IMPSTN");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_IMPSTN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_FPV, "FPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_FPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_RECORIMPOFPV, "RECORIMPOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_RECORIMPOFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_SUREISCRESI, "SUREISCRESI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_SUREISCRESI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_SUREISCSTANZ, "SUREISCSTANZ");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL4,IMDBDef17.PQSL_DUAL4_SUREISCSTANZ,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_DUAL4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedaInformativaBil(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedaInformativaBil()
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
    FormIdx = MyGlb.FRM_SCHEDINFOBIL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EDFE55B3-A02F-4D8D-ADC8-01EDDF8102CA";
    ResModeW = 3;
    ResModeH = 1;
    iBorderType = 2;
    iVisualFlags = -4089;
    DesignWidth = 692;
    DesignHeight = 678;
    set_Caption(new IDVariant("Scheda Informativa"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 692;
    Frames[1].Height = 652;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.453988;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 692;
    Frames[2].Height = 296;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Scheda Informativa Entrata";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 296;
    PAN_SCHEINFOENTR = new IDPanel(w, this, 2, "PAN_SCHEINFOENTR");
    Frames[2].Content = PAN_SCHEINFOENTR;
    PAN_SCHEINFOENTR.ShowRowSelector = false;
    PAN_SCHEINFOENTR.ShowToolbar = false;
    PAN_SCHEINFOENTR.ShowStatusbar = false;
    PAN_SCHEINFOENTR.iLocked = false;
    PAN_SCHEINFOENTR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEINFOENTR.VS = MainFrm.VisualStyleList;
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 692-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "230C7969-FB2D-45F3-81E1-63DD5571E3E8");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1308, 120, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 0);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEINFOENTR.InitStatus = 2;
    PAN_SCHEINFOENTR_Init();
    PAN_SCHEINFOENTR_InitFields();
    PAN_SCHEINFOENTR_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 692;
    Frames[3].Height = 356;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Scheda Informativa Spesa";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 356;
    PAN_SCHEINFOSPES = new IDPanel(w, this, 3, "PAN_SCHEINFOSPES");
    Frames[3].Content = PAN_SCHEINFOSPES;
    PAN_SCHEINFOSPES.ShowRowSelector = false;
    PAN_SCHEINFOSPES.ShowToolbar = false;
    PAN_SCHEINFOSPES.ShowStatusbar = false;
    PAN_SCHEINFOSPES.iLocked = false;
    PAN_SCHEINFOSPES.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEINFOSPES.VS = MainFrm.VisualStyleList;
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 692-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F6696916-A6F6-4327-8265-0E9887B1803C");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2960, 120, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 0);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEINFOSPES.InitStatus = 2;
    PAN_SCHEINFOSPES_Init();
    PAN_SCHEINFOSPES_InitFields();
    PAN_SCHEINFOSPES_InitQueries();
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
      PAN_SCHEINFOENTR.UpdatePanel(MainFrm);
      PAN_SCHEINFOSPES.UpdatePanel(MainFrm);
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
    return (obj instanceof SchedaInformativaBil);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedaInformativaBil.class.getName() : (Glb.ClassWithPackage(SchedaInformativaBil.class) ? SchedaInformativaBil.class.getName().substring(SchedaInformativaBil.class.getPackage().getName().length() + 1) : SchedaInformativaBil.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scheda Informativa Entrata After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SCHEINFOENTR_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scheda Informativa Entrata After Find Body
      // Corpo Procedura
      // 
      SettaCaption();
      VisibilitaInfoVar();
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_ACCERTATO = new IDVariant(0,IDVariant.STRING);
        v_ACCERTATO = (new IDVariant("Accertato"));
        IDVariant v_ORDINATIVRES = new IDVariant(0,IDVariant.STRING);
        v_ORDINATIVRES = (new IDVariant("Ordinativi Res."));
        IDVariant v_ORDINATICOMP = new IDVariant(0,IDVariant.STRING);
        v_ORDINATICOMP = (new IDVariant("Ordinativi Comp."));
        IDVariant v_ORDINATIVTOT = new IDVariant(0,IDVariant.STRING);
        v_ORDINATIVTOT = (new IDVariant("Ordinativi Tot."));
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_IMPEACCEPURO, new IDVariant(v_ACCERTATO).stringValue());
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_MANDORDRES1, new IDVariant(v_ORDINATIVRES).stringValue());
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_MANDORDCO1, new IDVariant(v_ORDINATICOMP).stringValue());
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_MANDORDTOT1, new IDVariant(v_ORDINATIVTOT).stringValue());
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        IDVariant v_IMPEGNATO = new IDVariant(0,IDVariant.STRING);
        v_IMPEGNATO = (new IDVariant("Impegnato"));
        IDVariant v_MANDATIRES = new IDVariant(0,IDVariant.STRING);
        v_MANDATIRES = (new IDVariant("Mandati Res."));
        IDVariant v_MANDATICOMP = new IDVariant(0,IDVariant.STRING);
        v_MANDATICOMP = (new IDVariant("Mandati Comp."));
        IDVariant v_MANDATITOT = new IDVariant(0,IDVariant.STRING);
        v_MANDATITOT = (new IDVariant("Mandati Tot."));
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_IMPEACCEPURO, new IDVariant(v_IMPEGNATO).stringValue());
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_MANDORDRES1, new IDVariant(v_MANDATIRES).stringValue());
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_MANDORDCO1, new IDVariant(v_MANDATICOMP).stringValue());
        PAN_SCHEINFOENTR.set_Header(Glb.OBJ_FIELD,PFL_SCHEINFOENTR_MANDORDTOT1, new IDVariant(v_MANDATITOT).stringValue());
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // MN Bug redmine #6147 - commento perchè non si capisce
      // chi e perchè abbia inserito questa condizione di vis
      // 
      // if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0).equals((new IDVariant("G")), true))
      // {
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // }
      // else
      // {
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // }
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0).equals((new IDVariant("E")), true))
      {
        PAN_SCHEINFOENTR.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_SCHEINFOSPES.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_SCHEINFOENTR.set_Visible((new IDVariant(0)).booleanValue());
        PAN_SCHEINFOSPES.set_Visible((new IDVariant(-1)).booleanValue());
      }
      set_FormHeightSize((new IDVariant(330)).intValue());
      set_FormTopPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ2, IMDBDef7.FLD_PARAMEPOSIZ2_POSTOP, 0),IDL.Sub((new IDVariant(MainFrm.ScreenHeight())), (new IDVariant(300)))).intValue());
      set_FormWidthSize((new IDVariant(600)).intValue());
      set_FormLeftPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ2, IMDBDef7.FLD_PARAMEPOSIZ2_POSLEFT, 0),IDL.Sub((new IDVariant(MainFrm.ScreenWidth())), (IDL.Add((new IDVariant(FormWidthSize())), (new IDVariant(40)))))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "SchedaInformativaEntrataAfterFind", _e);
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
      IDVariant v_DETTADELPURO = new IDVariant(0,IDVariant.STRING);
      v_DETTADELPURO = (new IDVariant("Dettaglio del Puro"));
      // if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0).equals((new IDVariant("E")), true))
      // {
        // PAN_SCHEINFOENTR.set_Visible((new IDVariant(-1)).booleanValue());
        // PAN_SCHEINFOSPES.set_Visible((new IDVariant(0)).booleanValue());
      // }
      // else
      // {
        // PAN_SCHEINFOENTR.set_Visible((new IDVariant(0)).booleanValue());
        // PAN_SCHEINFOSPES.set_Visible((new IDVariant(-1)).booleanValue());
      // }
      // set_FormTopPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ2, IMDBDef7.FLD_PARAMEPOSIZ2_POSTOP, 0),IDL.Sub((new IDVariant(MainFrm.ScreenHeight())), (new IDVariant(350)))).intValue());
      // set_FormLeftPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ2, IMDBDef7.FLD_PARAMEPOSIZ2_POSLEFT, 0),IDL.Sub((new IDVariant(MainFrm.ScreenWidth())), (IDL.Add((new IDVariant(FormWidthSize())), (new IDVariant(30)))))).intValue());
      PAN_SCHEINFOSPES.set_ToolTip(Glb.OBJ_FIELD,PFL_SCHEINFOSPES_INFOPURO,v_DETTADELPURO.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "Load", _e);
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
      UNLOAD_PARAMEDELETE();
      UNLOAD_IMPORTDELETE();
      IMDB.set_Value(IMDBDef6.TBL_PARAMEPOSIZ3, IMDBDef6.FLD_PARAMEPOSIZ3_POSTOP, 0, (new IDVariant(FormTopPosition())));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEPOSIZ3, IMDBDef6.FLD_PARAMEPOSIZ3_POSLEFT, 0, (new IDVariant(FormLeftPosition())));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARATIPOESPL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMTITOLO, 0, new IDVariant());
  }

  // **********************************************************************
  // Importivar: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMPORTDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR2, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR3, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR4, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARC, 0, new IDVariant());
  }

  // **********************************************************************
  // Scheda Informativa Spesa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SCHEINFOSPES_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scheda Informativa Spesa After Find Body
      // Corpo Procedura
      // 
      SettaCaption();
      VisibilitaInfoVar();
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0).equals((new IDVariant("E")), true))
      {
        PAN_SCHEINFOENTR.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_SCHEINFOSPES.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_SCHEINFOENTR.set_Visible((new IDVariant(0)).booleanValue());
        PAN_SCHEINFOSPES.set_Visible((new IDVariant(-1)).booleanValue());
      }
      set_FormHeightSize((new IDVariant(400)).intValue());
      set_FormTopPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ2, IMDBDef7.FLD_PARAMEPOSIZ2_POSTOP, 0),IDL.Sub((new IDVariant(MainFrm.ScreenHeight())), (new IDVariant(350)))).intValue());
      set_FormWidthSize((new IDVariant(700)).intValue());
      set_FormLeftPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ2, IMDBDef7.FLD_PARAMEPOSIZ2_POSLEFT, 0),IDL.Sub((new IDVariant(MainFrm.ScreenWidth())), (IDL.Add((new IDVariant(FormWidthSize())), (new IDVariant(40)))))).intValue());
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("Spesa")), true))
      {
        PAN_SCHEINFOSPES.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SCHEINFOSPES.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "SchedaInformativaSpesaAfterFind", _e);
    }
  }

  // **********************************************************************
  // Setta Caption
  // **********************************************************************
  public int SettaCaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Caption Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Scheda Informativa - "));
      IDVariant I = null;
      I = IDL.Find(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0), (new IDVariant(":")));
      set_Caption(IDL.Add(v_CAPTION, IDL.SubStr(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0), (new IDVariant(1)), ((I.equals((new IDVariant(0))))?(new IDVariant(100)):IDL.Sub(I, (new IDVariant(1)))))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "SettaCaption", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Disp Prov Spesa
  // **********************************************************************
  public int InfoDispProvSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Disp Prov Spesa Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMSTANATT, 0, IDL.ToCurrency((new IDVariant(PAN_SCHEINFOSPES.FieldText(PFL_SCHEINFOSPES_STANZATTTOT)))));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARSTAATTESI, 0, IMDB.Value(IMDBDef17.PQRY_DUAL4, IMDBDef17.PQSL_DUAL4_STNATTIMP, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARSTAATTSTN, 0, IMDB.Value(IMDBDef17.PQRY_DUAL4, IMDBDef17.PQSL_DUAL4_STNATTSTN, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARSTAATTCAS, 0, IMDB.Value(IMDBDef17.PQRY_DUAL4, IMDBDef17.PQSL_DUAL4_STANZATTCA, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMDISPONI, 0, IDL.ToCurrency((new IDVariant(PAN_SCHEINFOSPES.FieldText(PFL_SCHEINFOSPES_DISTOT)))));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMDISPESI, 0, IMDB.Value(IMDBDef17.PQRY_DUAL4, IMDBDef17.PQSL_DUAL4_DISPIMP, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMDISPSTN, 0, IMDB.Value(IMDBDef17.PQRY_DUAL4, IMDBDef17.PQSL_DUAL4_DISPSTN, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARADISPCASS, 0, IMDB.Value(IMDBDef17.PQRY_DUAL4, IMDBDef17.PQSL_DUAL4_DISPONCA3, 0));
      MainFrm.Show(MyGlb.FRM_INFODISPPROV, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "InfoDispProvSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Disp Prov Entrata
  // **********************************************************************
  public int InfoDispProvEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Disp Prov Entrata Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMSTANATT, 0, IDL.ToCurrency((new IDVariant(PAN_SCHEINFOENTR.FieldText(PFL_SCHEINFOENTR_TOTATT)))));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARSTAATTESI, 0, IMDB.Value(IMDBDef17.PQRY_DUAL1, IMDBDef17.PQSL_DUAL1_STAATTREIESI, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARSTAATTSTN, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARSTAATTCAS, 0, IMDB.Value(IMDBDef17.PQRY_DUAL1, IMDBDef17.PQSL_DUAL1_STANZATTCA, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMDISPONI, 0, IDL.ToCurrency((new IDVariant(PAN_SCHEINFOENTR.FieldText(PFL_SCHEINFOENTR_TOTDIS)))));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMDISPESI, 0, IMDB.Value(IMDBDef17.PQRY_DUAL1, IMDBDef17.PQSL_DUAL1_DISPREISESIG, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARAMDISPSTN, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI501, IMDBDef7.FLD_PARAMETRI501_PARADISPCASS, 0, IMDB.Value(IMDBDef17.PQRY_DUAL1, IMDBDef17.PQSL_DUAL1_DISPONCA3, 0));
      MainFrm.Show(MyGlb.FRM_INFODISPPROV, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "InfoDispProvEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Info Var
  // **********************************************************************
  public int VisibilitaInfoVar ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Info Var Body
      // Corpo Procedura
      // 
      IDVariant v_VARPUROPOS = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VARPURONEG = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VARIMPPOS = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VARIMPNEG = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VARSTNPOS = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VARSTNNEG = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VARCAPOS = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VARCANEG = new IDVariant(0,IDVariant.DECIMAL);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_PURO_POS'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO1, ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_PURO_NEG'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO2, ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_IMP_POS'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO3, ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_IMP_NEG'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO4, ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_STN_POS'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO5, ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_STN_NEG'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO6, ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_CA_POS'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO7, ");
      SQL.append("  GET_IMPORTI_SCHEDA_INFO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'VAR_CA_NEG'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIAZCO ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VARPUROPOS = QV.Get("VARIAZCO1", IDVariant.DECIMAL) ;
        v_VARPURONEG = QV.Get("VARIAZCO2", IDVariant.DECIMAL) ;
        v_VARIMPPOS = QV.Get("VARIAZCO3", IDVariant.DECIMAL) ;
        v_VARIMPNEG = QV.Get("VARIAZCO4", IDVariant.DECIMAL) ;
        v_VARSTNPOS = QV.Get("VARIAZCO5", IDVariant.DECIMAL) ;
        v_VARSTNNEG = QV.Get("VARIAZCO6", IDVariant.DECIMAL) ;
        v_VARCAPOS = QV.Get("VARIAZCO7", IDVariant.DECIMAL) ;
        v_VARCANEG = QV.Get("VARIAZCO", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR1, 0, new IDVariant(v_VARPUROPOS));
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR2, 0, new IDVariant(v_VARPURONEG));
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARI, 0, new IDVariant(v_VARIMPPOS));
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARP, 0, new IDVariant(v_VARIMPNEG));
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR3, 0, new IDVariant(v_VARSTNPOS));
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARS, 0, new IDVariant(v_VARSTNNEG));
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR4, 0, new IDVariant(v_VARCAPOS));
      IMDB.set_Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARC, 0, new IDVariant(v_VARCANEG));
      if ((IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Abs(IDL.NullValue(v_VARPUROPOS,(new IDVariant(0)))), IDL.Abs(IDL.NullValue(v_VARPURONEG,(new IDVariant(0))))), IDL.Abs(IDL.NullValue(v_VARIMPPOS,(new IDVariant(0))))), IDL.Abs(IDL.NullValue(v_VARIMPNEG,(new IDVariant(0))))), IDL.Abs(IDL.NullValue(v_VARSTNPOS,(new IDVariant(0))))), IDL.Abs(IDL.NullValue(v_VARSTNNEG,(new IDVariant(0))))), IDL.Abs(IDL.NullValue(v_VARCAPOS,(new IDVariant(0))))), IDL.Abs(IDL.NullValue(v_VARCANEG,(new IDVariant(0)))))).compareTo((new IDVariant(0)), true)>0)
      {
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOSPES.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SCHEINFOENTR.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEINFOSPES.SetFlags (Glb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "VisibilitaInfoVar", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Variazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Variazioni Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_SCHEINFOVARI, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_SCHEINFOVARI,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMEOGGETTES, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAPUPO, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR1, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAPUNE, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR2, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAIMPO, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARI, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAIMNE, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARP, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVASTPO, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR3, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVASTNE, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARS, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVACAPO, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVAR4, 0));
      IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVACANE, 0, IMDB.Value(IMDBDef7.TBL_IMPORTIVAR, IMDBDef7.FLD_IMPORTIVAR_NOMEOGGEVARC, 0));
      MainFrm.Show(MyGlb.FRM_SCHEINFOVARI, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "InfoVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Puro
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoPuro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Puro Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_DETTADELPURO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaBil", "InfoPuro", _e);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SCHEINFOENTR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEINFOENTR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEINFOENTR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEINFOENTR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEINFOENTR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCHEINFOENTR);
    // Stub
  }

  private void PAN_SCHEINFOENTR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SCHEINFOENTR_INFOVARIAZI1)
    {
      this.IdxPanelActived = this.PAN_SCHEINFOENTR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVariazioni();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SCHEINFOENTR_INFODISPPRO1)
    {
      this.IdxPanelActived = this.PAN_SCHEINFOENTR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDispProvEntrata();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SCHEINFOENTR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEINFOENTR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEINFOENTR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SCHEINFOSPES_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEINFOSPES, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEINFOSPES_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEINFOSPES, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEINFOSPES_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCHEINFOSPES);
    // Stub
  }

  private void PAN_SCHEINFOSPES_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SCHEINFOSPES_INFODISPPROV)
    {
      this.IdxPanelActived = this.PAN_SCHEINFOSPES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDispProvSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SCHEINFOSPES_INFOVARIAZIO)
    {
      this.IdxPanelActived = this.PAN_SCHEINFOSPES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVariazioni();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SCHEINFOSPES_INFOPURO)
    {
      this.IdxPanelActived = this.PAN_SCHEINFOSPES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPuro();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SCHEINFOSPES_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEINFOSPES_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEINFOSPES_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCHEINFOENTR_Init()
  {

    PAN_SCHEINFOENTR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEINFOENTR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCHEINFOENTR.SetSize(MyGlb.OBJ_FIELD, 31);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, "EE869303-2D44-4795-A901-3C2BD51A09CC");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, "Stanz. Iniz.");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, "92CCB630-1D4C-40D2-8C99-1E4ABFC856A4");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, "Variazioni");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, "4EABFEA4-4BB3-419C-BF3B-45FD88360193");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, MyGlb.VIS_STATICBUTTON);
    PAN_SCHEINFOENTR.SetImage(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, 0, "info.gif", false);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, "76E14B93-2694-4CF3-9555-29E5F200A69A");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, "Stanz. Att.");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, "8A76DAC0-B2EE-4965-9571-14F85320717E");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, "Impegnato");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, "597518A2-7057-4DC8-9C4E-648C5151385D");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, MyGlb.VIS_STATICBUTTON);
    PAN_SCHEINFOENTR.SetImage(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, 0, "info.gif", false);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, "1E8235C6-7119-4CAA-B44B-455AB71BCEFB");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, "Disponbilità");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, "1F0ABCAB-8BC8-4398-A770-1F3B49EBD126");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, "Stanz. Iniz. Cassa");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, "1E290F47-F54C-43B2-A987-4E2DD6BE7ECE");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, "Variazioni Cassa");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, "61368C88-473F-4803-BB85-E9DF5DA9DE46");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, "Stanz. Att. Cassa");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, "68195340-FEC3-43B8-BC15-828160D19CA2");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, "Disponibilità Cassa");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, "F21339C4-F34E-429E-9379-4BD83CE766E7");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, "Mandati Res.");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, "BF368418-A8DF-4D1A-AB2E-379BF40D45DE");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, "Mandati Comp.");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, "E06463A7-DEA0-490D-B86C-13A440F82E57");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, "Mandati Tot.");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, "7A1B414B-84DB-4B16-BF26-43EC66110455");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, "Residui");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, "18DF7499-B312-4F1F-8027-E0DC3DD4488C");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, "Stanz Ini Reisc Esig");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, "67FD884E-A092-489B-9A3C-A1BBDEC91E6C");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, "Variaz Reisc Esig");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, "A360483F-EC0A-4CFD-B9D5-57A4C9E98302");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, "Stanz Att Reisc Esig");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, "0E9E4E7A-7702-4720-B733-561CA48ED128");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, "Dispon Reisc Esig");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, "4F9B6577-E4A0-41FE-B767-001BB4A93B56");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, "Impegn Accert Reisc Esig");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, "C9608BA2-2FDC-4AF1-9011-6D927957ACEA");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, "Puro");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, "F17A28A8-B74A-494A-972E-6AC462CD3F9C");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, "Reiscrizione da Esigibilità");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, "E1041ED1-DF16-472A-A050-BE19FEAF97A5");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, "Cassa");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, "74001E88-6FAA-476E-A57F-3CA2390EB7DD");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, "Dispon Ca 1 1");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.VIS_NORMFIELPADR);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, "144D4B95-7C04-427C-98E3-1542A5DEF85A");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, "Dispon Ca 2 2");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.VIS_NORMFIELPADR);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, "C0822098-6759-4A8A-915B-AEED3C14CFC2");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, "Totale");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, "BFFFA35E-91C5-4209-B6E5-DAC2188E4829");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, "Stanz. Iniz.");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, "2C8AB069-B3A3-42A1-8B94-E1378465C849");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, "Variazioni");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, "5F19DC75-7121-4F55-807F-4B42B29344E5");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, "Stanz. Att.");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, "912E1320-2AD1-4E8E-BDD6-C81CA7C4BE2F");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, "Disponibilità");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOENTR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, "641A381B-F10A-4D4E-8B0C-285BC7F2D2DD");
    PAN_SCHEINFOENTR.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, "Accertato");
    PAN_SCHEINFOENTR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, "");
    PAN_SCHEINFOENTR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOENTR.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCHEINFOENTR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_LIST, 0, 0, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_LIST, "St. In.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_FORM, 220, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINIPURO, MyGlb.PANEL_FORM, "Stanz. Iniz.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_STANZINIPURO, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_STANZINIPURO, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_STANZINIPURO, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'INI_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZINIPURO", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_LIST, 60);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_FORM, 220, 64, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZPURO, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_VARIAZPURO, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_VARIAZPURO, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_VARIAZPURO, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARIAZPURO", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, MyGlb.PANEL_LIST, 16, 128, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, MyGlb.PANEL_FORM, 8, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFOVARIAZI1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_INFOVARIAZI1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_INFOVARIAZI1, -1, "", "INFOVARIAZI1", 0, 0, 0, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_LIST, "Stanz. Att.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_FORM, 220, 88, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTPURO, MyGlb.PANEL_FORM, "Stanz. Att.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_STANZATTPURO, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_STANZATTPURO, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_STANZATTPURO, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZATTPURO", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_LIST, 88);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_LIST, "Impegnato");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_FORM, 220, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPEACCEPURO, MyGlb.PANEL_FORM, "Impegnato");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_IMPEACCEPURO, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_IMPEACCEPURO, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_IMPEACCEPURO, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPEACCEPURO", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, MyGlb.PANEL_LIST, 8, 120, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, MyGlb.PANEL_FORM, 8, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_INFODISPPRO1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_INFODISPPRO1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_INFODISPPRO1, -1, "", "INFODISPPRO1", 0, 0, 0, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_LIST, 64);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_LIST, "Disponbilità");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_FORM, 220, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONPURO, MyGlb.PANEL_FORM, "Disponbilità");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_DISPONPURO, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_DISPONPURO, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_DISPONPURO, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONPURO", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_LIST, 76);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_LIST, "Stanz. Iniz. Cassa");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_FORM, 444, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZINICA1, MyGlb.PANEL_FORM, "Stanz. Iniz. Cassa");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_STANZINICA1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_STANZINICA1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_STANZINICA1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZINICA", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_LIST, 60);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_LIST, "Variazioni Cassa");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_FORM, 444, 64, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIAZCA1, MyGlb.PANEL_FORM, "Variazioni Cassa");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_VARIAZCA1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_VARIAZCA1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_VARIAZCA1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARIAZCA", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_LIST, "Stanz. Att. Cassa");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_FORM, 444, 88, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STANZATTCA1, MyGlb.PANEL_FORM, "Stanz. Att. Cassa");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_STANZATTCA1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_STANZATTCA1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_STANZATTCA1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZATTCA", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_LIST, 64);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_LIST, "Disponibilità Cassa");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_FORM, 444, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA1, MyGlb.PANEL_FORM, "Disponibilità Cassa");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_DISPONCA1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_DISPONCA1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_DISPONCA1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONCA3", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_LIST, 88);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_LIST, "Mandati Res.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_FORM, 320, 160, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDRES1, MyGlb.PANEL_FORM, "Mandati Res.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_MANDORDRES1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_MANDORDRES1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_MANDORDRES1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_RES',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "MANDORDRES", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_LIST, "Mandati Comp.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_FORM, 320, 184, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDCO1, MyGlb.PANEL_FORM, "Mandati Comp.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_MANDORDCO1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_MANDORDCO1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_MANDORDCO1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_CO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "MANDORDCO", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_LIST, "Mandati Tot.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_FORM, 320, 208, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_MANDORDTOT1, MyGlb.PANEL_FORM, "Mandati Tot.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_MANDORDTOT1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_MANDORDTOT1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_MANDORDTOT1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_TOT',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "MANDORDTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_LIST, 52);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_LIST, "Residui");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_FORM, 136, 208, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_RESIDUI1, MyGlb.PANEL_FORM, "Residui");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_RESIDUI1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_RESIDUI1, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_RESIDUI1, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'RES_IMP_ACC',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "RESIDUI", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_LIST, "St. Ini Reisc Esig");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_FORM, 332, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAINIREIESI, MyGlb.PANEL_FORM, "St. Ini Rs. Esg.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_STAINIREIESI, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_STAINIREIESI, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_STAINIREIESI, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STAINIREIESI", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_LIST, 68);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_LIST, "Variaz Reisc Esig");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_FORM, 332, 64, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_FORM, 68);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_VARIREISESIG, MyGlb.PANEL_FORM, "Var. Rs. Es.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_VARIREISESIG, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_VARIREISESIG, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_VARIREISESIG, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARIREISESIG", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_LIST, "St. Att Reisc Esig");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_FORM, 332, 88, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_STAATTREIESI, MyGlb.PANEL_FORM, "St. At. Rs. Es.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_STAATTREIESI, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_STAATTREIESI, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_STAATTREIESI, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STAATTREIESI", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_LIST, 72);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_LIST, "Dispon Reisc Esig");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_FORM, 332, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_FORM, 72);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPREISESIG, MyGlb.PANEL_FORM, "Dsp. Rs. Es.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_DISPREISESIG, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_DISPREISESIG, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_DISPREISESIG, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPREISESIG", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_LIST, 96);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_LIST, "Imp. Acc. Rs. Esg.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_FORM, 332, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_FORM, 96);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_IMPACCREIESI, MyGlb.PANEL_FORM, "Imp. Acc. Rs. Es.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_IMPACCREIESI, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_IMPACCREIESI, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_IMPACCREIESI, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'REISCR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPACCREIESI", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, MyGlb.PANEL_LIST, 144, 8, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, MyGlb.PANEL_FORM, 236, 12, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETTPURO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_ETICHETTPURO, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_ETICHETTPURO, -1, "", "ETICHETTPURO", 0, 0, 0, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, MyGlb.PANEL_LIST, 300, 12, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, MyGlb.PANEL_FORM, 332, 4, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICREIDAES1, MyGlb.PANEL_FORM, 2);
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_ETICREIDAES1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_ETICREIDAES1, -1, "", "ETICREIDAES1", 0, 0, 0, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, MyGlb.PANEL_LIST, 448, 12, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, MyGlb.PANEL_FORM, 444, 12, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETCASS1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_ETICHETCASS1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_ETICHETCASS1, -1, "", "ETICHETCASS1", 0, 0, 0, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_LIST, 8, 8, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_LIST, 64);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_LIST, "Dispon Ca 1 1");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_FORM, 12, 244, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_FORM, 64);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA11, MyGlb.PANEL_FORM, "Dsp. C. 1 1");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_DISPONCA11, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_DISPONCA11, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_DISPONCA11, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONCA1", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_LIST, 64);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_LIST, "Dispon Ca 2 2");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_FORM, 4, 236, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_FORM, 64);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_DISPONCA22, MyGlb.PANEL_FORM, "Dsp. C. 2 2");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_DISPONCA22, -1, -1);
    PAN_SCHEINFOENTR.SetFieldUnbound(PFL_SCHEINFOENTR_DISPONCA22, true);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_DISPONCA22, PPQRY_DUAL1, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONCA2", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, MyGlb.PANEL_LIST, 152, 16, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, MyGlb.PANEL_FORM, 108, 12, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_ETICHETOTAL1, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_ETICHETOTAL1, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_ETICHETOTAL1, -1, "", "ETICHETOTAL1", 0, 0, 0, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_LIST, 0, 0, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_LIST, 152);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_LIST, "Stanz. Iniz.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_FORM, 32, 40, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_FORM, 72);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTSTNINI, MyGlb.PANEL_FORM, "Stanz. Iniz.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_TOTSTNINI, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_TOTSTNINI, PPQRY_TOTSTNINI, "NVL(~~STANZINIPURO~~, 0) + NVL(~~STAINIREIESI~~, 0)", "TOTSTNINI", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_LIST, 136);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_FORM, 32, 64, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_FORM, 72);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTVAR, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_TOTVAR, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_TOTVAR, PPQRY_TOTSTNINI, "NVL(~~VARIAZPURO~~, 0) + NVL(~~VARIREISESIG~~, 0)", "TOTVAR", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_LIST, 132);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_LIST, "Stanz. Att.");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_FORM, 32, 88, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_FORM, 72);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTATT, MyGlb.PANEL_FORM, "Stanz. Att.");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_TOTATT, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_TOTATT, PPQRY_TOTSTNINI, "NVL(~~STANZATTPURO~~, 0) + NVL(~~STAATTREIESI~~, 0)", "TOTATT", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_LIST, 132);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_FORM, 24, 112, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTDIS, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_TOTDIS, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_TOTDIS, PPQRY_TOTSTNINI, "NVL(~~DISPONPURO~~, 0) + NVL(~~DISPREISESIG~~, 0)", "TOTDIS", 3, 28, 6, -13997);
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_LIST, 136);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_LIST, "Accertato");
    PAN_SCHEINFOENTR.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_FORM, 24, 136, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOENTR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOENTR.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOENTR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOENTR_TOTACC, MyGlb.PANEL_FORM, "Accertato");
    PAN_SCHEINFOENTR.SetFieldPage(PFL_SCHEINFOENTR_TOTACC, -1, -1);
    PAN_SCHEINFOENTR.SetFieldPanel(PFL_SCHEINFOENTR_TOTACC, PPQRY_TOTSTNINI, "NVL(~~IMPEACCEPURO~~, 0) + NVL(~~IMPACCREIESI~~, 0)", "TOTACC", 3, 28, 6, -13997);
  }

  private void PAN_SCHEINFOENTR_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEINFOENTR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(~~STANZINIPURO~~, 0) + NVL(~~STAINIREIESI~~, 0) as TOTSTNINI, ");
    SQL.append("  NVL(~~VARIAZPURO~~, 0) + NVL(~~VARIREISESIG~~, 0) as TOTVAR, ");
    SQL.append("  NVL(~~STANZATTPURO~~, 0) + NVL(~~STAATTREIESI~~, 0) as TOTATT, ");
    SQL.append("  NVL(~~DISPONPURO~~, 0) + NVL(~~DISPREISESIG~~, 0) as TOTDIS, ");
    SQL.append("  NVL(~~IMPEACCEPURO~~, 0) + NVL(~~IMPACCREIESI~~, 0) as TOTACC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEINFOENTR.SetQuery(PPQRY_TOTSTNINI, 0, SQL, -1, "");
    PAN_SCHEINFOENTR.SetQueryDB(PPQRY_TOTSTNINI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEINFOENTR.SetMasterTable(PPQRY_TOTSTNINI, "DUAL");
    PAN_SCHEINFOENTR.SetIMDB(IMDB, "PQRY_DUAL1", true);
    PAN_SCHEINFOENTR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'INI_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZINIPURO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARIAZPURO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZATTPURO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPEACCEPURO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONPURO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'RES_IMP_ACC',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as RESIDUI, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZINICA, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARIAZCA, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZATTCA, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_CO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as MANDORDCO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_RES',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as MANDORDRES, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_TOT',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as MANDORDTOT, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONCA3, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONCA1, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONCA2, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STAINIREIESI, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARIREISESIG, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STAATTREIESI, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPREISESIG, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'REISCR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPACCREIESI ");
    PAN_SCHEINFOENTR.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEINFOENTR.SetQuery(PPQRY_DUAL1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~TBL_VALONODOCORR.NODOCORRENES~~ = 'E') ");
    PAN_SCHEINFOENTR.SetQuery(PPQRY_DUAL1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEINFOENTR.SetQuery(PPQRY_DUAL1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEINFOENTR.SetQuery(PPQRY_DUAL1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEINFOENTR.SetQuery(PPQRY_DUAL1, 5, SQL, -1, "");
    PAN_SCHEINFOENTR.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEINFOENTR.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEINFOENTR.Status() == 2)
    {
      int oldListQBE = PAN_SCHEINFOENTR.iUseListQBE;
      PAN_SCHEINFOENTR.iUseListQBE = 0;
      PAN_SCHEINFOENTR.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEINFOENTR.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEINFOENTR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SCHEINFOSPES_Init()
  {

    PAN_SCHEINFOSPES.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEINFOSPES.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCHEINFOSPES.SetSize(MyGlb.OBJ_FIELD, 47);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, "1E3E09AC-8D58-4FF9-8D55-60A38DF58A2E");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, "Stanz. Iniz.");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, "696D0270-0600-48B4-9C4B-9910BF986676");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, "Variazioni");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, "31CD54AF-5772-4C4C-B489-2DEB5296EAD9");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, "Stanz. Att.");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, "4DDA9267-65E2-4089-8367-EAD1276D5886");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, "Impegnato");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, "2BB654A9-62CF-43BB-B72D-BF6C065C4AE9");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, MyGlb.VIS_STATICBUTTON);
    PAN_SCHEINFOSPES.SetImage(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, 0, "info.gif", false);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, "C02ECCB5-145D-47A1-85C8-ED886CE624BA");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, "Disponibilità");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, "5304F7B9-1346-4A6F-AC0C-74082AF90C0E");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, "Stanz. Iniz. Cassa");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, "EE466F5D-57D4-4323-B918-25ABBDC72EF4");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, "Variazioni Cassa");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, "F8499766-636A-4B28-9E34-DC4192E1DB49");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, "Stanz. Att. Cassa");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, "76A9A4DD-95F4-4315-A42B-9092F444B238");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, "Disponibilità Cassa");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, "74EE8ACE-E043-4618-9A29-FFDFD342FCC0");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, "Residuo");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, "74FE22B1-4E77-4A52-AF07-3B4BB0425BA2");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, "su Comp. Pura");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, "CC16B534-3564-4653-9961-4DEA52A28548");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, "Totali");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, "BFF98A10-628D-415A-8292-0677AE3AC4CF");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, "Residui");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, "D9C7640C-1E3C-4535-A425-65F83D27F1B1");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, "Stanz Ini FPV");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, "E17757D2-00F4-4879-B00B-3AAB0F64DCB2");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, "Variaz FPV");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, "077A5AC4-F992-4CE0-9190-D0D489478A48");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, "Stanz Att FPV");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, "1BBE1E42-5CD5-4673-9307-7E693255E202");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, "Dispon FPV");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, "DC6E3BE5-7D04-4C95-AAF0-A92A6DB2C68F");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, "Impegnato FPV");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, "3FC8DB99-0BE3-4B39-9898-F451F7EAA43A");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, "Puro");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, "1D90EA22-FCBD-43E4-9B00-44CA9701F15F");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, "Mandati");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, "99AFACF4-D12D-42A1-8520-57DD1139E53F");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, "Cassa");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, "96F23714-C473-4AAD-92BB-46357E8E0939");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, "Reiscrizioni da Esigibilità");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, "AEE01C16-1BC6-4486-A30A-F4EBF5D365A4");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, "Stanz Ini Imp");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, "EDCEBBA5-48DF-4873-A95C-CAEA224E7145");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, "Var Imp");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, "270D6E3C-CAE6-45DD-BC09-D2D870A1A932");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, "Stn Att Imp");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, "D2C7A942-D825-4D0D-AF82-77851B4C0BF2");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, "Disp Imp");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, "C47A8DFC-9395-48DE-B5F6-B5D0161F2FD5");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, "Reiscr Imp");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, "9E4E1AF8-3109-4305-BC68-20D0F109D80F");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, "Reiscrizioni da Stanziamento");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, "8FB50507-1791-4875-964A-655CAEAE5415");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, "Stn Ini Stn");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, "B1038B83-41A5-41D6-94FA-64426CCBA9DC");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, "Var Stn");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, "7D9B8563-7C68-40C1-904D-FCF69195D7BE");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, "Stn Att Stn");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, "9D2CB6F9-490A-424E-99DB-8BA81A5595D4");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, "Disp Stn");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, "26974351-B3C8-4CC5-8818-21D7104AEAA1");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, "Imp Stn");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, "998C78FC-089A-461D-935F-FDC271FB840B");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, "FPV");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, "5D88E91B-10A7-4946-810A-EC306B42FBD8");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, "Importo Fpv");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, "EF66A110-873A-40D5-BB1B-23E68AA8007D");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, "su Reiscr. da Esigibilità");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, "D30F8574-E7FA-4D49-A739-925C16E6ECA0");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, "Stanz. Iniz.");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, "ABB735BE-0FCB-4321-BA9E-50E1096788FF");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, "Totale");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, MyGlb.VIS_VUOTOGRASSET);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, "199851F8-AA5F-46D4-8EC0-A5790336122A");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, "Variazioni");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, "E161A177-E65E-4429-B43A-979CC398F156");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, "Stanz. Att.");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, "6734EFD7-AF9E-4022-8F4C-48FD4107C573");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, "Disponibilità");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, "68A71F9D-DFA7-4AB3-819A-E2ADAF957E5E");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, "Impegnato");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, "138765F6-FDE5-45EF-949E-960846D78563");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, "FPV");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, "55CD6F3B-2319-4554-9255-2863812BEDCF");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, MyGlb.VIS_STATICBUTTON);
    PAN_SCHEINFOSPES.SetImage(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, 0, "info.gif", false);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, "7875158B-68CB-4A99-97F6-5153FC10741B");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, MyGlb.VIS_STATICBUTTON);
    PAN_SCHEINFOSPES.SetImage(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, 0, "info.gif", false);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SCHEINFOSPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, "6DD59CF0-FFF9-4011-A089-72F60F23D4DA");
    PAN_SCHEINFOSPES.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, "su Reiscr. da Stanziamento");
    PAN_SCHEINFOSPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, "");
    PAN_SCHEINFOSPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEINFOSPES.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCHEINFOSPES_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_LIST, 0, 0, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_LIST, "St. In.");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_FORM, 224, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICO, MyGlb.PANEL_FORM, "Stanz. Iniz.");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZINICO, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STANZINICO, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZINICO, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'INI_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZINICO", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_LIST, 60);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_FORM, 224, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCO, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_VARIAZCO, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_VARIAZCO, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_VARIAZCO, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARIAZCO", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_LIST, "Stanz. Att.");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_FORM, 224, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCO, MyGlb.PANEL_FORM, "Stanz. Att.");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZATTCO, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STANZATTCO, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZATTCO, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZATTCO", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_LIST, 88);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_LIST, "Impegnato");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_FORM, 224, 140, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGACCERT, MyGlb.PANEL_FORM, "Impegnato");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_IMPEGACCERT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_IMPEGACCERT, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_IMPEGACCERT, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPEGACCERT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, MyGlb.PANEL_LIST, 8, 120, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, MyGlb.PANEL_FORM, 8, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFODISPPROV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_INFODISPPROV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_INFODISPPROV, -1, "", "INFODISPPROV", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_LIST, 64);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_FORM, 224, 116, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCO, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_DISPONCO, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_DISPONCO, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_DISPONCO, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONCO", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_LIST, 76);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_LIST, "Stanz. Iniz. Cassa");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_FORM, 560, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINICA, MyGlb.PANEL_FORM, "Stanz. Iniz. Cassa");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZINICA, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STANZINICA, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZINICA, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZINICA", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_LIST, 60);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_LIST, "Variazioni Cassa");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_FORM, 560, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZCA, MyGlb.PANEL_FORM, "Variazioni Cassa");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_VARIAZCA, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_VARIAZCA, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_VARIAZCA, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARIAZCA", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_LIST, "Stanz. Att. Cassa");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_FORM, 560, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTCA, MyGlb.PANEL_FORM, "Stanz. Att. Cassa");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZATTCA, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STANZATTCA, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZATTCA, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZATTCA", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_LIST, 64);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_LIST, "Disponibilità Cassa");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_FORM, 560, 116, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONCA, MyGlb.PANEL_FORM, "Disponibilità Cassa");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_DISPONCA, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_DISPONCA, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_DISPONCA, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONCA3", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_LIST, 88);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_LIST, "Residuo");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_FORM, 436, 204, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDRES, MyGlb.PANEL_FORM, "Residuo");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_MANDORDRES, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_MANDORDRES, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_MANDORDRES, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_RES',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "MANDORDRES", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_LIST, "su Comp. Pura");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_FORM, 436, 228, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDCO, MyGlb.PANEL_FORM, "su Comp. Pura");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_MANDORDCO, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_MANDORDCO, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_MANDORDCO, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_CO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) - GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) - GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "MANDORDCO", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_LIST, "Totali");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_FORM, 436, 300, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_FORM, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_MANDORDTOT, MyGlb.PANEL_FORM, "Totali");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_MANDORDTOT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_MANDORDTOT, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_MANDORDTOT, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_TOT',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "MANDORDTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_LIST, 52);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_FORM, 136, 212, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_RESIDUI, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_RESIDUI, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_RESIDUI, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'RES_IMP_ACC',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "RESIDUI", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_LIST, "Stanz Ini FPV");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_FORM, 84, 268, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIFPV, MyGlb.PANEL_FORM, "Stanz Ini FPV");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZINIFPV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STANZINIFPV, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZINIFPV, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZINIFPV", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_LIST, 68);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_LIST, "Variaz FPV");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_FORM, 84, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_FORM, 68);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZFPV, MyGlb.PANEL_FORM, "Variaz FPV");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_VARIAZFPV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_VARIAZFPV, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_VARIAZFPV, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARIAZFPV", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_LIST, "Stanz Att FPV");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_FORM, 84, 316, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTFPV, MyGlb.PANEL_FORM, "Stanz Att FPV");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZATTFPV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STANZATTFPV, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZATTFPV, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZATTFPV", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_LIST, 72);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_LIST, "Dispon FPV");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_FORM, 84, 340, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_FORM, 72);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPONFPV, MyGlb.PANEL_FORM, "Dispon FPV");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_DISPONFPV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_DISPONFPV, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_DISPONFPV, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONFPV", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_LIST, 96);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_LIST, "Impegnato FPV");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_FORM, 84, 368, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_FORM, 96);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOFPV, MyGlb.PANEL_FORM, "Impegnato FPV");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_IMPEGNATOFPV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_IMPEGNATOFPV, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_IMPEGNATOFPV, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPEGNATOFPV", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, MyGlb.PANEL_LIST, 144, 8, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, MyGlb.PANEL_FORM, 240, 16, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETTCOMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_ETICHETTCOMP, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_ETICHETTCOMP, -1, "", "ETICHETTCOMP", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, MyGlb.PANEL_LIST, 300, 12, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, MyGlb.PANEL_FORM, 560, 174, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHEMANDAT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_ETICHEMANDAT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_ETICHEMANDAT, -1, "", "ETICHEMANDAT", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, MyGlb.PANEL_LIST, 448, 12, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, MyGlb.PANEL_FORM, 560, 18, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETCASSA, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_ETICHETCASSA, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_ETICHETCASSA, -1, "", "ETICHETCASSA", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, MyGlb.PANEL_LIST, 152, 16, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, MyGlb.PANEL_FORM, 336, 8, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDAESI, MyGlb.PANEL_FORM, 2);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_ETICREIDAESI, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_ETICREIDAESI, -1, "", "ETICREIDAESI", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_LIST, "Stanz Ini Imp");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_FORM, 336, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_FORM, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZINIIMP, MyGlb.PANEL_FORM, "Stanz Ini Imp");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZINIIMP, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STANZINIIMP, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZINIIMP, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STANZINIIMP", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_LIST, 56);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_LIST, "Var Imp");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_FORM, 336, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_FORM, 56);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIMP, MyGlb.PANEL_FORM, "Var Imp");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_VARIMP, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_VARIMP, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_VARIMP, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARIMP", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_LIST, 76);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_LIST, "Stn Att Imp");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_FORM, 336, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_FORM, 76);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTIMP, MyGlb.PANEL_FORM, "Stn Att Imp");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STNATTIMP, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STNATTIMP, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STNATTIMP, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STNATTIMP", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_LIST, 60);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_LIST, "Disp Imp");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_FORM, 336, 116, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_FORM, 60);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPIMP, MyGlb.PANEL_FORM, "Disp Imp");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_DISPIMP, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_DISPIMP, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_DISPIMP, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPIMP", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_LIST, 72);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_LIST, "Reiscr Imp");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_FORM, 336, 140, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_FORM, 72);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_REISCRIMP, MyGlb.PANEL_FORM, "Reiscr Imp");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_REISCRIMP, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_REISCRIMP, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_REISCRIMP, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'REISCR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "REISCRIMP", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, MyGlb.PANEL_LIST, 160, 24, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, MyGlb.PANEL_FORM, 448, 8, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICREIDASTA, MyGlb.PANEL_FORM, 2);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_ETICREIDASTA, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_ETICREIDASTA, -1, "", "ETICREIDASTA", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_LIST, 68);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_LIST, "Stn Ini Stn");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_FORM, 448, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_FORM, 68);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNINISTN, MyGlb.PANEL_FORM, "Stn Ini Stn");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STNINISTN, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STNINISTN, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STNINISTN, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STNINISTN", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_LIST, 52);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_LIST, "Var Stn");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_FORM, 448, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_FORM, 52);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARSTN, MyGlb.PANEL_FORM, "Var Stn");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_VARSTN, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_VARSTN, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_VARSTN, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "VARSTN", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_LIST, 72);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_LIST, "Stn Att Stn");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_FORM, 448, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_FORM, 72);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNATTSTN, MyGlb.PANEL_FORM, "Stn Att Stn");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STNATTSTN, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_STNATTSTN, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STNATTSTN, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "STNATTSTN", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_LIST, 56);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_LIST, "Disp Stn");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_FORM, 448, 116, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_FORM, 56);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISPSTN, MyGlb.PANEL_FORM, "Disp Stn");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_DISPSTN, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_DISPSTN, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_DISPSTN, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPSTN", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_LIST, 56);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_LIST, "Imp Stn");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_FORM, 448, 140, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_FORM, 56);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPSTN, MyGlb.PANEL_FORM, "Imp Stn");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_IMPSTN, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_IMPSTN, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_IMPSTN, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_REISCR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPSTN", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_LIST, 64);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_LIST, "FPV");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_FORM, 336, 174, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_FORM, 64);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPV, MyGlb.PANEL_FORM, "FPV");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_FPV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_FPV, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_FPV, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMPO_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "FPV", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_LIST, 0, 0, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_LIST, "Importo Fpv");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_FORM, 448, 174, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPORTOFPV, MyGlb.PANEL_FORM, "Importo Fpv");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_IMPORTOFPV, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_IMPORTOFPV, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_IMPORTOFPV, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMPO_FPV_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "RECORIMPOFPV", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_LIST, 72);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_LIST, "su Reiscr. da Esigibilità");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_FORM, 416, 252, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_FORM, 140);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCRESI, MyGlb.PANEL_FORM, "su Reiscr. da Esigibilità");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_SUREISCRESI, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_SUREISCRESI, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_SUREISCRESI, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "SUREISCRESI", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_LIST, 88);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_LIST, "Stanz. Iniz.");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_FORM, 28, 44, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STNTOT, MyGlb.PANEL_FORM, "Stanz. Iniz.");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STNTOT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STNTOT, PPQRY_TOT, "NVL(~~STANZINICO~~, 0) + NVL(~~STANZINIIMP~~, 0) + NVL(~~STNINISTN~~, 0)", "STNTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, MyGlb.PANEL_LIST, 152, 16, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, MyGlb.PANEL_FORM, 112, 16, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_ETICHETOTALE, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_LIST, 120);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_FORM, 28, 68, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_VARIAZIONTOT, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_VARIAZIONTOT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_VARIAZIONTOT, PPQRY_TOT, "NVL(~~VARIAZCO~~, 0) + NVL(~~VARIMP~~, 0) + NVL(~~VARSTN~~, 0)", "VARIAZIONTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_LIST, 116);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_LIST, "Stanz. Att.");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_FORM, 28, 92, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_STANZATTTOT, MyGlb.PANEL_FORM, "Stanz. Att.");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_STANZATTTOT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_STANZATTTOT, PPQRY_TOT, "NVL(~~STANZATTCO~~, 0) + NVL(~~STNATTIMP~~, 0) + NVL(~~STNATTSTN~~, 0)", "STANZATTTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_LIST, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_FORM, 28, 116, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_DISTOT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_DISTOT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_DISTOT, PPQRY_TOT, "NVL(~~DISPONCO~~, 0) + NVL(~~DISPIMP~~, 0) + NVL(~~DISPSTN~~, 0)", "DISTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_LIST, 128);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_LIST, "Impegnato");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_FORM, 28, 140, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_FORM, 80);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_IMPEGNATOTOT, MyGlb.PANEL_FORM, "Impegnato");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_IMPEGNATOTOT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_IMPEGNATOTOT, PPQRY_TOT, "NVL(~~IMPEGACCERT~~, 0) + NVL(~~REISCRIMP~~, 0) + NVL(~~IMPSTN~~, 0)", "IMPEGNATOTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_LIST, 84);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_LIST, "FPV");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_FORM, 80, 174, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_FORM, 28);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_FPVTOT, MyGlb.PANEL_FORM, "FPV");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_FPVTOT, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_FPVTOT, PPQRY_TOT, "NVL(~~FPV~~, 0) + NVL(~~RECORIMPOFPV~~, 0)", "FPVTOT", 3, 28, 6, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, MyGlb.PANEL_LIST, 16, 128, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, MyGlb.PANEL_FORM, 8, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_INFOVARIAZIO, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_INFOVARIAZIO, -1, "", "INFOVARIAZIO", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, MyGlb.PANEL_LIST, 16, 128, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, MyGlb.PANEL_LIST, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, MyGlb.PANEL_FORM, 312, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, MyGlb.PANEL_FORM, 0);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_INFOPURO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_INFOPURO, -1, -1);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_INFOPURO, -1, "", "INFOPURO", 0, 0, 0, -13997);
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_LIST, 96);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_LIST, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_LIST, "su Reis. da Stanziamento");
    PAN_SCHEINFOSPES.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_FORM, 392, 276, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEINFOSPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_FORM, 164);
    PAN_SCHEINFOSPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_FORM, 1);
    PAN_SCHEINFOSPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEINFOSPES_SUREISCSTANZ, MyGlb.PANEL_FORM, "su Reiscr. da Stanziamento");
    PAN_SCHEINFOSPES.SetFieldPage(PFL_SCHEINFOSPES_SUREISCSTANZ, -1, -1);
    PAN_SCHEINFOSPES.SetFieldUnbound(PFL_SCHEINFOSPES_SUREISCSTANZ, true);
    PAN_SCHEINFOSPES.SetFieldPanel(PFL_SCHEINFOSPES_SUREISCSTANZ, PPQRY_DUAL4, "GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "SUREISCSTANZ", 3, 28, 6, -13997);
  }

  private void PAN_SCHEINFOSPES_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEINFOSPES.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(~~STANZINICO~~, 0) + NVL(~~STANZINIIMP~~, 0) + NVL(~~STNINISTN~~, 0) as STNTOT, ");
    SQL.append("  NVL(~~VARIAZCO~~, 0) + NVL(~~VARIMP~~, 0) + NVL(~~VARSTN~~, 0) as VARIAZIONTOT, ");
    SQL.append("  NVL(~~STANZATTCO~~, 0) + NVL(~~STNATTIMP~~, 0) + NVL(~~STNATTSTN~~, 0) as STANZATTTOT, ");
    SQL.append("  NVL(~~DISPONCO~~, 0) + NVL(~~DISPIMP~~, 0) + NVL(~~DISPSTN~~, 0) as DISTOT, ");
    SQL.append("  NVL(~~IMPEGACCERT~~, 0) + NVL(~~REISCRIMP~~, 0) + NVL(~~IMPSTN~~, 0) as IMPEGNATOTOT, ");
    SQL.append("  NVL(~~FPV~~, 0) + NVL(~~RECORIMPOFPV~~, 0) as FPVTOT ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEINFOSPES.SetQuery(PPQRY_TOT, 0, SQL, -1, "");
    PAN_SCHEINFOSPES.SetQueryDB(PPQRY_TOT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEINFOSPES.SetMasterTable(PPQRY_TOT, "DUAL");
    PAN_SCHEINFOSPES.SetIMDB(IMDB, "PQRY_DUAL4", true);
    PAN_SCHEINFOSPES.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'INI_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZINICO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARIAZCO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZATTCO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPEGACCERT, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_PURO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONCO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'RES_IMP_ACC',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as RESIDUI, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZINICA, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARIAZCA, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZATTCA, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_CO',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) - GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) - GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as MANDORDCO, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_RES',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as MANDORDRES, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_ORD_TOT',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as MANDORDTOT, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_CA',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONCA3, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZINIFPV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARIAZFPV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZATTFPV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONFPV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPEGNATOFPV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STANZINIIMP, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARIMP, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STNATTIMP, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPIMP, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'REISCR_IMP',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as REISCRIMP, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_INI_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STNINISTN, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'VAR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as VARSTN, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'STN_ATT_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as STNATTSTN, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'DISP_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPSTN, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMP_REISCR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPSTN, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMPO_FPV',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as FPV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'IMPO_FPV_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as RECORIMPOFPV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as SUREISCRESI, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(~~TBL_PARAMETRI416.PARAMESERCIZ~~,~~TBL_VALONODOCORR.NODOCORRENES~~,~~TBL_VALONODOCORR.NODOCORRCAPI~~,~~TBL_VALONODOCORR.NODOCORRARTI~~,'MAN_REISCR_STN',~~TBL_VALONODOCORR.NODCORTIPRAM~~,~~TBL_VALONODOCORR.NODCORMISTIT~~,~~TBL_VALONODOCORR.NODCORCODSTR~~,~~TBL_VALONODOCORR.NODCORCODLI1~~,~~TBL_VALONODOCORR.NODCORCODLI2~~,~~TBL_VALONODOCORR.NODCORCODLI3~~,~~TBL_VALONODOCORR.NODCORCODLI4~~,~~TBL_VALONODOCORR.NODOCORTIPUO~~,~~TBL_VALONODOCORR.NODOCORUOGES~~,~~TBL_VALONODOCORR.NODOCORRRESP~~,~~TBL_VALONODOCORR.NODCORCEDICO~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODOCORRESPL~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as SUREISCSTANZ ");
    PAN_SCHEINFOSPES.SetQuery(PPQRY_DUAL4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEINFOSPES.SetQuery(PPQRY_DUAL4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~TBL_VALONODOCORR.NODOCORRENES~~ = 'S') ");
    PAN_SCHEINFOSPES.SetQuery(PPQRY_DUAL4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEINFOSPES.SetQuery(PPQRY_DUAL4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEINFOSPES.SetQuery(PPQRY_DUAL4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEINFOSPES.SetQuery(PPQRY_DUAL4, 5, SQL, -1, "");
    PAN_SCHEINFOSPES.SetQueryDB(PPQRY_DUAL4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEINFOSPES.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEINFOSPES.Status() == 2)
    {
      int oldListQBE = PAN_SCHEINFOSPES.iUseListQBE;
      PAN_SCHEINFOSPES.iUseListQBE = 0;
      PAN_SCHEINFOSPES.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEINFOSPES.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEINFOSPES.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCHEINFOENTR) PAN_SCHEINFOENTR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SCHEINFOSPES) PAN_SCHEINFOSPES_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEINFOENTR) PAN_SCHEINFOENTR_ValidateRow(Cancel);
    if (SrcObj == PAN_SCHEINFOSPES) PAN_SCHEINFOSPES_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCHEINFOENTR) PAN_SCHEINFOENTR_DynamicProperties();
    if (SrcObj == PAN_SCHEINFOSPES) PAN_SCHEINFOSPES_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEINFOENTR) PAN_SCHEINFOENTR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SCHEINFOSPES) PAN_SCHEINFOSPES_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCHEINFOENTR) PAN_SCHEINFOENTR_AfterFind(CmdFind);
    if (SrcObj == PAN_SCHEINFOSPES) PAN_SCHEINFOSPES_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SCHEINFOENTR) PAN_SCHEINFOENTR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SCHEINFOSPES) PAN_SCHEINFOSPES_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
