// **********************************************
// Variazioni Definitive
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniDefinitive extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_NUOVTABBVIEW;
  private static int GRP_VARIAZDEFINI_CAPITOLOART = 0;
  private static int GRP_VARIAZDEFINI_CONSSVILUPPO = 1;

  private static int PFL_VARIAZDEFINI_NEWPANELLABE = 0;
  private static int PFL_VARIAZDEFINI_CAPITOLO1 = 1;
  private static int PFL_VARIAZDEFINI_ARTICOLO1 = 2;
  private static int PFL_VARIAZDEFINI_PARTE = 3;
  private static int PFL_VARIAZDEFINI_CAPITOLO2 = 4;
  private static int PFL_VARIAZDEFINI_BARRA = 5;
  private static int PFL_VARIAZDEFINI_ARTICOLO2 = 6;
  private static int PFL_VARIAZDEFINI_SCELTAPEG = 7;
  private static int PFL_VARIAZDEFINI_INFOPEG = 8;
  private static int PFL_VARIAZDEFINI_DUALSCELTCAP = 9;
  private static int PFL_VARIAZDEFINI_INFO = 10;
  private static int PFL_VARIAZDEFINI_NUOVO = 11;
  private static int PFL_VARIAZDEFINI_DESCRIZIONE = 12;
  private static int PFL_VARIAZDEFINI_INSERTED = 13;
  private static int PFL_VARIAZDEFINI_TIPOVARIAZIO = 14;
  private static int PFL_VARIAZDEFINI_IMPORTCOMPET = 15;
  private static int PFL_VARIAZDEFINI_IMPORTOCASSA = 16;
  private static int PFL_VARIAZDEFINI_DATA = 17;
  private static int PFL_VARIAZDEFINI_CAPITOLOART = 18;
  private static int PFL_VARIAZDEFINI_DIBILANCIO = 19;
  private static int PFL_VARIAZDEFINI_CONSSVILUPPO = 20;
  private static int PFL_VARIAZDEFINI_DUALUNITORGA = 21;
  private static int PFL_VARIAZDEFINI_UNITAORGANIZ = 22;
  private static int PFL_VARIAZDEFINI_DESCUNITORGA = 23;
  private static int PFL_VARIAZDEFINI_DESCRIZIONE1 = 24;
  private static int PFL_VARIAZDEFINI_INDIETRO = 25;
  private static int PFL_VARIAZDEFINI_REGISTVARIAZ = 26;
  private static int PFL_VARIAZDEFINI_TOTALECOMPET = 27;
  private static int PFL_VARIAZDEFINI_OBIETTIVGEST = 28;
  private static int PFL_VARIAZDEFINI_DUALOBIEGEST = 29;
  private static int PFL_VARIAZDEFINI_DUALOBIEOPER = 30;
  private static int PFL_VARIAZDEFINI_TOTALECASSA = 31;
  private static int PFL_VARIAZDEFINI_TOTALESOTTO2 = 32;
  private static int PFL_VARIAZDEFINI_TOTALESOTTO3 = 33;
  private static int PFL_VARIAZDEFINI_TOTALESOTTO4 = 34;
  private static int PFL_VARIAZDEFINI_TOTALESOTTO5 = 35;
  private static int PFL_VARIAZDEFINI_PROGRESSIVO2 = 36;
  private static int PFL_VARIAZDEFINI_INFOFINTOT = 37;
  private static int PFL_VARIAZDEFINI_INFOOPETOT = 38;
  private static int PFL_VARIAZDEFINI_INFOOPE = 39;
  private static int PFL_VARIAZDEFINI_SCHEDOBIETID = 40;
  private static int PFL_VARIAZDEFINI_FINANZOPERA = 41;
  private static int PFL_VARIAZDEFINI_FINANZIAMEN1 = 42;
  private static int PFL_VARIAZDEFINI_OPERA1 = 43;
  private static int PFL_VARIAZDEFINI_ESERCIZIO1 = 44;
  private static int PFL_VARIAZDEFINI_ANNOPROPOST1 = 45;
  private static int PFL_VARIAZDEFINI_UNITAPROPON1 = 46;
  private static int PFL_VARIAZDEFINI_NUMEROPROPO1 = 47;
  private static int PFL_VARIAZDEFINI_ANNODEL1 = 48;
  private static int PFL_VARIAZDEFINI_NUMERODEL1 = 49;
  private static int PFL_VARIAZDEFINI_SEDEDEL1 = 50;
  private static int PFL_VARIAZDEFINI_PROGRESSIVO1 = 51;
  private static int PFL_VARIAZDEFINI_NUMEROACC = 52;
  private static int PFL_VARIAZDEFINI_ANNOACC = 53;
  private static int PFL_VARIAZDEFINI_ANNOIMP = 54;
  private static int PFL_VARIAZDEFINI_IMPEGNO = 55;
  private static int PFL_VARIAZDEFINI_INFOIMPACCES = 56;
  private static int PFL_VARIAZDEFINI_ANNOESIGIBIL = 57;
  private static int PFL_VARIAZDEFINI_ETICHSCELVAR = 58;
  private static int PFL_VARIAZDEFINI_PROGREVARIMP = 59;
  private static int PFL_VARIAZDEFINI_ETICHETLABEL = 60;
  private static int PFL_VARIAZDEFINI_PROGREVARACC = 61;
  private static int PFL_VARIAZDEFINI_PROGETTOID1 = 62;

  private static int PPQRY_VARCOMPRO1 = 0;

  private static int PPQRY_DUAL3 = 1;
  private static int PPQRY_DUAL1 = 2;
  private static int PPQRY_DUAL2 = 3;
  private static int PPQRY_BILFIN = 4;
  private static int PPQRY_UNITAORGANIZ = 5;
  private static int PPQRY_DUPOBIETGEST = 6;
  private static int PPQRY_OBIETTIVI = 7;

  private static int PPQRY_DUAL4 = 8;
  private static int PPQRY_T54 = 9;
  private static int PPQRY_FINANZIAMENT = 10;
  private static int PPQRY_OPERE = 11;


  IDPanel PAN_VARIAZDEFINI;
  private static int PFL_PLURIENNALI_ESERCIZIO2 = 0;
  private static int PFL_PLURIENNALI_ES1 = 1;
  private static int PFL_PLURIENNALI_PROGRPRIMVAR = 2;
  private static int PFL_PLURIENNALI_IMPORTO1 = 3;
  private static int PFL_PLURIENNALI_CAPITOLO3 = 4;
  private static int PFL_PLURIENNALI_ARTICOLO3 = 5;
  private static int PFL_PLURIENNALI_DESCRIZIONE3 = 6;
  private static int PFL_PLURIENNALI_TIPOVAR1 = 7;
  private static int PFL_PLURIENNALI_ETILABCAPART = 8;
  private static int PFL_PLURIENNALI_DUALCOPIIMPO = 9;
  private static int PFL_PLURIENNALI_PROGETTOID = 10;
  private static int PFL_PLURIENNALI_FINANZIAMENT = 11;
  private static int PFL_PLURIENNALI_OPERA = 12;
  private static int PFL_PLURIENNALI_ISTITUZIONNC = 13;
  private static int PFL_PLURIENNALI_PROGUNITORGA = 14;
  private static int PFL_PLURIENNALI_PROGRESSIVO3 = 15;
  private static int PFL_PLURIENNALI_ANNOPROPOSTA = 16;
  private static int PFL_PLURIENNALI_UNITAPROPONE = 17;
  private static int PFL_PLURIENNALI_NUMEROPROPOS = 18;
  private static int PFL_PLURIENNALI_ANNODEL = 19;
  private static int PFL_PLURIENNALI_NUMERODEL = 20;
  private static int PFL_PLURIENNALI_SEDEDEL = 21;

  private static int PPQRY_VARCOMPRO10 = 0;

  private static int PPQRY_LOOKUPVARCOM = 1;
  private static int PPQRY_DUAL = 2;


  IDPanel PAN_PLURIENNALI;
  private static int PFL_POSPARS_ES = 0;
  private static int PFL_POSPARS_CAPITOLO = 1;
  private static int PFL_POSPARS_ARTICOLO = 2;
  private static int PFL_POSPARS_ETICHSCELCAP = 3;
  private static int PFL_POSPARS_ETICHETTROVA = 4;

  private static int PPQRY_POSPARS2 = 0;


  IDPanel PAN_POSPARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM7(IMDB);
    Init_TBL_POSPARS3(IMDB);
    //
    //
    Init_PQRY_VARCOMPRO1(IMDB);
    Init_PQRY_VARCOMPRO10(IMDB);
    Init_PQRY_POSPARS2(IMDB);
    Init_PQRY_POSPARS2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM7, 35);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM7, "TBL_PARAM7");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDESLAB, "ROWNAMDESLAB");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDESLAB,5,49,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMETIPOL, "ROWNAMETIPOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMETIPOL,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMEPLURI, "ROWNAMEPLURI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMEPLURI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDETIVA, "ROWNAMDETIVA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDETIVA,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMTIPVAR,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOPON1, "RONASOTOPON1");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOPON1,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENS1, "RONASOTOENS1");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENS1,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOPONC, "RONASOTOPONC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOPONC,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENSC, "RONASOTOENSC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENSC,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOPON2, "RONASOTOPON2");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOPON2,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENS2, "RONASOTOENS2");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENS2,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMCONSVI, "ROWNAMCONSVI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMCONSVI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDIBIPE, "ROWNAMDIBIPE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDIBIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, "ROWNAMTIPQUA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMQUAOBB, "ROWNAMQUAOBB");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMQUAOBB,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMQUOBCA, "ROWNAMQUOBCA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMQUOBCA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENCO, "RONASOTOENCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENCO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOSPCO, "RONASOTOSPCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOSPCO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENCA, "RONASOTOENCA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOENCA,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOSPCA, "RONASOTOSPCA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOSPCA,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOIMSC, "RONASOTOIMSC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOIMSC,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOCASC, "RONASOTOCASC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_RONASOTOCASC,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMSEDDEL,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMNUMDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDELINS, "ROWNAMDELINS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMDELINS,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMPROINS, "ROWNAMPROINS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMPROINS,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMPARVAR, "ROWNAMPARVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMPARVAR,5,52,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMTIPIMP, "ROWNAMTIPIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMTIPIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMPROPAR, "ROWNAMPROPAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMPROPAR,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMEQUALE, "ROWNAMEQUALE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM7,IMDBDef3.FLD_PARAM7_ROWNAMEQUALE,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM7, 0);
  }

  private static void Init_TBL_POSPARS3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_POSPARS3, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_POSPARS3, "TBL_POSPARS3");
    IMDB.set_FldCode(IMDBDef3.TBL_POSPARS3,IMDBDef3.FLD_POSPARS3_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_POSPARS3,IMDBDef3.FLD_POSPARS3_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_POSPARS3,IMDBDef3.FLD_POSPARS3_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_POSPARS3,IMDBDef3.FLD_POSPARS3_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_POSPARS3,IMDBDef3.FLD_POSPARS3_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_POSPARS3,IMDBDef3.FLD_POSPARS3_NOMEOGGEARTI,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_POSPARS3, 0);
  }

  private static void Init_PQRY_VARCOMPRO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOMPRO1, 39);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOMPRO1, "PQRY_VARCOMPRO1");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGRPRIMVAR, "PROGRPRIMVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGRPRIMVAR,1,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ES, "ES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNODEL, "ANNODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMERODEL, "NUMERODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMERODEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_SEDEDEL, "SEDEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_SEDEDEL,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DATAREG, "DATAREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DATAREG,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_TIPOVAR, "TIPOVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_TIPOVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOPROPOSTA, "ANNOPROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOPROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_UNITAPROPONE, "UNITAPROPONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_UNITAPROPONE,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMEROPROPOS, "NUMEROPROPOS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMEROPROPOS,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_CONSSVILUPPO, "CONSSVILUPPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_CONSSVILUPPO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DDATAREG, "DDATAREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DDATAREG,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ISTITUZIONNC, "ISTITUZIONNC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ISTITUZIONNC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGETTOID, "PROGETTOID");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGETTOID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGUNITORGA, "PROGUNITORGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGUNITORGA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_UTENTEINSERI, "UTENTEINSERI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_UTENTEINSERI,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DATAINSERIME, "DATAINSERIME");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DATAINSERIME,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_UTENTULTIAGG, "UTENTULTIAGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_UTENTULTIAGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DATAULTIMAGG, "DATAULTIMAGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_DATAULTIMAGG,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_VARBIL, "VARBIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_VARBIL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_SCHEDOBIETID, "SCHEDOBIETID");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_SCHEDOBIETID,1,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_IMPORTOCASSA, "IMPORTOCASSA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_IMPORTOCASSA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_INSERTED, "INSERTED");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_INSERTED,11,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOIMP, "ANNOIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMEROIMP, "NUMEROIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMEROIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOESIGIBIL, "ANNOESIGIBIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOESIGIBIL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGREVARIMP, "PROGREVARIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGREVARIMP,1,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOACC, "ANNOACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_ANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMEROACC, "NUMEROACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_NUMEROACC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGREVARACC, "PROGREVARACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_PROGREVARACC,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_OBIETTIVGEST, "OBIETTIVGEST");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO1,IMDBDef12.PQSL_VARCOMPRO1_OBIETTIVGEST,5,9,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOMPRO1, 0);
  }

  private static void Init_PQRY_VARCOMPRO10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOMPRO10, 20);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOMPRO10, "PQRY_VARCOMPRO10");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ES, "ES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGRPRIMVAR, "PROGRPRIMVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGRPRIMVAR,1,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_TIPOVAR, "TIPOVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_TIPOVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGETTOID, "PROGETTOID");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGETTOID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ISTITUZIONNC, "ISTITUZIONNC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ISTITUZIONNC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGUNITORGA, "PROGUNITORGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGUNITORGA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ANNOPROPOSTA, "ANNOPROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ANNOPROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_UNITAPROPONE, "UNITAPROPONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_UNITAPROPONE,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_NUMEROPROPOS, "NUMEROPROPOS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_NUMEROPROPOS,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ANNODEL, "ANNODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_ANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_NUMERODEL, "NUMERODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_NUMERODEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_SEDEDEL, "SEDEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO10,IMDBDef12.PQSL_VARCOMPRO10_SEDEDEL,5,255,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOMPRO10, 0);
  }

  private static void Init_PQRY_POSPARS2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POSPARS2, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_POSPARS2, "PQRY_POSPARS2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POSPARS2,IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef12.PQRY_POSPARS2,IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POSPARS2,IMDBDef12.PQSL_POSPARS2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POSPARS2,IMDBDef12.PQSL_POSPARS2_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POSPARS2,IMDBDef12.PQSL_POSPARS2_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POSPARS2,IMDBDef12.PQSL_POSPARS2_NOMEOGGEARTI,1,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POSPARS2, 0);
  }

  private static void Init_PQRY_POSPARS2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POSPARS2_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_POSPARS2_RS, "PQRY_POSPARS2_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_POSPARS2_RS,IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef12.PQRY_POSPARS2_RS,IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POSPARS2_RS,IMDBDef12.PQSL_POSPARS2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POSPARS2_RS,IMDBDef12.PQSL_POSPARS2_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POSPARS2_RS,IMDBDef12.PQSL_POSPARS2_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POSPARS2_RS,IMDBDef12.PQSL_POSPARS2_NOMEOGGEARTI,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniDefinitive(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniDefinitive()
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
    FormIdx = MyGlb.FRM_VARIAZDEFINI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D7799838-8752-4653-9B7B-8D9D35E22F5A";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1048;
    DesignHeight = 650;
    set_Caption(new IDVariant("Variazioni Definitive"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1048;
    Frames[1].Height = 624;
    Frames[1].Caption = "Nuova Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 624;
    TAB_NUOVTABBVIEW = new OTabView(this);
    Frames[1].Content = TAB_NUOVTABBVIEW;
    TAB_NUOVTABBVIEW.iGuid = "1296A41D-2ED9-4620-A7BE-3079B5208965";
    TAB_NUOVTABBVIEW.SetItemCount(2);
    TAB_NUOVTABBVIEW.Placement = 1;
    TAB_NUOVTABBVIEW.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Variazioni Definitive";
    Frames[2].Parent = this;
    PAN_VARIAZDEFINI = new IDPanel(w, this, 2, "PAN_VARIAZDEFINI");
    Frames[2].Content = PAN_VARIAZDEFINI;
    PAN_VARIAZDEFINI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZDEFINI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1048-MyGlb.PAN_OFFS_X, 624-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A12E548E-BF43-4D9B-B96A-BFFE7960B6AF");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 68, 984, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZDEFINI.InitStatus = 2;
    PAN_VARIAZDEFINI_Init();
    PAN_VARIAZDEFINI_InitFields();
    PAN_VARIAZDEFINI_InitQueries();
    TAB_NUOVTABBVIEW.SetItem(1, Frames[2], 0, "", "Variazioni Definitive", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Pluriennali";
    Frames[3].Parent = this;
    PAN_PLURIENNALI = new IDPanel(w, this, 3, "PAN_PLURIENNALI");
    Frames[3].Content = PAN_PLURIENNALI;
    PAN_PLURIENNALI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PLURIENNALI.VS = MainFrm.VisualStyleList;
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1048-MyGlb.PAN_OFFS_X, 624-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9778F49A-17F8-438E-8F94-6D98790064D4");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 8, 36, 208, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PLURIENNALI.MasterPanelCode = "PAN_VARIAZDEFINI";
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PLURIENNALI.InitStatus = 2;
    PAN_PLURIENNALI_Init();
    PAN_PLURIENNALI_InitFields();
    PAN_PLURIENNALI_InitQueries();
    TAB_NUOVTABBVIEW.SetItem(2, Frames[3], 0, "", "Pluriennali", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_VARIAZDEFINI.SetSubFrame(PFL_VARIAZDEFINI_ETICHETLABEL,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Pos Pars";
    Frames[4].Parent = this;
    PAN_POSPARS = new IDPanel(w, this, 4, "PAN_POSPARS");
    Frames[4].Content = PAN_POSPARS;
    PAN_POSPARS.Lockable = false;
    PAN_POSPARS.iLocked = false;
    PAN_POSPARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_POSPARS.VS = MainFrm.VisualStyleList;
    PAN_POSPARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "69E4C4BC-4AEA-48D8-A471-0C918E1401A7");
    PAN_POSPARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 264, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_POSPARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_POSPARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_POSPARS.InitStatus = 1;
    PAN_POSPARS_Init();
    PAN_POSPARS_InitFields();
    PAN_POSPARS_InitQueries();
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
    // Resetto il fuoco perchË le tabbed view lo possono modificare
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
      if (CmdIdx==MyGlb.CMD_INDIETRO+BaseCmdLinIdx)
      {
        Indietro();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGISTVARIAZ+BaseCmdLinIdx)
      {
        RegistraVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTROQUADR2+BaseCmdLinIdx)
      {
        ControlloQuadraturaPluriennali();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI99+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI77+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI99+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTQUADPLU1+BaseCmdLinIdx)
      {
        ControlloQuadraturaPluriennali();
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
      if (IMDB.TblModified(IMDBDef3.TBL_POSPARS3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAZDEFINI_POSPARS2();
      }
      PAN_VARIAZDEFINI.UpdatePanel(MainFrm);
      PAN_PLURIENNALI.UpdatePanel(MainFrm);
      PAN_POSPARS.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_VARIAZDEFINI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZDEFINI_SCELTAPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_VARIAZDEFINI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZDEFINI_DUALSCELTCAP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEVARPERESI && flRis && IdxPanelActived == PAN_VARIAZDEFINI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZDEFINI_ETICHSCELVAR) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_POSPARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_POSPARS_ETICHSCELCAP) {
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
  // Torna TRUE se l'oggetto passato Ë una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VariazioniDefinitive);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniDefinitive.class.getName() : (Glb.ClassWithPackage(VariazioniDefinitive.class) ? VariazioniDefinitive.class.getName().substring(VariazioniDefinitive.class.getPackage().getName().length() + 1) : VariazioniDefinitive.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni Definitive On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZDEFINI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZDEFINI);
      // 
      // Variazioni Definitive On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaTooltip();
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_IMPORTO, 0).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZDEFINI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_IMPORTCOMPET,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_VARIAZDEFINI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_IMPORTCOMPET,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_IMPORTOCASSA, 0).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZDEFINI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_IMPORTOCASSA,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_VARIAZDEFINI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_IMPORTOCASSA,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_INSERTED, 0).equals((new IDVariant(0)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0))))
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ISTITUZIONNC, 0).equals((new IDVariant("SI")), true))
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "VariazioniDefinitiveOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Definitive On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: PuÚ essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZDEFINI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Definitive On Command Event Body
      // Procedure Body
      // 
      if ((Command.equals((new IDVariant(32)), true)) || (Command.equals((new IDVariant(16)), true)))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPROPAR, 0, (new IDVariant(0)));
        CalcolaTotali();
      }
      if (Command.equals((new IDVariant(8)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPROPAR, 0, (new IDVariant(1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "VariazioniDefinitiveOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Definitive After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VARIAZDEFINI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Definitive After Find Event Body
      // Procedure Body
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "VariazioniDefinitiveAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Definitive After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_VARIAZDEFINI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Definitive After Commit Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "VariazioniDefinitiveAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Variazioni Definitive On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VARIAZDEFINI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Definitive On Updating Row Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOPROPOSTA, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNPRO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_UNITAPROPONE, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROPROPOS, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNODEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNDEL, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_SEDEDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMSEDDEL, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMERODEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMDEL, 0));
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_DESCRIZIONE, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_DESCRIZIONE, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDETIVA, 0));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGRESSIVO, 0)))
      {
        IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  VARCOM_SQ.nextval as VARCOMSQ ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_MAX = QV.Get("VARCOMSQ", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGRESSIVO, 0, new IDVariant(v_MAX));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "VariazioniDefinitiveOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Variazioni Definitive After Delete
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_VARIAZDEFINI_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Definitive After Delete Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "VariazioniDefinitiveAfterDelete", _e);
    }
  }

  // **********************************************************************
  // Variazioni Definitive On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARIAZDEFINI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Definitive On Change Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPROPAR, 0).equals((new IDVariant(1)), true))
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPARVAR, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0, (new IDVariant("E")));
        }
        if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPARVAR, 0).equals((new IDVariant("S")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0, (new IDVariant("S")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "VariazioniDefinitiveOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: » un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercher‡ di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEQUALE, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
      }
      // if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPROGIND1)), true) && Result.booleanValue())
      // {
        // IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGETTOID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI4, IMDBDef7.PQSL_PROGETTI4_PROGETTO_ID, 0));
      // }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGETTOID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI6, IMDBDef7.PQSL_PROGETTI6_PROGETTO_ID, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVARPERESI)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0).equals((new IDVariant("S")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROIMP, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORDIMPEGN, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOIMP, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORANNOIMP, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGREVARIMP, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECNOMOGGPRO, 0),IDVariant.INTEGER));
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOACC, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORANNOIMP, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROACC, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECORDIMPEGN, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGREVARACC, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECNOMOGGPRO, 0));
        }
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOESIGIBIL, 0, IMDB.Value(IMDBDef7.PQRY_VARIMP8, IMDBDef7.PQSL_VARIMP8_RECOANNOESIG, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEUODACAPUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGUNITORGA, 0, IMDB.Value(IMDBDef8.PQRY_CAPUO2, IMDBDef8.PQSL_CAPUO2_CAPUOPROUNOR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCUODACABIUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGUNITORGA, 0, IMDB.Value(IMDBDef8.PQRY_CAPUO3, IMDBDef8.PQSL_CAPUO3_CACABIUOPRUO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEOBIDIGEDU)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_OBIETTIVGEST, 0, IDL.ToString(IMDB.Value(IMDBDef8.PQRY_DUPOBIETGEST, IMDBDef8.PQSL_DUPOBIETGEST_DUOBDUOBIDOG, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "EndModalEvent", _e);
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
    IDVariant v_DESCR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FASE1 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_INFOFIN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INFOOPE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FASE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DESCR = (new IDVariant("Variazioni Definitive - ", IDVariant.STRING));
      v_IMPORTO = (new IDVariant("Importo ", IDVariant.STRING));
      v_INFOFIN = (new IDVariant("Informazione Finanziamento", IDVariant.STRING));
      v_INFOOPE = (new IDVariant("Informazione Opera", IDVariant.STRING));
      v_FASE = (new IDVariant("Fase 2 - ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(v_FASE, (new IDVariant("Variazioni Definitive"))), MainFrm.ESERCIZIO));
      PAN_VARIAZDEFINI.set_FieldText(PFL_VARIAZDEFINI_DESCRIZIONE1, IDL.Add(v_DESCR, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDESLAB, 0)).stringValue());
      PAN_VARIAZDEFINI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_INFOFINTOT,v_INFOFIN.stringValue()); 
      PAN_VARIAZDEFINI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_INFOOPETOT,v_INFOOPE.stringValue()); 
      PAN_VARIAZDEFINI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_INFOOPE,v_INFOOPE.stringValue()); 
      PAN_VARIAZDEFINI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PLURIENNALI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZDEFINI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PLURIENNALI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      // 
      // 
      // 
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_QUADRATURA as TIPMOTVBTIQU, ");
      SQL.append("  A.QUADRATURA_OBBLIG as TIPMOTVBQUOB, ");
      SQL.append("  A.QUADRATURA_OBBLIG_CASSA as TIMOVBQUOBCA ");
      SQL.append("from ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMETIPOL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, 0, QV.Get("TIPMOTVBTIQU", IDVariant.STRING));
        IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMQUAOBB, 0, QV.Get("TIPMOTVBQUOB", IDVariant.STRING));
        IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMQUOBCA, 0, QV.Get("TIMOVBQUOBCA", IDVariant.STRING));
      }
      QV.Close();
      PAN_PLURIENNALI.set_Header(Glb.OBJ_FIELD,PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("")).stringValue());
      PAN_PLURIENNALI.set_ToolTip(Glb.OBJ_FIELD,PFL_PLURIENNALI_DUALCOPIIMPO,(new IDVariant("Copia Importo")).stringValue()); 
      if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPIMP, 0).equals((new IDVariant("CO")), true))
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, 0)))
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPIMP, 0).equals((new IDVariant("CA")), true))
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PLURIENNALI.set_Visible((new IDVariant(0)).booleanValue());
        if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, 0)))
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, 0)))
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      PAN_VARIAZDEFINI.EditInsErrorMode = (new IDVariant(1)).intValue();
      PAN_VARIAZDEFINI.EditUpdErrorMode = (new IDVariant(1)).intValue();
      PAN_VARIAZDEFINI.FinalInsErrorMode = (new IDVariant(0)).intValue();
      PAN_VARIAZDEFINI.FinalUpdErrorMode = (new IDVariant(0)).intValue(); 
      if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPIMP, 0).compareTo((new IDVariant("RE")), true)!=0)
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDESLAB, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMETIPOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEPLURI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDETIVA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPVAR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPON1, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENS1, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPONC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENSC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPON2, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENS2, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMCONSVI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDIBIPE, 0, (new IDVariant()));
      if (MainFrm.INTEMPOBIGES.compareTo((new IDVariant("SI")), true)!=0)
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Nuova Tabbed View Change Page
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TAB_NUOVTABBVIEW_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuova Tabbed View Change Page Body
      // Corpo Procedura
      // 
      if (new IDVariant(TAB_NUOVTABBVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_PLURIENNALI.FrIndex)), true))
      {
        PAN_PLURIENNALI.set_FieldText(PFL_PLURIENNALI_ETILABCAPART, IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo ")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0))).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "NuovaTabbedViewChangePage", _e);
    }
  }

  // **********************************************************************
  // Pluriennali On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PLURIENNALI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pluriennali On Updating Row Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_CAPITOLO, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_ARTICOLO, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_DESCRIZIONE, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_DESCRIZIONE, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_TIPOVAR, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_TIPOVAR, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_ES, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_PROGETTOID, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGETTOID, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_FINANZIAMENTO, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_OPERA, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_OPERA, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_ISTITUZIONNC, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ISTITUZIONNC, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_PROGUNITORGA, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_PROGUNITORGA, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_ANNOPROPOSTA, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNPRO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_UNITAPROPONE, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_NUMEROPROPOS, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_ANNODEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNDEL, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_SEDEDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMSEDDEL, 0));
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_NUMERODEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMDEL, 0));
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_PROGRESSIVO, 0)))
      {
        IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  VARCOM_SQ.nextval as VARCOMSQ ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_MAX = QV.Get("VARCOMSQ", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_PROGRESSIVO, 0, new IDVariant(v_MAX));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "PluriennaliOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pluriennali On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PLURIENNALI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PLURIENNALI);
      // 
      // Pluriennali On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_PLURIENNALI.set_ToolTip(Glb.OBJ_FIELD,PFL_PLURIENNALI_DUALCOPIIMPO,(new IDVariant("Copia Importo")).stringValue()); 
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0).equals((new IDVariant("S")), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROIMP, 0))))
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOACC, 0))))
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_FINANZIAMENTO, 0))))
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_OPERA, 0))))
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPIMP, 0).equals((new IDVariant("RE")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0).equals((new IDVariant("E")), true))
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZDEFINI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "PluriennaliOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Infopeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "Infopeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Sceltapeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta peg Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Indicare la parte", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_INSERTED, 0).booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEQUALE, 0, (new IDVariant(1)));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "Sceltapeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Indietro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Indietro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Attenzione. Le modifiche sulle variazioni andranno perse. Continuare?", IDVariant.STRING));
      // 
      // Indietro Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_VARIAZDEFINI.GetNumRows())).compareTo((new IDVariant(0)), true)>0)
      {
        if (Message(v_SMS))
        {
          MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
        }
      }
      else
      {
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "Indietro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Tooltip
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaTooltip ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tooltip Body
      // Procedure Body
      // 
      PAN_VARIAZDEFINI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_DESCRIZIONE,IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_DESCRIZIONE, 0).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "SettaTooltip", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Registra Variazioni
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int RegistraVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registra Variazioni Body
      // Procedure Body
      // 
      IDVariant v_AVVISO = null;
      v_AVVISO = (new IDVariant());
      if (ControlliTotali())
      {
        if (ControlliSingolaRiga())
        {
          PAN_VARIAZDEFINI.PanelCommand(Glb.PCM_UPDATE);
          // if (!(PAN_VARIAZDEFINI.IsPanelInError()))
          // {
            // 
            // folder
            // 
            // {
              // MainFrm.set_AlertMessage(v_SMS); 
            // }
          // }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "RegistraVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totali
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CalcolaTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMENTRCOMP = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMSPESCOMP = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMPOSICOMP = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMNEGACOMP = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMENTRCASS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMSPESCASS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMPOSICASS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMNEGACASS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMAENTRAT2 = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMASPESA2 = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMAPOSITI2 = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMANEGATI2 = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMESERCOMP = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMESERCASS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMAESERCI2 = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Calcola Totali Body
      // Procedure Body
      // 
      com.progamma.doc.IDCollection v_VAR = null;
      v_VAR = PAN_VARIAZDEFINI.pCollection();
      ListIterator L2 = v_VAR.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        VarDef C2_VAR = (VarDef) L2.next();
        if (C2_VAR.getES().equals((new IDVariant("E")), true))
        {
          v_SOMMENTRCOMP = IDL.Add(v_SOMMENTRCOMP, C2_VAR.getIMPORTO());
          v_SOMMENTRCASS = IDL.Add(v_SOMMENTRCASS, C2_VAR.getIMPORTOCASSA());
        }
        else
        {
          v_SOMMSPESCOMP = IDL.Add(v_SOMMSPESCOMP, C2_VAR.getIMPORTO());
          v_SOMMSPESCASS = IDL.Add(v_SOMMSPESCASS, C2_VAR.getIMPORTOCASSA());
        }
        if (C2_VAR.getIMPORTO().compareTo((new IDVariant(0)), true)>=0)
        {
          v_SOMMPOSICOMP = IDL.Add(v_SOMMPOSICOMP, C2_VAR.getIMPORTO());
        }
        else
        {
          v_SOMMNEGACOMP = IDL.Sub(v_SOMMNEGACOMP, C2_VAR.getIMPORTO());
        }
        if (C2_VAR.getIMPORTOCASSA().compareTo((new IDVariant(0)), true)>=0)
        {
          v_SOMMPOSICASS = IDL.Add(v_SOMMPOSICASS, C2_VAR.getIMPORTOCASSA());
        }
        else
        {
          v_SOMMNEGACASS = IDL.Sub(v_SOMMNEGACASS, C2_VAR.getIMPORTOCASSA());
        }
      }
      if (v_SOMMESERCOMP.compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZDEFINI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_TOTALESOTTO3,new IDVariant(MyGlb.VIS_VUOGRAALRIRO).intValue()); 
      }
      else
      {
        PAN_VARIAZDEFINI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZDEFINI_TOTALESOTTO3,new IDVariant(MyGlb.VIS_VUOGRAALRICO).intValue()); 
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, 0).equals((new IDVariant("PM")), true))
      {
        PAN_VARIAZDEFINI.set_FieldText(PFL_VARIAZDEFINI_TOTALECOMPET, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Competenza ")), IDL.Replicate(new IDVariant(), (new IDVariant(4)))), (new IDVariant("+: "))), IDL.Format(IDL.NullValue(v_SOMMPOSICOMP,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)), (new IDVariant(" -: "))), IDL.Format(IDL.NullValue(v_SOMMNEGACOMP,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
        PAN_VARIAZDEFINI.set_FieldText(PFL_VARIAZDEFINI_TOTALECASSA, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Cassa ")), IDL.Replicate(new IDVariant(), (new IDVariant(4)))), (new IDVariant("+: "))), IDL.Format(IDL.NullValue(v_SOMMPOSICASS,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)), (new IDVariant(" -: "))), IDL.Format(IDL.NullValue(v_SOMMNEGACASS,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, 0).equals((new IDVariant("ES")), true))
      {
        PAN_VARIAZDEFINI.set_FieldText(PFL_VARIAZDEFINI_TOTALECOMPET, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Competenza ")), IDL.Replicate(new IDVariant(), (new IDVariant(4)))), (new IDVariant("E: "))), IDL.Format(IDL.NullValue(v_SOMMENTRCOMP,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)), (new IDVariant(" S: "))), IDL.Format(IDL.NullValue(v_SOMMSPESCOMP,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
        PAN_VARIAZDEFINI.set_FieldText(PFL_VARIAZDEFINI_TOTALECASSA, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Cassa ")), IDL.Replicate(new IDVariant(), (new IDVariant(4)))), (new IDVariant("E: "))), IDL.Format(IDL.NullValue(v_SOMMENTRCASS,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)), (new IDVariant(" S: "))), IDL.Format(IDL.NullValue(v_SOMMSPESCASS,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENCO, 0, new IDVariant(v_SOMMENTRCOMP));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOSPCO, 0, new IDVariant(v_SOMMSPESCOMP));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENCA, 0, new IDVariant(v_SOMMENTRCASS));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOSPCA, 0, new IDVariant(v_SOMMSPESCASS));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPON1, 0, IDL.Abs(IDL.Sub(v_SOMMPOSICOMP, v_SOMMNEGACOMP)));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENS1, 0, IDL.Abs(IDL.Sub(v_SOMMENTRCOMP, v_SOMMSPESCOMP)));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPONC, 0, IDL.Abs(IDL.Sub(v_SOMMPOSICASS, v_SOMMNEGACASS)));
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENSC, 0, IDL.Abs(IDL.Sub(v_SOMMENTRCASS, v_SOMMSPESCASS)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "CalcolaTotali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Fin tot
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoFintot ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Fin tot Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_FINANZIAMENTO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_FINANZIAMENTO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "InfoFintot", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Ope tot
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoOpetot ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Ope tot Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_OPERA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI21, IMDBDef1.FLD_PARAMETRI21_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_OPERA, 0));
        MainFrm.Show(MyGlb.FRM_INFOSULLOPER, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "InfoOpetot", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Message
  // Explain which processing is carried out by this procedure
  // sms:  - Input
  // **********************************************************************
  public boolean Message (IDVariant sms)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Message Body
      // Procedure Body
      // 
      v_SALVATO = (new IDVariant(-1));
      if (!(MainFrm.MessageConfirm(sms)))
      {
        v_SALVATO = (new IDVariant(0));
      }
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "Message", _e);
      return false;
    }
  }

  // **********************************************************************
  // Righe Stessa Parte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean RigheStessaParte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_STESSA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RIGA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_RIGA = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Righe Stessa Parte Body
      // Procedure Body
      // 
      v_STESSA = (new IDVariant(-1));
      com.progamma.doc.IDCollection v_VAR = null;
      v_VAR = PAN_VARIAZDEFINI.pCollection();
      ListIterator L2 = v_VAR.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        VarDef C2_VAR = (VarDef) L2.next();
        if (v_RIGA.equals((new IDVariant(1)), true))
        {
          v_ES = C2_VAR.getES();
        }
        if (v_RIGA.compareTo((new IDVariant(1)), true)>0)
        {
          if (C2_VAR.getES().compareTo(v_ES, true)!=0)
          {
            v_STESSA = (new IDVariant(0));
            break;
          }
        }
        v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
      }
      return v_STESSA.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "RigheStessaParte", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli Totali
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean ControlliTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTINUA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RIGHESTESSAP = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlli Totali Body
      // Procedure Body
      // 
      IDVariant v_AVVISO = null;
      v_AVVISO = (new IDVariant());
      v_CONTINUA = (new IDVariant(-1));
      v_RIGHESTESSAP = (new IDVariant(RigheStessaParte()));
      // 
      // competenza
      // 
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMQUAOBB, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEES, 0).equals((new IDVariant("ES")), true))
          {
            if (v_RIGHESTESSAP.booleanValue())
            {
              if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPON1, 0).compareTo((new IDVariant(0)), true)>0)
              {
                v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Quadratura Competenza errata per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant("<br/>")));
              }
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENS1, 0).compareTo((new IDVariant(0)), true)>0)
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Quadratura Competenza errata per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant("<br/>")));
            }
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEES, 0).compareTo((new IDVariant("ES")), true)!=0)
          {
            if (v_RIGHESTESSAP.booleanValue())
            {
              if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPON1, 0).compareTo((new IDVariant(0)), true)>0)
              {
                MainFrm.set_AlertMessage(IDL.Add((new IDVariant("Quadratura Competenza errata per l'esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
                v_CONTINUA = (new IDVariant(0));
                return v_CONTINUA.booleanValue();
              }
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENS1, 0).compareTo((new IDVariant(0)), true)>0)
            {
              MainFrm.set_AlertMessage(IDL.Add((new IDVariant("Quadratura Competenza errata per l'esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
              v_CONTINUA = (new IDVariant(0));
              return v_CONTINUA.booleanValue();
            }
          }
        }
      }
      // 
      // competenza
      // 
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMQUOBCA, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEES, 0).equals((new IDVariant("ES")), true))
          {
            if (v_RIGHESTESSAP.booleanValue())
            {
              if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPONC, 0).compareTo((new IDVariant(0)), true)>0)
              {
                v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Quadratura Cassa errata per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant("<br/>")));
              }
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENSC, 0).compareTo((new IDVariant(0)), true)>0)
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("Quadratura Cassa errata per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant("<br/>")));
            }
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEES, 0).compareTo((new IDVariant("ES")), true)!=0)
          {
            if (v_RIGHESTESSAP.booleanValue())
            {
              if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOPONC, 0).compareTo((new IDVariant(0)), true)>0)
              {
                MainFrm.set_AlertMessage(IDL.Add((new IDVariant("Quadratura Cassa errata per l'esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
                v_CONTINUA = (new IDVariant(0));
                return v_CONTINUA.booleanValue();
              }
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_RONASOTOENSC, 0).compareTo((new IDVariant(0)), true)>0)
            {
              MainFrm.set_AlertMessage(IDL.Add((new IDVariant("Quadratura Cassa errata per l'esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
              v_CONTINUA = (new IDVariant(0));
              return v_CONTINUA.booleanValue();
            }
          }
        }
      }
      if ((MainFrm.FASEBILANCIO.equals((new IDVariant(1)), true)) || (MainFrm.FASEBILANCIO.equals((new IDVariant(2)), true)))
      {
        ControlloDodicesimi(v_MESSAGGIO);
      }
      // 
      // 
      // 
      // 
      if (v_MESSAGGIO.compareTo((new IDVariant("")), true)!=0)
      {
        if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant(". "))), (new IDVariant("Continuare?"))))))
        {
          v_CONTINUA = (new IDVariant(0));
          return v_CONTINUA.booleanValue();
        }
      }
      return v_CONTINUA.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "ControlliTotali", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli Singola Riga
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean ControlliSingolaRiga ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTINUA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlli Singola Riga Body
      // Procedure Body
      // 
      v_CONTINUA = (new IDVariant(-1));
      com.progamma.doc.IDCollection v_VAR = null;
      v_VAR = PAN_VARIAZDEFINI.pCollection();
      IDVariant I = null;
      I = (new IDVariant(1));
      ListIterator L2 = v_VAR.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        VarDef C2_VAR = (VarDef) L2.next();
        if (IDL.IsNull(C2_VAR.getPROGUNITORGA()))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          if (IDL.NullValue(C2_VAR.getISTITUZIONNC(),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  VISTA_BILANCIO_UO A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(C2_VAR.getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C2_VAR.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(C2_VAR.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = " + IDL.CSql(C2_VAR.getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= NVL(" + IDL.CSql(C2_VAR.getDDATAREG(), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC( SYSDATE ))) ");
            SQL.append("and   (A.TIPO = 'O') ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  CAP_UO A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(C2_VAR.getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C2_VAR.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(C2_VAR.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = " + IDL.CSql(C2_VAR.getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= NVL(" + IDL.CSql(C2_VAR.getDDATAREG(), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC( SYSDATE ))) ");
            SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Unit‡ Organizzativa obbligatoria", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga")), (new IDVariant(" "))), IDL.ToString(I)), (new IDVariant(" "))), v_SMS), (new IDVariant(" capitolo "))), IDL.ToString(C2_VAR.getCAPITOLO())), (new IDVariant("/"))), IDL.ToString(C2_VAR.getARTICOLO())), (new IDVariant(" "))), C2_VAR.getES())); 
            v_CONTINUA = (new IDVariant(0));
            PAN_VARIAZDEFINI.set_ActualPosition(true, new IDVariant(I).intValue());
            return v_CONTINUA.booleanValue();
          }
        }
        if (IDL.IsNull(C2_VAR.getIMPORTO()) && IDL.IsNull(C2_VAR.getIMPORTOCASSA()))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Importo obbligatorio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          PAN_VARIAZDEFINI.set_ActualPosition(true, new IDVariant(I).intValue());
          v_CONTINUA = (new IDVariant(0));
          return v_CONTINUA.booleanValue();
        }
        if (IDL.IsNull(C2_VAR.getDESCRIZIONE()))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Descrizione obbligatoria", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          v_CONTINUA = (new IDVariant(0));
          PAN_VARIAZDEFINI.set_ActualPosition(true, new IDVariant(I).intValue());
          return v_CONTINUA.booleanValue();
        }
        if (IDL.IsNull(C2_VAR.getTIPOVAR()))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Tipo variazione obbligatoria", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          v_CONTINUA = (new IDVariant(0));
          PAN_VARIAZDEFINI.set_ActualPosition(true, new IDVariant(I).intValue());
          return v_CONTINUA.booleanValue();
        }
        if (C2_VAR.getISTITUZIONNC().equals((new IDVariant("SI")), true))
        {
          if (!(!(IDL.IsNull(C2_VAR.getFINANZIAMENTO())) && IDL.IsNull(C2_VAR.getOPERA())))
          {
            if ((!(IDL.IsNull(C2_VAR.getFINANZIAMENTO())) && IDL.IsNull(C2_VAR.getOPERA())) || (IDL.IsNull(C2_VAR.getFINANZIAMENTO()) && !(IDL.IsNull(C2_VAR.getOPERA()))))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Finanziamento e Opera incongruenti", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_SMS); 
              v_CONTINUA = (new IDVariant(0));
              PAN_VARIAZDEFINI.set_ActualPosition(true, new IDVariant(I).intValue());
              return v_CONTINUA.booleanValue();
            }
          }
        }
        else
        {
          // 
          // controllo che la voce peg abbia lo stanziamento di bilancio
          // 
          {
            IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  BIL A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(C2_VAR.getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C2_VAR.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(C2_VAR.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = " + IDL.CSql(C2_VAR.getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Capitolo ", IDVariant.STRING));
              IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
              v_SMS1 = (new IDVariant(": non presente in Bilancio", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), ((C2_VAR.getES().equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))), (new IDVariant(" "))), IDL.ToString(C2_VAR.getCAPITOLO())), (new IDVariant(" / "))), IDL.ToString(C2_VAR.getARTICOLO())), v_SMS1)); 
              v_CONTINUA = (new IDVariant(0));
              PAN_VARIAZDEFINI.set_ActualPosition(true, new IDVariant(I).intValue());
              return v_CONTINUA.booleanValue();
            }
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
      }
      if (v_MESSAGGIO.compareTo((new IDVariant("")), true)!=0)
      {
        if (!(MainFrm.MessageConfirm(IDL.Add(v_MESSAGGIO, (new IDVariant("Continuare?"))))))
        {
          v_CONTINUA = (new IDVariant(0));
          return v_CONTINUA.booleanValue();
        }
      }
      return v_CONTINUA.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "ControlliSingolaRiga", _e);
      return false;
    }
  }

  // **********************************************************************
  // Copia Importo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CopiaImporto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Copia Importo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_IMPORTO, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_IMPORTO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "CopiaImporto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impaccesig
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpaccesig ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impaccesig Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0).equals((new IDVariant("S")), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROIMP, 0))))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
          MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_NUMEROACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ANNOACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "InfoImpaccesig", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Quadratura Pluriennali
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ControlloQuadraturaPluriennali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Quadratura Pluriennali Body
      // Corpo Procedura
      // 
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGUNIPRO, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO, 0));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGNUMPRO, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO, 0));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGANNPRO, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNPRO, 0));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGTIPVAR, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPVAR, 0));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGDEFPRO, 0, (new IDVariant("D")));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGTIPIMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMETIPOL, 0));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMSEDDEL, 0));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMDEL, 0));
      // IMDB.set_Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNDEL, 0));
      // MainFrm.Show(MyGlb.FRM_CONTQUADPLU1, (new IDVariant(0)).intValue(), this); 
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGDEFPRO, 0, (new IDVariant("D")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMSEDDEL, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMDEL, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNDEL, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGSEDPRO, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMUNIPRO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGNUMPRO, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGANNPRO, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMANNPRO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPQUA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGPROINS, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMPROINS, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGDELINS, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMDELINS, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMEOGGETIPO, 0, IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMETIPOL, 0));
      MainFrm.Show(MyGlb.FRM_CONTQUADPLUR, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "ControlloQuadraturaPluriennali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Var
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaVar ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Var Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Indicare prima la parte"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IMDB.set_Value(IMDBDef1.TBL_PAR117, IMDBDef1.FLD_PAR117_NOMEOGGETTES, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0));
      MainFrm.Show(MyGlb.FRM_SCEVARPERESI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "EtichettaSceltaVar", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta SCelta Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSCeltaCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta SCelta Cap Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Indicare la parte", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMEQUALE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES, 0));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "EtichettaSCeltaCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Trova
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaTrova ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Trova Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare la parte"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGECAPI, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGEARTI, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Capitolo/Art. incompleto"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      PAN_VARIAZDEFINI.FindRecord((new IDVariant(PFL_VARIAZDEFINI_PARTE)),IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGETTES, 0),(new IDVariant(PFL_VARIAZDEFINI_CAPITOLO2)),IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGECAPI, 0),(new IDVariant(PFL_VARIAZDEFINI_ARTICOLO2)),IMDB.Value(IMDBDef12.PQRY_POSPARS2, IMDBDef12.PQSL_POSPARS2_NOMEOGGEARTI, 0)); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "EtichettaTrova", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Unit‡ Organizzativa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Unit‡Organizzativa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unit‡ Organizzativa Body
      // Corpo Procedura
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Indicare la parte"));
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Capitolo incompleto"));
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0)))
      {
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0)))
      {
        MainFrm.set_AlertMessage(v_S1); 
        return 0;
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ISTITUZIONNC, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_IN19, IMDBDef1.FLD_IN19_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN19, IMDBDef1.FLD_IN19_NOMEOGGETTES, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN19, IMDBDef1.FLD_IN19_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef1.TBL_IN19, IMDBDef1.FLD_IN19_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0));
        MainFrm.Show(MyGlb.FRM_SCEUODACAPUO, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_IN20, IMDBDef1.FLD_IN20_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN20, IMDBDef1.FLD_IN20_NOMEOGGETTES, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ES, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN20, IMDBDef1.FLD_IN20_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_CAPITOLO, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef1.TBL_IN20, IMDBDef1.FLD_IN20_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO1, IMDBDef12.PQSL_VARCOMPRO1_ARTICOLO, 0));
        MainFrm.Show(MyGlb.FRM_SCUODACABIUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "Unit‡Organizzativa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Dodicesimi
  // Messaggio Non Bloccante:  - Input/Output
  // **********************************************************************
  public int ControlloDodicesimi (IDVariant MessaggioNonBloccante)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Dodicesimi Body
      // Corpo Procedura
      // 
      com.progamma.doc.IDCollection v_VAR = null;
      v_VAR = PAN_VARIAZDEFINI.pCollection();
      IDVariant v_CODSTRUTTCAP = new IDVariant(0,IDVariant.STRING);
      IDVariant v_CODSTRALTCAP = new IDVariant(0,IDVariant.STRING);
      IDVariant v_TITOLOCAP = new IDVariant(0,IDVariant.STRING);
      IDVariant v_TITOLALTRCAP = new IDVariant(0,IDVariant.STRING);
      IDVariant v_LIVELLO5CAP = new IDVariant(0,IDVariant.STRING);
      IDVariant v_ESCLUSI12CAP = new IDVariant(0,IDVariant.STRING);
      IDVariant v_STANZIAMECAP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_IMPEGNATOCAP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_DIFFERENZCAP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_DIFFEALTRCAP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_MISPROTIGITR = null;
      v_MISPROTIGITR = (new IDVariant("@"));
      IDVariant v_MESE = null;
      v_MESE = IDL.Month(IDL.Today());
      ListIterator L2 = v_VAR.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        VarDef C2_VAR = (VarDef) L2.next();
        // 
        // se inserisco una variazione negativa o decremento una
        // variazione esistente faccio il controllo
        // 
        v_DIFFERENZCAP = (new IDVariant(0, IDVariant.DECIMAL));
        v_DIFFERENZCAP = IDL.Sub(C2_VAR.getIMPORTO(), IDL.NullValue(C2_VAR.getIMPORTORIGIN(),(new IDVariant(0))));
        if (C2_VAR.IsModified() && C2_VAR.getES().equals((new IDVariant("S")), true) && v_DIFFERENZCAP.compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant v_DODICESIMI = new IDVariant(0,IDVariant.DECIMAL);
          IDVariant v_ROUND = new IDVariant(0,IDVariant.DECIMAL);
          v_CODSTRUTTCAP = (new IDVariant());
          v_TITOLOCAP = (new IDVariant());
          v_LIVELLO5CAP = (new IDVariant());
          v_ESCLUSI12CAP = (new IDVariant());
          v_DIFFEALTRCAP = (new IDVariant(0, IDVariant.DECIMAL));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.CODICE_STRUTTURA as CAPCODICSTRU, ");
          SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,1,'SI','MACRO') as AGCRCCECESC1, ");
          SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,2,'SI','MACRO_5') as AGCRCCECESCC, ");
          SQL.append("  A_GET_SE_ESCLUSIONE_12(A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,TRUNC(TO_NUMBER(A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,2,'SI','MACRO_5'))),to_number(NULL),NULL,NULL,TRUNC( SYSDATE )) as AGSE1CECCCAT, ");
          SQL.append("  A_GET_STANZIAMENTO_12(A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO) as AGEST1CECCCA ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(C2_VAR.getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = " + IDL.CSql(C2_VAR.getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C2_VAR.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(C2_VAR.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CODSTRUTTCAP = QV.Get("CAPCODICSTRU", IDVariant.STRING) ;
            v_TITOLOCAP = QV.Get("AGCRCCECESC1", IDVariant.STRING) ;
            v_LIVELLO5CAP = QV.Get("AGCRCCECESCC", IDVariant.STRING) ;
            v_ESCLUSI12CAP = QV.Get("AGSE1CECCCAT", IDVariant.STRING) ;
            v_STANZIAMECAP = QV.Get("AGEST1CECCCA", IDVariant.DECIMAL) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(SUM(B.SALDO_INI + B.VARIAZIONI), 0) as NUVASUESIEV0 ");
          SQL.append("from ");
          SQL.append("  IMP A, ");
          SQL.append("  ESEIMP B, ");
          SQL.append("  CAP C ");
          SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = C.CAPITOLO) ");
          SQL.append("and   (A.ARTICOLO = C.ARTICOLO) ");
          SQL.append("and   (B.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
          SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
          SQL.append("and   ((A.IMP_DA_REISCR_STN IS NULL)) ");
          SQL.append("and   ((A.ANNO_IMP_PROVENIENZA IS NULL)) ");
          SQL.append("and   (TO_NUMBER(TO_CHAR(A.D_DATA_REG, 'yyyy')) = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A_GET_SE_ESCLUSIONE_12(C.ESERCIZIO,C.CAPITOLO,C.ARTICOLO,A.COD_LIVELLO_5,A.ANNO_IMP_PROVENIENZA,A.IMP_DA_REISCR_STN,A.ESCLUSIONE_12,A.D_DATA_REG) = 'NO') ");
          SQL.append("and   (C.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (C.E_S = 'S') ");
          SQL.append("and   (C.CODICE_STRUTTURA = " + IDL.CSql(v_CODSTRUTTCAP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A_GET_COD_RICL_CAP(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO,1,'SI','MACRO') = " + IDL.CSql(v_TITOLOCAP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPEGNATOCAP = QV.Get("NUVASUESIEV0", IDVariant.DECIMAL) ;
          }
          QV.Close();
          // 
          // verifico se Missione Programma Titolo non sono stati
          // gi‡ controllati in precedenza
          // 
          if (IDL.Find(v_MISPROTIGITR, IDL.Add(v_CODSTRUTTCAP, v_TITOLOCAP)).equals((new IDVariant(0)), true))
          {
            v_MISPROTIGITR = IDL.Add(IDL.Add(IDL.Add(v_MISPROTIGITR, v_CODSTRUTTCAP), v_TITOLOCAP), (new IDVariant("@")));
            // 
            // controllo se altri capitoli di spesa con stessa missione
            // programma titolo hanno importo modificato
            // 
            com.progamma.doc.IDCollection v_VARALTRICAP = null;
            v_VARALTRICAP = PAN_VARIAZDEFINI.pCollection();
            ListIterator L5 = v_VARALTRICAP.GetLoopCollection().listIterator();
            while (L5.hasNext())
            {
              VarDef C5_VARALTRICAP = (VarDef) L5.next();
              if (C5_VARALTRICAP.IsModified() && C5_VARALTRICAP.getES().equals((new IDVariant("S")), true) && C5_VARALTRICAP.getIMPORTORIGIN().compareTo(C5_VARALTRICAP.getIMPORTO(), true)!=0 && C5_VARALTRICAP.getPROGRESSIVO().compareTo(C2_VAR.getPROGRESSIVO(), true)!=0)
              {
                IDVariant v_VCAPESC12ALT = new IDVariant(0,IDVariant.STRING);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  NVL(A.ESCLUSIONE_12, 'NO') as NUVACAES12NO, ");
                SQL.append("  A.CODICE_STRUTTURA as CAPCODICSTRU, ");
                SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,1,'SI','MACRO') as AGCRCCECESCC ");
                SQL.append("from ");
                SQL.append("  CAP A ");
                SQL.append("where (A.ESERCIZIO = " + IDL.CSql(C5_VARALTRICAP.getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.E_S = " + IDL.CSql(C5_VARALTRICAP.getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C5_VARALTRICAP.getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.ARTICOLO = " + IDL.CSql(C5_VARALTRICAP.getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VCAPESC12ALT = QV.Get("NUVACAES12NO", IDVariant.STRING) ;
                  v_CODSTRALTCAP = QV.Get("CAPCODICSTRU", IDVariant.STRING) ;
                  v_TITOLALTRCAP = QV.Get("AGCRCCECESCC", IDVariant.STRING) ;
                }
                QV.Close();
                if (v_CODSTRALTCAP.equals(v_CODSTRUTTCAP, true) && v_TITOLALTRCAP.equals(v_TITOLOCAP, true) && v_VCAPESC12ALT.equals((new IDVariant("NO")), true))
                {
                  v_DIFFEALTRCAP = IDL.Sub(IDL.Add(v_DIFFEALTRCAP, C5_VARALTRICAP.getIMPORTO()), C5_VARALTRICAP.getIMPORTORIGIN());
                }
              }
            }
            v_STANZIAMECAP = IDL.Add(IDL.Add(v_STANZIAMECAP, v_DIFFERENZCAP), v_DIFFEALTRCAP);
            v_DODICESIMI = IDL.Div(v_MESE, IDL.ToCurrency((new IDVariant(12))));
            v_ROUND = IDL.Round(IDL.Mul(v_STANZIAMECAP, v_DODICESIMI), (new IDVariant(0)));
            if (v_ROUND.compareTo(v_IMPEGNATOCAP, true)<0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Il Totale Impegnato (", IDVariant.STRING));
              IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
              v_SMS1 = (new IDVariant(") di Missione-Programma ", IDVariant.STRING));
              IDVariant v_SMS2 = new IDVariant(0,IDVariant.STRING);
              v_SMS2 = (new IDVariant(" Titolo ", IDVariant.STRING));
              IDVariant v_SMS3 = new IDVariant(0,IDVariant.STRING);
              v_SMS3 = (new IDVariant(" Ë superiore ai "));
              IDVariant v_SMS4 = new IDVariant(0,IDVariant.STRING);
              v_SMS4 = (new IDVariant("/12 dello Stanziamento ("));
              MessaggioNonBloccante.set(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(MessaggioNonBloccante, (new IDVariant("<BR/>"))), v_SMS), IDL.Format(v_IMPEGNATOCAP, (new IDVariant("###,###,###,##0.00")), MainFrm)), v_SMS1), v_CODSTRUTTCAP), v_SMS2), v_TITOLOCAP), v_SMS3), IDL.ToString(v_MESE)), v_SMS4), IDL.ToString(IDL.Format(v_ROUND, (new IDVariant("###,###,###,##0.00")), MainFrm))), (new IDVariant(")"))));
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDefinitive", "ControlloDodicesimi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pos Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void VARIAZDEFINI_POSPARS2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_POSPARS2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_POSPARS3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_POSPARS3, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_POSPARS2_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_POSPARS2_RS, 0, IMDBDef3.TBL_POSPARS3, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_POSPARS2_RS, 0, 0, IMDBDef3.TBL_POSPARS3, IMDBDef3.FLD_POSPARS3_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_POSPARS2_RS, 1, 0, IMDBDef3.TBL_POSPARS3, IMDBDef3.FLD_POSPARS3_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_POSPARS2_RS, 2, 0, IMDBDef3.TBL_POSPARS3, IMDBDef3.FLD_POSPARS3_NOMEOGGEARTI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_POSPARS3, 0);
      if (IMDB.Eof(IMDBDef3.TBL_POSPARS3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_POSPARS3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_POSPARS2_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioË quando viene portata in primo piano
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
  private void TAB_NUOVTABBVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_NUOVTABBVIEW_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VARIAZDEFINI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZDEFINI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZDEFINI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZDEFINI, Cancel);
    // Stub
  }

  private void PAN_VARIAZDEFINI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_SCELTAPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Sceltapeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Infopeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_DUALSCELTCAP)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Sceltapeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_INFO)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Infopeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_DUALUNITORGA)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Unit‡Organizzativa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_INDIETRO)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Indietro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_REGISTVARIAZ)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RegistraVariazioni();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_INFOFINTOT)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFintot();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_INFOOPETOT)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOpetot();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_INFOOPE)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOpetot();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_INFOIMPACCES)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpaccesig();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZDEFINI_ETICHSCELVAR)
    {
      this.IdxPanelActived = this.PAN_VARIAZDEFINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaVar();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZDEFINI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAZDEFINI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZDEFINI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZDEFINI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PLURIENNALI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PLURIENNALI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PLURIENNALI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PLURIENNALI, Cancel);
    // Stub
  }

  private void PAN_PLURIENNALI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PLURIENNALI_DUALCOPIIMPO)
    {
      this.IdxPanelActived = this.PAN_PLURIENNALI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CopiaImporto();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PLURIENNALI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PLURIENNALI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PLURIENNALI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PLURIENNALI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_POSPARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_POSPARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_POSPARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_POSPARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_POSPARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_POSPARS);
    // Stub
  }

  private void PAN_POSPARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_POSPARS_ETICHSCELCAP)
    {
      this.IdxPanelActived = this.PAN_POSPARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSCeltaCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_POSPARS_ETICHETTROVA)
    {
      this.IdxPanelActived = this.PAN_POSPARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaTrova();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_POSPARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_POSPARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_POSPARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZDEFINI_Init()
  {

    PAN_VARIAZDEFINI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZDEFINI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, "4BF28920-3DA3-4C62-9273-72139D46286D");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, "Capitolo/Art");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_LIST, 4, 308, 496, 52, 0, 0);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_FORM, 76, 72, 544, 64, 0, 0);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, 0, 70);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, 1, 13);
    PAN_VARIAZDEFINI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, 0, 1);
    PAN_VARIAZDEFINI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, 1, 1);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, "B86DEC52-8B60-4302-9985-657742A570F6");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, "Cons/Sviluppo");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_FORM, 468, 240, 152, 28, 0, 0);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, 0, 81);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, 1, 13);
    PAN_VARIAZDEFINI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, 0, 4);
    PAN_VARIAZDEFINI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, 1, 1);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZDEFINI_CONSSVILUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZDEFINI.SetSize(MyGlb.OBJ_FIELD, 63);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, "B99651FB-2AFC-4213-BC69-635D922CDC1B");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, 0 | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, "9584460D-A788-42B7-AE07-EF97250325B1");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, "Capitolo");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, "B80DAA4E-2079-4719-BFE6-6835A207A466");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, "Articolo");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, "894D49CB-7BFA-4D4A-BE8F-D6907D3272E4");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, "Parte");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, "E88ECA1B-32E9-45AE-A63F-78C197ADE358");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, "CAPITOLO");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, "174BE5E1-EF0A-403A-968E-79D06650FA67");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, "/");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, 0 | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, "70F11BE6-AFCB-4E71-A04B-46750D484C4A");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, "ARTICOLO");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, "9B50CB3B-AF8E-472B-95C9-89C4D63029CC");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, 0, "wsearch1.gif", false);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, "6FED0860-7157-436B-A31B-3D2C435FF4AD");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, 0, "info.gif", false);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, "A99486D0-3CA0-4A82-8A20-6A2BC78BFD65");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, "DUAL Scelta Cap");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.VIS_HYPLINIMLOU1);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, "E6DB3CD3-E21A-464A-B645-8E535565DA58");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, "Info");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, "C817BCC1-0723-4BE4-93C1-5751B7B8B45B");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, "Nuovo");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.VIS_CHECKSTYLE);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, "953893A2-9AA9-4B67-8552-8DF66A89C699");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, "Descrizione");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, "77A12325-C57F-4C9F-8BAF-E8C1CBBD08E0");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, "Inserted");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, "1AEA6C64-D9CE-405C-A90B-E647889DAAFC");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, "754097DC-AC6A-4E4C-BCC7-7E5162D5760A");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, "Importo Competenza");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, "C11A2908-EED2-4623-8B1A-0BC5D08EEE73");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, "Importo Cassa");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, "C8941A02-6B85-46C3-96B1-FD3A34537E2F");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, "Data");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, "256A2371-045C-430C-8864-D0E8C4D13570");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, "Capitolo/Art");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, "21041733-0868-49DB-9A30-1009B1ED1AA9");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, "di Bilancio");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.VIS_CHECKSTYLE);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, "80A45574-7B26-4808-910E-02CE1C32A5C6");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, "CONS SVILUPPO");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, "20B4387C-CB7C-4857-8731-BD3350F8179D");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, "Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, "A18C6FCC-46DA-4796-963C-BBFD7316B646");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, "Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, "4CDC291D-627F-4167-9AF8-9669C3955857");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, "Descrizione Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, "7E30B4FA-7FD7-4EB8-AD00-21A21893C614");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, MyGlb.VIS_ETICHEGRASSE);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, 0, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, "AD744C3C-8CAB-47D6-A3E7-FFC191AB8431");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, "Indietro");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, 0, "button1.gif", true);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, 0 | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, "0E3D6B86-AAB2-426B-BBF1-E00AF750D2E3");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, "Registra Variazioni");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, 0, "button_large.GIF", true);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, 0 | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, "ADC6E1E4-66CD-4DE1-BBE4-FE3CE2E3F124");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, "E:");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, MyGlb.VIS_VUOGRAALRICO);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, "0B9CC533-0AE2-414C-AAE3-BAB397B9735E");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, "Obiettivo Gestionale");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, "937A00DF-96F1-46CF-8EE4-0D061893B33B");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, "Obiettivo Gestionale");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, "6023CE27-C1B4-4AA0-BE71-C0948535F6E8");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, "Obiettivo Operativo");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, "03E4BFA9-464E-49FE-B6DE-8C6F5DD87340");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, "2009 E:");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, MyGlb.VIS_VUOGRAALRICO);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, "C5BDAD0D-1B27-4898-B29F-EDE24B1E28D8");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, "s");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, MyGlb.VIS_VUOGRAALLECO);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, 0, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, "5FD5D412-2FFB-4B1D-8ED5-FCFDBE7D9193");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, MyGlb.VIS_VUOGRAALRICO);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, "6CC5A0B2-95B6-4DAB-9E16-896E2E94AB09");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, MyGlb.VIS_VUOGRAALLECO);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, 0, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, "19B7971A-AAC5-4DD1-8603-D5123DB8A7C2");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, MyGlb.VIS_VUOGRAALLECO);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, 0, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, "A482B928-E384-4439-913E-FBF652E07057");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, "PROGRESSIVO");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, "745C7999-8898-4487-B645-5EC2F1DB81DF");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, 0, "info.gif", false);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, "B1042905-F124-46E0-9C41-204408D0E6D0");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, 0, "info.gif", false);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, "536C9773-3113-4EA8-88D2-450E40E319AE");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, 0, "info.gif", false);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, "20C70C90-6C40-48F9-B2D5-D3873CB8D7AB");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, "F49E188C-6759-4B46-84DD-172590EBBB03");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, "Finanz./Opera");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, "2B40610D-EE61-49DC-BA77-AC79EA61CD42");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, "Finanziamento");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, "8BAE7CF2-61E2-4BFA-BD81-CFCFAE2D8942");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, "Opera");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, "DB3CE8F3-4A0C-4634-82D6-98BA020122B3");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, "ESERCIZIO");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, 0, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, "A40FA8D4-0312-4710-9CB2-E00A3D1C3D06");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, "ANNO PROPOSTA");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, "D758BE0F-2EA3-4B57-9499-FD9F1DE00687");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, "UNITA PROPONENTE");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, "7B22481B-C2A7-40B8-8257-F250721E5C65");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, "NUMERO PROPOSTA");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, "04B006C8-DB68-4849-8137-2DA9653062A2");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, "ANNO DEL");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, "B0907BFB-5CC0-4747-ADBB-BE280E2B0AD7");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, "NUMERO DEL");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, "24654629-1EEA-41EA-8195-9E7F7E851579");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, "SEDE DEL");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, "017E9A4B-E55C-4CA9-A9BE-9C1002942209");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, "PROGRESSIVO 1");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, "4FA75CAA-72BD-418B-B72D-8FAF055E63EA");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, "Accertamento");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, "638605C8-FAA7-4316-BF4E-C258C49F29A7");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, "/");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, "A0D0FE0A-EE3F-457C-BB6D-FD5D6E836E19");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, "/");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, "E155EDFC-8429-430F-BBBF-412D6A0F5045");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, "Impegno");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, "7408F58D-BC4D-48CE-A13B-80430972716C");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, 0, "info.gif", false);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, "CE937E44-C307-44D7-AE0C-16E7591F7F5E");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, "Anno Esigibilit‡");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, "0C715939-5457-40F0-AC61-AD382817DF20");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZDEFINI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, 0, "wsearch1.gif", false);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, "890D7E39-C6FD-42A3-9F0A-EA49B15ECCC6");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, "PROGRESSIVO VARIMP");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, "E2AF7150-3D30-4BDD-B6B2-89DEFDF4809D");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, "Label");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, MyGlb.VIS_LABELFIELD);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, "A66F34A6-7E22-4C01-9CFA-226847FE568C");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, "PROGRESSIVO VARACC");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZDEFINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, "CCADDA78-37A1-486C-B350-29241EAC605B");
    PAN_VARIAZDEFINI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, "PROGETTO ID");
    PAN_VARIAZDEFINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, "");
    PAN_VARIAZDEFINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZDEFINI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZDEFINI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, MyGlb.PANEL_LIST, 380, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, MyGlb.PANEL_FORM, 536, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_NEWPANELLABE, -1, GRP_VARIAZDEFINI_CAPITOLOART);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_LIST, 8, 312, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_FORM, 80, 88, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_CAPITOLO1, -1, GRP_VARIAZDEFINI_CAPITOLOART);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_CAPITOLO1, PPQRY_DUAL3, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,0)", "DUALDESCCAPI", 5, 99, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_LIST, 12, 336, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_FORM, 80, 112, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ARTICOLO1, -1, GRP_VARIAZDEFINI_CAPITOLOART);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ARTICOLO1, PPQRY_DUAL3, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,~~ARTICOLO~~)", "DUALDESCARTI", 5, 99, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_LIST, 0, 104, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_FORM, 100, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_FORM, 40);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_PARTE, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_PARTE, PPQRY_VARCOMPRO1, "E_S", "ES", 5, 1, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_LIST, 64, 104, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_FORM, 168, 56, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLO2, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_CAPITOLO2, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_CAPITOLO2, PPQRY_VARCOMPRO1, "CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, MyGlb.PANEL_LIST, 136, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, MyGlb.PANEL_FORM, 300, 56, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_BARRA, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_LIST, 192, 104, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_LIST, "A.");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_FORM, 320, 56, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ARTICOLO2, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ARTICOLO2, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ARTICOLO2, PPQRY_VARCOMPRO1, "ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, MyGlb.PANEL_LIST, 248, 28, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, MyGlb.PANEL_FORM, 352, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCELTAPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_SCELTAPEG, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_SCELTAPEG, -1, "", "SCELTAPEG", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, MyGlb.PANEL_LIST, 256, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, MyGlb.PANEL_FORM, 368, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INFOPEG, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INFOPEG, -1, "", "INFOPEG", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_LIST, 216, 104, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_LIST, "D. S. C.");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_FORM, 4, 556, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALSCELTCAP, MyGlb.PANEL_FORM, "DUAL Scelta Cap");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DUALSCELTCAP, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DUALSCELTCAP, PPQRY_DUAL1, "'A'", "SCELTACAP", 5, 1, 0, -13997);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_DUALSCELTCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_DUALSCELTCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_DUALSCELTCAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_LIST, 240, 104, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_LIST, "I.");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_FORM, 4, 580, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFO, MyGlb.PANEL_FORM, "Info");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INFO, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INFO, PPQRY_DUAL2, "'I'", "INFO", 5, 1, 0, -13997);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_INFO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_LIST, 260, 104, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_LIST, "Nuovo");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_FORM, 256, 244, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUOVO, MyGlb.PANEL_FORM, "Nuovo");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_NUOVO, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_NUOVO, PPQRY_VARCOMPRO1, "ISTITUZIONE_NC", "ISTITUZIONNC", 5, 2, 0, -13997);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_NUOVO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_NUOVO, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_LIST, 304, 104, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_FORM, 64, 156, 556, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DESCRIZIONE, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DESCRIZIONE, PPQRY_VARCOMPRO1, "DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_LIST, 496, 52, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_LIST, "Inserted");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_FORM, 4, 628, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INSERTED, MyGlb.PANEL_FORM, "Inserted");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INSERTED, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INSERTED, PPQRY_VARCOMPRO1, "A.INSERTED", "INSERTED", 11, 9, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 496, 104, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 316, 216, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 32);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "T. V.");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_TIPOVARIAZIO, PPQRY_VARCOMPRO1, "TIPO_VAR", "TIPOVAR", 1, 2, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_LIST, 724, 104, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_LIST, "Importo Competenza");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_FORM, 76, 192, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTCOMPET, MyGlb.PANEL_FORM, "Imp. Cmp.");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_IMPORTCOMPET, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_IMPORTCOMPET, PPQRY_VARCOMPRO1, "IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_LIST, 812, 104, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_LIST, "Importo Cassa");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_FORM, 4, 604, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPORTOCASSA, MyGlb.PANEL_FORM, "Importo Cassa");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_IMPORTOCASSA, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_IMPORTOCASSA, PPQRY_VARCOMPRO1, "IMPORTO_CASSA", "IMPORTOCASSA", 3, 14, 2, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_LIST, 900, 104, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_FORM, 76, 216, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DATA, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DATA, PPQRY_VARCOMPRO1, "D_DATA_REG", "DDATAREG", 6, 10, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_LIST, 64, 68, 196, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_FORM, 0, 0, 128, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_CAPITOLOART, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_LIST, "di Bilancio");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_FORM, 76, 244, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DIBILANCIO, MyGlb.PANEL_FORM, "di Bilancio");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DIBILANCIO, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DIBILANCIO, PPQRY_VARCOMPRO1, "VAR_BIL", "VARBIL", 5, 2, 0, -13997);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_DIBILANCIO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_DIBILANCIO, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_LIST, "CONS SVILUPPO");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_FORM, 472, 244, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_CONSSVILUPPO, MyGlb.PANEL_FORM, "CNS. SVILUPPO");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_CONSSVILUPPO, -1, GRP_VARIAZDEFINI_CONSSVILUPPO);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_CONSSVILUPPO, PPQRY_VARCOMPRO1, "CONS_SVILUPPO", "CONSSVILUPPO", 5, 1, 0, -13997);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_CONSSVILUPPO, (new IDVariant("C")), "Consolidato", "", "", -1);
    PAN_VARIAZDEFINI.SetValueListItem(PFL_VARIAZDEFINI_CONSSVILUPPO, (new IDVariant("S")), "Sviluppo", "", "", -1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_LIST, 4, 392, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_LIST, "Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_FORM, 4, 720, 660, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALUNITORGA, MyGlb.PANEL_FORM, "Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DUALUNITORGA, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DUALUNITORGA, PPQRY_UNITAORGANIZ, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "UNITAORGANIZ", 5, 99, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_LIST, 4, 392, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_FORM, 20, 272, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_UNITAORGANIZ, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_UNITAORGANIZ, PPQRY_VARCOMPRO1, "PROGR_UNITA_ORGANIZZATIVA", "PROGUNITORGA", 1, 8, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_LIST, 204, 392, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_LIST, "Desc. Un. Org.");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_FORM, 100, 684, 508, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCUNITORGA, MyGlb.PANEL_FORM, "Descr. Unit‡ Organizzativa");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DESCUNITORGA, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DESCUNITORGA, PPQRY_UNITAORGANIZ, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "DESCUNITORGA", 5, 99, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, MyGlb.PANEL_LIST, 0, 4, 720, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, MyGlb.PANEL_FORM, 144, 4, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DESCRIZIONE1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DESCRIZIONE1, -1, "", "DESCRIZIONE1", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, MyGlb.PANEL_LIST, 616, 364, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, MyGlb.PANEL_FORM, 380, 520, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INDIETRO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INDIETRO, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INDIETRO, -1, "", "INDIETRO", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, MyGlb.PANEL_LIST, 704, 364, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, MyGlb.PANEL_FORM, 472, 520, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_REGISTVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_REGISTVARIAZ, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_REGISTVARIAZ, -1, "", "REGISTVARIAZ", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, MyGlb.PANEL_LIST, 516, 308, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, MyGlb.PANEL_FORM, 160, 444, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_TOTALECOMPET, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_TOTALECOMPET, -1, "", "TOTALECOMPET", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_LIST, 500, 416, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_FORM, 4, 744, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OBIETTIVGEST, MyGlb.PANEL_FORM, "Obiet. Gestion.");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_OBIETTIVGEST, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_OBIETTIVGEST, PPQRY_VARCOMPRO1, "OBIETTIVO_GEST", "OBIETTIVGEST", 5, 9, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_LIST, 516, 416, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_LIST, 148);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_FORM, 4, 840, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_FORM, 148);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEGEST, MyGlb.PANEL_FORM, "Obiettivo Gestionale");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DUALOBIEGEST, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DUALOBIEGEST, PPQRY_OBIETTIVI, "DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,~~ARTICOLO~~,TRUNC( SYSDATE ),'NO')", "OBIETTGESTIO", 5, 99, 0, -13997);
    PAN_VARIAZDEFINI.set_Alignment(PFL_VARIAZDEFINI_DUALOBIEGEST, 2);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_LIST, 0, 416, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_FORM, 4, 840, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_DUALOBIEOPER, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_DUALOBIEOPER, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_DUALOBIEOPER, PPQRY_OBIETTIVI, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,~~ARTICOLO~~,TRUNC( SYSDATE ),'NO')", "OBIETTOPERAT", 5, 99, 0, -13997);
    PAN_VARIAZDEFINI.set_Alignment(PFL_VARIAZDEFINI_DUALOBIEOPER, 2);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, MyGlb.PANEL_LIST, 516, 332, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, MyGlb.PANEL_FORM, 128, 468, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALECASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_TOTALECASSA, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_TOTALECASSA, -1, "", "TOTALECASSA", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, MyGlb.PANEL_LIST, 512, 332, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, MyGlb.PANEL_FORM, 128, 492, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_TOTALESOTTO2, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_TOTALESOTTO2, -1, "", "TOTALESOTTO2", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, MyGlb.PANEL_LIST, 896, 464, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, MyGlb.PANEL_FORM, 204, 300, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO3, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_TOTALESOTTO3, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_TOTALESOTTO3, -1, "", "TOTALESOTTO3", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, MyGlb.PANEL_LIST, 698, 284, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, MyGlb.PANEL_FORM, 212, 308, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO4, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_TOTALESOTTO4, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_TOTALESOTTO4, -1, "", "TOTALESOTTO4", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, MyGlb.PANEL_LIST, 774, 284, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, MyGlb.PANEL_FORM, 220, 316, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_TOTALESOTTO5, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_TOTALESOTTO5, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_TOTALESOTTO5, -1, "", "TOTALESOTTO5", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_LIST, 280, 420, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_FORM, 4, 400, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO2, MyGlb.PANEL_FORM, "PROGR.");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_PROGRESSIVO2, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_PROGRESSIVO2, PPQRY_VARCOMPRO1, "PROGRESSIVO_PRIMA_VAR", "PROGRPRIMVAR", 1, 10, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, MyGlb.PANEL_LIST, 500, 444, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, MyGlb.PANEL_FORM, 624, 396, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOFINTOT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INFOFINTOT, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INFOFINTOT, -1, "", "INFOFINTOT", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, MyGlb.PANEL_LIST, 520, 444, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, MyGlb.PANEL_FORM, 640, 396, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPETOT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INFOOPETOT, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INFOOPETOT, -1, "", "INFOOPETOT", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, MyGlb.PANEL_LIST, 568, 356, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, MyGlb.PANEL_FORM, 624, 420, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOOPE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INFOOPE, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INFOOPE, -1, "", "INFOOPE", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_FORM, 592, 348, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SCHEDOBIETID, MyGlb.PANEL_FORM, "S. OB. I.");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_SCHEDOBIETID, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_SCHEDOBIETID, PPQRY_VARCOMPRO1, "SCHEDA_OBIETTIVO_ID", "SCHEDOBIETID", 1, 10, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_LIST, 8, 440, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_LIST, "Finanz./Opera");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_FORM, 4, 628, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZOPERA, MyGlb.PANEL_FORM, "Finanz./Opera");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_FINANZOPERA, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_FINANZOPERA, PPQRY_BILFIN, "LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE", "DESCRIZIONE", 5, 605, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_LIST, 24, 440, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 628, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_FINANZIAMEN1, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_FINANZIAMEN1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_FINANZIAMEN1, PPQRY_VARCOMPRO1, "FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_LIST, 80, 464, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_LIST, 44);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_FORM, 96, 416, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_FORM, 44);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_OPERA1, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_OPERA1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_OPERA1, PPQRY_VARCOMPRO1, "OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 628, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ESERCIZIO1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ESERCIZIO1, PPQRY_VARCOMPRO1, "ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_LIST, "ANNO PROPOSTA");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_FORM, 4, 628, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOPROPOST1, MyGlb.PANEL_FORM, "ANNO PROPOSTA");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ANNOPROPOST1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ANNOPROPOST1, PPQRY_VARCOMPRO1, "ANNO_PROPOSTA", "ANNOPROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_FORM, 4, 652, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_UNITAPROPON1, MyGlb.PANEL_FORM, "UNITA PROPONENTE");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_UNITAPROPON1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_UNITAPROPON1, PPQRY_VARCOMPRO1, "UNITA_PROPONENTE", "UNITAPROPONE", 5, 255, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_LIST, "NUMERO PROPOSTA");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_FORM, 4, 676, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROPROPO1, MyGlb.PANEL_FORM, "NUMERO PROPOSTA");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_NUMEROPROPO1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_NUMEROPROPO1, PPQRY_VARCOMPRO1, "NUMERO_PROPOSTA", "NUMEROPROPOS", 1, 4, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_FORM, 4, 628, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNODEL1, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ANNODEL1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ANNODEL1, PPQRY_VARCOMPRO1, "ANNO_DEL", "ANNODEL", 1, 4, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_FORM, 4, 652, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMERODEL1, MyGlb.PANEL_FORM, "NUMERO DEL");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_NUMERODEL1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_NUMERODEL1, PPQRY_VARCOMPRO1, "NUMERO_DEL", "NUMERODEL", 1, 6, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_FORM, 4, 676, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_SEDEDEL1, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_SEDEDEL1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_SEDEDEL1, PPQRY_VARCOMPRO1, "SEDE_DEL", "SEDEDEL", 5, 255, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_LIST, 984, 52, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGRESSIVO 1");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 628, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGR. 1");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_PROGRESSIVO1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_PROGRESSIVO1, PPQRY_VARCOMPRO1, "PROGRESSIVO", "PROGRESSIVO", 1, 10, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_LIST, 32, 368, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_LIST, "Accertamento");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_FORM, 4, 660, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_NUMEROACC, MyGlb.PANEL_FORM, "Accert.");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_NUMEROACC, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_NUMEROACC, PPQRY_VARCOMPRO1, "NUMERO_ACC", "NUMEROACC", 1, 5, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_LIST, 208, 368, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_LIST, 16);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_LIST, "/");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_FORM, 12, 636, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOACC, MyGlb.PANEL_FORM, "/");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ANNOACC, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ANNOACC, PPQRY_VARCOMPRO1, "ANNO_ACC", "ANNOACC", 1, 4, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_LIST, 160, 368, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_LIST, "/");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_FORM, 12, 636, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOIMP, MyGlb.PANEL_FORM, "/");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ANNOIMP, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ANNOIMP, PPQRY_VARCOMPRO1, "ANNO_IMP", "ANNOIMP", 1, 4, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_LIST, 44, 368, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_FORM, 4, 660, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_IMPEGNO, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_IMPEGNO, PPQRY_VARCOMPRO1, "NUMERO_IMP", "NUMEROIMP", 1, 5, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, MyGlb.PANEL_LIST, 284, 372, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, MyGlb.PANEL_FORM, 648, 404, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_INFOIMPACCES, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_INFOIMPACCES, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_INFOIMPACCES, -1, "", "INFOIMPACCES", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 312, 368, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilit‡");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 684, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilit‡");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ANNOESIGIBIL, PPQRY_VARCOMPRO1, "ANNO_ESIGIBILITA", "ANNOESIGIBIL", 1, 4, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, MyGlb.PANEL_LIST, 500, 372, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, MyGlb.PANEL_FORM, 500, 324, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHSCELVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ETICHSCELVAR, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ETICHSCELVAR, -1, "", "ETICHSCELVAR", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_LIST, 984, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_LIST, "PROGRESSIVO VARIMP");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_FORM, 4, 628, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARIMP, MyGlb.PANEL_FORM, "PROGRESSIVO VARIMP");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_PROGREVARIMP, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_PROGREVARIMP, PPQRY_VARCOMPRO1, "PROGRESSIVO_VARIMP", "PROGREVARIMP", 1, 10, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, MyGlb.PANEL_LIST, 12, 8, 728, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, MyGlb.PANEL_LIST, 3);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, MyGlb.PANEL_FORM, 12, 8, 728, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_ETICHETLABEL, MyGlb.PANEL_FORM, 3);
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_ETICHETLABEL, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_ETICHETLABEL, -1, "", "ETICHETLABEL", 0, 0, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_LIST, 984, 104, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_LIST, "PROGRESSIVO VARACC");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_FORM, 4, 684, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGREVARACC, MyGlb.PANEL_FORM, "PROGRESSIVO VARACC");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_PROGREVARACC, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_PROGREVARACC, PPQRY_VARCOMPRO1, "PROGRESSIVO_VARACC", "PROGREVARACC", 3, 10, 0, -13997);
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_VARIAZDEFINI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_FORM, 4, 840, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZDEFINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZDEFINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZDEFINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZDEFINI_PROGETTOID1, MyGlb.PANEL_FORM, "PROGETTO ID");
    PAN_VARIAZDEFINI.SetFieldPage(PFL_VARIAZDEFINI_PROGETTOID1, -1, -1);
    PAN_VARIAZDEFINI.SetFieldPanel(PFL_VARIAZDEFINI_PROGETTOID1, PPQRY_VARCOMPRO1, "PROGETTO_ID", "PROGETTOID", 5, 9, 0, -13997);
  }

  private void PAN_VARIAZDEFINI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZDEFINI.SetSize(MyGlb.OBJ_QUERY, 12);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,0) as DUALDESCCAPI, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,~~ARTICOLO~~) as DUALDESCARTI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_DUAL3, 0, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_DUAL3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetMasterTable(PPQRY_DUAL3, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as SCELTACAP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where ((~~INSERTED~~ = -1) AND NOT ((~~ES~~ IS NULL))) ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~CAPITOLO~~ IS NULL))) ");
    SQL.append("and   (NOT ((~~ARTICOLO~~ IS NULL))) ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_DUAL2, 0, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetMasterTable(PPQRY_DUAL2, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as BILFINFINANZ, ");
    SQL.append("  A.OPERA as BILFINOPERA, ");
    SQL.append("  LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.OPERA = ~~OPERA~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.E_S = ~~ES~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.OPERA = C.CODICE) ");
    SQL.append("and   (A.OPERA <> 0) ");
    SQL.append("order by 3 ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_BILFIN, 0, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_BILFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetMasterTable(PPQRY_BILFIN, "BIL_FIN");
    PAN_VARIAZDEFINI.SetQueryLKE(PPQRY_BILFIN, PFL_VARIAZDEFINI_FINANZIAMEN1, "BILFINFINANZ");
    PAN_VARIAZDEFINI.SetQueryLKE(PPQRY_BILFIN, PFL_VARIAZDEFINI_OPERA1, "BILFINOPERA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as BILFINFINANZ, ");
    SQL.append("  A.OPERA as BILFINOPERA, ");
    SQL.append("  LPAD(TO_CHAR ( B.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( C.CODICE ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.E_S = ~~ES~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.OPERA = C.CODICE) ");
    SQL.append("and   (A.OPERA <> 0) ");
    SQL.append("order by 3 ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_BILFIN, 1, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryHeaderColumn(PPQRY_BILFIN, "DESCRIZIONE", "Descrizione");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as UNITAORGANIZ, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCUNITORGA ");
    SQL.append("from ");
    SQL.append("  CAP_BIL_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGUNITORGA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~ES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= NVL(~~DDATAREG~~, TRUNC( SYSDATE ))) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("and   ((~~ISTITUZIONNC~~ IS NULL)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(B.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  CAP_UO B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = ~~PROGUNITORGA~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.E_S = ~~ES~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (NVL(B.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= NVL(~~DDATAREG~~, TRUNC( SYSDATE ))) ");
    SQL.append("and   (~~ISTITUZIONNC~~ = 'SI') ");
    SQL.append("order by 2 ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_UNITAORGANIZ, 0, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_UNITAORGANIZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetMasterTable(PPQRY_UNITAORGANIZ, "CAP_BIL_UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as DUPOBIGESCOD ");
    SQL.append("from ");
    SQL.append("  DUP_OBIETTIVI_GESTIONE A ");
    SQL.append("where (A.ID_OBIETTIVO_GESTIONE = TRUNC(TO_NUMBER(~~OBIETTIVGEST~~))) ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_DUPOBIETGEST, 0, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_DUPOBIETGEST, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetMasterTable(PPQRY_DUPOBIETGEST, "DUP_OBIETTIVI_GESTIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,~~ARTICOLO~~,TRUNC( SYSDATE ),'NO') as OBIETTOPERAT, ");
    SQL.append("  DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~ES~~,~~CAPITOLO~~,~~ARTICOLO~~,TRUNC( SYSDATE ),'NO') as OBIETTGESTIO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_OBIETTIVI, 0, SQL, -1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_OBIETTIVI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetMasterTable(PPQRY_OBIETTIVI, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'E' as CODICE, ");
    SQL.append("  'Entrata' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~ES~~ = 'E') ");
    SQL.append("and   ((~~TBL_PARAM7.ROWNAMPARVAR~~ = 'E') OR ~~TBL_PARAM7.ROWNAMPARVAR~~ = 'ES') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'S', ");
    SQL.append("  'Spesa' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ES~~ = 'S') ");
    SQL.append("and   ((~~TBL_PARAM7.ROWNAMPARVAR~~ = 'S') OR ~~TBL_PARAM7.ROWNAMPARVAR~~ = 'ES') ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_DUAL4, 0, SQL, PFL_VARIAZDEFINI_PARTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'E' as CODICE, ");
    SQL.append("  'Entrata' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where ((~~TBL_PARAM7.ROWNAMPARVAR~~ = 'E') OR ~~TBL_PARAM7.ROWNAMPARVAR~~ = 'ES') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'S', ");
    SQL.append("  'Spesa' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where ((~~TBL_PARAM7.ROWNAMPARVAR~~ = 'S') OR ~~TBL_PARAM7.ROWNAMPARVAR~~ = 'ES') ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_DUAL4, 1, SQL, PFL_VARIAZDEFINI_PARTE, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_DUAL4, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    SQL.append("where (A.CODICE = ~~TIPOVAR~~) ");
    SQL.append("and   (A.TIPOLOGIA = ~~TBL_PARAM7.ROWNAMETIPOL~~) ");
    SQL.append("and   (A.TIPOLOGIA = B.CODICE) ");
    SQL.append("and   (B.TIPO_QUADRATURA = ~~TBL_PARAM7.ROWNAMTIPQUA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_T54, 0, SQL, PFL_VARIAZDEFINI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    SQL.append("where (A.TIPOLOGIA = ~~TBL_PARAM7.ROWNAMETIPOL~~) ");
    SQL.append("and   (A.TIPOLOGIA = B.CODICE) ");
    SQL.append("and   (B.TIPO_QUADRATURA = ~~TBL_PARAM7.ROWNAMTIPQUA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_T54, 1, SQL, PFL_VARIAZDEFINI_TIPOVARIAZIO, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FINANZCODIC1 ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_VARIAZDEFINI_FINANZIAMEN1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FINANZCODIC1 ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_VARIAZDEFINI_FINANZIAMEN1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_OPERE, 0, SQL, PFL_VARIAZDEFINI_OPERA1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZDEFINI.SetQuery(PPQRY_OPERE, 1, SQL, PFL_VARIAZDEFINI_OPERA1, "");
    PAN_VARIAZDEFINI.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZDEFINI.SetIMDB(IMDB, "PQRY_VARCOMPRO1", true);
    PAN_VARIAZDEFINI.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOMPRO");
    PAN_VARIAZDEFINI.SetDocumentClass(0, "VarDef");
    PAN_VARIAZDEFINI.AddDOSortCriteria(VarDef.VARDEF_ES);
    PAN_VARIAZDEFINI.AddDOSortCriteria(VarDef.VARDEF_CAPITOLO);
    PAN_VARIAZDEFINI.AddDOSortCriteria(VarDef.VARDEF_ARTICOLO);
    PAN_VARIAZDEFINI.SetDOWhereClause("((PROGRESSIVO_PRIMA_VAR IS NULL)) and (ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) and ((~~TBL_PARAM7.ROWNAMPROINS~~ = 'SI' AND ((ANNO_PROPOSTA = ~~TBL_PARAM7.ROWNAMANNPRO~~) AND (NUMERO_PROPOSTA = ~~TBL_PARAM7.ROWNAMNUMPRO~~) AND (UNITA_PROPONENTE = ~~TBL_PARAM7.ROWNAMUNIPRO~~))) OR (~~TBL_PARAM7.ROWNAMPROINS~~ IS NULL)) and ((~~TBL_PARAM7.ROWNAMDELINS~~ = 'SI' AND ((ANNO_DEL = ~~TBL_PARAM7.ROWNAMANNDEL~~) AND (NUMERO_DEL = ~~TBL_PARAM7.ROWNAMNUMDEL~~) AND (SEDE_DEL = ~~TBL_PARAM7.ROWNAMSEDDEL~~))) OR (~~TBL_PARAM7.ROWNAMDELINS~~ IS NULL)) and (TIPO_VAR IN    (   select     B.CODICE   from     T54 B,     TIPI_MOTIVAZIONE_VBIL C   where (B.TIPOLOGIA = C.CODICE)   and   (C.TIPO_QUADRATURA = ~~TBL_PARAM7.ROWNAMTIPQUA~~)   and   (B.TIPOLOGIA = ~~TBL_PARAM7.ROWNAMETIPOL~~)   ))");
    PAN_VARIAZDEFINI.AddToSortList(PFL_VARIAZDEFINI_PARTE, true);
    PAN_VARIAZDEFINI.AddToSortList(PFL_VARIAZDEFINI_CAPITOLO2, true);
    PAN_VARIAZDEFINI.AddToSortList(PFL_VARIAZDEFINI_ARTICOLO2, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_VARIAZDEFINI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZDEFINI.iUseListQBE;
      PAN_VARIAZDEFINI.iUseListQBE = 0;
      PAN_VARIAZDEFINI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZDEFINI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZDEFINI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PLURIENNALI_Init()
  {

    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, "EF62BEC7-B518-42A2-B229-80C25A925D0C");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, "Esercizio");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, "33C7BCDD-253F-461C-9746-C07CB682F536");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, "E S");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, "Brief description of field content.");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, 0, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, "7D234DB8-F8BC-42F0-AF8B-AFEB87AFE49A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, "PROGRESSIVO PRIMA VAR");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.VIS_FOREIKEYFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, "FFFC6E94-6E19-4792-8062-B83C1DEB134E");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, "Importo");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, "301A265A-0C71-4F9C-9100-689FE50D4ED3");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, "CAPITOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, 0, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, "049E7388-ECFA-4610-908D-6ACED44963DA");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, "ARTICOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, 0, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, "C9988D2B-AEF3-4E33-8DAC-86F9D9C465FE");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, "DESCRIZIONE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, 0 | MyGlb.FLD_ISDESCR, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, "D115EA72-34B3-4CED-B259-A33BF5C126E1");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, "TIPO VAR");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, 0, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, "FF18EC9D-C84A-49C4-8C86-C92C0B68247A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, "Label Cap Art");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, MyGlb.VIS_VUOGRAALILEF);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, "3D0FD10A-2F8A-4553-B93A-2A687F358F6A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, "DUAL Copia Importo");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.VIS_HYPELINKIMMA);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "4068C0E1-5E4E-4304-BF7E-13564B28220F");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "PROGETTO ID");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, "CE7F4F92-6C47-4F39-B0CC-3235462A3DAE");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, "FINANZIAMENTO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, "F6B8480F-BFD0-4885-B34F-6798C578A8BE");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, "OPERA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, "B4D747CF-B3DA-4BD7-8075-3AB4961D3C65");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, "ISTITUZIONE NC");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, "E6104CC3-65CC-45D0-B494-504691773FA8");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, "B3678FB1-3DE5-448B-8262-62F26397E06C");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, "PROGRESSIVO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "5E395C3C-A42D-4FC9-967C-8D0E26B53D76");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "558A374C-EE51-49B6-90C4-3691B3A188F7");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "6CE565CD-6830-414E-A7D4-3C1EF6ECB9B9");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "6BED4D97-400B-4248-AD3E-CCB50C58ABB1");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "ANNO DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "1BFF2423-8560-456F-81E4-A4AA64A27BB7");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "NUMERO DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "20EB8D15-1E60-47F3-8B6C-32A5C53EB9E6");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "SEDE DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PLURIENNALI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_LIST, 8, 72, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_FORM, 212, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_FORM, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCIZIO2, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ESERCIZIO2, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ESERCIZIO2, PPQRY_VARCOMPRO10, "ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_LIST, 76, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_LIST, 24);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_LIST, "E S");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_FORM, 332, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_FORM, 40);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ES1, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ES1, PPQRY_VARCOMPRO10, "E_S", "ES", 5, 1, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_ES1, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_ES1, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_LIST, 156);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_LIST, "PROGRESSIVO PRIMA VAR");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_FORM, 4, 196, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_FORM, 156);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRPRIMVAR, MyGlb.PANEL_FORM, "PROGRESSIVO PRIMA VAR");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PROGRPRIMVAR, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PROGRPRIMVAR, PPQRY_VARCOMPRO10, "PROGRESSIVO_PRIMA_VAR", "PROGRPRIMVAR", 1, 10, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_LIST, 76, 72, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_FORM, 4, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_IMPORTO1, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_IMPORTO1, PPQRY_VARCOMPRO10, "IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_LIST, 168, 68, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_LIST, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO3, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CAPITOLO3, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CAPITOLO3, PPQRY_VARCOMPRO10, "CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_LIST, 256, 68, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_LIST, "ARTICOLO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_FORM, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO3, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ARTICOLO3, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ARTICOLO3, PPQRY_VARCOMPRO10, "ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_LIST, 324, 68, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_LIST, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_LIST, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_FORM, 4, 100, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_FORM, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_FORM, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE3, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_DESCRIZIONE3, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_DESCRIZIONE3, PPQRY_VARCOMPRO10, "DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_LIST, 680, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_LIST, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_LIST, "TIPO VAR");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_FORM, 4, 136, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVAR1, MyGlb.PANEL_FORM, "TIPO VAR");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_TIPOVAR1, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_TIPOVAR1, PPQRY_VARCOMPRO10, "TIPO_VAR", "TIPOVAR", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, MyGlb.PANEL_LIST, 8, 8, 304, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, MyGlb.PANEL_LIST, 0);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, MyGlb.PANEL_FORM, 272, 68, 304, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, MyGlb.PANEL_FORM, 0);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ETILABCAPART, MyGlb.PANEL_FORM, 3);
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ETILABCAPART, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ETILABCAPART, -1, "", "ETILABCAPART", 0, 0, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_LIST, 192, 72, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_LIST, 124);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_LIST, "D. C. I.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_FORM, 124);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DUALCOPIIMPO, MyGlb.PANEL_FORM, "DUAL Copia Importo");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_DUALCOPIIMPO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_DUALCOPIIMPO, PPQRY_DUAL, "'G'", "DUALCOPIIMPO", 5, 1, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_DUALCOPIIMPO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, "PROGETTO ID");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PROGETTOID, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PROGETTOID, PPQRY_VARCOMPRO10, "PROGETTO_ID", "PROGETTOID", 5, 9, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_FINANZIAMENT, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_FINANZIAMENT, PPQRY_VARCOMPRO10, "FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_FORM, 4, 76, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_OPERA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_OPERA, PPQRY_VARCOMPRO10, "OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_LIST, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_LIST, "ISTITUZIONE NC");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_FORM, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ISTITUZIONNC, MyGlb.PANEL_FORM, "ISTITUZIONE NC");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ISTITUZIONNC, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ISTITUZIONNC, PPQRY_VARCOMPRO10, "ISTITUZIONE_NC", "ISTITUZIONNC", 5, 2, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_ISTITUZIONNC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_ISTITUZIONNC, (new IDVariant()), "Null", "", "", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_LIST, 216, 72, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 28, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PROGUNITORGA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PROGUNITORGA, PPQRY_VARCOMPRO10, "PROGR_UNITA_ORGANIZZATIVA", "PROGUNITORGA", 1, 8, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_LIST, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_FORM, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGRESSIVO3, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PROGRESSIVO3, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PROGRESSIVO3, PPQRY_VARCOMPRO10, "PROGRESSIVO", "PROGRESSIVO", 1, 10, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANNO PROPOSTA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANNO PROPOSTA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNOPROPOSTA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNOPROPOSTA, PPQRY_VARCOMPRO10, "ANNO_PROPOSTA", "ANNOPROPOSTA", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 52, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, "UNITA PROPONENTE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_UNITAPROPONE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_UNITAPROPONE, PPQRY_VARCOMPRO10, "UNITA_PROPONENTE", "UNITAPROPONE", 5, 255, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUMERO PROPOSTA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 76, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUMERO PROPOSTA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMEROPROPOS, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMEROPROPOS, PPQRY_VARCOMPRO10, "NUMERO_PROPOSTA", "NUMEROPROPOS", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 4, 100, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNODEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNODEL, PPQRY_VARCOMPRO10, "ANNO_DEL", "ANNODEL", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 4, 124, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, "NUMERO DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMERODEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMERODEL, PPQRY_VARCOMPRO10, "NUMERO_DEL", "NUMERODEL", 1, 6, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_SEDEDEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_SEDEDEL, PPQRY_VARCOMPRO10, "SEDE_DEL", "SEDEDEL", 5, 255, 0, -13997);
  }

  private void PAN_PLURIENNALI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_QUERY, 3);
    PAN_PLURIENNALI.SetDocumentClass(PPQRY_LOOKUPVARCOM, "VarDef");
    PAN_PLURIENNALI.AddLookupParam(PPQRY_LOOKUPVARCOM, IMDBDef12.PQRY_VARCOMPRO10, IMDBDef12.PQSL_VARCOMPRO10_PROGRPRIMVAR, "PROGRESSIVO", false);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'G' as DUALCOPIIMPO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PLURIENNALI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_PLURIENNALI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PLURIENNALI.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_PLURIENNALI.SetIMDB(IMDB, "PQRY_VARCOMPRO10", true);
    PAN_PLURIENNALI.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOMPRO");
    PAN_PLURIENNALI.SetDocumentClass(0, "VarDef");
    PAN_PLURIENNALI.AddDOSortCriteria(VarDef.VARDEF_ESERCIZIO);
    PAN_PLURIENNALI.AddToSortList(PFL_PLURIENNALI_ESERCIZIO2, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_PLURIENNALI.Status() == 2)
    {
      int oldListQBE = PAN_PLURIENNALI.iUseListQBE;
      PAN_PLURIENNALI.iUseListQBE = 0;
      PAN_PLURIENNALI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PLURIENNALI.PanelCommand(Glb.PCM_FIND);
      PAN_PLURIENNALI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_POSPARS_Init()
  {

    PAN_POSPARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_POSPARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_POSPARS.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_POSPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, "2D13BCE7-C139-42B6-AAE2-FEA18A3016A8");
    PAN_POSPARS.set_Header(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, "Parte");
    PAN_POSPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, "");
    PAN_POSPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_POSPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_POSPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, "877402DF-202D-48A8-A131-B5311B46C7D2");
    PAN_POSPARS.set_Header(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, "Capitolo/Art.");
    PAN_POSPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, "");
    PAN_POSPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_POSPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_POSPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, "5393CD1B-8442-4B20-8CE9-806EE252F31A");
    PAN_POSPARS.set_Header(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, "/");
    PAN_POSPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, "");
    PAN_POSPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_POSPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_POSPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, "87E1C184-6FAB-4B99-B093-DA8315950028");
    PAN_POSPARS.set_Header(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, "");
    PAN_POSPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_POSPARS.SetImage(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, 0, "wsearch1.gif", false);
    PAN_POSPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_POSPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, "D3EB8CC6-751B-4506-8E27-5A7467BE1DA7");
    PAN_POSPARS.set_Header(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, "Trova");
    PAN_POSPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, MyGlb.VIS_STATICBUTTON);
    PAN_POSPARS.SetImage(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, 0, "button1.gif", false);
    PAN_POSPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_POSPARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_LIST, 24);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_LIST, 1);
    PAN_POSPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_FORM, 72);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_FORM, 1);
    PAN_POSPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POSPARS_ES, MyGlb.PANEL_FORM, "Parte");
    PAN_POSPARS.SetFieldPage(PFL_POSPARS_ES, -1, -1);
    PAN_POSPARS.SetFieldPanel(PFL_POSPARS_ES, PPQRY_POSPARS2, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_POSPARS.SetValueListItem(PFL_POSPARS_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_POSPARS.SetValueListItem(PFL_POSPARS_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_LIST, 56);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_POSPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo Art");
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_FORM, 212, 4, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_POSPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POSPARS_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_POSPARS.SetFieldPage(PFL_POSPARS_CAPITOLO, -1, -1);
    PAN_POSPARS.SetFieldPanel(PFL_POSPARS_CAPITOLO, PPQRY_POSPARS2, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_LIST, 52);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_POSPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_LIST, "/");
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_FORM, 436, 4, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_FORM, 16);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_POSPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POSPARS_ARTICOLO, MyGlb.PANEL_FORM, "/");
    PAN_POSPARS.SetFieldPage(PFL_POSPARS_ARTICOLO, -1, -1);
    PAN_POSPARS.SetFieldPanel(PFL_POSPARS_ARTICOLO, PPQRY_POSPARS2, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, MyGlb.PANEL_LIST, 484, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, MyGlb.PANEL_LIST, 0);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, MyGlb.PANEL_LIST, 1);
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, MyGlb.PANEL_FORM, 480, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, MyGlb.PANEL_FORM, 0);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHSCELCAP, MyGlb.PANEL_FORM, 1);
    PAN_POSPARS.SetFieldPage(PFL_POSPARS_ETICHSCELCAP, -1, -1);
    PAN_POSPARS.SetFieldPanel(PFL_POSPARS_ETICHSCELCAP, -1, "", "ETICHSCELCAP", 0, 0, 0, -13997);
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, MyGlb.PANEL_LIST, 520, 8, 108, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, MyGlb.PANEL_LIST, 0);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, MyGlb.PANEL_LIST, 1);
    PAN_POSPARS.SetRect(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, MyGlb.PANEL_FORM, 504, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POSPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, MyGlb.PANEL_FORM, 0);
    PAN_POSPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_POSPARS_ETICHETTROVA, MyGlb.PANEL_FORM, 1);
    PAN_POSPARS.SetFieldPage(PFL_POSPARS_ETICHETTROVA, -1, -1);
    PAN_POSPARS.SetFieldPanel(PFL_POSPARS_ETICHETTROVA, -1, "", "ETICHETTROVA", 0, 0, 0, -13997);
  }

  private void PAN_POSPARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_POSPARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_POSPARS.SetIMDB(IMDB, "PQRY_POSPARS2", true);
    PAN_POSPARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_POSPARS.SetQueryIMDB(PPQRY_POSPARS2, IMDBDef12.PQRY_POSPARS2_RS, IMDBDef3.TBL_POSPARS3);
    JustLoaded = true;
    PAN_POSPARS.SetFieldPrimaryIndex(PFL_POSPARS_ES, IMDBDef3.FLD_POSPARS3_NOMEOGGETTES);
    PAN_POSPARS.SetFieldPrimaryIndex(PFL_POSPARS_CAPITOLO, IMDBDef3.FLD_POSPARS3_NOMEOGGECAPI);
    PAN_POSPARS.SetFieldPrimaryIndex(PFL_POSPARS_ARTICOLO, IMDBDef3.FLD_POSPARS3_NOMEOGGEARTI);
    PAN_POSPARS.SetMasterTable(0, "POSPARS3");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_POSPARS.Status() == 2)
    {
      int oldListQBE = PAN_POSPARS.iUseListQBE;
      PAN_POSPARS.iUseListQBE = 0;
      PAN_POSPARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_POSPARS.PanelCommand(Glb.PCM_FIND);
      PAN_POSPARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_POSPARS) PAN_POSPARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_ValidateRow(Cancel);
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_ValidateRow(Cancel);
    if (SrcObj == PAN_POSPARS) PAN_POSPARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_DynamicProperties();
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_DynamicProperties();
    if (SrcObj == PAN_POSPARS) PAN_POSPARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_POSPARS) PAN_POSPARS_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_OnChangeRow();
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
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VARIAZDEFINI) PAN_VARIAZDEFINI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_POSPARS) PAN_POSPARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_NUOVTABBVIEW) TAB_NUOVTABBVIEW_Click(PreviousPage, Cancel);
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
