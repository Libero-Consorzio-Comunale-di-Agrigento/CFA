// **********************************************
// Scheda Composizione FPV Entrata
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedaComposizioneFPVEntrata extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ESERCIZIPLU1 = 0;
  private static int PFL_PARAMETRI_CAPITOLPARAM = 1;
  private static int PFL_PARAMETRI_ARTICOLPARAM = 2;
  private static int PFL_PARAMETRI_TIPOSTANZIAM = 3;
  private static int PFL_PARAMETRI_CAPITOLFONDO = 4;
  private static int PFL_PARAMETRI_ARTICOLFONDO = 5;
  private static int PFL_PARAMETRI_TOPEANMIPRES = 6;
  private static int PFL_PARAMETRI_TOPEANMIPRCR = 7;

  private static int PPQRY_PARAMETRI498 = 0;

  private static int PPQRY_BIL1 = 1;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_TAB;
  private static int PFL_CAPITOLI_CAPITOLO2 = 0;
  private static int PFL_CAPITOLI_ARTICOLO2 = 1;
  private static int PFL_CAPITOLI_DESCRIZIOCAP = 2;
  private static int PFL_CAPITOLI_STNINICO = 3;
  private static int PFL_CAPITOLI_VARIAZIONICO = 4;
  private static int PFL_CAPITOLI_STANZATTUALE = 5;
  private static int PFL_CAPITOLI_ETICHETOTALE = 6;
  private static int PFL_CAPITOLI_TOTALEDAESI2 = 7;

  private static int PPQRY_CAP1 = 0;


  IDPanel PAN_CAPITOLI;
  private static int GRP_DAESIGIBILIT_IMPEGNO = 0;
  private static int GRP_DAESIGIBILIT_IMPPROVENIEN = 1;
  private static int GRP_DAESIGIBILIT_MISSIONE1 = 2;
  private static int GRP_DAESIGIBILIT_PROGRAMMA2 = 3;

  private static int PFL_DAESIGIBILIT_CAPITOLOFPV1 = 0;
  private static int PFL_DAESIGIBILIT_ARTICOLOFPV1 = 1;
  private static int PFL_DAESIGIBILIT_DESCRIZIOFP1 = 2;
  private static int PFL_DAESIGIBILIT_ANNOESIGIBIL = 3;
  private static int PFL_DAESIGIBILIT_ANNOENTRATA = 4;
  private static int PFL_DAESIGIBILIT_CAPITOLO3 = 5;
  private static int PFL_DAESIGIBILIT_ARTICOLO3 = 6;
  private static int PFL_DAESIGIBILIT_INFOCAPITOLO = 7;
  private static int PFL_DAESIGIBILIT_DESCRIZIONE1 = 8;
  private static int PFL_DAESIGIBILIT_NUMEROIMP = 9;
  private static int PFL_DAESIGIBILIT_ANNOIMP = 10;
  private static int PFL_DAESIGIBILIT_INFOIMPEGNO = 11;
  private static int PFL_DAESIGIBILIT_IMPORTO1 = 12;
  private static int PFL_DAESIGIBILIT_DDATAREG1 = 13;
  private static int PFL_DAESIGIBILIT_NUMERIMPPROV = 14;
  private static int PFL_DAESIGIBILIT_ANNOIMPPROVE = 15;
  private static int PFL_DAESIGIBILIT_INFOIMPEPROV = 16;
  private static int PFL_DAESIGIBILIT_ANNOENTRPROV = 17;
  private static int PFL_DAESIGIBILIT_BILVAR1 = 18;
  private static int PFL_DAESIGIBILIT_INFOBILVAR = 19;
  private static int PFL_DAESIGIBILIT_CODICEUO1 = 20;
  private static int PFL_DAESIGIBILIT_DESCRIZIONUO = 21;
  private static int PFL_DAESIGIBILIT_ANNOIMPEPADR = 22;
  private static int PFL_DAESIGIBILIT_MISSIONE2 = 23;
  private static int PFL_DAESIGIBILIT_DESMISSIONE2 = 24;
  private static int PFL_DAESIGIBILIT_PROGRAMMA2 = 25;
  private static int PFL_DAESIGIBILIT_DESPROGRAMM2 = 26;
  private static int PFL_DAESIGIBILIT_ETICHETOTAL1 = 27;
  private static int PFL_DAESIGIBILIT_TOTALEDAESI1 = 28;
  private static int PFL_DAESIGIBILIT_PROGRESSIVO1 = 29;
  private static int PFL_DAESIGIBILIT_CODICESTRUTT = 30;
  private static int PFL_DAESIGIBILIT_PROGUNITORG1 = 31;

  private static int PPQRY_FPVDAESIG1 = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_UNITAORGANIZ = 2;


  IDPanel PAN_DAESIGIBILIT;
  private static int GRP_DAESITOTMIPR_MISSIONE2 = 0;
  private static int GRP_DAESITOTMIPR_PROGRAMMA3 = 1;

  private static int PFL_DAESITOTMIPR_IMPORTO2 = 0;
  private static int PFL_DAESITOTMIPR_MISSIONE1 = 1;
  private static int PFL_DAESITOTMIPR_DESMISSIONE1 = 2;
  private static int PFL_DAESITOTMIPR_PROGRAMMA1 = 3;
  private static int PFL_DAESITOTMIPR_DESPROGRAMM1 = 4;
  private static int PFL_DAESITOTMIPR_TOTALEDAESIG = 5;

  private static int PPQRY_FPVDAESIG = 0;

  private static int PPQRY_DUAL2 = 1;


  IDPanel PAN_DAESITOTMIPR;
  private static int GRP_DACRONOPROGR_OPERAPROGET1 = 0;
  private static int GRP_DACRONOPROGR_FINANZIAMEN1 = 1;
  private static int GRP_DACRONOPROGR_MISSIONE3 = 2;
  private static int GRP_DACRONOPROGR_PROGRAMMA4 = 3;

  private static int PFL_DACRONOPROGR_CRONOPROGRID = 0;
  private static int PFL_DACRONOPROGR_VARCOMPROGRE = 1;
  private static int PFL_DACRONOPROGR_CAPITOLOFPV = 2;
  private static int PFL_DACRONOPROGR_ARTICOLOFPV = 3;
  private static int PFL_DACRONOPROGR_DESCRIZIOFPV = 4;
  private static int PFL_DACRONOPROGR_CAPITOLO = 5;
  private static int PFL_DACRONOPROGR_ARTICOLO = 6;
  private static int PFL_DACRONOPROGR_DESCRIZIONE = 7;
  private static int PFL_DACRONOPROGR_OPERA = 8;
  private static int PFL_DACRONOPROGR_DESCRIZOPERA = 9;
  private static int PFL_DACRONOPROGR_ESERCIZIPLUR = 10;
  private static int PFL_DACRONOPROGR_IMPORTO3 = 11;
  private static int PFL_DACRONOPROGR_DDATAREG = 12;
  private static int PFL_DACRONOPROGR_BILVAR = 13;
  private static int PFL_DACRONOPROGR_INFOVARBIL = 14;
  private static int PFL_DACRONOPROGR_CODICEUO = 15;
  private static int PFL_DACRONOPROGR_CAPUOUNITORG = 16;
  private static int PFL_DACRONOPROGR_ANNOFINANZ = 17;
  private static int PFL_DACRONOPROGR_FINANZIAMENT = 18;
  private static int PFL_DACRONOPROGR_FINANZDESCRI = 19;
  private static int PFL_DACRONOPROGR_MISSIONE3 = 20;
  private static int PFL_DACRONOPROGR_DESMISSIONE3 = 21;
  private static int PFL_DACRONOPROGR_PROGRAMMA3 = 22;
  private static int PFL_DACRONOPROGR_DESPROGRAMM3 = 23;
  private static int PFL_DACRONOPROGR_ETICHETOTAL3 = 24;
  private static int PFL_DACRONOPROGR_TOTALDACRON1 = 25;
  private static int PFL_DACRONOPROGR_PROGUNITORGA = 26;

  private static int PPQRY_FPVDACRONO1 = 0;

  private static int PPQRY_CAPUO = 1;
  private static int PPQRY_DUAL3 = 2;
  private static int PPQRY_FINANZIAMENT = 3;


  IDPanel PAN_DACRONOPROGR;
  private static int GRP_DACROTOTMIPR_OPERAPROGETT = 0;
  private static int GRP_DACROTOTMIPR_FINANZIAMENT = 1;
  private static int GRP_DACROTOTMIPR_MISSIONE = 2;
  private static int GRP_DACROTOTMIPR_PROGRAMMA = 3;

  private static int PFL_DACROTOTMIPR_IMPORTO = 0;
  private static int PFL_DACROTOTMIPR_MISSIONE = 1;
  private static int PFL_DACROTOTMIPR_DESMISSIONE = 2;
  private static int PFL_DACROTOTMIPR_PROGRAMMA = 3;
  private static int PFL_DACROTOTMIPR_DESPROGRAMMA = 4;
  private static int PFL_DACROTOTMIPR_TOTALDACRONO = 5;

  private static int PPQRY_FPVDACRONO = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_DACROTOTMIPR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI190(IMDB);
    //
    //
    Init_PQRY_PARAMETRI498(IMDB);
    Init_PQRY_PARAMETRI498_RS(IMDB);
    Init_PQRY_CAP1(IMDB);
    Init_PQRY_FPVDAESIG1(IMDB);
    Init_PQRY_FPVDAESIG(IMDB);
    Init_PQRY_FPVDACRONO1(IMDB);
    Init_PQRY_FPVDACRONO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI190(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI190, 6);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI190, "TBL_PARAMETRI190");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGCAPPAR, "NOMOGGCAPPAR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGCAPPAR,3,16,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGARTPAR, "NOMOGGARTPAR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGARTPAR,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPE, "NOOGTOPEAMPE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPC, "NOOGTOPEAMPC");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPC,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI190,IMDBDef7.FLD_PARAMETRI190_NOMOGGTIPSTA,5,1,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI190, 0);
  }

  private static void Init_PQRY_PARAMETRI498(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI498, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI498, "PQRY_PARAMETRI498");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGCAPPAR, "NOMOGGCAPPAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGCAPPAR,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGARTPAR, "NOMOGGARTPAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGARTPAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPE, "NOOGTOPEAMPE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPC, "NOOGTOPEAMPC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPC,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498,IMDBDef17.PQSL_PARAMETRI498_NOMOGGTIPSTA,5,1,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI498, 0);
  }

  private static void Init_PQRY_PARAMETRI498_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI498_RS, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI498_RS, "PQRY_PARAMETRI498_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGCAPPAR, "NOMOGGCAPPAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGCAPPAR,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGARTPAR, "NOMOGGARTPAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGARTPAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPE, "NOOGTOPEAMPE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPC, "NOOGTOPEAMPC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPC,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI498_RS,IMDBDef17.PQSL_PARAMETRI498_NOMOGGTIPSTA,5,1,0);
  }

  private static void Init_PQRY_CAP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CAP1, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_CAP1, "PQRY_CAP1");
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECORCAPCAPI, "RECORCAPCAPI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECORCAPCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECORCAPARTI, "RECORCAPARTI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECORCAPARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECORCAPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECBILSTINCO, "RECBILSTINCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECBILSTINCO,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECOBILVARCO, "RECOBILVARCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_RECOBILVARCO,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_STANZATTUALE, "STANZATTUALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP1,IMDBDef17.PQSL_CAP1_STANZATTUALE,2,19,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CAP1, 0);
  }

  private static void Init_PQRY_FPVDAESIG1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FPVDAESIG1, 22);
    IMDB.set_TblCode(IMDBDef17.PQRY_FPVDAESIG1, "PQRY_FPVDAESIG1");
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_CAPITOLOFPV, "CAPITOLOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_CAPITOLOFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_ARTICOLOFPV, "ARTICOLOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_ARTICOLOFPV,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_DESCRIZIOFPV, "DESCRIZIOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_DESCRIZIOFPV,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESENUI, "REFPDAESENUI");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESENUI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEANI, "REFPDAESEANI");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEANI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESECA, "RECFPDAESECA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESECA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESEAR, "RECFPDAESEAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESEAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEDEC, "REFPDAESEDEC");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEDEC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEAN1, "REFPDAESEAN1");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEAN1,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESEIM, "RECFPDAESEIM");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESEIM,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEDDR, "REFPDAESEDDR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEDDR,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESENIP, "REFPDAESENIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESENIP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEAIP, "REFPDAESEAIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEAIP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECORDBILVAR, "RECORDBILVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECORDBILVAR,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEPRV, "REFPDAESEPRV");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEPRV,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_ANNOIMPEPADR, "ANNOIMPEPADR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_ANNOIMPEPADR,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECORDMISSIO, "RECORDMISSIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_RECORDMISSIO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_PROGRAMMA,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESECOS, "REFPDAESECOS");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESECOS,5,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEPUO, "REFPDAESEPUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEPUO,1,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEANE, "REFPDAESEANE");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEANE,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESANEP, "REFPDAESANEP");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG1,IMDBDef17.PQSL_FPVDAESIG1_REFPDAESANEP,1,4,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FPVDAESIG1, 0);
  }

  private static void Init_PQRY_FPVDAESIG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FPVDAESIG, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_FPVDAESIG, "PQRY_FPVDAESIG");
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG,IMDBDef17.PQSL_FPVDAESIG_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG,IMDBDef17.PQSL_FPVDAESIG_IMPORTO,2,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG,IMDBDef17.PQSL_FPVDAESIG_RECORDMISSIO, "RECORDMISSIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG,IMDBDef17.PQSL_FPVDAESIG_RECORDMISSIO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDAESIG,IMDBDef17.PQSL_FPVDAESIG_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDAESIG,IMDBDef17.PQSL_FPVDAESIG_PROGRAMMA,5,99,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FPVDAESIG, 0);
  }

  private static void Init_PQRY_FPVDACRONO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FPVDACRONO1, 19);
    IMDB.set_TblCode(IMDBDef17.PQRY_FPVDACRONO1, "PQRY_FPVDACRONO1");
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_CAPITOLOFPV, "CAPITOLOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_CAPITOLOFPV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_ARTICOLOFPV, "ARTICOLOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_ARTICOLOFPV,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_DESCRIZIOFPV, "DESCRIZIOFPV");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_DESCRIZIOFPV,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRCRID, "REFPDACRCRID");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRCRID,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRCA, "RECFPVDACRCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRAR, "RECFPVDACRAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRDECC, "REFPDACRDECC");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRDECC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACROP, "RECFPVDACROP");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACROP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECOOPERDESC, "RECOOPERDESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECOOPERDESC,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRESPL, "REFPDACRESPL");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRESPL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRIM, "RECFPVDACRIM");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRIM,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRDAVA, "REFPDACRDAVA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRDAVA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECORDBILVAR, "RECORDBILVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECORDBILVAR,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRPRVA, "REFPDACRPRVA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRPRVA,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRFI, "RECFPVDACRFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRFI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRANFI, "REFPDACRANFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_REFPDACRANFI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECORDMISSIO, "RECORDMISSIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECORDMISSIO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECORDPROGRA, "RECORDPROGRA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECORDPROGRA,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECPROUNIORG, "RECPROUNIORG");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO1,IMDBDef17.PQSL_FPVDACRONO1_RECPROUNIORG,1,8,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FPVDACRONO1, 0);
  }

  private static void Init_PQRY_FPVDACRONO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FPVDACRONO, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_FPVDACRONO, "PQRY_FPVDACRONO");
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO,IMDBDef17.PQSL_FPVDACRONO_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO,IMDBDef17.PQSL_FPVDACRONO_IMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO,IMDBDef17.PQSL_FPVDACRONO_RECORDMISSIO, "RECORDMISSIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO,IMDBDef17.PQSL_FPVDACRONO_RECORDMISSIO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FPVDACRONO,IMDBDef17.PQSL_FPVDACRONO_RECORDPROGRA, "RECORDPROGRA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FPVDACRONO,IMDBDef17.PQSL_FPVDACRONO_RECORDPROGRA,5,99,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FPVDACRONO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedaComposizioneFPVEntrata(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedaComposizioneFPVEntrata()
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
    FormIdx = MyGlb.FRM_SCHCOMFPVENT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "38607F6F-1C54-4D22-8959-83DB7E8E5A82";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1040;
    DesignHeight = 510;
    set_Caption(new IDVariant("Scheda Composizione Fondo Pluriennale Vincolato Entrata"));
    //
    Frames = new AFrame[9];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1040;
    Frames[1].Height = 484;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.132231;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1040;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1040;
    Frames[2].FixedHeight = 64;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BE12C784-3F6E-4654-9E73-0F5C65E38D6E");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1040;
    Frames[3].Height = 420;
    Frames[3].Caption = "Tab";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 420;
    TAB_TAB = new OTabView(this);
    Frames[3].Content = TAB_TAB;
    TAB_TAB.iGuid = "B79BA00B-03C7-4CC1-8CCD-3870655F4C39";
    TAB_TAB.SetItemCount(5);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Capitoli";
    Frames[4].Parent = this;
    PAN_CAPITOLI = new IDPanel(w, this, 4, "PAN_CAPITOLI");
    Frames[4].Content = PAN_CAPITOLI;
    PAN_CAPITOLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPITOLI.VS = MainFrm.VisualStyleList;
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DA6796D3-FD8F-4FFD-AAB5-8C30E0B5D753");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 716, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPITOLI.InitStatus = 2;
    PAN_CAPITOLI_Init();
    PAN_CAPITOLI_InitFields();
    PAN_CAPITOLI_InitQueries();
    TAB_TAB.SetItem(1, Frames[4], 0, "", "Capitoli", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "da Esigibilità";
    Frames[5].Parent = this;
    PAN_DAESIGIBILIT = new IDPanel(w, this, 5, "PAN_DAESIGIBILIT");
    Frames[5].Content = PAN_DAESIGIBILIT;
    PAN_DAESIGIBILIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DAESIGIBILIT.VS = MainFrm.VisualStyleList;
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CD81F65F-1440-42DA-B6C3-B0A29D1D14D0");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1668, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DAESIGIBILIT.InitStatus = 2;
    PAN_DAESIGIBILIT_Init();
    PAN_DAESIGIBILIT_InitFields();
    PAN_DAESIGIBILIT_InitQueries();
    TAB_TAB.SetItem(2, Frames[5], 0, "", "da Esigibilita", "");
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[6].InTabbed = true;
    Frames[6].Caption = "da Esigibilità";
    Frames[6].Parent = this;
    PAN_DAESITOTMIPR = new IDPanel(w, this, 6, "PAN_DAESITOTMIPR");
    Frames[6].Content = PAN_DAESITOTMIPR;
    PAN_DAESITOTMIPR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DAESITOTMIPR.VS = MainFrm.VisualStyleList;
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "656E5028-5EA5-4207-B34B-904587B28323");
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 536, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DAESITOTMIPR.InitStatus = 2;
    PAN_DAESITOTMIPR_Init();
    PAN_DAESITOTMIPR_InitFields();
    PAN_DAESITOTMIPR_InitQueries();
    TAB_TAB.SetItem(3, Frames[6], 0, "", "da Esigibilita Tot Mis Prog", "");
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[7].InTabbed = true;
    Frames[7].Caption = "da Cronoprogramma";
    Frames[7].Parent = this;
    PAN_DACRONOPROGR = new IDPanel(w, this, 7, "PAN_DACRONOPROGR");
    Frames[7].Content = PAN_DACRONOPROGR;
    PAN_DACRONOPROGR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DACRONOPROGR.VS = MainFrm.VisualStyleList;
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "52B75DFB-59FF-4745-B9A7-0F5DDCBC8952");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1680, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DACRONOPROGR.InitStatus = 2;
    PAN_DACRONOPROGR_Init();
    PAN_DACRONOPROGR_InitFields();
    PAN_DACRONOPROGR_InitQueries();
    TAB_TAB.SetItem(4, Frames[7], 0, "", "da Cronoprogramma", "");
    Frames[8] = new AFrame(8);
    Frames[8].Parent = this;
    Frames[8].InTabbed = true;
    Frames[8].Caption = "da Cronoprogramma";
    Frames[8].Parent = this;
    PAN_DACROTOTMIPR = new IDPanel(w, this, 8, "PAN_DACROTOTMIPR");
    Frames[8].Content = PAN_DACROTOTMIPR;
    PAN_DACROTOTMIPR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DACROTOTMIPR.VS = MainFrm.VisualStyleList;
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9AE80636-38E3-49B6-8ABB-D90725610637");
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 536, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DACROTOTMIPR.InitStatus = 2;
    PAN_DACROTOTMIPR_Init();
    PAN_DACROTOTMIPR_InitFields();
    PAN_DACROTOTMIPR_InitQueries();
    TAB_TAB.SetItem(5, Frames[8], 0, "", "da Cronoprogramma Tot Mis Prog", "");
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI190, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCHCOMFPVENT_PARAMETRI498();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_CAPITOLI.UpdatePanel(MainFrm);
      PAN_DAESIGIBILIT.UpdatePanel(MainFrm);
      PAN_DAESITOTMIPR.UpdatePanel(MainFrm);
      PAN_DACRONOPROGR.UpdatePanel(MainFrm);
      PAN_DACROTOTMIPR.UpdatePanel(MainFrm);
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
    return (obj instanceof SchedaComposizioneFPVEntrata);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedaComposizioneFPVEntrata.class.getName() : (Glb.ClassWithPackage(SchedaComposizioneFPVEntrata.class) ? SchedaComposizioneFPVEntrata.class.getName().substring(SchedaComposizioneFPVEntrata.class.getPackage().getName().length() + 1) : SchedaComposizioneFPVEntrata.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TOPEANMIPRES)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI498, IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPE, 0).equals((new IDVariant("SI")), true))
        {
          PAN_DAESITOTMIPR.set_Visible((new IDVariant(-1)).booleanValue());
          if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DAESIGIBILIT.FrIndex)), true))
          {
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DAESITOTMIPR.FrIndex)).intValue()); 
          }
          PAN_DAESIGIBILIT.set_Visible((new IDVariant(0)).booleanValue());
        }
        else
        {
          PAN_DAESIGIBILIT.set_Visible((new IDVariant(-1)).booleanValue());
          if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DAESITOTMIPR.FrIndex)), true))
          {
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DAESIGIBILIT.FrIndex)).intValue()); 
          }
          PAN_DAESITOTMIPR.set_Visible((new IDVariant(0)).booleanValue());
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TOPEANMIPRCR)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI498, IMDBDef17.PQSL_PARAMETRI498_NOOGTOPEAMPC, 0).equals((new IDVariant("SI")), true))
        {
          PAN_DACROTOTMIPR.set_Visible((new IDVariant(-1)).booleanValue());
          if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DACRONOPROGR.FrIndex)), true))
          {
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DACROTOTMIPR.FrIndex)).intValue()); 
          }
          PAN_DACRONOPROGR.set_Visible((new IDVariant(0)).booleanValue());
        }
        else
        {
          PAN_DACRONOPROGR.set_Visible((new IDVariant(-1)).booleanValue());
          if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DACROTOTMIPR.FrIndex)), true))
          {
            TAB_TAB.SelectFrameByIndex((new IDVariant(PAN_DACRONOPROGR.FrIndex)).intValue()); 
          }
          PAN_DACROTOTMIPR.set_Visible((new IDVariant(0)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "ParametriOnUpdatingRow", _e);
    }
  }

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
      if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DAESIGIBILIT.FrIndex)), true) || new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DAESITOTMIPR.FrIndex)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DACRONOPROGR.FrIndex)), true) || new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_DACROTOTMIPR.FrIndex)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "TabChangePage", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGESEPLU, 0)))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGESEPLU, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGTIPSTA, 0, (new IDVariant("E")));
      PAN_DAESIGIBILIT.set_Visible((new IDVariant(-1)).booleanValue());
      PAN_DACRONOPROGR.set_Visible((new IDVariant(-1)).booleanValue());
      PAN_DAESITOTMIPR.set_Visible((new IDVariant(0)).booleanValue());
      PAN_DACROTOTMIPR.set_Visible((new IDVariant(0)).booleanValue());
      PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_DACRONOPROGR.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "Load", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGESEPLU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGCAPPAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGARTPAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGTIPSTA, 0, new IDVariant());
  }

  // **********************************************************************
  // Capitoli On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPITOLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAPITOLI);
      // 
      // Capitoli On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CAPITOLI.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPITOLI_DESCRIZIOCAP,(new IDVariant(PAN_CAPITOLI.FieldText(PFL_CAPITOLI_DESCRIZIOCAP))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "CapitoliOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Capitoli After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_CAPITOLI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli After Find Body
      // Corpo Procedura
      // 
      PAN_CAPITOLI.set_FieldText(PFL_CAPITOLI_TOTALEDAESI2, IDL.Format(IDL.NullValue(PAN_CAPITOLI.GetFieldSum(PFL_CAPITOLI_STANZATTUALE),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "CapitoliAfterFind", _e);
    }
  }

  // **********************************************************************
  // da Esigibilita On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DAESIGIBILIT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DAESIGIBILIT);
      // 
      // da Esigibilita On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESCRIZIONE1,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_DESCRIZIONE1))).stringValue()); 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESMISSIONE2,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_DESMISSIONE2))).stringValue()); 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESPROGRAMM2,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_DESPROGRAMM2))).stringValue()); 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_CODICEUO1,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_CODICEUO1))).stringValue()); 
      PAN_DAESIGIBILIT.set_ToolTip(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESCRIZIONUO,(new IDVariant(PAN_DAESIGIBILIT.FieldText(PFL_DAESIGIBILIT_DESCRIZIONUO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daEsigibilitaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // da Esigibilita On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DAESIGIBILIT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Esigibilita On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.STRING);
          v_NUMEROIMP = (new IDVariant("Numero Imp."));
          IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.STRING);
          v_ANNOIMP = (new IDVariant("Anno Imp."));
          IDVariant v_NUMERIMPPROV = new IDVariant(0,IDVariant.STRING);
          v_NUMERIMPPROV = (new IDVariant("Numero Imp. Prov."));
          IDVariant v_ANNOIMPPROV = new IDVariant(0,IDVariant.STRING);
          v_ANNOIMPPROV = (new IDVariant("Anno Imp. Prov."));
          IDVariant v_CODMISSIONE = new IDVariant(0,IDVariant.STRING);
          v_CODMISSIONE = (new IDVariant("Cod. Missione"));
          IDVariant v_CODPROGRAMMA = new IDVariant(0,IDVariant.STRING);
          v_CODPROGRAMMA = (new IDVariant("Cod. Programma"));
          IDVariant v_DESCMISSIONE = new IDVariant(0,IDVariant.STRING);
          v_DESCMISSIONE = (new IDVariant("Desc. Missione"));
          IDVariant v_DESCPROGRAMM = new IDVariant(0,IDVariant.STRING);
          v_DESCPROGRAMM = (new IDVariant("Desc. Programma"));
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMEROIMP, new IDVariant(v_NUMEROIMP).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMP, new IDVariant(v_ANNOIMP).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMERIMPPROV, new IDVariant(v_NUMERIMPPROV).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMPPROVE, new IDVariant(v_ANNOIMPPROV).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_MISSIONE2, new IDVariant(v_CODMISSIONE).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESMISSIONE2, new IDVariant(v_DESCMISSIONE).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_PROGRAMMA2, new IDVariant(v_CODPROGRAMMA).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESPROGRAMM2, new IDVariant(v_DESCPROGRAMM).stringValue());
          new IDVariant(PAN_DAESIGIBILIT.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMEROIMP, (new IDVariant("Numero")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMP, (new IDVariant("Anno")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_NUMERIMPPROV, (new IDVariant("Numero")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_ANNOIMPPROVE, (new IDVariant("Anno")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_MISSIONE2, (new IDVariant("Codice")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESMISSIONE2, (new IDVariant("Descrizione")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_PROGRAMMA2, (new IDVariant("Codice")).stringValue());
          PAN_DAESIGIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DAESIGIBILIT_DESPROGRAMM2, (new IDVariant("Descrizione")).stringValue());
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daEsigibilitaOnCommand", _e);
    }
  }

  // **********************************************************************
  // da Esigibilita After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DAESIGIBILIT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Esigibilita After Find Body
      // Corpo Procedura
      // 
      PAN_DAESIGIBILIT.set_FieldText(PFL_DAESIGIBILIT_TOTALEDAESI1, IDL.Format(IDL.NullValue(PAN_DAESIGIBILIT.GetFieldSum(PFL_DAESIGIBILIT_IMPORTO1),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daEsigibilitaAfterFind", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DACRONOPROGR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DACRONOPROGR);
      // 
      // da Cronoprogramma On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_CAPUOUNITORG,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_CAPUOUNITORG))).stringValue()); 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESCRIZOPERA,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_DESCRIZOPERA))).stringValue()); 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZDESCRI,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_FINANZDESCRI))).stringValue()); 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESMISSIONE3,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_DESMISSIONE3))).stringValue()); 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESPROGRAMM3,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_DESPROGRAMM3))).stringValue()); 
      PAN_DACRONOPROGR.set_ToolTip(Glb.OBJ_FIELD,PFL_DACRONOPROGR_CODICEUO,(new IDVariant(PAN_DACRONOPROGR.FieldText(PFL_DACRONOPROGR_CODICEUO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daCronoprogrammaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DACRONOPROGR_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Cronoprogramma On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          IDVariant v_CODOPERA = new IDVariant(0,IDVariant.STRING);
          v_CODOPERA = (new IDVariant("Cod. Opera"));
          IDVariant v_DESCOPERA = new IDVariant(0,IDVariant.STRING);
          v_DESCOPERA = (new IDVariant("Desc. Opera"));
          IDVariant v_CODFINANZIAM = new IDVariant(0,IDVariant.STRING);
          v_CODFINANZIAM = (new IDVariant("Cod. Finanziamento"));
          IDVariant v_DESCFINANZIA = new IDVariant(0,IDVariant.STRING);
          v_DESCFINANZIA = (new IDVariant("Desc. Finanziamento"));
          IDVariant v_CODMISSIONE = new IDVariant(0,IDVariant.STRING);
          v_CODMISSIONE = (new IDVariant("Cod. Missione"));
          IDVariant v_DESCMISSIONE = new IDVariant(0,IDVariant.STRING);
          v_DESCMISSIONE = (new IDVariant("Desc. Missione"));
          IDVariant v_CODPROGRAMMA = new IDVariant(0,IDVariant.STRING);
          v_CODPROGRAMMA = (new IDVariant("Cod. Programma"));
          IDVariant v_DESCPROGRAMM = new IDVariant(0,IDVariant.STRING);
          v_DESCPROGRAMM = (new IDVariant("Desc. Programma"));
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_OPERA, new IDVariant(v_CODOPERA).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESCRIZOPERA, new IDVariant(v_DESCOPERA).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZIAMENT, new IDVariant(v_CODFINANZIAM).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZDESCRI, new IDVariant(v_DESCFINANZIA).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_MISSIONE3, new IDVariant(v_CODMISSIONE).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESMISSIONE3, new IDVariant(v_DESCMISSIONE).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_PROGRAMMA3, new IDVariant(v_CODPROGRAMMA).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESPROGRAMM3, new IDVariant(v_DESCPROGRAMM).stringValue());
          new IDVariant(PAN_DACRONOPROGR.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.SetFlags (Glb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_OPERA, (new IDVariant("Codice")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESCRIZOPERA, (new IDVariant("Descrizione")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZIAMENT, (new IDVariant("Codice")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_FINANZDESCRI, (new IDVariant("Descrizione")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_MISSIONE3, (new IDVariant("Codice")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESMISSIONE3, (new IDVariant("Descrizione")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_PROGRAMMA3, (new IDVariant("Codice")).stringValue());
          PAN_DACRONOPROGR.set_Header(Glb.OBJ_FIELD,PFL_DACRONOPROGR_DESPROGRAMM3, (new IDVariant("Descrizione")).stringValue());
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daCronoprogrammaOnCommand", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DACRONOPROGR_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Cronoprogramma After Find Body
      // Corpo Procedura
      // 
      PAN_DACRONOPROGR.set_FieldText(PFL_DACRONOPROGR_TOTALDACRON1, IDL.Format(IDL.NullValue(PAN_DACRONOPROGR.GetFieldSum(PFL_DACRONOPROGR_IMPORTO3),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daCronoprogrammaAfterFind", _e);
    }
  }

  // **********************************************************************
  // DUAL Info Fin
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Fin Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_REFPDACRCRID, 0))))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGECRON, 0, new IDVariant(IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_REFPDACRCRID, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRCA, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRAR, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEFINA, 0, IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRFI, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARSCRONO, IMDBDef7.FLD_PARSCRONO_NOMEOGGEIMPO, 0, IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_RECFPVDACRIM, 0));
        MainFrm.Show(MyGlb.FRM_FINANZCRONOP, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "DUALInfoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DUAL Info Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Impegno Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEANI, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, ((IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEANI, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)?(new IDVariant("R")):(new IDVariant("INFO"))));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEANI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESENUI, 0));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "DUALInfoImpegno", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESECA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESECA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_RECFPDAESEAR, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno Prov
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpegnoProv ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Prov Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEAIP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, ((IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEAIP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)?(new IDVariant("R")):(new IDVariant("INFO"))));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEAIP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESENIP, 0));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "InfoImpegnoProv", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Bil Var Esig
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoBilVarEsig ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Bil Var Esig Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_RECORDBILVAR, 0).equals((new IDVariant("V")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0, IMDB.Value(IMDBDef17.PQRY_FPVDAESIG1, IMDBDef17.PQSL_FPVDAESIG1_REFPDAESEPRV, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON, 0, (new IDVariant("E")));
        MainFrm.Show(MyGlb.FRM_INFOVARICRON, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "InfoBilVarEsig", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Var Bil Crono
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoVarBilCrono ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Var Bil Crono Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_RECORDBILVAR, 0).equals((new IDVariant("V")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0, new IDVariant(IMDB.Value(IMDBDef17.PQRY_FPVDACRONO1, IMDBDef17.PQSL_FPVDACRONO1_REFPDACRPRVA, 0),IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON, 0, (new IDVariant("C")));
        MainFrm.Show(MyGlb.FRM_INFOVARICRON, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "InfoVarBilCrono", _e);
      return -1;
    }
  }

  // **********************************************************************
  // da Esigibilita Tot Mis Prog After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DAESITOTMIPR_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Esigibilita Tot Mis Prog After Find Body
      // Corpo Procedura
      // 
      PAN_DAESITOTMIPR.set_FieldText(PFL_DAESITOTMIPR_TOTALEDAESIG, IDL.Format(IDL.NullValue(PAN_DAESITOTMIPR.GetFieldSum(PFL_DAESITOTMIPR_IMPORTO2),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daEsigibilitaTotMisProgAfterFind", _e);
    }
  }

  // **********************************************************************
  // da Cronoprogramma Tot Mis Prog After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DACROTOTMIPR_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // da Cronoprogramma Tot Mis Prog After Find Body
      // Corpo Procedura
      // 
      PAN_DACROTOTMIPR.set_FieldText(PFL_DACROTOTMIPR_TOTALDACRONO, IDL.Format(IDL.NullValue(PAN_DACROTOTMIPR.GetFieldSum(PFL_DACROTOTMIPR_IMPORTO),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaComposizioneFPVEntrata", "daCronoprogrammaTotMisProgAfterFind", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCHCOMFPVENT_PARAMETRI498() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI498_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI190, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI190, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI498_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI498_RS, 0, IMDBDef7.TBL_PARAMETRI190, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI498_RS, 0, 0, IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGESEPLU, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI498_RS, 1, 0, IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGCAPPAR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI498_RS, 2, 0, IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGARTPAR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI498_RS, 3, 0, IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI498_RS, 4, 0, IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPC, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI498_RS, 5, 0, IMDBDef7.TBL_PARAMETRI190, IMDBDef7.FLD_PARAMETRI190_NOMOGGTIPSTA, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI190, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI190, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI190, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI498_RS, 0);
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
  private void PAN_CAPITOLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPITOLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPITOLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPITOLI, Cancel);
    // Stub
  }

  private void PAN_CAPITOLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAPITOLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAPITOLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPITOLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DAESIGIBILIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DAESIGIBILIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DAESIGIBILIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DAESIGIBILIT, Cancel);
    // Stub
  }

  private void PAN_DAESIGIBILIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOCAPITOLO)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOIMPEPROV)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoProv();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DAESIGIBILIT_INFOBILVAR)
    {
      this.IdxPanelActived = this.PAN_DAESIGIBILIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoBilVarEsig();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DAESIGIBILIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DAESIGIBILIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DAESIGIBILIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DAESITOTMIPR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DAESITOTMIPR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DAESITOTMIPR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DAESITOTMIPR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DAESITOTMIPR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DAESITOTMIPR);
    // Stub
  }

  private void PAN_DAESITOTMIPR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DAESITOTMIPR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DAESITOTMIPR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DAESITOTMIPR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DACRONOPROGR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DACRONOPROGR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DACRONOPROGR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DACRONOPROGR, Cancel);
    // Stub
  }

  private void PAN_DACRONOPROGR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DACRONOPROGR_INFOVARBIL)
    {
      this.IdxPanelActived = this.PAN_DACRONOPROGR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVarBilCrono();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DACRONOPROGR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DACRONOPROGR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DACRONOPROGR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DACROTOTMIPR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DACROTOTMIPR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DACROTOTMIPR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DACROTOTMIPR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DACROTOTMIPR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DACROTOTMIPR);
    // Stub
  }

  private void PAN_DACROTOTMIPR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DACROTOTMIPR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DACROTOTMIPR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DACROTOTMIPR_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, "39DC5E40-3B5B-4EF2-AABF-F3158539691F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, "E10C98B1-EDD5-44C4-9F31-8F2A2D5BF165");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, "Capitolo Param");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, "DA07911A-CBCB-4FA7-90EC-2F21D07C3BDF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, "Articolo Param");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, "3BA2EF28-020C-46BB-A96B-6D9C1F1418E5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, "Tipo Stanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, "DAEED314-47BE-414D-A558-DCC0EA93BE64");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, "Capitolo/Art.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, "01BFAE1A-8F60-40CB-AF3E-1835A774FC6E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, "5C77EB2B-1CC1-4E1C-A94B-227BB39E54BD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, "Totale per Missione/Programma");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, "AD2A081F-866A-4221-BEDB-00E3864AC7A1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, "Totale per Missione/Programma");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_LIST, "Eserc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 8, 8, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLU1, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIPLU1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIPLU1, PPQRY_PARAMETRI498, "A.NOMOGGESEPLU", "NOMOGGESEPLU", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_LIST, "Capitolo Param");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLPARAM, MyGlb.PANEL_FORM, "Capitolo Param");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLPARAM, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLPARAM, PPQRY_PARAMETRI498, "A.NOMOGGCAPPAR", "NOMOGGCAPPAR", 3, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_LIST, "Articolo Param");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLPARAM, MyGlb.PANEL_FORM, "Articolo Param");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTICOLPARAM, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTICOLPARAM, PPQRY_PARAMETRI498, "A.NOMOGGARTPAR", "NOMOGGARTPAR", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_LIST, "Tipo Stanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_FORM, 412, 8, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTANZIAM, MyGlb.PANEL_FORM, "Tipo Stanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOSTANZIAM, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOSTANZIAM, PPQRY_PARAMETRI498, "A.NOMOGGTIPSTA", "NOMOGGTIPSTA", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOSTANZIAM, (new IDVariant("S")), "Stanziamento Simulato", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOSTANZIAM, (new IDVariant("E")), "Stanziamento Definitivo", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_FORM, 124, 8, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLFONDO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLFONDO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLFONDO, PPQRY_BIL1, "~~PQRY_CAP1.RECORCAPCAPI~~", "CAPITOLO", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_FORM, 352, 8, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLFONDO, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTICOLFONDO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTICOLFONDO, PPQRY_BIL1, "~~PQRY_CAP1.RECORCAPARTI~~", "ARTICOLO", 1, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_LIST, "Totale per Missione Programma");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_FORM, 156, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_FORM, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRES, MyGlb.PANEL_FORM, "Totale per Missione/Programma");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOPEANMIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOPEANMIPRES, PPQRY_PARAMETRI498, "A.NOOGTOPEAMPE", "NOOGTOPEAMPE", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOPEANMIPRES, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOPEANMIPRES, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_LIST, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_LIST, "Totale per Missione/Programma");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_FORM, 156, 36, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_FORM, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOPEANMIPRCR, MyGlb.PANEL_FORM, "Totale per Missione/Programma");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOPEANMIPRCR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOPEANMIPRCR, PPQRY_PARAMETRI498, "A.NOOGTOPEAMPC", "NOOGTOPEAMPC", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOPEANMIPRCR, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOPEANMIPRCR, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPCAPI~~ as CAPITOLO, ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPARTI~~ as ARTICOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PARAMETRI.SetQuery(PPQRY_BIL1, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BIL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BIL1, "DUAL");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI498", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI498, IMDBDef17.PQRY_PARAMETRI498_RS, IMDBDef7.TBL_PARAMETRI190);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIPLU1, IMDBDef7.FLD_PARAMETRI190_NOMOGGESEPLU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOLPARAM, IMDBDef7.FLD_PARAMETRI190_NOMOGGCAPPAR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ARTICOLPARAM, IMDBDef7.FLD_PARAMETRI190_NOMOGGARTPAR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOSTANZIAM, IMDBDef7.FLD_PARAMETRI190_NOMOGGTIPSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOPEANMIPRES, IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOPEANMIPRCR, IMDBDef7.FLD_PARAMETRI190_NOOGTOPEAMPC);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI190");
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

  private void PAN_CAPITOLI_Init()
  {

    PAN_CAPITOLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPITOLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPITOLI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, "721D345D-2A49-404A-A182-C141E678BEB9");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, "Capitolo");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.VIS_NOFIINLUHELE);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, "70FE0FB4-BF92-4B14-B969-0C3AF4F8CA03");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, "Art.");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, "15231BD0-6CFC-4683-A1F5-168C4E0BCC3E");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, "Descrizione");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, "1532E071-EF4E-4438-AD2A-DE1BE07128E0");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, "Stanz. Iniz.");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, "66179E08-1FA1-4068-8C17-35BACABEB0B9");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, "Variazioni");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, "CC9A34BB-2005-46D1-9896-778628F3C0DF");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, "Stanz. Attuale");
    PAN_CAPITOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, "DCA829EB-4FF4-404D-B0A9-8B934DABBF34");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, "Totale Stanz. Attuale");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAPITOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, "727F04F1-94A2-4764-9E23-A6BFBD608742");
    PAN_CAPITOLI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, "");
    PAN_CAPITOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, MyGlb.VIS_CAMPTOTADISA);
    PAN_CAPITOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CAPITOLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_LIST, 64);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_FORM, 64);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_CAPITOLO2, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_CAPITOLO2, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_CAPITOLO2, PPQRY_CAP1, "A.CAPITOLO", "RECORCAPCAPI", 3, 16, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_LIST, 136, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_LIST, 68);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_LIST, "Art.");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_FORM, 4, 28, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_FORM, 68);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ARTICOLO2, MyGlb.PANEL_FORM, "Art.");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_ARTICOLO2, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_ARTICOLO2, PPQRY_CAP1, "A.ARTICOLO", "RECORCAPARTI", 1, 2, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_LIST, 168, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_LIST, 108);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_FORM, 4, 52, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_FORM, 108);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_FORM, 2);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_DESCRIZIOCAP, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_DESCRIZIOCAP, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_DESCRIZIOCAP, PPQRY_CAP1, "A.DESCRIZIONE", "RECORCAPDESC", 5, 140, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_LIST, 368, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_LIST, 68);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_LIST, "Stanz. Iniz.");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_FORM, 4, 256, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_FORM, 68);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STNINICO, MyGlb.PANEL_FORM, "Stanz. Iniz.");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_STNINICO, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_STNINICO, PPQRY_CAP1, "B.STN_INI_CO", "RECBILSTINCO", 2, 15, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_LIST, 484, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_LIST, 96);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_LIST, "Variazioni");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_FORM, 4, 280, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_FORM, 96);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_VARIAZIONICO, MyGlb.PANEL_FORM, "Variazioni");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_VARIAZIONICO, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_VARIAZIONICO, PPQRY_CAP1, "B.VARIAZIONI_CO", "RECOBILVARCO", 2, 15, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_LIST, 600, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_LIST, 88);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_LIST, "Stanz. Attuale");
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_FORM, 4, 304, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_FORM, 88);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOLI_STANZATTUALE, MyGlb.PANEL_FORM, "Stanz. Attuale");
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_STANZATTUALE, -1, -1);
    PAN_CAPITOLI.SetFieldUnbound(PFL_CAPITOLI_STANZATTUALE, true);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_STANZATTUALE, PPQRY_CAP1, "B.STN_INI_CO + B.VARIAZIONI_CO", "STANZATTUALE", 2, 19, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, MyGlb.PANEL_LIST, 432, 256, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, MyGlb.PANEL_FORM, 324, 252, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_ETICHETOTALE, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, MyGlb.PANEL_LIST, 600, 256, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, MyGlb.PANEL_LIST, 0);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOLI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CAPITOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, MyGlb.PANEL_FORM, 0);
    PAN_CAPITOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOLI_TOTALEDAESI2, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOLI.SetFieldPage(PFL_CAPITOLI_TOTALEDAESI2, -1, -1);
    PAN_CAPITOLI.SetFieldPanel(PFL_CAPITOLI_TOTALEDAESI2, -1, "", "TOTALEDAESI2", 0, 0, 0, -13997);
  }

  private void PAN_CAPITOLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPITOLI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAPITOLI.SetIMDB(IMDB, "PQRY_CAP1", true);
    PAN_CAPITOLI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as RECORCAPCAPI, ");
    SQL.append("  A.ARTICOLO as RECORCAPARTI, ");
    SQL.append("  A.DESCRIZIONE as RECORCAPDESC, ");
    SQL.append("  B.STN_INI_CO as RECBILSTINCO, ");
    SQL.append("  B.VARIAZIONI_CO as RECOBILVARCO, ");
    SQL.append("  B.STN_INI_CO + B.VARIAZIONI_CO as STANZATTUALE ");
    PAN_CAPITOLI.SetQuery(PPQRY_CAP1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  BILBPR B ");
    PAN_CAPITOLI.SetQuery(PPQRY_CAP1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.TIPO = ~~PQRY_PARAMETRI498.NOMOGGTIPSTA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARAMETRI498.NOMOGGESEPLU~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.CAPITOLO = NVL(~~TBL_PARAMETRI190.NOMOGGCAPPAR~~, A.CAPITOLO)) ");
    SQL.append("and   (A.ARTICOLO = NVL(~~TBL_PARAMETRI190.NOMOGGARTPAR~~, A.ARTICOLO)) ");
    SQL.append("and   (A.CAPITOLO = 9999999999999996 OR A.CAPITOLO = 9999999999999997) ");
    PAN_CAPITOLI.SetQuery(PPQRY_CAP1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPITOLI.SetQuery(PPQRY_CAP1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPITOLI.SetQuery(PPQRY_CAP1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_CAPITOLI.SetQuery(PPQRY_CAP1, 5, SQL, -1, "");
    PAN_CAPITOLI.SetQueryDB(PPQRY_CAP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPITOLI.SetMasterTable(0, "CAP");
    PAN_CAPITOLI.AddToSortList(PFL_CAPITOLI_CAPITOLO2, true);
    PAN_CAPITOLI.AddToSortList(PFL_CAPITOLI_ARTICOLO2, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPITOLI.Status() == 2)
    {
      int oldListQBE = PAN_CAPITOLI.iUseListQBE;
      PAN_CAPITOLI.iUseListQBE = 0;
      PAN_CAPITOLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPITOLI.PanelCommand(Glb.PCM_FIND);
      PAN_CAPITOLI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DAESIGIBILIT_Init()
  {

    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, "063F37A9-6ADF-4E95-97C2-31AC999D7070");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, "Impegno");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, MyGlb.PANEL_LIST, 304, -9999, 120, 16, 0, 0);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, MyGlb.PANEL_FORM, 0, 159, 172, 181, 0, 0);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 0, 51);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 1, 13);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 0, 4);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 1, 4);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, "A46A407B-5B23-4BA0-9CAA-BC7A7E379AFC");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, "Imp. Provenienza");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, MyGlb.PANEL_LIST, 620, -9999, 140, 16, 0, 0);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, MyGlb.PANEL_FORM, 0, 447, 664, 97, 0, 0);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 0, 99);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 1, 13);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 0, 4);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 1, 4);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_IMPPROVENIEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, "DFAD8B1A-9F22-47DD-BB26-68834DE3E354");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, "Missione");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, MyGlb.PANEL_LIST, 1252, -9999, 208, 16, 0, 0);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, MyGlb.PANEL_FORM, 0, 591, 632, 121, 0, 0);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, 0, 49);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, 1, 13);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, 0, 4);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, 1, 4);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_MISSIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, "81B5A8B7-0282-48DF-9501-F4E4790242FA");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, "Programma");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_LIST, 1460, -9999, 208, 16, 0, 0);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_FORM, 0, 591, 648, 145, 0, 0);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, 0, 67);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, 1, 13);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, 0, 4);
    PAN_DAESIGIBILIT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, 1, 4);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESIGIBILIT_PROGRAMMA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_FIELD, 32);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, "0145F582-738D-4EC6-A1F0-9BE12FB77C37");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, "Capitolo FPV");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, "C19C9887-0E07-4919-BCCA-BC02E269DB3D");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, "Articolo FPV");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, "165D68D0-AF57-47BC-899C-E24BE4FB98D3");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, "Descrizione FPV");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.VIS_NORMFIELPADR);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, "F934EB52-C6A8-49C8-A024-80DDBB2098AE");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, "8D3B1963-8B83-4246-A4C4-3E0F71F678CC");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, "Anno Entrata");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, "C9611F8E-A82E-47FD-AC74-229524A5ECD5");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, "Capitolo");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.VIS_NOFIINLUHELE);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, "E5F31611-1335-437F-A339-32F7F0B1B113");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, "Art.");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, "54E039A6-E17F-4325-A0B3-0385E746E1F5");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, "D9366EA5-9587-478D-93DB-7420E8986490");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, "Descrizione Cap");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, "F6373F07-27C2-43AD-BE9E-105254B180CC");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, "Numero");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, "3BE225FC-00CD-458C-AA3B-3DAD2C3B2D09");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, "Anno");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, "A8355EC8-0F3F-4AF7-A74A-55DAD45C6842");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, "7EE5ABAA-8C60-4B7B-B932-953E065462DA");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, "   Importo Variazione");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, "3639A041-8DD5-4133-ACD8-BBC31868B9A6");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, "Data Variazione");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, "AC2D8E23-87CD-44CB-992E-07E5F110A35B");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, "Numero");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, "B29FE502-BD73-4EC2-8E56-546879ADEA86");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, "Anno");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, "469D4BEE-303E-4FAB-A822-61B1492E7873");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, "2EE58D27-963C-432F-B284-029789866AD8");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, "Anno Entrata Provenienza");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, "1EC6DEFE-1614-4F4C-A704-C56A498ED8F8");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, "Bil. Var.");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, "DB5159CA-953F-4854-AC00-A8CCEEF41888");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, " ");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.VIS_HYPELINKIMMA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, "3F87EA39-548A-4F14-A7A4-00274EDC65F8");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, "Codice UO");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, "3B7DF388-3ED4-41CB-8A0A-70827A50D486");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, "Unità Organizzativa");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, "887BFE23-DCEE-4898-9EA3-953380473CB5");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, "Anno Finanz.");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, "Anno del primo impegno di provenienza");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, "617E3666-1950-40A7-80F6-E21C20C23D47");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, "Codice");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, "E9755336-9A59-49EA-BABB-A044972755E2");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, "Descrizione");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, "88C207CE-8D4A-4F23-A510-FD56C0136C6E");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, "Codice");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, "7A39D4A7-AAC6-4914-9F0A-8C8B05E9FC89");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, "Descrizione");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, "515F63FC-F428-4DE8-8297-B41FF5226594");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, "Totale da Esigibilità");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.VIS_VUOTONORMALE);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, "51EE348B-17D3-4B41-BCEC-E435E89DF0F9");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.VIS_CAMPTOTADISA);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, "7E1F243D-BF0D-4773-9B9D-364D96849E7D");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, "PROGRESSIVO");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, "64C309C0-95CC-43D1-B1B4-F789E9C8F94F");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, "CODICE STRUTTURA");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.VIS_NORMFIELPADR);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DAESIGIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, "5663599C-58E6-4017-9C7D-4A202AE142CB");
    PAN_DAESIGIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, "PROGR UNITA ORGANIZZATIVA");
    PAN_DAESIGIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, "");
    PAN_DAESIGIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DAESIGIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DAESIGIBILIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_LIST, 80);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_LIST, "Capitolo FPV");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_FORM, 4, 592, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_FORM, 80);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLOFPV1, MyGlb.PANEL_FORM, "Capitolo FPV");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_CAPITOLOFPV1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_CAPITOLOFPV1, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_CAPITOLOFPV1, PPQRY_FPVDAESIG1, "~~PQRY_CAP1.RECORCAPCAPI~~", "CAPITOLOFPV", 3, 28, 6, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_LIST, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_LIST, "Articolo FPV");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_FORM, 4, 616, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_FORM, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLOFPV1, MyGlb.PANEL_FORM, "Articolo FPV");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ARTICOLOFPV1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_ARTICOLOFPV1, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ARTICOLOFPV1, PPQRY_FPVDAESIG1, "~~PQRY_CAP1.RECORCAPARTI~~", "ARTICOLOFPV", 1, 19, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_LIST, 108);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_LIST, 2);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_LIST, "Descrizione FPV");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_FORM, 4, 640, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_FORM, 108);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_FORM, 2);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIOFP1, MyGlb.PANEL_FORM, "Descrizione FPV");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DESCRIZIOFP1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_DESCRIZIOFP1, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DESCRIZIOFP1, PPQRY_FPVDAESIG1, "~~PQRY_CAP1.RECORCAPDESC~~", "DESCRIZIOFPV", 5, 140, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 232, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOESIGIBIL, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOESIGIBIL, PPQRY_FPVDAESIG1, "A.ANNO_ESIGIBILITA", "REFPDAESEAN1", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_LIST, 64, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_FORM, 4, 832, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOENTRATA, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOENTRATA, PPQRY_FPVDAESIG1, "A.ANNO_ENTRATA", "REFPDAESEANE", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, 128, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, 4, 340, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CAPITOLO3, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_CAPITOLO3, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_CAPITOLO3, PPQRY_FPVDAESIG1, "A.CAPITOLO", "RECFPDAESECA", 3, 16, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, 248, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, 68);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_LIST, "Art.");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, 4, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, 68);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ARTICOLO3, MyGlb.PANEL_FORM, "Art.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ARTICOLO3, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ARTICOLO3, PPQRY_FPVDAESIG1, "A.ARTICOLO", "RECFPDAESEAR", 1, 2, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, 280, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, 4, 424, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, 116);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOCAPITOLO, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOCAPITOLO, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOCAPITOLO, PPQRY_DUAL1, "DECODE(~~RECFPDAESECA~~, to_number(NULL), NULL, 'I')", "INFOCAPITOLO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOCAPITOLO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, 236, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione Cap");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 388, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione Cap");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DESCRIZIONE1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DESCRIZIONE1, PPQRY_FPVDAESIG1, "A.DESCRIZIONE_CAP", "REFPDAESEDEC", 5, 140, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, 304, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, 4, 184, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_NUMEROIMP, -1, GRP_DAESIGIBILIT_IMPEGNO);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_NUMEROIMP, PPQRY_FPVDAESIG1, "A.NUMERO_IMP", "REFPDAESENUI", 1, 5, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, 360, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, 4, 208, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOIMP, -1, GRP_DAESIGIBILIT_IMPEGNO);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOIMP, PPQRY_FPVDAESIG1, "A.ANNO_IMP", "REFPDAESEANI", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, 404, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, 120);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 316, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, 120);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEGNO, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOIMPEGNO, -1, GRP_DAESIGIBILIT_IMPEGNO);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOIMPEGNO, PPQRY_DUAL1, "DECODE(~~REFPDAESEANI~~, to_number(NULL), NULL, 'I')", "INFOIMPEGNO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, 424, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_LIST, "   Importo Variazione");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, 4, 256, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_IMPORTO1, MyGlb.PANEL_FORM, "Imp. Var.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_IMPORTO1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_IMPORTO1, PPQRY_FPVDAESIG1, "A.IMPORTO", "RECFPDAESEIM", 2, 15, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, 544, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_LIST, "Data Variazione");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, 4, 448, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DDATAREG1, MyGlb.PANEL_FORM, "Dt. Variaz.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DDATAREG1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DDATAREG1, PPQRY_FPVDAESIG1, "A.D_DATA_REG", "REFPDAESEDDR", 6, 10, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, 620, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, 160);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_LIST, "Numero");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, 4, 472, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, 160);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_NUMERIMPPROV, MyGlb.PANEL_FORM, "Numero");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_NUMERIMPPROV, -1, GRP_DAESIGIBILIT_IMPPROVENIEN);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_NUMERIMPPROV, PPQRY_FPVDAESIG1, "A.NUMERO_IMP_PROVENIENZA", "REFPDAESENIP", 1, 5, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, 680, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, 144);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_LIST, "Anno");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, 4, 496, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, 144);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPPROVE, MyGlb.PANEL_FORM, "Anno");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOIMPPROVE, -1, GRP_DAESIGIBILIT_IMPPROVENIEN);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOIMPPROVE, PPQRY_FPVDAESIG1, "A.ANNO_IMP_PROVENIENZA", "REFPDAESEAIP", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, 740, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, 148);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, 4, 520, 656, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, 148);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOIMPEPROV, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOIMPEPROV, -1, GRP_DAESIGIBILIT_IMPPROVENIEN);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOIMPEPROV, PPQRY_DUAL1, "DECODE(~~REFPDAESEAIP~~, to_number(NULL), NULL, 'I')", "INFOIMPEPROV", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOIMPEPROV, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_LIST, 760, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_LIST, 172);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_LIST, "Anno Entrata Provenienza");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_FORM, 4, 856, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_FORM, 172);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOENTRPROV, MyGlb.PANEL_FORM, "Anno Entrata Provenienza");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOENTRPROV, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOENTRPROV, PPQRY_FPVDAESIG1, "A.ANNO_ENTRATA_PROVENIENZA", "REFPDAESANEP", 1, 4, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, 848, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, 44);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_LIST, "Bil. Var.");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, 4, 544, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, 44);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_BILVAR1, MyGlb.PANEL_FORM, "Bil Var");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_BILVAR1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_BILVAR1, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_BILVAR1, PPQRY_FPVDAESIG1, "GET_BIL_VAR_ESIG(~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,A.PROGRESSIVO_VARIMP,'E')", "RECORDBILVAR", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, 880, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, 104);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_LIST, " ");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, 4, 568, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, 104);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_INFOBILVAR, MyGlb.PANEL_FORM, " ");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_INFOBILVAR, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_INFOBILVAR, PPQRY_DUAL1, "DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL)", "INFOBILVAR", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DAESIGIBILIT.SetValueListItem(PFL_DAESIGIBILIT_INFOBILVAR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, 904, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, 100);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_LIST, "Codice UO");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, 4, 784, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, 100);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICEUO1, MyGlb.PANEL_FORM, "Codice UO");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_CODICEUO1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_CODICEUO1, PPQRY_UNITAORGANIZ, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~REFPDAESEPUO~~,TRUNC( SYSDATE ))", "CODICEUO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, 1004, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 808, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESCRIZIONUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DESCRIZIONUO, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DESCRIZIONUO, PPQRY_UNITAORGANIZ, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(~~REFPDAESEPUO~~,TRUNC( SYSDATE ))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_LIST, 1204, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_LIST, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_LIST, "Anno Finanz.");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_FORM, 4, 592, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_FORM, 128);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ANNOIMPEPADR, MyGlb.PANEL_FORM, "Anno Finanz.");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ANNOIMPEPADR, -1, -1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_ANNOIMPEPADR, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ANNOIMPEPADR, PPQRY_FPVDAESIG1, "SUBSTR(GET_IMPEGNO_PROV_PADRE(A.NUMERO_IMP,A.ANNO_IMP), -4, 8000)", "ANNOIMPEPADR", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_LIST, 1252, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_LIST, 60);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_LIST, "Codice");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_FORM, 4, 616, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_FORM, 60);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_MISSIONE2, MyGlb.PANEL_FORM, "Codice");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_MISSIONE2, -1, GRP_DAESIGIBILIT_MISSIONE1);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_MISSIONE2, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_MISSIONE2, PPQRY_FPVDAESIG1, "SUBSTR(A.CODICE_STRUTTURA, 1, 2)", "RECORDMISSIO", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_LIST, 1300, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_LIST, 116);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_FORM, 4, 688, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_FORM, 116);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESMISSIONE2, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DESMISSIONE2, -1, GRP_DAESIGIBILIT_MISSIONE1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DESMISSIONE2, PPQRY_DUAL1, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~)))", "DESMISSIONE", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_LIST, 1460, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_LIST, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_LIST, "Codice");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_FORM, 4, 616, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_FORM, 76);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRAMMA2, MyGlb.PANEL_FORM, "Codice");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_PROGRAMMA2, -1, GRP_DAESIGIBILIT_PROGRAMMA2);
    PAN_DAESIGIBILIT.SetFieldUnbound(PFL_DAESIGIBILIT_PROGRAMMA2, true);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_PROGRAMMA2, PPQRY_FPVDAESIG1, "SUBSTR(A.CODICE_STRUTTURA, 3, 2)", "PROGRAMMA", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_LIST, 1508, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_LIST, 132);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_FORM, 4, 712, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_FORM, 132);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_DESPROGRAMM2, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_DESPROGRAMM2, -1, GRP_DAESIGIBILIT_PROGRAMMA2);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_DESPROGRAMM2, PPQRY_DUAL1, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~REFPDAESECOS~~)))", "DESPROGRAMMA", 5, 99, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_LIST, 256, 244, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_LIST, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_FORM, 324, 252, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_FORM, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_ETICHETOTAL1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_ETICHETOTAL1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_ETICHETOTAL1, -1, "", "ETICHETOTAL1", 0, 0, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_LIST, 424, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_LIST, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_FORM, 0);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_TOTALEDAESI1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_TOTALEDAESI1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_TOTALEDAESI1, -1, "", "TOTALEDAESI1", 0, 0, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, 88);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_PROGRESSIVO1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_PROGRESSIVO1, PPQRY_FPVDAESIG1, "A.PROGRESSIVO_VARIMP", "REFPDAESEPRV", 3, 10, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_LIST, 120);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_LIST, "CODICE STRUTTURA");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_FORM, 4, 616, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_FORM, 120);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_CODICESTRUTT, MyGlb.PANEL_FORM, "CODICE STRUTTURA");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_CODICESTRUTT, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_CODICESTRUTT, PPQRY_FPVDAESIG1, "A.CODICE_STRUTTURA", "REFPDAESECOS", 5, 10, 0, -13997);
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, 1516, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, 184);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_DAESIGIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, 4, 832, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESIGIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, 184);
    PAN_DAESIGIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, 1);
    PAN_DAESIGIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESIGIBILIT_PROGUNITORG1, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_DAESIGIBILIT.SetFieldPage(PFL_DAESIGIBILIT_PROGUNITORG1, -1, -1);
    PAN_DAESIGIBILIT.SetFieldPanel(PFL_DAESIGIBILIT_PROGUNITORG1, PPQRY_FPVDAESIG1, "A.PROGR_UNITA_ORGANIZZATIVA", "REFPDAESEPUO", 1, 8, 0, -13997);
  }

  private void PAN_DAESIGIBILIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DAESIGIBILIT.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~REFPDAESEANI~~, to_number(NULL), NULL, 'I') as INFOIMPEGNO, ");
    SQL.append("  DECODE(~~RECFPDAESECA~~, to_number(NULL), NULL, 'I') as INFOCAPITOLO, ");
    SQL.append("  DECODE(~~REFPDAESEAIP~~, to_number(NULL), NULL, 'I') as INFOIMPEPROV, ");
    SQL.append("  DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL) as INFOBILVAR, ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~))) as DESMISSIONE, ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~REFPDAESECOS~~))) as DESPROGRAMMA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_DAESIGIBILIT.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESIGIBILIT.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~REFPDAESEPUO~~,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(~~REFPDAESEPUO~~,TRUNC( SYSDATE )) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~REFPDAESEPUO~~ IS NULL))) ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_UNITAORGANIZ, 0, SQL, -1, "");
    PAN_DAESIGIBILIT.SetQueryDB(PPQRY_UNITAORGANIZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESIGIBILIT.SetMasterTable(PPQRY_UNITAORGANIZ, "DUAL");
    PAN_DAESIGIBILIT.SetIMDB(IMDB, "PQRY_FPVDAESIG1", true);
    PAN_DAESIGIBILIT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPCAPI~~ as CAPITOLOFPV, ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPARTI~~ as ARTICOLOFPV, ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPDESC~~ as DESCRIZIOFPV, ");
    SQL.append("  A.NUMERO_IMP as REFPDAESENUI, ");
    SQL.append("  A.ANNO_IMP as REFPDAESEANI, ");
    SQL.append("  A.CAPITOLO as RECFPDAESECA, ");
    SQL.append("  A.ARTICOLO as RECFPDAESEAR, ");
    SQL.append("  A.DESCRIZIONE_CAP as REFPDAESEDEC, ");
    SQL.append("  A.ANNO_ESIGIBILITA as REFPDAESEAN1, ");
    SQL.append("  A.IMPORTO as RECFPDAESEIM, ");
    SQL.append("  A.D_DATA_REG as REFPDAESEDDR, ");
    SQL.append("  A.NUMERO_IMP_PROVENIENZA as REFPDAESENIP, ");
    SQL.append("  A.ANNO_IMP_PROVENIENZA as REFPDAESEAIP, ");
    SQL.append("  GET_BIL_VAR_ESIG(~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,A.PROGRESSIVO_VARIMP,'E') as RECORDBILVAR, ");
    SQL.append("  A.PROGRESSIVO_VARIMP as REFPDAESEPRV, ");
    SQL.append("  SUBSTR(GET_IMPEGNO_PROV_PADRE(A.NUMERO_IMP,A.ANNO_IMP), -4, 8000) as ANNOIMPEPADR, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 1, 2) as RECORDMISSIO, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 3, 2) as PROGRAMMA, ");
    SQL.append("  A.CODICE_STRUTTURA as REFPDAESECOS, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as REFPDAESEPUO, ");
    SQL.append("  A.ANNO_ENTRATA as REFPDAESEANE, ");
    SQL.append("  A.ANNO_ENTRATA_PROVENIENZA as REFPDAESANEP ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVDAESIG1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_ESIG A ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVDAESIG1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ > NVL(A.ANNO_ENTRATA, DECODE(SIGN(A.ANNO_ESIGIBILITA - A.ANNO_IMP), -1, NVL(A.ANNO_ENTRATA_PROVENIENZA, A.ANNO_IMP_PROVENIENZA), A.ANNO_IMP))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ BETWEEN LEAST(A.ANNO_VAR, A.ANNO_ESIGIBILITA) + 1 AND GREATEST(A.ANNO_VAR, A.ANNO_ESIGIBILITA))) ");
    SQL.append("and   (SUBSTR(A.COD_4_LIV, 1, 1) = TO_CHAR ( DECODE(~~PQRY_CAP1.RECORCAPCAPI~~, 9999999999999997, 1, 2) )) ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVDAESIG1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVDAESIG1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVDAESIG1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_ESIGIBILITA, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.D_DATA_REG ");
    PAN_DAESIGIBILIT.SetQuery(PPQRY_FPVDAESIG1, 5, SQL, -1, "");
    PAN_DAESIGIBILIT.SetQueryDB(PPQRY_FPVDAESIG1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESIGIBILIT.SetMasterTable(0, "FPV_DA_ESIG");
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_CAPITOLO3, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_ARTICOLO3, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_ANNOESIGIBIL, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_ANNOIMP, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_NUMEROIMP, true);
    PAN_DAESIGIBILIT.AddToSortList(PFL_DAESIGIBILIT_DDATAREG1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DAESIGIBILIT.Status() == 2)
    {
      int oldListQBE = PAN_DAESIGIBILIT.iUseListQBE;
      PAN_DAESIGIBILIT.iUseListQBE = 0;
      PAN_DAESIGIBILIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DAESIGIBILIT.PanelCommand(Glb.PCM_FIND);
      PAN_DAESIGIBILIT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DAESITOTMIPR_Init()
  {

    PAN_DAESITOTMIPR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DAESITOTMIPR.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, "AA92610F-02B2-4F1B-8E08-636D5D315C14");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, "Missione");
    PAN_DAESITOTMIPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, MyGlb.PANEL_LIST, 120, -9999, 208, 16, 0, 0);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, MyGlb.PANEL_FORM, 0, 591, 632, 121, 0, 0);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, 0, 49);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, 1, 13);
    PAN_DAESITOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, 0, 4);
    PAN_DAESITOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, 1, 4);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_MISSIONE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, "EDC3700D-6F6E-4748-843D-72D07B2C6F80");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, "Programma");
    PAN_DAESITOTMIPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, MyGlb.VIS_GROUPSTYLE);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, MyGlb.PANEL_LIST, 328, -9999, 208, 16, 0, 0);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, MyGlb.PANEL_FORM, 0, 591, 648, 145, 0, 0);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, 0, 67);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, 1, 13);
    PAN_DAESITOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, 0, 4);
    PAN_DAESITOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, 1, 4);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_GROUP, GRP_DAESITOTMIPR_PROGRAMMA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DAESITOTMIPR.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, "6CFF4C47-A7D2-4811-92F9-576AB7B502E6");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, "   Importo Variazione");
    PAN_DAESITOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, "37A61D06-3086-4D09-B9CC-4633441AF92F");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, "Codice");
    PAN_DAESITOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, "8C361164-0348-4440-A266-B13FC425E495");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, "Descrizione");
    PAN_DAESITOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, "FFDB33FF-BC99-4195-9C4C-340FEE4D13CA");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, "Codice");
    PAN_DAESITOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, "40F6425E-843F-4C9F-9E53-3BB7104382D5");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, "Descrizione");
    PAN_DAESITOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.VIS_NORMALFIELDS);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DAESITOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, "E8F7205C-9F2B-4390-B131-B2D1639CFC35");
    PAN_DAESITOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, "");
    PAN_DAESITOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, MyGlb.VIS_CAMPTOTADISA);
    PAN_DAESITOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DAESITOTMIPR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_LIST, "   Importo Variazione");
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_FORM, 4, 256, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_IMPORTO2, MyGlb.PANEL_FORM, "Imp. Var.");
    PAN_DAESITOTMIPR.SetFieldPage(PFL_DAESITOTMIPR_IMPORTO2, -1, -1);
    PAN_DAESITOTMIPR.SetFieldUnbound(PFL_DAESITOTMIPR_IMPORTO2, true);
    PAN_DAESITOTMIPR.SetFieldPanel(PFL_DAESITOTMIPR_IMPORTO2, PPQRY_FPVDAESIG, "SUM(A.IMPORTO)", "IMPORTO", 2, 19, 0, -13997);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_LIST, 120, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_LIST, 60);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_LIST, "Codice");
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_FORM, 4, 616, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_FORM, 60);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_FORM, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_MISSIONE1, MyGlb.PANEL_FORM, "Codice");
    PAN_DAESITOTMIPR.SetFieldPage(PFL_DAESITOTMIPR_MISSIONE1, -1, GRP_DAESITOTMIPR_MISSIONE2);
    PAN_DAESITOTMIPR.SetFieldUnbound(PFL_DAESITOTMIPR_MISSIONE1, true);
    PAN_DAESITOTMIPR.SetFieldPanel(PFL_DAESITOTMIPR_MISSIONE1, PPQRY_FPVDAESIG, "SUBSTR(A.CODICE_STRUTTURA, 1, 2)", "RECORDMISSIO", 5, 99, 0, -13997);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_LIST, 168, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_LIST, 116);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_FORM, 4, 688, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_FORM, 116);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_FORM, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESMISSIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DAESITOTMIPR.SetFieldPage(PFL_DAESITOTMIPR_DESMISSIONE1, -1, GRP_DAESITOTMIPR_MISSIONE2);
    PAN_DAESITOTMIPR.SetFieldPanel(PFL_DAESITOTMIPR_DESMISSIONE1, PPQRY_DUAL2, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~)))", "DESMISSIONE", 5, 99, 0, -13997);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_LIST, 328, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_LIST, 76);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_LIST, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_LIST, "Codice");
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_FORM, 4, 616, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_FORM, 76);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_FORM, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_PROGRAMMA1, MyGlb.PANEL_FORM, "Codice");
    PAN_DAESITOTMIPR.SetFieldPage(PFL_DAESITOTMIPR_PROGRAMMA1, -1, GRP_DAESITOTMIPR_PROGRAMMA3);
    PAN_DAESITOTMIPR.SetFieldUnbound(PFL_DAESITOTMIPR_PROGRAMMA1, true);
    PAN_DAESITOTMIPR.SetFieldPanel(PFL_DAESITOTMIPR_PROGRAMMA1, PPQRY_FPVDAESIG, "SUBSTR(A.CODICE_STRUTTURA, 3, 2)", "PROGRAMMA", 5, 99, 0, -13997);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_LIST, 376, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_LIST, 132);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_LIST, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_FORM, 4, 712, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_FORM, 132);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_FORM, 1);
    PAN_DAESITOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_DESPROGRAMM1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DAESITOTMIPR.SetFieldPage(PFL_DAESITOTMIPR_DESPROGRAMM1, -1, GRP_DAESITOTMIPR_PROGRAMMA3);
    PAN_DAESITOTMIPR.SetFieldPanel(PFL_DAESITOTMIPR_DESPROGRAMM1, PPQRY_DUAL2, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~RECORDMISSIO~~ || ~~PROGRAMMA~~)))", "DESPROGRAMMA", 5, 99, 0, -13997);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, MyGlb.PANEL_LIST, 0, 248, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, MyGlb.PANEL_LIST, 0);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, MyGlb.PANEL_LIST, 1);
    PAN_DAESITOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DAESITOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, MyGlb.PANEL_FORM, 0);
    PAN_DAESITOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DAESITOTMIPR_TOTALEDAESIG, MyGlb.PANEL_FORM, 1);
    PAN_DAESITOTMIPR.SetFieldPage(PFL_DAESITOTMIPR_TOTALEDAESIG, -1, -1);
    PAN_DAESITOTMIPR.SetFieldPanel(PFL_DAESITOTMIPR_TOTALEDAESIG, -1, "", "TOTALEDAESIG", 0, 0, 0, -13997);
  }

  private void PAN_DAESITOTMIPR_InitQueries()
  {
    StringBuffer SQL;

    PAN_DAESITOTMIPR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~))) as DESMISSIONE, ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~RECORDMISSIO~~ || ~~PROGRAMMA~~))) as DESPROGRAMMA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DAESITOTMIPR.SetQuery(PPQRY_DUAL2, 0, SQL, -1, "");
    PAN_DAESITOTMIPR.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESITOTMIPR.SetMasterTable(PPQRY_DUAL2, "DUAL");
    PAN_DAESITOTMIPR.SetIMDB(IMDB, "PQRY_FPVDAESIG", true);
    PAN_DAESITOTMIPR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(A.IMPORTO) as IMPORTO, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 1, 2) as RECORDMISSIO, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 3, 2) as PROGRAMMA ");
    PAN_DAESITOTMIPR.SetQuery(PPQRY_FPVDAESIG, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_ESIG A ");
    PAN_DAESITOTMIPR.SetQuery(PPQRY_FPVDAESIG, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ > NVL(A.ANNO_ENTRATA, DECODE(SIGN(A.ANNO_ESIGIBILITA - A.ANNO_IMP), -1, NVL(A.ANNO_ENTRATA_PROVENIENZA, A.ANNO_IMP_PROVENIENZA), A.ANNO_IMP))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ BETWEEN LEAST(A.ANNO_VAR, A.ANNO_ESIGIBILITA) + 1 AND GREATEST(A.ANNO_VAR, A.ANNO_ESIGIBILITA))) ");
    SQL.append("and   (SUBSTR(A.COD_4_LIV, 1, 1) = TO_CHAR ( DECODE(~~PQRY_CAP1.RECORCAPCAPI~~, 9999999999999997, 1, 2) )) ");
    PAN_DAESITOTMIPR.SetQuery(PPQRY_FPVDAESIG, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 1, 2), ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 3, 2) ");
    PAN_DAESITOTMIPR.SetQuery(PPQRY_FPVDAESIG, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DAESITOTMIPR.SetQuery(PPQRY_FPVDAESIG, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 3 ");
    PAN_DAESITOTMIPR.SetQuery(PPQRY_FPVDAESIG, 5, SQL, -1, "");
    PAN_DAESITOTMIPR.SetQueryDB(PPQRY_FPVDAESIG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DAESITOTMIPR.SetMasterTable(0, "FPV_DA_ESIG");
    PAN_DAESITOTMIPR.AddToSortList(PFL_DAESITOTMIPR_MISSIONE1, true);
    PAN_DAESITOTMIPR.AddToSortList(PFL_DAESITOTMIPR_PROGRAMMA1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DAESITOTMIPR.Status() == 2)
    {
      int oldListQBE = PAN_DAESITOTMIPR.iUseListQBE;
      PAN_DAESITOTMIPR.iUseListQBE = 0;
      PAN_DAESITOTMIPR.PanelCommand(Glb.PCM_SEARCH);
      PAN_DAESITOTMIPR.PanelCommand(Glb.PCM_FIND);
      PAN_DAESITOTMIPR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DACRONOPROGR_Init()
  {

    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, "D66CC391-68B6-49A9-9BF9-0AA96630EEE3");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, "Opera/Progetto");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, MyGlb.VIS_GROUPSTYLE);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, MyGlb.PANEL_LIST, 152, -9999, 260, 16, 0, 0);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, MyGlb.PANEL_FORM, 0, 411, 492, 109, 0, 0);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, 0, 90);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, 1, 13);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, 0, 4);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, 1, 4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_OPERAPROGET1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, "31A102C0-A9C4-4281-9A34-2E89E17F8C7C");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, "Finanziamento");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, MyGlb.VIS_GROUPSTYLE);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, MyGlb.PANEL_LIST, 1056, -9999, 208, 16, 0, 0);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, MyGlb.PANEL_FORM, 0, 591, 692, 85, 0, 0);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, 0, 83);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, 1, 13);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, 0, 4);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, 1, 4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_FINANZIAMEN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, "E1A43D98-A8AE-402E-9722-3FF7EE7C85C6");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, "Missione");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, MyGlb.VIS_GROUPSTYLE);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_LIST, 1264, -9999, 208, 16, 0, 0);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_FORM, 0, 651, 632, 49, 0, 0);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, 0, 49);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, 1, 13);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, 0, 4);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, 1, 4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_MISSIONE3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, "0B33E8A7-30DA-485A-8268-3696D557A1B4");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, "Programma");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, MyGlb.VIS_GROUPSTYLE);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, MyGlb.PANEL_LIST, 1472, -9999, 208, 16, 0, 0);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, MyGlb.PANEL_FORM, 0, 675, 648, 49, 0, 0);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, 0, 67);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, 1, 13);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, 0, 4);
    PAN_DACRONOPROGR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, 1, 4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACRONOPROGR_PROGRAMMA4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, "133E4532-5560-409A-BD4F-594BA52A2E82");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, "CRONOPROGRAMMA ID");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.VIS_NONNULLAFIEL);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, 0, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, "9E8E3988-331A-4845-9238-5C990E24465C");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, "VARCOM PROGRESSIVO ");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, "1560F9CD-F0D2-4A88-A677-3409E1933C04");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, "Capitolo FPV");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, "1E25FD06-2086-420C-9617-E27EF17E5FFE");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, "Articolo FPV");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, "E7938437-48F0-4479-867D-D07813105715");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, "Descrizione FPV");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, "2F2569D6-C0B2-4E6F-AE83-EC441B7C1B32");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, "Capitolo");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, "B90865A8-1A89-43B9-87AB-6834FC36F65C");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, "Art.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, "8CC84BD9-670F-4246-8DEC-E5AB32EDAF20");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, "Descrizione Cap");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, "8A64D4A8-E2CC-4599-A2A3-13E2318C47DB");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, "Codice");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, "00BEC003-48C7-472C-BEF8-492CBA4508C5");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, "Descrizione");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, "402FE3D5-9D84-4B26-8270-BB8BB37A0819");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, "Anno Plur.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, "FA9E6B5D-B6AB-4D07-9F32-14BD233A3A33");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, "Importo");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, "F84D579E-814B-4DEB-A78E-197BA185308C");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, "Data Var.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, "9FF45B65-93BF-435C-B3B9-31A64A7639CC");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, "Bil. Var.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, "73BC6285-140B-4D48-811D-D4744F7B9084");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, " ");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.VIS_HYPELINKIMMA);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, "87AB4855-33E1-458B-9871-AAC446D6C1EC");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, "Codice UO");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, "A755D9D6-CDFD-471A-AA60-324F0C61ABA4");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, "Unità Organizzativa");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.VIS_VISULOOUPCF4);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, "2032F324-50D3-4DE1-9AEB-41881CE87E1A");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, "Anno Finanz.");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, "Esercizio plur dell'entrata cronoprogramma se presente, altrimenti esercizio entrata del finanziamento sul cronoprogramma");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, "2725CA12-D053-4C05-BC88-15EF68476A4D");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, "Codice");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, "E2B0F597-8EF1-42EB-BFD4-A858130099D6");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, "Descrizione");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, "A6C19A27-E2BA-4E76-B53C-2AE26DD1CD97");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, "Codice");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, "2EFEE0D4-FAC3-48AF-B950-907A92907A46");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, "Descrizione");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, "645A43C6-1689-4CFF-BD4E-C678B8A554BC");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, "Codice");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, "72428C5A-24B5-4461-9C00-06CE90F83BE0");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, "Descrizione");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.VIS_NORMALFIELDS);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, "EDD0261A-E02B-4EBF-B1AB-2F1E6E9A40D2");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, "Totale da Cronoprogramma");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, MyGlb.VIS_VUOTONORMALE);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, "7727C3AC-498E-4935-B758-B3B2C2F16AA6");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.VIS_CAMPTOTADISA);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DACRONOPROGR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, "41387426-0A2A-4A89-A59E-0F30D60F789F");
    PAN_DACRONOPROGR.set_Header(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_DACRONOPROGR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, "");
    PAN_DACRONOPROGR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_DACRONOPROGR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DACRONOPROGR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, 1312, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, 140);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 340, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, 140);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CRONOPROGRID, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CRONOPROGRID, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CRONOPROGRID, PPQRY_FPVDACRONO1, "A.CRONOPROGRAMMA_ID", "REFPDACRCRID", 3, 10, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, 88);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_LIST, "VARCOM PROGRESSIVO ");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, 88);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_VARCOMPROGRE, MyGlb.PANEL_FORM, "VARC. PROGR.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_VARCOMPROGRE, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_VARCOMPROGRE, PPQRY_FPVDACRONO1, "A.PROGRESSIVO_VAR", "REFPDACRPRVA", 2, 15, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_LIST, 80);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_LIST, "Capitolo FPV");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_FORM, 4, 592, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_FORM, 80);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLOFPV, MyGlb.PANEL_FORM, "Capitolo FPV");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CAPITOLOFPV, -1, -1);
    PAN_DACRONOPROGR.SetFieldUnbound(PFL_DACRONOPROGR_CAPITOLOFPV, true);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CAPITOLOFPV, PPQRY_FPVDACRONO1, "~~PQRY_CAP1.RECORCAPCAPI~~", "CAPITOLOFPV", 3, 28, 6, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_LIST, 76);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_LIST, "Articolo FPV");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_FORM, 4, 616, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_FORM, 76);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLOFPV, MyGlb.PANEL_FORM, "Articolo FPV");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ARTICOLOFPV, -1, -1);
    PAN_DACRONOPROGR.SetFieldUnbound(PFL_DACRONOPROGR_ARTICOLOFPV, true);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ARTICOLOFPV, PPQRY_FPVDACRONO1, "~~PQRY_CAP1.RECORCAPARTI~~", "ARTICOLOFPV", 1, 19, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_LIST, 108);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_LIST, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_LIST, "Descrizione FPV");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_FORM, 4, 640, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_FORM, 108);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_FORM, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIOFPV, MyGlb.PANEL_FORM, "Descrizione FPV");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DESCRIZIOFPV, -1, -1);
    PAN_DACRONOPROGR.SetFieldUnbound(PFL_DACRONOPROGR_DESCRIZIOFPV, true);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DESCRIZIOFPV, PPQRY_FPVDACRONO1, "~~PQRY_CAP1.RECORCAPDESC~~", "DESCRIZIOFPV", 5, 140, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_FORM, 4, 340, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CAPITOLO, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CAPITOLO, PPQRY_FPVDACRONO1, "A.CAPITOLO", "RECFPVDACRCA", 3, 16, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_LIST, 120, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_FORM, 4, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ARTICOLO, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ARTICOLO, PPQRY_FPVDACRONO1, "A.ARTICOLO", "RECFPVDACRAR", 1, 2, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Cap");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 592, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Cap");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DESCRIZIONE, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DESCRIZIONE, PPQRY_FPVDACRONO1, "A.DESCRIZIONE_CAP", "REFPDACRDECC", 5, 140, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, 152, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_LIST, "Codice");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, 4, 436, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_OPERA, MyGlb.PANEL_FORM, "Codice");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_OPERA, -1, GRP_DACRONOPROGR_OPERAPROGET1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_OPERA, PPQRY_FPVDACRONO1, "A.OPERA", "RECFPVDACROP", 1, 5, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, 212, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, 124);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, 4, 484, 484, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, 124);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESCRIZOPERA, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DESCRIZOPERA, -1, GRP_DACRONOPROGR_OPERAPROGET1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DESCRIZOPERA, PPQRY_FPVDACRONO1, "B.DESCRIZIONE", "RECOOPERDESC", 5, 200, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_LIST, 412, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Anno Plur.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_FORM, 4, 460, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_FORM, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Anno Plur.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ESERCIZIPLUR, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ESERCIZIPLUR, PPQRY_FPVDACRONO1, "A.ESERCIZIO_PLUR", "REFPDACRESPL", 1, 4, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_LIST, 460, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_LIST, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_LIST, "Importo");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_IMPORTO3, MyGlb.PANEL_FORM, "Importo");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_IMPORTO3, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_IMPORTO3, PPQRY_FPVDACRONO1, "A.IMPORTO", "RECFPVDACRIM", 3, 14, 2, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, 580, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_LIST, "Data Var.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, 4, 520, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DDATAREG, MyGlb.PANEL_FORM, "Data Var.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DDATAREG, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DDATAREG, PPQRY_FPVDACRONO1, "A.DATA_VAR", "REFPDACRDAVA", 6, 10, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, 652, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, 44);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_LIST, "Bil. Var.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, 4, 544, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, 44);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_BILVAR, MyGlb.PANEL_FORM, "Bil Var");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_BILVAR, -1, -1);
    PAN_DACRONOPROGR.SetFieldUnbound(PFL_DACRONOPROGR_BILVAR, true);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_BILVAR, PPQRY_FPVDACRONO1, "GET_BIL_VAR_CRONO(~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ - 1,~~TBL_DATISESSIONE.SESSIOESERCI~~,A.CRONOPROGRAMMA_ID,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO_PLUR,A.FINANZIAMENTO,A.ANNO_FINANZIAMENTO,A.PROGRESSIVO_VAR)", "RECORDBILVAR", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, 684, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, 104);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_LIST, " ");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, 4, 568, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, 104);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_INFOVARBIL, MyGlb.PANEL_FORM, " ");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_INFOVARBIL, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_INFOVARBIL, PPQRY_DUAL3, "DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL)", "INFOVARBIL", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetValueListItem(PFL_DACRONOPROGR_INFOVARBIL, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DACRONOPROGR.SetValueListItem(PFL_DACRONOPROGR_INFOVARBIL, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DACRONOPROGR.SetValueListItem(PFL_DACRONOPROGR_INFOVARBIL, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, 708, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, 92);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_LIST, "Codice UO");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, 4, 724, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, 92);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CODICEUO, MyGlb.PANEL_FORM, "Codice UO");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CODICEUO, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CODICEUO, PPQRY_CAPUO, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~RECPROUNIORG~~,TRUNC( SYSDATE ))", "CODICEUO", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_LIST, 808, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_LIST, 164);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_FORM, 4, 340, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_FORM, 164);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_CAPUOUNITORG, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_CAPUOUNITORG, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_CAPUOUNITORG, PPQRY_CAPUO, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(~~RECPROUNIORG~~,TRUNC( SYSDATE ))", "UNITAORGANIZ", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_LIST, 1008, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_LIST, 116);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_LIST, "Anno Finanz.");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_FORM, 4, 616, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_FORM, 116);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ANNOFINANZ, MyGlb.PANEL_FORM, "Anno Finanz.");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ANNOFINANZ, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ANNOFINANZ, PPQRY_FPVDACRONO1, "A.ANNO_FINANZIAMENTO", "REFPDACRANFI", 1, 4, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, 1056, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_LIST, "Codice");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 616, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZIAMENT, MyGlb.PANEL_FORM, "Codice");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_FINANZIAMENT, -1, GRP_DACRONOPROGR_FINANZIAMEN1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_FINANZIAMENT, PPQRY_FPVDACRONO1, "A.FINANZIAMENTO", "RECFPVDACRFI", 1, 5, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, 1104, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, 4, 640, 684, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_FINANZDESCRI, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_FINANZDESCRI, -1, GRP_DACRONOPROGR_FINANZIAMEN1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_LIST, 1264, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_LIST, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_LIST, "Codice");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_FORM, 4, 676, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_FORM, 64);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_MISSIONE3, MyGlb.PANEL_FORM, "Codice");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_MISSIONE3, -1, GRP_DACRONOPROGR_MISSIONE3);
    PAN_DACRONOPROGR.SetFieldUnbound(PFL_DACRONOPROGR_MISSIONE3, true);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_MISSIONE3, PPQRY_FPVDACRONO1, "SUBSTR(A.CODICE_STRUTTURA, 1, 2)", "RECORDMISSIO", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_LIST, 1312, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_LIST, 116);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_FORM, 4, 676, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_FORM, 116);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESMISSIONE3, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DESMISSIONE3, -1, GRP_DACRONOPROGR_MISSIONE3);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DESMISSIONE3, PPQRY_DUAL3, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~)))", "DESMISSIONE", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_LIST, 1472, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_LIST, 84);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_LIST, "Codice");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_FORM, 4, 700, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_FORM, 84);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGRAMMA3, MyGlb.PANEL_FORM, "Codice");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_PROGRAMMA3, -1, GRP_DACRONOPROGR_PROGRAMMA4);
    PAN_DACRONOPROGR.SetFieldUnbound(PFL_DACRONOPROGR_PROGRAMMA3, true);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_PROGRAMMA3, PPQRY_FPVDACRONO1, "SUBSTR(A.CODICE_STRUTTURA, 3, 2)", "RECORDPROGRA", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_LIST, 1520, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_LIST, 132);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_FORM, 4, 700, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_FORM, 132);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_DESPROGRAMM3, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_DESPROGRAMM3, -1, GRP_DACRONOPROGR_PROGRAMMA4);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_DESPROGRAMM3, PPQRY_DUAL3, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~RECORDMISSIO~~ || ~~RECORDPROGRA~~)))", "DESPROGRAMMA", 5, 99, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, MyGlb.PANEL_LIST, 288, 252, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, MyGlb.PANEL_LIST, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, MyGlb.PANEL_FORM, 324, 252, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, MyGlb.PANEL_FORM, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_ETICHETOTAL3, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_ETICHETOTAL3, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_ETICHETOTAL3, -1, "", "ETICHETOTAL3", 0, 0, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_LIST, 460, 252, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_LIST, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_FORM, 0);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_TOTALDACRON1, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_TOTALDACRON1, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_TOTALDACRON1, -1, "", "TOTALDACRON1", 0, 0, 0, -13997);
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_DACRONOPROGR.SetRect(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 748, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACRONOPROGR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_DACRONOPROGR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_DACRONOPROGR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACRONOPROGR_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_DACRONOPROGR.SetFieldPage(PFL_DACRONOPROGR_PROGUNITORGA, -1, -1);
    PAN_DACRONOPROGR.SetFieldPanel(PFL_DACRONOPROGR_PROGUNITORGA, PPQRY_FPVDACRONO1, "A.PROGR_UNITA_ORGANIZZATIVA", "RECPROUNIORG", 1, 8, 0, -13997);
  }

  private void PAN_DACRONOPROGR_InitQueries()
  {
    StringBuffer SQL;

    PAN_DACRONOPROGR.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~RECPROUNIORG~~,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(~~RECPROUNIORG~~,TRUNC( SYSDATE )) as UNITAORGANIZ ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_CAPUO, 0, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(PPQRY_CAPUO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~RECORDBILVAR~~, 'V', 'I', NULL) as INFOVARBIL, ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~))) as DESMISSIONE, ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~RECORDMISSIO~~ || ~~RECORDPROGRA~~))) as DESPROGRAMMA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~REFPDACRCRID~~ IS NULL))) ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_DUAL3, 0, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_DUAL3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(PPQRY_DUAL3, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~RECFPVDACRFI~~) ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_DACRONOPROGR.SetIMDB(IMDB, "PQRY_FPVDACRONO1", true);
    PAN_DACRONOPROGR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPCAPI~~ as CAPITOLOFPV, ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPARTI~~ as ARTICOLOFPV, ");
    SQL.append("  ~~PQRY_CAP1.RECORCAPDESC~~ as DESCRIZIOFPV, ");
    SQL.append("  A.CRONOPROGRAMMA_ID as REFPDACRCRID, ");
    SQL.append("  A.CAPITOLO as RECFPVDACRCA, ");
    SQL.append("  A.ARTICOLO as RECFPVDACRAR, ");
    SQL.append("  A.DESCRIZIONE_CAP as REFPDACRDECC, ");
    SQL.append("  A.OPERA as RECFPVDACROP, ");
    SQL.append("  B.DESCRIZIONE as RECOOPERDESC, ");
    SQL.append("  A.ESERCIZIO_PLUR as REFPDACRESPL, ");
    SQL.append("  A.IMPORTO as RECFPVDACRIM, ");
    SQL.append("  A.DATA_VAR as REFPDACRDAVA, ");
    SQL.append("  GET_BIL_VAR_CRONO(~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ - 1,~~TBL_DATISESSIONE.SESSIOESERCI~~,A.CRONOPROGRAMMA_ID,A.CAPITOLO,A.ARTICOLO,A.ESERCIZIO_PLUR,A.FINANZIAMENTO,A.ANNO_FINANZIAMENTO,A.PROGRESSIVO_VAR) as RECORDBILVAR, ");
    SQL.append("  A.PROGRESSIVO_VAR as REFPDACRPRVA, ");
    SQL.append("  A.FINANZIAMENTO as RECFPVDACRFI, ");
    SQL.append("  A.ANNO_FINANZIAMENTO as REFPDACRANFI, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 1, 2) as RECORDMISSIO, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 3, 2) as RECORDPROGRA, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as RECPROUNIORG ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_FPVDACRONO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_CRONO A, ");
    SQL.append("  OPERE B ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_FPVDACRONO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE = A.OPERA) ");
    SQL.append("and   (A.ESERCIZIO_PLUR > ~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ - 1) ");
    SQL.append("and   (A.ANNO_FINANZIAMENTO <= ~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ - 1) ");
    SQL.append("and   (SUBSTR(A.COD_4_LIV, 1, 1) = TO_CHAR ( DECODE(~~PQRY_CAP1.RECORCAPCAPI~~, 9999999999999997, 1, 2) )) ");
    SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_FPVDACRONO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DACRONOPROGR.SetQuery(PPQRY_FPVDACRONO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DACRONOPROGR.SetQuery(PPQRY_FPVDACRONO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_DACRONOPROGR.SetQuery(PPQRY_FPVDACRONO1, 5, SQL, -1, "");
    PAN_DACRONOPROGR.SetQueryDB(PPQRY_FPVDACRONO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACRONOPROGR.SetMasterTable(0, "FPV_DA_CRONO");
    PAN_DACRONOPROGR.AddToSortList(PFL_DACRONOPROGR_CAPITOLO, true);
    PAN_DACRONOPROGR.AddToSortList(PFL_DACRONOPROGR_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DACRONOPROGR.Status() == 2)
    {
      int oldListQBE = PAN_DACRONOPROGR.iUseListQBE;
      PAN_DACRONOPROGR.iUseListQBE = 0;
      PAN_DACRONOPROGR.PanelCommand(Glb.PCM_SEARCH);
      PAN_DACRONOPROGR.PanelCommand(Glb.PCM_FIND);
      PAN_DACRONOPROGR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DACROTOTMIPR_Init()
  {

    PAN_DACROTOTMIPR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DACROTOTMIPR.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, "28549F3D-88E8-49CB-AD31-6418E3FDAD74");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, "Opera/Progetto");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, MyGlb.VIS_GROUPSTYLE);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, 0, 90);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, 1, 13);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, 0, 4);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, 1, 4);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_OPERAPROGETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, "ABC1B06A-216F-4D13-AEDD-257DC3EAF4F3");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, "Finanziamento");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, 0, 83);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, 1, 13);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, 0, 4);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, 1, 4);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, "3D54AAAB-B817-4B5B-A4DD-0A032F52247A");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, "Missione");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_LIST, 120, -9999, 208, 16, 0, 0);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_FORM, 0, 651, 632, 49, 0, 0);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, 0, 49);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, 1, 13);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, 0, 4);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, 1, 4);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_MISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, "5AC6EC54-4D51-472E-A097-FE3E685F7650");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, "Programma");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, MyGlb.VIS_GROUPSTYLE);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_LIST, 328, -9999, 208, 16, 0, 0);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_FORM, 0, 675, 648, 49, 0, 0);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, 0, 67);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, 1, 13);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, 0, 4);
    PAN_DACROTOTMIPR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, 1, 4);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_GROUP, GRP_DACROTOTMIPR_PROGRAMMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DACROTOTMIPR.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, "5A49FF25-159F-4972-8D62-E51123FEAF49");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, "Importo");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, "86C264A9-1022-4D92-A425-D980F3CE2021");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, "Codice");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, "29BCD0F4-8FF4-4BE7-BECF-73B8845C4137");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, "Descrizione");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, "C4A7592D-D066-4BAF-A224-E315F2010E41");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, "Codice");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, "B0E292CF-B15D-4A67-8FCF-2BB172743E29");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, "Descrizione");
    PAN_DACROTOTMIPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DACROTOTMIPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, "C9C1047A-7EF7-4E72-A496-EE0090419552");
    PAN_DACROTOTMIPR.set_Header(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, "");
    PAN_DACROTOTMIPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DACROTOTMIPR.SetFlags(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DACROTOTMIPR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_FORM, 4, 592, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DACROTOTMIPR.SetFieldPage(PFL_DACROTOTMIPR_IMPORTO, -1, -1);
    PAN_DACROTOTMIPR.SetFieldUnbound(PFL_DACROTOTMIPR_IMPORTO, true);
    PAN_DACROTOTMIPR.SetFieldPanel(PFL_DACROTOTMIPR_IMPORTO, PPQRY_FPVDACRONO, "SUM(A.IMPORTO)", "IMPORTO", 3, 28, 6, -13997);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_LIST, 120, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_LIST, 64);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_LIST, "Codice");
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_FORM, 4, 676, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_FORM, 64);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_MISSIONE, MyGlb.PANEL_FORM, "Codice");
    PAN_DACROTOTMIPR.SetFieldPage(PFL_DACROTOTMIPR_MISSIONE, -1, GRP_DACROTOTMIPR_MISSIONE);
    PAN_DACROTOTMIPR.SetFieldUnbound(PFL_DACROTOTMIPR_MISSIONE, true);
    PAN_DACROTOTMIPR.SetFieldPanel(PFL_DACROTOTMIPR_MISSIONE, PPQRY_FPVDACRONO, "SUBSTR(A.CODICE_STRUTTURA, 1, 2)", "RECORDMISSIO", 5, 99, 0, -13997);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_LIST, 168, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_LIST, 116);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_FORM, 4, 676, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_FORM, 116);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESMISSIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACROTOTMIPR.SetFieldPage(PFL_DACROTOTMIPR_DESMISSIONE, -1, GRP_DACROTOTMIPR_MISSIONE);
    PAN_DACROTOTMIPR.SetFieldPanel(PFL_DACROTOTMIPR_DESMISSIONE, PPQRY_DUAL, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~)))", "DESMISSIONE", 5, 99, 0, -13997);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_LIST, 328, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_LIST, 84);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_LIST, "Codice");
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_FORM, 4, 700, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_FORM, 84);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_PROGRAMMA, MyGlb.PANEL_FORM, "Codice");
    PAN_DACROTOTMIPR.SetFieldPage(PFL_DACROTOTMIPR_PROGRAMMA, -1, GRP_DACROTOTMIPR_PROGRAMMA);
    PAN_DACROTOTMIPR.SetFieldUnbound(PFL_DACROTOTMIPR_PROGRAMMA, true);
    PAN_DACROTOTMIPR.SetFieldPanel(PFL_DACROTOTMIPR_PROGRAMMA, PPQRY_FPVDACRONO, "SUBSTR(A.CODICE_STRUTTURA, 3, 2)", "RECORDPROGRA", 5, 99, 0, -13997);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_LIST, 376, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_LIST, 132);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_FORM, 4, 700, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_FORM, 132);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_DACROTOTMIPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_DESPROGRAMMA, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DACROTOTMIPR.SetFieldPage(PFL_DACROTOTMIPR_DESPROGRAMMA, -1, GRP_DACROTOTMIPR_PROGRAMMA);
    PAN_DACROTOTMIPR.SetFieldPanel(PFL_DACROTOTMIPR_DESPROGRAMMA, PPQRY_DUAL, "A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~RECORDMISSIO~~ || ~~RECORDPROGRA~~)))", "DESPROGRAMMA", 5, 99, 0, -13997);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, MyGlb.PANEL_LIST, 0, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, MyGlb.PANEL_LIST, 0);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, MyGlb.PANEL_LIST, 1);
    PAN_DACROTOTMIPR.SetRect(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, MyGlb.PANEL_FORM, 360, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DACROTOTMIPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, MyGlb.PANEL_FORM, 0);
    PAN_DACROTOTMIPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DACROTOTMIPR_TOTALDACRONO, MyGlb.PANEL_FORM, 1);
    PAN_DACROTOTMIPR.SetFieldPage(PFL_DACROTOTMIPR_TOTALDACRONO, -1, -1);
    PAN_DACROTOTMIPR.SetFieldPanel(PFL_DACROTOTMIPR_TOTALDACRONO, -1, "", "TOTALDACRONO", 0, 0, 0, -13997);
  }

  private void PAN_DACROTOTMIPR_InitQueries()
  {
    StringBuffer SQL;

    PAN_DACROTOTMIPR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,1,TRUNC(TO_NUMBER(~~RECORDMISSIO~~))) as DESMISSIONE, ");
    SQL.append("  A_GET_DES_DA_STRUTTURA('S',~~PQRY_PARAMETRI498.NOMOGGESEPLU~~,2,TRUNC(TO_NUMBER(~~RECORDMISSIO~~ || ~~RECORDPROGRA~~))) as DESPROGRAMMA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DACROTOTMIPR.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_DACROTOTMIPR.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACROTOTMIPR.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_DACROTOTMIPR.SetIMDB(IMDB, "PQRY_FPVDACRONO", true);
    PAN_DACROTOTMIPR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(A.IMPORTO) as IMPORTO, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 1, 2) as RECORDMISSIO, ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 3, 2) as RECORDPROGRA ");
    PAN_DACROTOTMIPR.SetQuery(PPQRY_FPVDACRONO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FPV_DA_CRONO A ");
    PAN_DACROTOTMIPR.SetQuery(PPQRY_FPVDACRONO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO_PLUR > ~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ - 1) ");
    SQL.append("and   (A.ANNO_FINANZIAMENTO <= ~~PQRY_PARAMETRI498.NOMOGGESEPLU~~ - 1) ");
    SQL.append("and   (SUBSTR(A.COD_4_LIV, 1, 1) = TO_CHAR ( DECODE(~~PQRY_CAP1.RECORCAPCAPI~~, 9999999999999997, 1, 2) )) ");
    SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_DACROTOTMIPR.SetQuery(PPQRY_FPVDACRONO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 1, 2), ");
    SQL.append("  SUBSTR(A.CODICE_STRUTTURA, 3, 2) ");
    PAN_DACROTOTMIPR.SetQuery(PPQRY_FPVDACRONO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DACROTOTMIPR.SetQuery(PPQRY_FPVDACRONO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 3 ");
    PAN_DACROTOTMIPR.SetQuery(PPQRY_FPVDACRONO, 5, SQL, -1, "");
    PAN_DACROTOTMIPR.SetQueryDB(PPQRY_FPVDACRONO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DACROTOTMIPR.SetMasterTable(0, "FPV_DA_CRONO");
    PAN_DACROTOTMIPR.AddToSortList(PFL_DACROTOTMIPR_MISSIONE, true);
    PAN_DACROTOTMIPR.AddToSortList(PFL_DACROTOTMIPR_PROGRAMMA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DACROTOTMIPR.Status() == 2)
    {
      int oldListQBE = PAN_DACROTOTMIPR.iUseListQBE;
      PAN_DACROTOTMIPR.iUseListQBE = 0;
      PAN_DACROTOTMIPR.PanelCommand(Glb.PCM_SEARCH);
      PAN_DACROTOTMIPR.PanelCommand(Glb.PCM_FIND);
      PAN_DACROTOTMIPR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DAESITOTMIPR) PAN_DAESITOTMIPR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DACROTOTMIPR) PAN_DACROTOTMIPR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_ValidateRow(Cancel);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_ValidateRow(Cancel);
    if (SrcObj == PAN_DAESITOTMIPR) PAN_DAESITOTMIPR_ValidateRow(Cancel);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_ValidateRow(Cancel);
    if (SrcObj == PAN_DACROTOTMIPR) PAN_DACROTOTMIPR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_DynamicProperties();
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_DynamicProperties();
    if (SrcObj == PAN_DAESITOTMIPR) PAN_DAESITOTMIPR_DynamicProperties();
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_DynamicProperties();
    if (SrcObj == PAN_DACROTOTMIPR) PAN_DACROTOTMIPR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DAESITOTMIPR) PAN_DAESITOTMIPR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DACROTOTMIPR) PAN_DACROTOTMIPR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_AfterFind(CmdFind);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_AfterFind(CmdFind);
    if (SrcObj == PAN_DAESITOTMIPR) PAN_DAESITOTMIPR_AfterFind(CmdFind);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_AfterFind(CmdFind);
    if (SrcObj == PAN_DACROTOTMIPR) PAN_DACROTOTMIPR_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CAPITOLI) PAN_CAPITOLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DAESIGIBILIT) PAN_DAESIGIBILIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DAESITOTMIPR) PAN_DAESITOTMIPR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DACRONOPROGR) PAN_DACRONOPROGR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DACROTOTMIPR) PAN_DACROTOTMIPR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
