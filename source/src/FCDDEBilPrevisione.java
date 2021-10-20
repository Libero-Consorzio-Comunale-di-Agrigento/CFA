// **********************************************
// FCDDE Bil Previsione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FCDDEBilPrevisione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ESERCIZIPLUR = 0;

  private static int PPQRY_AD4PROGETTI = 0;

  private static int PPQRY_ESERCIFINANZ = 1;


  IDPanel PAN_PARAMETRI;
  private static int GRP_FCDDEBILPREV_MEDARISUITOT = 0;
  private static int GRP_FCDDEBILPREV_MEDARIDESIRA = 1;
  private static int GRP_FCDDEBILPREV_MEDPOSUACEIN = 2;
  private static int GRP_FCDDEBILPREV_MEPOSUMEACEI = 3;

  private static int PFL_FCDDEBILPREV_TITOLO = 0;
  private static int PFL_FCDDEBILPREV_TIPOLOGIA = 1;
  private static int PFL_FCDDEBILPREV_CAPITOLO = 2;
  private static int PFL_FCDDEBILPREV_ART = 3;
  private static int PFL_FCDDEBILPREV_DESCRIZIONE = 4;
  private static int PFL_FCDDEBILPREV_ESERCIZIO = 5;
  private static int PFL_FCDDEBILPREV_ACCERTATOM5 = 6;
  private static int PFL_FCDDEBILPREV_IMGAM5 = 7;
  private static int PFL_FCDDEBILPREV_INCASSATOM5 = 8;
  private static int PFL_FCDDEBILPREV_IMGIM5 = 9;
  private static int PFL_FCDDEBILPREV_PERCENTUALM5 = 10;
  private static int PFL_FCDDEBILPREV_ACCERTATOM4 = 11;
  private static int PFL_FCDDEBILPREV_IMGAM4 = 12;
  private static int PFL_FCDDEBILPREV_INCASSATOM4 = 13;
  private static int PFL_FCDDEBILPREV_IMGIM4 = 14;
  private static int PFL_FCDDEBILPREV_PERCENTUALM4 = 15;
  private static int PFL_FCDDEBILPREV_ACCERTATOM3 = 16;
  private static int PFL_FCDDEBILPREV_IMGAM3 = 17;
  private static int PFL_FCDDEBILPREV_INCASSATOM3 = 18;
  private static int PFL_FCDDEBILPREV_IMGIM3 = 19;
  private static int PFL_FCDDEBILPREV_PERCENTUALM3 = 20;
  private static int PFL_FCDDEBILPREV_ACCERTATOM2 = 21;
  private static int PFL_FCDDEBILPREV_IMGAM2 = 22;
  private static int PFL_FCDDEBILPREV_INCASSATOM2 = 23;
  private static int PFL_FCDDEBILPREV_IMGIM2 = 24;
  private static int PFL_FCDDEBILPREV_PERCENTUALM2 = 25;
  private static int PFL_FCDDEBILPREV_ACCERTATOM1 = 26;
  private static int PFL_FCDDEBILPREV_IMGAM1 = 27;
  private static int PFL_FCDDEBILPREV_INCASSATOM1 = 28;
  private static int PFL_FCDDEBILPREV_IMGIM1 = 29;
  private static int PFL_FCDDEBILPREV_PERCENTUALM1 = 30;
  private static int PFL_FCDDEBILPREV_TIPOCALCOLO = 31;
  private static int PFL_FCDDEBILPREV_PERCMT = 32;
  private static int PFL_FCDDEBILPREV_RECIPROCOMT = 33;
  private static int PFL_FCDDEBILPREV_RECIPRETTIMT = 34;
  private static int PFL_FCDDEBILPREV_PREVISIONE = 35;
  private static int PFL_FCDDEBILPREV_FONDOATTESMT = 36;
  private static int PFL_FCDDEBILPREV_PERCAPPLICMT = 37;
  private static int PFL_FCDDEBILPREV_FONDOCALCOMT = 38;
  private static int PFL_FCDDEBILPREV_PERCMS = 39;
  private static int PFL_FCDDEBILPREV_RECIPROCOMS = 40;
  private static int PFL_FCDDEBILPREV_RECIPRETTIMS = 41;
  private static int PFL_FCDDEBILPREV_PREVISIONE1 = 42;
  private static int PFL_FCDDEBILPREV_FONDOATTESMS = 43;
  private static int PFL_FCDDEBILPREV_PERCAPPLICMS = 44;
  private static int PFL_FCDDEBILPREV_FONDOCALCOMS = 45;
  private static int PFL_FCDDEBILPREV_ACCERTARIVPA = 46;
  private static int PFL_FCDDEBILPREV_INCASSARIVPA = 47;
  private static int PFL_FCDDEBILPREV_PERCRIVPA = 48;
  private static int PFL_FCDDEBILPREV_RECIPROCOPA = 49;
  private static int PFL_FCDDEBILPREV_RECIPRETTIPA = 50;
  private static int PFL_FCDDEBILPREV_PREVISIONE2 = 51;
  private static int PFL_FCDDEBILPREV_FONDOATTESPA = 52;
  private static int PFL_FCDDEBILPREV_PERCAPPLICPA = 53;
  private static int PFL_FCDDEBILPREV_FONDOCALCOPA = 54;
  private static int PFL_FCDDEBILPREV_PERACCINCRIV = 55;
  private static int PFL_FCDDEBILPREV_RECIPROCOPR = 56;
  private static int PFL_FCDDEBILPREV_RECIPRETTIPR = 57;
  private static int PFL_FCDDEBILPREV_PREVISIONE3 = 58;
  private static int PFL_FCDDEBILPREV_FONDOATTESPR = 59;
  private static int PFL_FCDDEBILPREV_PERCAPPLICPR = 60;
  private static int PFL_FCDDEBILPREV_FONDOCALCOPR = 61;
  private static int PFL_FCDDEBILPREV_FONDOFINALE = 62;
  private static int PFL_FCDDEBILPREV_ACCANEFFBILA = 63;
  private static int PFL_FCDDEBILPREV_ESERCIZIPLU1 = 64;

  private static int PPQRY_FSCIMPORTI = 0;

  private static int PPQRY_ICONEINFO = 1;

  private static int PPQRY_FSCTIPICALCO = 2;


  IDPanel PAN_FCDDEBILPREV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FSCPARAMETRI(IMDB);
    Init_TBL_PARAFCDDPREV(IMDB);
    //
    //
    Init_PQRY_FSCIMPORTI(IMDB);
    Init_PQRY_AD4PROGETTI(IMDB);
    Init_PQRY_AD4PROGETTI_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FSCPARAMETRI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_FSCPARAMETRI, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_FSCPARAMETRI, "TBL_FSCPARAMETRI");
    IMDB.set_FldCode(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOMOGGTIPCLA,5,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPRESAR, "NOMOGGPRESAR");
    IMDB.SetFldParams(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPRESAR,1,9,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOOGTICANUOR, "NOOGTICANUOR");
    IMDB.SetFldParams(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOOGTICANUOR,5,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPERRIF, "NOMOGGPERRIF");
    IMDB.SetFldParams(IMDBDef3.TBL_FSCPARAMETRI,IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPERRIF,5,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_FSCPARAMETRI, 0);
  }

  private static void Init_TBL_PARAFCDDPREV(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAFCDDPREV, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAFCDDPREV, "TBL_PARAFCDDPREV");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAFCDDPREV,IMDBDef3.FLD_PARAFCDDPREV_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAFCDDPREV,IMDBDef3.FLD_PARAFCDDPREV_NOMOGGESEPLU,1,4,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAFCDDPREV, 0);
  }

  private static void Init_PQRY_FSCIMPORTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FSCIMPORTI, 55);
    IMDB.set_TblCode(IMDBDef11.PQRY_FSCIMPORTI, "PQRY_FSCIMPORTI");
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_TIPOLOGIA_CATEGORIA, "TIPOLOGIA_CATEGORIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_TIPOLOGIA_CATEGORIA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_TITOLO,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M5, "ACCERTATO_M5");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M5,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M5, "INCASSATO_M5");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M5,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M5, "PERCENTUALE_M5");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M5,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M4, "ACCERTATO_M4");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M4,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M4, "INCASSATO_M4");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M4,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M4, "PERCENTUALE_M4");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M4,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M3, "ACCERTATO_M3");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M3, "INCASSATO_M3");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M3, "PERCENTUALE_M3");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M3,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M2, "ACCERTATO_M2");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M2, "INCASSATO_M2");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M2, "PERCENTUALE_M2");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M2,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M1, "ACCERTATO_M1");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M1, "INCASSATO_M1");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M1, "PERCENTUALE_M1");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERCENTUALE_M1,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, "TIPO_CALCOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_MT, "PERC_MT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_MT,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_MT, "RECIPROCO_MT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_MT,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MT, "RECIPROCO_RETTIF_MT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MT,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MT, "FONDO_ATTESO_MT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MT,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_MT, "PERC_APPLICATA_MT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_MT,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MT, "FONDO_CALCOLATO_MT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MT,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_MS, "PERC_MS");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_MS,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_MS, "RECIPROCO_MS");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_MS,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MS, "RECIPROCO_RETTIF_MS");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MS,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MS, "FONDO_ATTESO_MS");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MS, "FONDO_CALCOLATO_MS");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_MS, "PERC_APPLICATA_MS");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_MS,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_RIV_PA, "ACCERTATO_RIV_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCERTATO_RIV_PA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_RIV_PA, "INCASSATO_RIV_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_INCASSATO_RIV_PA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_RIV_PA, "PERC_RIV_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_RIV_PA,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_PA, "RECIPROCO_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_PA,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PA, "RECIPROCO_RETTIF_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PA,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PA, "FONDO_ATTESO_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_PA, "PERC_APPLICATA_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_PA,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PA, "FONDO_CALCOLATO_PA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_ACC_INC_RIV, "PERC_ACC_INC_RIV");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_ACC_INC_RIV,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_PR, "RECIPROCO_PR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_PR,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PR, "RECIPROCO_RETTIF_PR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PR,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PR, "FONDO_ATTESO_PR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PR,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_PR, "PERC_APPLICATA_PR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_PR,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PR, "FONDO_CALCOLATO_PR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PR,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, "FONDO_FINALE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, "ACCANT_EFF_BILANCIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVIS, "RECORDPREVIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVIS,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVI2, "RECORDPREVI2");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVI2,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVI3, "RECORDPREVI3");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVI3,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ESERCIZIO_PLUR, "ESERCIZIO_PLUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORTI,IMDBDef11.PQSL_FSCIMPORTI_ESERCIZIO_PLUR,1,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_FSCIMPORTI, 0);
  }

  private static void Init_PQRY_AD4PROGETTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_AD4PROGETTI, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_AD4PROGETTI, "PQRY_AD4PROGETTI");
    IMDB.set_FldCode(IMDBDef11.PQRY_AD4PROGETTI,IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef11.PQRY_AD4PROGETTI,IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU,1,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_AD4PROGETTI, 0);
  }

  private static void Init_PQRY_AD4PROGETTI_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_AD4PROGETTI_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_AD4PROGETTI_RS, "PQRY_AD4PROGETTI_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_AD4PROGETTI_RS,IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef11.PQRY_AD4PROGETTI_RS,IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FCDDEBilPrevisione(MyWebEntryPoint w, IMDBObj imdb)
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
  public FCDDEBilPrevisione()
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
    FormIdx = MyGlb.FRM_FCDDEBILPREV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C18CCD91-3181-4F2B-AA67-B6684B0F941F";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1028;
    DesignHeight = 502;
    set_Caption(new IDVariant("FCDDE Bil. Previsione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1028;
    Frames[1].Height = 476;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0756303;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1028;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.ShowRowSelector = false;
    PAN_PARAMETRI.ShowToolbar = false;
    PAN_PARAMETRI.ShowStatusbar = false;
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1028-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A6B02954-2154-42B8-918C-0808B3C3248A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 100, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1028;
    Frames[3].Height = 440;
    Frames[3].Caption = "FCDDE Bil. Previsione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 440;
    PAN_FCDDEBILPREV = new IDPanel(w, this, 3, "PAN_FCDDEBILPREV");
    Frames[3].Content = PAN_FCDDEBILPREV;
    PAN_FCDDEBILPREV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FCDDEBILPREV.VS = MainFrm.VisualStyleList;
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1028-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "288B2C17-52D0-4FB7-B8D8-03F99E5CEF6B");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5664, 356, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FCDDEBILPREV.InitStatus = 2;
    PAN_FCDDEBILPREV_Init();
    PAN_FCDDEBILPREV_InitFields();
    PAN_FCDDEBILPREV_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG22+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG168+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG22+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CALCOLOFCDD2+BaseCmdLinIdx)
      {
        RicalcoloFCDDEBilPrevisione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGCAPBILPRE+BaseCmdLinIdx)
      {
        AggiornaCapitoliBilPrevisione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGTIPCALCAP+BaseCmdLinIdx)
      {
        ((DefinizioneTipoCalcolo)MainFrm.GetForm(MyGlb.FRM_DEFITIPOCALC,0)).AggiornaTipoCalcolo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGCAPDETICA+BaseCmdLinIdx)
      {
        ((DefinizioneTipoCalcolo)MainFrm.GetForm(MyGlb.FRM_DEFITIPOCALC,0)).AggiornaCapitoliDefTipoCalcolo();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAFCDDPREV, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FCDDEBILPREV_AD4PROGETTI();
      }
      PAN_FCDDEBILPREV.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof FCDDEBilPrevisione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FCDDEBilPrevisione.class.getName() : (Glb.ClassWithPackage(FCDDEBilPrevisione.class) ? FCDDEBilPrevisione.class.getName().substring(FCDDEBilPrevisione.class.getPackage().getName().length() + 1) : FCDDEBilPrevisione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Ricalcolo FCDDE Bil Previsione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RicalcoloFCDDEBilPrevisione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricalcolo FCDDE Bil Previsione Body
      // Corpo Procedura
      // 
      if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add((new IDVariant("Il calcolo interesserà i tre esercizi del Bilancio di Previsione.")), (new IDVariant("<br/>"))), (new IDVariant("Sei sicuro di voler proseguire?"))))))
      {
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      // 
      // Lancio della Procedure
      // 
      MainFrm.Cf4armDBObject.FSCCALCOLOGEN(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToInteger(MainFrm.PRIMOESERARM));
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      PAN_FCDDEBILPREV.PanelCommand(Glb.PCM_REQUERY);
      MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita."))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "RicalcoloFCDDEBilPrevisione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Capitoli Bil Previsione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornaCapitoliBilPrevisione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Capitoli Bil Previsione Body
      // Corpo Procedura
      // 
      IDVariant v_SMESSAGGIO = new IDVariant(0,IDVariant.STRING);
      // 
      //  
      // 
      if (new IDVariant(PAN_FCDDEBILPREV.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      // 
      //  
      // 
      if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add((new IDVariant("Verranno aggiunti i nuovi Capitoli per i tre esercizi del Bilancio di Previsione.")), (new IDVariant("<br/>"))), (new IDVariant("Sei sicuro di voler proseguire?"))))))
      {
        return 0;
      }
      // 
      // Lancio della Procedure
      // 
      MainFrm.Cf4armDBObject.FSCAGGCAPIMPORTIPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToInteger(MainFrm.PRIMOESERARM), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_SMESSAGGIO);
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      PAN_FCDDEBILPREV.PanelCommand(Glb.PCM_REQUERY);
      MainFrm.set_AlertMessage(v_SMESSAGGIO); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "AggiornaCapitoliBilPrevisione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertato Incassato
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // p Colonna: 1-5 colonne - Input
  // p Tipo Colonna: A=Accertato;I=Incassato - Input
  // **********************************************************************
  public int InfoAccertatoIncassato (IDVariant pColonna, IDVariant pTipoColonna)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertato Incassato Body
      // Corpo Procedura
      // 
      IDVariant v_VESERCIZIO = new IDVariant(0,IDVariant.INTEGER);
      if (pColonna.compareTo((new IDVariant(1)), true)<0 || pColonna.compareTo((new IDVariant(5)), true)>0)
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Funzione non abilitata per la colonna selezionata"));
        MainFrm.set_AlertMessage(v_VMSG); 
        return 0;
      }
      if (pTipoColonna.compareTo((new IDVariant("A")), true)!=0 && pTipoColonna.compareTo((new IDVariant("I")), true)!=0)
      {
        IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
        v_VMSG = (new IDVariant("Funzione non abilitata per la colonna selezionata"));
        MainFrm.set_AlertMessage(v_VMSG); 
        return 0;
      }
      // 
      // Determino Esercizio selezionato
      // 
      if (IMDB.Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPERRIF, 0).equals((new IDVariant("QN-1")), true))
      {
        switch ((pColonna).intValue())
        {
          case 1:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)));
          }
          break;

          case 2:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)));
          }
          break;

          case 3:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(3)));
          }
          break;

          case 4:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(4)));
          }
          break;

          case 5:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(5)));
          }
          break;

        }
      }
      else
      {
        switch ((pColonna).intValue())
        {
          case 1:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)));
          }
          break;

          case 2:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(3)));
          }
          break;

          case 3:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(4)));
          }
          break;

          case 4:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(5)));
          }
          break;

          case 5:	
          {
            v_VESERCIZIO = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(6)));
          }
          break;

        }
      }
      if (pTipoColonna.equals((new IDVariant("A")), true))
      {
        MainFrm.UnloadForm(MyGlb.FRM_FCDDINFOACCE,(new IDVariant(2)).booleanValue()); 
        IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCLA, 0, IMDB.Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGTIPCLA, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEESER, 0, new IDVariant(v_VESERCIZIO));
        IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_CAPITOLO, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMOGGTIPCAT, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPOLOGIA_CATEGORIA, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARINFACCFCD, IMDBDef3.FLD_PARINFACCFCD_NOMEOGGEDESC, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_DESCRIZIONE, 0));
        MainFrm.Show(MyGlb.FRM_FCDDINFOACCE, (new IDVariant(2)).intValue(), this); 
      }
      else
      {
        MainFrm.UnloadForm(MyGlb.FRM_FCDDINFOINCA,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCLA, 0, IMDB.Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGTIPCLA, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOOGTICANUOR, 0, IMDB.Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOOGTICANUOR, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEESER, 0, new IDVariant(v_VESERCIZIO));
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGPERRIF, 0, IMDB.Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPERRIF, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_CAPITOLO, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMOGGTIPCAT, 0, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPOLOGIA_CATEGORIA, 0)));
        IMDB.set_Value(IMDBDef3.TBL_PARINFINCFC3, IMDBDef3.FLD_PARINFINCFC3_NOMEOGGEDESC, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_DESCRIZIONE, 0));
        MainFrm.Show(MyGlb.FRM_FCDDINFOINCA, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoAccertatoIncassato", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertato M1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertatoM1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertato M1 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(1)), (new IDVariant("A")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoAccertatoM1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertato M2
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertatoM2 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertato M2 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(2)), (new IDVariant("A")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoAccertatoM2", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertato M3
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertatoM3 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertato M3 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(3)), (new IDVariant("A")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoAccertatoM3", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertato M4
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertatoM4 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertato M4 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(4)), (new IDVariant("A")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoAccertatoM4", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertato M5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertatoM5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertato M5 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(5)), (new IDVariant("A")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoAccertatoM5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Incassato M1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoIncassatoM1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Incassato M1 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(1)), (new IDVariant("I")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoIncassatoM1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Incassato M2
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoIncassatoM2 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Incassato M2 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(2)), (new IDVariant("I")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoIncassatoM2", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Incassato M3
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoIncassatoM3 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Incassato M3 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(3)), (new IDVariant("I")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoIncassatoM3", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Incassato M4
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoIncassatoM4 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Incassato M4 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(4)), (new IDVariant("I")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoIncassatoM4", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Incassato M5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoIncassatoM5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Incassato M5 Body
      // Corpo Procedura
      // 
      InfoAccertatoIncassato((new IDVariant(5)), (new IDVariant("I")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "InfoIncassatoM5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // FCDDE Bil Previsione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FCDDEBILPREV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FCDDEBILPREV);
      // 
      // FCDDE Bil Previsione On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FCDDEBILPREV.set_ToolTip(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_DESCRIZIONE,(new IDVariant(PAN_FCDDEBILPREV.FieldText(PFL_FCDDEBILPREV_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "FCDDEBilPrevisioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // FCDDE Bil Previsione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FCDDEBILPREV_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FCDDE Bil Previsione On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_RECIPRETTIMT)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PREVISIONE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MT, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MT, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, 0)), (new IDVariant(100))));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOATTESMT)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PERCAPPLICMT)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MT, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_MT, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MT, 0)), (new IDVariant(100))));
        if (IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("MT")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MT, 0));
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOCALCOMT)), true) && FieldWasModified.booleanValue() && IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("MT")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MT, 0));
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_RECIPRETTIMS)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PREVISIONE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MS, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MS, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, 0)), (new IDVariant(100))));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOATTESMS)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PERCAPPLICMS)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MS, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_MS, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_MS, 0)), (new IDVariant(100))));
        if (IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("MS")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MS, 0));
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOCALCOMS)), true) && FieldWasModified.booleanValue() && IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("MS")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_MS, 0));
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_RECIPRETTIPA)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PREVISIONE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PA, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PA, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, 0)), (new IDVariant(100))));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOATTESPA)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PERCAPPLICPA)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PA, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_PA, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PA, 0)), (new IDVariant(100))));
        if (IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("PA")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PA, 0));
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOCALCOPA)), true) && FieldWasModified.booleanValue() && IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("PA")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PA, 0));
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_RECIPRETTIPR)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PREVISIONE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PR, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PR, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, 0)), (new IDVariant(100))));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOATTESPR)), true) || Column.equals((new IDVariant(PFL_FCDDEBILPREV_PERCAPPLICPR)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PR, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PERC_APPLICATA_PR, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_ATTESO_PR, 0)), (new IDVariant(100))));
        if (IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("PR")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PR, 0));
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_FCDDEBILPREV_FONDOCALCOPR)), true) && FieldWasModified.booleanValue() && IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_TIPO_CALCOLO, 0).equals((new IDVariant("PR")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_CALCOLATO_PR, 0));
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_PREVISIONE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVIS, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, 0));
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVI2, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, 0));
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_RECORDPREVI3, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_PREVISIONE, 0));
      }
      if ((Column.equals((new IDVariant(PFL_FCDDEBILPREV_ACCANEFFBILA)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0),(new IDVariant(0))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0),(new IDVariant(0))), true)<0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("L'Accantonamento Effettivo di Bilancio(c) non può essere minore dell'Accantonamento Obbligatorio al Fondo(b)."));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO, 0, IMDB.Value(IMDBDef11.PQRY_FSCIMPORTI, IMDBDef11.PQSL_FSCIMPORTI_FONDO_FINALE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "FCDDEBilPrevisioneOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // FCDDE Bil Previsione On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_FCDDEBILPREV_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FCDDE Bil Previsione On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_FCDDEBILPREV.Status()).equals((new IDVariant(3)), true))
      {
        PAN_PARAMETRI.set_Locked((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_PARAMETRI.set_Locked((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "FCDDEBilPrevisioneOnChangeStatus", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAFCDDPREV, IMDBDef3.FLD_PARAFCDDPREV_NOMOGGESEPLU, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IDVariant v_VFSCPARTIPCL = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VFSCPARPERRI = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VFSCPAPRESAR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VFSPATICANUO = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_CLASSIF as FSCPARTIPCLA, ");
      SQL.append("  A.PRIMO_ESERCIZIO_ARM as FSCPARPRESAR, ");
      SQL.append("  A.TIPO_CALCOLO_NUOVO_ORD as FSPATICANUOR, ");
      SQL.append("  A.PERIODO_RIFERIMENTO as FSCPARPERRIF ");
      SQL.append("from ");
      SQL.append("  FSC_PARAMETRI A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VFSCPARTIPCL = QV.Get("FSCPARTIPCLA", IDVariant.STRING) ;
        v_VFSCPAPRESAR = QV.Get("FSCPARPRESAR", IDVariant.INTEGER) ;
        v_VFSPATICANUO = QV.Get("FSPATICANUOR", IDVariant.STRING) ;
        v_VFSCPARPERRI = QV.Get("FSCPARPERRIF", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGTIPCLA, 0, new IDVariant(v_VFSCPARTIPCL));
      IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPRESAR, 0, new IDVariant(v_VFSCPAPRESAR));
      IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOOGTICANUOR, 0, new IDVariant(v_VFSPATICANUO));
      IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPERRIF, 0, new IDVariant(v_VFSCPARPERRI));
      IDVariant v_TI = new IDVariant(0,IDVariant.STRING);
      v_TI = (new IDVariant("Tipologia"));
      IDVariant v_CAT = new IDVariant(0,IDVariant.STRING);
      v_CAT = (new IDVariant("Categoria"));
      IDVariant v_ACCERTATO = new IDVariant(0,IDVariant.STRING);
      v_ACCERTATO = (new IDVariant("Accertato "));
      IDVariant v_INCASSATO = new IDVariant(0,IDVariant.STRING);
      v_INCASSATO = (new IDVariant("Incassato "));
      if (v_VFSCPARTIPCL.equals((new IDVariant("TIP")), true))
      {
        PAN_FCDDEBILPREV.SetFlags (Glb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FCDDEBILPREV.SetFlags (Glb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FCDDEBILPREV.SetFlags (Glb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_TIPOLOGIA, new IDVariant(v_TI).stringValue());
        PAN_FCDDEBILPREV.set_FixedCols((new IDVariant(2)).intValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGCAPBILPRE+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else if (v_VFSCPARTIPCL.equals((new IDVariant("CAT")), true))
      {
        PAN_FCDDEBILPREV.SetFlags (Glb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FCDDEBILPREV.SetFlags (Glb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FCDDEBILPREV.SetFlags (Glb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_TIPOLOGIA, new IDVariant(v_CAT).stringValue());
        PAN_FCDDEBILPREV.set_FixedCols((new IDVariant(2)).intValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGCAPBILPRE+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_FCDDEBILPREV.set_FixedCols((new IDVariant(5)).intValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGCAPBILPRE+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (v_VFSCPARPERRI.equals((new IDVariant("QN-1")), true))
      {
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM5, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(5))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM5, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(5))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM4, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(4))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM4, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(4))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM3, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(3))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM3, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(3))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM2, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM2, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM1, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM1, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      }
      else
      {
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM5, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(6))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM5, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(6))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM4, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(5))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM4, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(5))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM3, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(4))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM3, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(4))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM2, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(3))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM2, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(3))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_ACCERTATOM1, IDL.Add(v_ACCERTATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_INCASSATOM1, IDL.Add(v_INCASSATO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
      }
      PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE, IDL.Add(IDL.Add((new IDVariant(PAN_FCDDEBILPREV.Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE1, IDL.Add(IDL.Add((new IDVariant(PAN_FCDDEBILPREV.Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE2, IDL.Add(IDL.Add((new IDVariant(PAN_FCDDEBILPREV.Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE3, IDL.Add(IDL.Add((new IDVariant(PAN_FCDDEBILPREV.Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "Load", _e);
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
      UNLOAD_FSCPARAMDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "Unload", _e);
    }
  }

  // **********************************************************************
  // FSC Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FSCPARAMDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGTIPCLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPRESAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOOGTICANUOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FSCPARAMETRI, IMDBDef3.FLD_FSCPARAMETRI_NOMOGGPERRIF, 0, new IDVariant());
  }

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
      IDVariant v_SCAPTION = null;
      v_SCAPTION = (new IDVariant("Previsione "));
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIZIPLUR)), true) && FieldWasModified.booleanValue())
      {
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE, IDL.Add(v_SCAPTION, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_AD4PROGETTI, IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU, 0))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE1, IDL.Add(v_SCAPTION, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_AD4PROGETTI, IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU, 0))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE2, IDL.Add(v_SCAPTION, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_AD4PROGETTI, IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU, 0))).stringValue());
        PAN_FCDDEBILPREV.set_Header(Glb.OBJ_FIELD,PFL_FCDDEBILPREV_PREVISIONE3, IDL.Add(v_SCAPTION, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_AD4PROGETTI, IMDBDef11.PQSL_AD4PROGETTI_NOMOGGESEPLU, 0))).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEBilPrevisione", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // AD4 PROGETTI
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FCDDEBILPREV_AD4PROGETTI() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_AD4PROGETTI_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAFCDDPREV, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAFCDDPREV, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_AD4PROGETTI_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_AD4PROGETTI_RS, 0, IMDBDef3.TBL_PARAFCDDPREV, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_AD4PROGETTI_RS, 0, 0, IMDBDef3.TBL_PARAFCDDPREV, IMDBDef3.FLD_PARAFCDDPREV_NOMOGGESEPLU, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAFCDDPREV, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAFCDDPREV, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAFCDDPREV, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_AD4PROGETTI_RS, 0);
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FCDDEBILPREV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FCDDEBILPREV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FCDDEBILPREV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FCDDEBILPREV, Cancel);
    // Stub
  }

  private void PAN_FCDDEBILPREV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGAM5)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertatoM5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGIM5)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoIncassatoM5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGAM4)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertatoM4();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGIM4)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoIncassatoM4();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGAM3)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertatoM3();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGIM3)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoIncassatoM3();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGAM2)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertatoM2();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGIM2)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoIncassatoM2();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGAM1)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertatoM1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FCDDEBILPREV_IMGIM1)
    {
      this.IdxPanelActived = this.PAN_FCDDEBILPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoIncassatoM1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FCDDEBILPREV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FCDDEBILPREV_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FCDDEBILPREV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FCDDEBILPREV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FCDDEBILPREV_Init()
  {

    PAN_FCDDEBILPREV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FCDDEBILPREV.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, "DCEEA4BA-C30C-4AD2-A1A2-71BA6224C628");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, "Media Aritmetica sui Totali");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, MyGlb.VIS_DEFAPANESTYL);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, MyGlb.PANEL_LIST, 2372, -9999, 680, 16, 0, 0);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, MyGlb.PANEL_FORM, 0, 567, 228, 673, 0, 0);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, 0, 151);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, 1, 13);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, 0, 4);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, 1, 4);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARISUITOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, "F716F09F-8629-48F6-9850-0A431AACBE5E");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, "Media Aritmetica dei Singoli Rapporti");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, MyGlb.VIS_DEFAPANESTYL);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, MyGlb.PANEL_LIST, 3052, -9999, 684, 16, 0, 0);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, MyGlb.PANEL_FORM, 0, 471, 244, 793, 0, 0);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, 0, 209);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, 1, 13);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, 0, 4);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, 1, 4);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDARIDESIRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, "6F0E01A7-6C59-4B8E-8193-D17D699D2BC6");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, "Media Ponderata su Accertamenti e Incassi");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, MyGlb.VIS_DEFAPANESTYL);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, MyGlb.PANEL_LIST, 3736, -9999, 956, 16, 0, 0);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, MyGlb.PANEL_FORM, 0, 639, 244, 409, 0, 0);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, 0, 245);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, 1, 13);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, 0, 4);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, 1, 4);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEDPOSUACEIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, "1E1CC10C-B3E5-478B-BAA1-E5BF063167FF");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, "Media Ponderata su Media Accertamenti e Incassi");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, MyGlb.VIS_DEFAPANESTYL);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, MyGlb.PANEL_LIST, 4692, -9999, 688, 16, 0, 0);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, MyGlb.PANEL_FORM, 0, 831, 244, 241, 0, 0);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, 0, 282);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, 1, 13);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, 0, 4);
    PAN_FCDDEBILPREV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, 1, 4);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDEBILPREV_MEPOSUMEACEI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDEBILPREV.SetSize(MyGlb.OBJ_FIELD, 65);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, "029EA85B-43F1-4297-9C3C-3BE1AB824BFD");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, "Titolo");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, "92EE4F5B-6FC3-4610-ABDB-361F71CFA2B6");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, "Tipologia");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, "B81F5959-AF41-434C-81D4-D6DBF5D27CDF");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, "Capitolo");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, "410A8805-63B6-42FB-A961-4511E4459C87");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, "Art.");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, "13F31176-9EB5-47F4-A7C7-60EF5C2E5A5A");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, "Descrizione");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, "0A4C8EC5-9582-47DB-B133-61C91D6C007F");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, "ESERCIZIO");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, 0, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, "AF381573-B777-430C-B077-669F1974B010");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, "ACCERTATO M5");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, "7B0E5250-5812-400E-896E-27E08D44C5A3");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, "BB64BCD0-9A4A-4788-A9ED-CC1EC11E2710");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, "INCASSATO M5");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, "C05C84B0-574C-4538-9E7E-A28F596A9B58");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, "CDB681BE-DC8F-496B-8C78-547A5D82F8D7");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, "%");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, "DC1F5F35-6CC6-43BB-AD74-23B795B5FB0C");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, "ACCERTATO M4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, "5D1729D3-4AE7-438A-9AE2-368B34AB6D54");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, "F62FCBFE-4B14-4FB0-A1AD-1620F5A35B77");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, "INCASSATO M4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, "61B53F3E-B039-4B65-9B8B-276241BFF6DB");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, "C4F483F5-D10E-4245-9CF2-505155B1A608");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, "%");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, "EE720085-7D3C-43C5-8E71-2183E510FA00");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, "ACCERTATO M3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, "37F9D9E4-FCC8-4BD8-BBA8-02032524DEE8");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, "29174734-04F7-42E5-B132-52BFE9A1E61D");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, "INCASSATO M3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, "9631702C-C13B-4AEA-87C6-AC8E37735FFE");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, "79D7D263-2616-476A-8E05-BFB628CDDD05");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, "%");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, "CCDC3627-E395-4ECB-A9BF-33DFEDB3C89C");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, "ACCERTATO M2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, "8ADDB2D0-A826-4724-A856-1F7C28EC7220");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, "FAD77A46-FE42-4C95-A001-ECF286465C6D");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, "INCASSATO M2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, "DACB6B6C-9E5C-473C-AE09-30EC5FBDDE9B");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, "F9C303A3-B6FC-4325-A49A-175BD8D6604A");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, "%");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, "FCDDE21A-9A1F-4A0E-B888-94E9F93BF512");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, "ACCERTATO M1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, "D9C77AC1-2CDB-442B-AF45-5A2E83879886");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, "EB810888-918B-4899-BCBF-F37B59B5F2E2");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, "INCASSATO M1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, "444BBFB7-8CC3-44E1-9A2F-FC39911D7D7D");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, " ");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.VIS_HYPELINKIMMA);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, "EB3F743F-C125-4FA0-A24F-E07DD0429A77");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, "%");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, "FE32A2EA-9631-4FCE-AA34-85CA5FC5A77E");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, "Tipo Calcolo");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, "04850B7E-C806-4711-AC95-4F5ABC36853A");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, "% Media 1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, "267BB70F-F51C-4B47-9CB7-429DCBEA8348");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, "Reciproco 1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, "9DD09593-A199-4A11-B44D-5456BB3082CE");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, "Reciproco Rettificato 1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, "BF133976-D982-456B-8921-4A80C8692C20");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, "Previsione 1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, "399E401C-E923-4A1C-B7B5-86B1C16333B0");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, "Fondo Atteso 1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, "33798F6E-3EFB-4E41-B9B5-E7D94AC574AC");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, "% Applicata 1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, "1B73BDA9-644F-4A03-BD00-276A646914A1");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, "Fondo Calcolato 1");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, "9CF4381C-A156-49EC-9BFD-3718D10E11F8");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, "% Media 2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, "B360D939-6EFA-414D-8371-3B9838AB97BC");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, "Reciproco 2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, "02118451-C297-4E3B-B3E3-C1A0AA4B5D8E");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, "Reciproco Rettificato 2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, "C0CE0CC9-3B6B-4C57-9414-47861E79360C");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, "Previsione 2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, "EE12040C-35C0-4056-84CF-F483E98817C0");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, "Fondo Atteso 2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, "3C76A583-CE24-42EC-B6C9-4774B807FB80");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, "% Applicata 2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, "B6E598D9-7121-4CF1-8362-415896729A9A");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, "Fondo Calcolato 2");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, "AFD04516-F6F4-4D61-9109-459235453A44");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, "Accertato Rivalutato 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, "434137AD-1943-4D73-88F6-1773FFF36942");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, "Incassato Rivalutato 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, "C0880D4C-09E6-43DA-B647-39D72583B65A");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, "% Media 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, "6F39A384-A864-48E7-8D85-E4675AAD8FAA");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, "Reciproco 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, "52DD7F34-1A6A-4724-80B4-39C35996A30E");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, "Reciproco Rettificato 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, "67AEF879-C334-4472-B79B-409BFCB02A4B");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, "Previsione 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, "26737A8D-4950-4004-BEF9-4E0A0CDA08DB");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, "Fondo Atteso 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, "FF744E41-24AB-4A18-ABC6-1780E7D9C666");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, "% Applicata 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, "CE8B7962-8009-45D5-A699-BCA272F6C566");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, "Fondo Calcolato 3");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, "8C0247E3-48D1-4C5E-8DF9-8A3CCB891322");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, "% Media 4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.VIS_PERALINOFICF);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, "2930A282-5269-467A-B81D-2DA49CDE0F80");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, "Reciproco 4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.VIS_PERINNOFICF4);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, "C3D8B5BA-8C6F-4328-A577-A601706D8A56");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, "Reciproco Rettificato 4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, "658D8EC0-2FB8-4F5F-BCA7-183902A7340F");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, "Previsione 4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, "1E6F5C89-8973-4D67-81BF-58216D6CA886");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, "Fondo Atteso 4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, "1EE9572E-DF81-4488-AA7A-F577396B41A9");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, "% Applicata 4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, "4DC954C0-8494-4514-974B-1543A87B1485");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, "Fondo Calcolato 4");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, "28E301A5-08E0-4391-B66B-408DE6BB8C20");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, "Accantonamento Obbligatorio al Fondo (b)");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, "F8FC1C1F-7205-4715-9F05-3C1EB240F844");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, "Accantonamento Effettivo di Bilancio (c)");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDEBILPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, "C28C0C64-6BC6-4028-B46B-7B5CCF3537CE");
    PAN_FCDDEBILPREV.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, "ESERCIZIO PLUR");
    PAN_FCDDEBILPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, "");
    PAN_FCDDEBILPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.VIS_NONNULLAFIEL);
    PAN_FCDDEBILPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, 0, -1);
  }

  private void PAN_FCDDEBILPREV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_LIST, 40);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_FORM, 4, 1072, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_FORM, 40);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_TITOLO, -1, -1);
    PAN_FCDDEBILPREV.SetFieldUnbound(PFL_FCDDEBILPREV_TITOLO, true);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_TITOLO, PPQRY_FSCIMPORTI, "TRUNC(TO_NUMBER(SUBSTR(TO_CHAR ( A.TIPOLOGIA_CATEGORIA ), 1, 1)))", "TITOLO", 1, 19, 0, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_LIST, 40, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_LIST, 140);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_LIST, "Tipologia");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_FORM, 140);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOLOGIA, MyGlb.PANEL_FORM, "Tipologia");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_TIPOLOGIA, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_TIPOLOGIA, PPQRY_FSCIMPORTI, "A.TIPOLOGIA_CATEGORIA", "TIPOLOGIA_CATEGORIA", 1, 5, 0, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_LIST, 104, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_CAPITOLO, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_CAPITOLO, PPQRY_FSCIMPORTI, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_LIST, 244, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_LIST, 68);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_FORM, 68);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ART, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ART, PPQRY_FSCIMPORTI, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_LIST, 276, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_DESCRIZIONE, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_DESCRIZIONE, PPQRY_FSCIMPORTI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_FORM, 4, 112, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ESERCIZIO, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ESERCIZIO, PPQRY_FSCIMPORTI, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_LIST, 536, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_LIST, "ACCERTATO M5");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_FORM, 4, 112, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM5, MyGlb.PANEL_FORM, "ACCERTATO M5");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ACCERTATOM5, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ACCERTATOM5, PPQRY_FSCIMPORTI, "A.ACCERTATO_M5", "ACCERTATO_M5", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_LIST, 656, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_FORM, 4, 1456, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM5, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGAM5, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGAM5, PPQRY_ICONEINFO, "CASE WHEN ~~ACCERTATO_M5~~ <> 0 THEN 'I' ELSE NULL END", "IMGAM5", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM5, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGAM5, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGAM5, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_LIST, 676, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_LIST, "INCASSATO M5");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_FORM, 4, 136, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM5, MyGlb.PANEL_FORM, "INCASSATO M5");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_INCASSATOM5, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_INCASSATOM5, PPQRY_FSCIMPORTI, "A.INCASSATO_M5", "INCASSATO_M5", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_LIST, 796, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_FORM, 4, 1480, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM5, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGIM5, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGIM5, PPQRY_ICONEINFO, "CASE WHEN ~~INCASSATO_M5~~ <> 0 THEN 'I' ELSE NULL END", "IMGIM5", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM5, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGIM5, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGIM5, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_LIST, 816, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_LIST, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_LIST, "%");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_FORM, 4, 160, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_FORM, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM5, MyGlb.PANEL_FORM, "%");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCENTUALM5, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCENTUALM5, PPQRY_FSCIMPORTI, "A.PERCENTUALE_M5", "PERCENTUALE_M5", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_LIST, 856, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_LIST, "ACCERTATO M4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_FORM, 4, 184, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM4, MyGlb.PANEL_FORM, "ACCERTATO M4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ACCERTATOM4, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ACCERTATOM4, PPQRY_FSCIMPORTI, "A.ACCERTATO_M4", "ACCERTATO_M4", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_LIST, 976, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_FORM, 4, 1408, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM4, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGAM4, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGAM4, PPQRY_ICONEINFO, "CASE WHEN ~~ACCERTATO_M4~~ <> 0 THEN 'I' ELSE NULL END", "IMGAM4", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM4, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGAM4, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGAM4, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_LIST, 996, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_LIST, "INCASSATO M4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_FORM, 4, 208, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM4, MyGlb.PANEL_FORM, "INCASSATO M4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_INCASSATOM4, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_INCASSATOM4, PPQRY_FSCIMPORTI, "A.INCASSATO_M4", "INCASSATO_M4", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_LIST, 1116, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_FORM, 4, 1432, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM4, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGIM4, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGIM4, PPQRY_ICONEINFO, "CASE WHEN ~~INCASSATO_M4~~ <> 0 THEN 'I' ELSE NULL END", "IMGIM4", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM4, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGIM4, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGIM4, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_LIST, 1136, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_LIST, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_LIST, "%");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_FORM, 4, 232, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_FORM, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM4, MyGlb.PANEL_FORM, "%");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCENTUALM4, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCENTUALM4, PPQRY_FSCIMPORTI, "A.PERCENTUALE_M4", "PERCENTUALE_M4", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_LIST, 1176, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_LIST, "ACCERTATO M3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_FORM, 4, 256, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM3, MyGlb.PANEL_FORM, "ACCERTATO M3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ACCERTATOM3, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ACCERTATOM3, PPQRY_FSCIMPORTI, "A.ACCERTATO_M3", "ACCERTATO_M3", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_LIST, 1296, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_FORM, 4, 1360, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM3, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGAM3, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGAM3, PPQRY_ICONEINFO, "CASE WHEN ~~ACCERTATO_M3~~ <> 0 THEN 'I' ELSE NULL END", "IMGAM3", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM3, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGAM3, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGAM3, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_LIST, 1316, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_LIST, "INCASSATO M3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_FORM, 4, 280, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM3, MyGlb.PANEL_FORM, "INCASSATO M3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_INCASSATOM3, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_INCASSATOM3, PPQRY_FSCIMPORTI, "A.INCASSATO_M3", "INCASSATO_M3", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_LIST, 1436, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_FORM, 4, 1384, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM3, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGIM3, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGIM3, PPQRY_ICONEINFO, "CASE WHEN ~~INCASSATO_M3~~ <> 0 THEN 'I' ELSE NULL END", "IMGIM3", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM3, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGIM3, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGIM3, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_LIST, 1456, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_LIST, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_LIST, "%");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_FORM, 4, 304, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_FORM, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM3, MyGlb.PANEL_FORM, "%");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCENTUALM3, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCENTUALM3, PPQRY_FSCIMPORTI, "A.PERCENTUALE_M3", "PERCENTUALE_M3", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_LIST, 1496, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_LIST, "ACCERTATO M2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_FORM, 4, 328, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM2, MyGlb.PANEL_FORM, "ACCERTATO M2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ACCERTATOM2, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ACCERTATOM2, PPQRY_FSCIMPORTI, "A.ACCERTATO_M2", "ACCERTATO_M2", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_LIST, 1616, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_FORM, 4, 1312, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM2, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGAM2, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGAM2, PPQRY_ICONEINFO, "CASE WHEN ~~ACCERTATO_M2~~ <> 0 THEN 'I' ELSE NULL END", "IMGAM2", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM2, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGAM2, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGAM2, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_LIST, 1636, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_LIST, "INCASSATO M2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_FORM, 4, 352, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM2, MyGlb.PANEL_FORM, "INCASSATO M2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_INCASSATOM2, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_INCASSATOM2, PPQRY_FSCIMPORTI, "A.INCASSATO_M2", "INCASSATO_M2", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_LIST, 1756, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_FORM, 4, 1336, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM2, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGIM2, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGIM2, PPQRY_ICONEINFO, "CASE WHEN ~~INCASSATO_M2~~ <> 0 THEN 'I' ELSE NULL END", "IMGIM2", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM2, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGIM2, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGIM2, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_LIST, 1776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_LIST, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_LIST, "%");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_FORM, 4, 376, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_FORM, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM2, MyGlb.PANEL_FORM, "%");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCENTUALM2, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCENTUALM2, PPQRY_FSCIMPORTI, "A.PERCENTUALE_M2", "PERCENTUALE_M2", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_LIST, 1816, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_LIST, "ACCERTATO M1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_FORM, 4, 400, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTATOM1, MyGlb.PANEL_FORM, "ACCERTATO M1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ACCERTATOM1, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ACCERTATOM1, PPQRY_FSCIMPORTI, "A.ACCERTATO_M1", "ACCERTATO_M1", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_LIST, 1936, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_LIST, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_FORM, 4, 1264, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_FORM, 96);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGAM1, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGAM1, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGAM1, PPQRY_ICONEINFO, "CASE WHEN ~~ACCERTATO_M1~~ <> 0 THEN 'I' ELSE NULL END", "IMGAM1", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGAM1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.set_Alignment(PFL_FCDDEBILPREV_IMGAM1, 3);
    PAN_FCDDEBILPREV.set_ImageResizeMode(PFL_FCDDEBILPREV_IMGAM1, 2);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_LIST, 1956, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_LIST, "INCASSATO M1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_FORM, 4, 424, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSATOM1, MyGlb.PANEL_FORM, "INCASSATO M1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_INCASSATOM1, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_INCASSATOM1, PPQRY_FSCIMPORTI, "A.INCASSATO_M1", "INCASSATO_M1", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_LIST, 2076, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_LIST, " ");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_FORM, 4, 1504, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_IMGIM1, MyGlb.PANEL_FORM, " ");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_IMGIM1, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_IMGIM1, PPQRY_ICONEINFO, "CASE WHEN ~~INCASSATO_M1~~ <> 0 THEN 'I' ELSE NULL END", "IMGIM1", 5, 99, 0, -13997);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FCDDEBILPREV.SetValueListItem(PFL_FCDDEBILPREV_IMGIM1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_LIST, 2096, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_LIST, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_LIST, "%");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_FORM, 4, 448, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_FORM, 104);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCENTUALM1, MyGlb.PANEL_FORM, "%");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCENTUALM1, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCENTUALM1, PPQRY_FSCIMPORTI, "A.PERCENTUALE_M1", "PERCENTUALE_M1", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_LIST, 2136, 36, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_LIST, 88);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_LIST, "Tipo Calcolo");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_FORM, 4, 472, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_FORM, 88);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_TIPOCALCOLO, MyGlb.PANEL_FORM, "Tipo Calcolo");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_TIPOCALCOLO, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_TIPOCALCOLO, PPQRY_FSCIMPORTI, "A.TIPO_CALCOLO", "TIPO_CALCOLO", 5, 2, 0, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_LIST, 2372, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_LIST, 56);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_LIST, "% Media 1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_FORM, 4, 1096, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_FORM, 56);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMT, MyGlb.PANEL_FORM, "Media 1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCMT, -1, GRP_FCDDEBILPREV_MEDARISUITOT);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCMT, PPQRY_FSCIMPORTI, "A.PERC_MT", "PERC_MT", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_LIST, 2444, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_LIST, "Reciproco 1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_FORM, 4, 1120, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMT, MyGlb.PANEL_FORM, "Reciproco 1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPROCOMT, -1, GRP_FCDDEBILPREV_MEDARISUITOT);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPROCOMT, PPQRY_FSCIMPORTI, "A.RECIPROCO_MT", "RECIPROCO_MT", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_LIST, 2524, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_LIST, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_LIST, "Rec. Rettif. 1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_FORM, 4, 1144, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_FORM, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMT, MyGlb.PANEL_FORM, "Reciproco Rettificato 1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPRETTIMT, -1, GRP_FCDDEBILPREV_MEDARISUITOT);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPRETTIMT, PPQRY_FSCIMPORTI, "A.RECIPROCO_RETTIF_MT", "RECIPROCO_RETTIF_MT", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_LIST, 2604, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_LIST, 76);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_LIST, "Previsione 1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_FORM, 4, 592, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_FORM, 76);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE, MyGlb.PANEL_FORM, "Previsione 1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PREVISIONE, -1, GRP_FCDDEBILPREV_MEDARISUITOT);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PREVISIONE, PPQRY_FSCIMPORTI, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_LIST, 2724, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_LIST, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_LIST, "Fondo Atteso 1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_FORM, 4, 1168, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_FORM, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMT, MyGlb.PANEL_FORM, "Fondo Atteso 1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOATTESMT, -1, GRP_FCDDEBILPREV_MEDARISUITOT);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOATTESMT, PPQRY_FSCIMPORTI, "A.FONDO_ATTESO_MT", "FONDO_ATTESO_MT", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_LIST, 2844, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_LIST, 124);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_LIST, "% Applicata 1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_FORM, 4, 1192, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_FORM, 124);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMT, MyGlb.PANEL_FORM, "% Applicata 1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCAPPLICMT, -1, GRP_FCDDEBILPREV_MEDARISUITOT);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCAPPLICMT, PPQRY_FSCIMPORTI, "A.PERC_APPLICATA_MT", "PERC_APPLICATA_MT", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_LIST, 2932, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_LIST, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_LIST, "Fondo Calcolato 1");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_FORM, 4, 1216, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_FORM, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMT, MyGlb.PANEL_FORM, "Fondo Calcolato 1");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOCALCOMT, -1, GRP_FCDDEBILPREV_MEDARISUITOT);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOCALCOMT, PPQRY_FSCIMPORTI, "A.FONDO_CALCOLATO_MT", "FONDO_CALCOLATO_MT", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_LIST, 3052, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_LIST, 56);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_LIST, "% Media 2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_FORM, 4, 496, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_FORM, 56);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCMS, MyGlb.PANEL_FORM, "Media 2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCMS, -1, GRP_FCDDEBILPREV_MEDARIDESIRA);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCMS, PPQRY_FSCIMPORTI, "A.PERC_MS", "PERC_MS", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_LIST, 3128, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_LIST, "Reciproco 2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_FORM, 4, 520, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOMS, MyGlb.PANEL_FORM, "Reciproco 2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPROCOMS, -1, GRP_FCDDEBILPREV_MEDARIDESIRA);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPROCOMS, PPQRY_FSCIMPORTI, "A.RECIPROCO_MS", "RECIPROCO_MS", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_LIST, 3204, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_LIST, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_LIST, "Rec. Rettif. 2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_FORM, 4, 544, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_FORM, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIMS, MyGlb.PANEL_FORM, "Reciproco Rettificato 2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPRETTIMS, -1, GRP_FCDDEBILPREV_MEDARIDESIRA);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPRETTIMS, PPQRY_FSCIMPORTI, "A.RECIPROCO_RETTIF_MS", "RECIPROCO_RETTIF_MS", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_LIST, 3284, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_LIST, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_LIST, "Previsione 2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_FORM, 4, 1240, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_FORM, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE1, MyGlb.PANEL_FORM, "Previsione 2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PREVISIONE1, -1, GRP_FCDDEBILPREV_MEDARIDESIRA);
    PAN_FCDDEBILPREV.SetFieldUnbound(PFL_FCDDEBILPREV_PREVISIONE1, true);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PREVISIONE1, PPQRY_FSCIMPORTI, "A.PREVISIONE + 0", "RECORDPREVIS", 3, 28, 6, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_LIST, 3404, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_LIST, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_LIST, "Fondo Atteso 2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_FORM, 4, 568, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_FORM, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESMS, MyGlb.PANEL_FORM, "Fondo Atteso 2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOATTESMS, -1, GRP_FCDDEBILPREV_MEDARIDESIRA);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOATTESMS, PPQRY_FSCIMPORTI, "A.FONDO_ATTESO_MS", "FONDO_ATTESO_MS", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_LIST, 3524, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_LIST, 124);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_LIST, "% Applicata 2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_FORM, 4, 640, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_FORM, 124);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICMS, MyGlb.PANEL_FORM, "% Applicata 2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCAPPLICMS, -1, GRP_FCDDEBILPREV_MEDARIDESIRA);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCAPPLICMS, PPQRY_FSCIMPORTI, "A.PERC_APPLICATA_MS", "PERC_APPLICATA_MS", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_LIST, 3616, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_LIST, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_LIST, "Fondo Calcolato 2");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_FORM, 4, 616, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_FORM, 136);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOMS, MyGlb.PANEL_FORM, "Fondo Calcolato 2");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOCALCOMS, -1, GRP_FCDDEBILPREV_MEDARIDESIRA);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOCALCOMS, PPQRY_FSCIMPORTI, "A.FONDO_CALCOLATO_MS", "FONDO_CALCOLATO_MS", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_LIST, 3736, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_LIST, 116);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_LIST, "Accertato Rivalutato 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_FORM, 4, 664, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_FORM, 116);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCERTARIVPA, MyGlb.PANEL_FORM, "Accer. Rivalutato 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ACCERTARIVPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ACCERTARIVPA, PPQRY_FSCIMPORTI, "A.ACCERTATO_RIV_PA", "ACCERTATO_RIV_PA", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_LIST, 3872, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_LIST, 116);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_LIST, "Incassato Rivalutato 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_FORM, 4, 688, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_FORM, 116);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_INCASSARIVPA, MyGlb.PANEL_FORM, "Incas. Rivalutato 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_INCASSARIVPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_INCASSARIVPA, PPQRY_FSCIMPORTI, "A.INCASSATO_RIV_PA", "INCASSATO_RIV_PA", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_LIST, 4016, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_LIST, 80);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_LIST, "% Media 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_FORM, 4, 712, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_FORM, 80);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCRIVPA, MyGlb.PANEL_FORM, "% Media 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCRIVPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCRIVPA, PPQRY_FSCIMPORTI, "A.PERC_RIV_PA", "PERC_RIV_PA", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_LIST, 4088, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_LIST, "Reciproco 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_FORM, 4, 736, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPA, MyGlb.PANEL_FORM, "Reciproco 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPROCOPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPROCOPA, PPQRY_FSCIMPORTI, "A.RECIPROCO_PA", "RECIPROCO_PA", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_LIST, 4164, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_LIST, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_LIST, "Rec. Rettif. 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_FORM, 4, 760, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_FORM, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPA, MyGlb.PANEL_FORM, "Recip. Rettificato 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPRETTIPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPRETTIPA, PPQRY_FSCIMPORTI, "A.RECIPROCO_RETTIF_PA", "RECIPROCO_RETTIF_PA", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_LIST, 4244, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_LIST, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_LIST, "Previsione 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_FORM, 4, 1024, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_FORM, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE2, MyGlb.PANEL_FORM, "Previsione 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PREVISIONE2, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldUnbound(PFL_FCDDEBILPREV_PREVISIONE2, true);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PREVISIONE2, PPQRY_FSCIMPORTI, "A.PREVISIONE + 0", "RECORDPREVI2", 3, 28, 6, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_LIST, 4364, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_LIST, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_LIST, "Fondo Atteso 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_FORM, 4, 784, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_FORM, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPA, MyGlb.PANEL_FORM, "Fondo Atteso 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOATTESPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOATTESPA, PPQRY_FSCIMPORTI, "A.FONDO_ATTESO_PA", "FONDO_ATTESO_PA", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_LIST, 4484, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_LIST, 120);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_LIST, "% Applicata 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_FORM, 4, 808, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_FORM, 120);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPA, MyGlb.PANEL_FORM, "% Applicata 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCAPPLICPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCAPPLICPA, PPQRY_FSCIMPORTI, "A.PERC_APPLICATA_PA", "PERC_APPLICATA_PA", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_LIST, 4572, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_LIST, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_LIST, "Fondo Calcolato 3");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_FORM, 4, 832, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_FORM, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPA, MyGlb.PANEL_FORM, "Fondo Calcolato 3");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOCALCOPA, -1, GRP_FCDDEBILPREV_MEDPOSUACEIN);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOCALCOPA, PPQRY_FSCIMPORTI, "A.FONDO_CALCOLATO_PA", "FONDO_CALCOLATO_PA", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_LIST, 4692, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_LIST, 108);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_LIST, "% Media 4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_FORM, 4, 856, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_FORM, 108);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERACCINCRIV, MyGlb.PANEL_FORM, "% Media 4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERACCINCRIV, -1, GRP_FCDDEBILPREV_MEPOSUMEACEI);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERACCINCRIV, PPQRY_FSCIMPORTI, "A.PERC_ACC_INC_RIV", "PERC_ACC_INC_RIV", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_LIST, 4772, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_LIST, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_LIST, "Reciproco 4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_FORM, 4, 880, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_FORM, 92);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPROCOPR, MyGlb.PANEL_FORM, "Reciproco 4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPROCOPR, -1, GRP_FCDDEBILPREV_MEPOSUMEACEI);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPROCOPR, PPQRY_FSCIMPORTI, "A.RECIPROCO_PR", "RECIPROCO_PR", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_LIST, 4848, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_LIST, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_LIST, "Rec. Rettif. 4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_FORM, 4, 904, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_FORM, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_RECIPRETTIPR, MyGlb.PANEL_FORM, "Recip. Rettificato 4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_RECIPRETTIPR, -1, GRP_FCDDEBILPREV_MEPOSUMEACEI);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_RECIPRETTIPR, PPQRY_FSCIMPORTI, "A.RECIPROCO_RETTIF_PR", "RECIPROCO_RETTIF_PR", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_LIST, 4928, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_LIST, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_LIST, "Previsione 4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_FORM, 4, 1048, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_FORM, 84);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PREVISIONE3, MyGlb.PANEL_FORM, "Previsione 4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PREVISIONE3, -1, GRP_FCDDEBILPREV_MEPOSUMEACEI);
    PAN_FCDDEBILPREV.SetFieldUnbound(PFL_FCDDEBILPREV_PREVISIONE3, true);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PREVISIONE3, PPQRY_FSCIMPORTI, "A.PREVISIONE + 0", "RECORDPREVI3", 3, 28, 6, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_LIST, 5048, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_LIST, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_LIST, "Fondo Atteso 4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_FORM, 4, 928, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_FORM, 112);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOATTESPR, MyGlb.PANEL_FORM, "Fondo Atteso 4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOATTESPR, -1, GRP_FCDDEBILPREV_MEPOSUMEACEI);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOATTESPR, PPQRY_FSCIMPORTI, "A.FONDO_ATTESO_PR", "FONDO_ATTESO_PR", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_LIST, 5168, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_LIST, 120);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_LIST, "% Applicata 4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_FORM, 4, 952, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_FORM, 120);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_PERCAPPLICPR, MyGlb.PANEL_FORM, "% Applicata 4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_PERCAPPLICPR, -1, GRP_FCDDEBILPREV_MEPOSUMEACEI);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_PERCAPPLICPR, PPQRY_FSCIMPORTI, "A.PERC_APPLICATA_PR", "PERC_APPLICATA_PR", 3, 5, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_LIST, 5256, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_LIST, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_LIST, "Fondo Calcolato 4");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_FORM, 4, 976, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_FORM, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOCALCOPR, MyGlb.PANEL_FORM, "Fondo Calcolato 4");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOCALCOPR, -1, GRP_FCDDEBILPREV_MEPOSUMEACEI);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOCALCOPR, PPQRY_FSCIMPORTI, "A.FONDO_CALCOLATO_PR", "FONDO_CALCOLATO_PR", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_LIST, 5380, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_LIST, 88);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_LIST, "Accantonamento Obbligatorio al Fondo (b)");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_FORM, 4, 1000, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_FORM, 88);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_FONDOFINALE, MyGlb.PANEL_FORM, "Acc. Ob. a. F. b");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_FONDOFINALE, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_FONDOFINALE, PPQRY_FSCIMPORTI, "A.FONDO_FINALE", "FONDO_FINALE", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_LIST, 5528, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_LIST, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_LIST, "Accantonamento Effettivo di Bilancio (c)");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_FORM, 4, 1528, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_FORM, 132);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ACCANEFFBILA, MyGlb.PANEL_FORM, "Accant. Effet. di Bil. c");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ACCANEFFBILA, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ACCANEFFBILA, PPQRY_FSCIMPORTI, "A.ACCANT_EFF_BILANCIO", "ACCANT_EFF_BILANCIO", 3, 14, 2, -13997);
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_LIST, 100);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_LIST, "ESERCIZIO PLUR");
    PAN_FCDDEBILPREV.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_FORM, 4, 1528, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDEBILPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_FORM, 100);
    PAN_FCDDEBILPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDEBILPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDEBILPREV_ESERCIZIPLU1, MyGlb.PANEL_FORM, "ESERCIZIO PLUR");
    PAN_FCDDEBILPREV.SetFieldPage(PFL_FCDDEBILPREV_ESERCIZIPLU1, -1, -1);
    PAN_FCDDEBILPREV.SetFieldPanel(PFL_FCDDEBILPREV_ESERCIZIPLU1, PPQRY_FSCIMPORTI, "A.ESERCIZIO_PLUR", "ESERCIZIO_PLUR", 1, 4, 0, -13997);
  }

  private void PAN_FCDDEBILPREV_InitQueries()
  {
    StringBuffer SQL;

    PAN_FCDDEBILPREV.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN ~~ACCERTATO_M1~~ <> 0 THEN 'I' ELSE NULL END as IMGAM1, ");
    SQL.append("  CASE WHEN ~~INCASSATO_M1~~ <> 0 THEN 'I' ELSE NULL END as IMGIM1, ");
    SQL.append("  CASE WHEN ~~ACCERTATO_M2~~ <> 0 THEN 'I' ELSE NULL END as IMGAM2, ");
    SQL.append("  CASE WHEN ~~INCASSATO_M2~~ <> 0 THEN 'I' ELSE NULL END as IMGIM2, ");
    SQL.append("  CASE WHEN ~~ACCERTATO_M3~~ <> 0 THEN 'I' ELSE NULL END as IMGAM3, ");
    SQL.append("  CASE WHEN ~~INCASSATO_M3~~ <> 0 THEN 'I' ELSE NULL END as IMGIM3, ");
    SQL.append("  CASE WHEN ~~ACCERTATO_M4~~ <> 0 THEN 'I' ELSE NULL END as IMGAM4, ");
    SQL.append("  CASE WHEN ~~INCASSATO_M4~~ <> 0 THEN 'I' ELSE NULL END as IMGIM4, ");
    SQL.append("  CASE WHEN ~~ACCERTATO_M5~~ <> 0 THEN 'I' ELSE NULL END as IMGAM5, ");
    SQL.append("  CASE WHEN ~~INCASSATO_M5~~ <> 0 THEN 'I' ELSE NULL END as IMGIM5 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_FCDDEBILPREV.SetQuery(PPQRY_ICONEINFO, 0, SQL, -1, "");
    PAN_FCDDEBILPREV.SetQueryDB(PPQRY_ICONEINFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FCDDEBILPREV.SetMasterTable(PPQRY_ICONEINFO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("where (A.TIPO = ~~TIPO_CALCOLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCTIPICALCO, 0, SQL, PFL_FCDDEBILPREV_TIPOCALCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCTIPICALCO, 1, SQL, PFL_FCDDEBILPREV_TIPOCALCOLO, "");
    PAN_FCDDEBILPREV.SetQueryDB(PPQRY_FSCTIPICALCO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FCDDEBILPREV.SetIMDB(IMDB, "PQRY_FSCIMPORTI", true);
    PAN_FCDDEBILPREV.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.TIPOLOGIA_CATEGORIA as TIPOLOGIA_CATEGORIA, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  TRUNC(TO_NUMBER(SUBSTR(TO_CHAR ( A.TIPOLOGIA_CATEGORIA ), 1, 1))) as TITOLO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.ACCERTATO_M5 as ACCERTATO_M5, ");
    SQL.append("  A.INCASSATO_M5 as INCASSATO_M5, ");
    SQL.append("  A.PERCENTUALE_M5 as PERCENTUALE_M5, ");
    SQL.append("  A.ACCERTATO_M4 as ACCERTATO_M4, ");
    SQL.append("  A.INCASSATO_M4 as INCASSATO_M4, ");
    SQL.append("  A.PERCENTUALE_M4 as PERCENTUALE_M4, ");
    SQL.append("  A.ACCERTATO_M3 as ACCERTATO_M3, ");
    SQL.append("  A.INCASSATO_M3 as INCASSATO_M3, ");
    SQL.append("  A.PERCENTUALE_M3 as PERCENTUALE_M3, ");
    SQL.append("  A.ACCERTATO_M2 as ACCERTATO_M2, ");
    SQL.append("  A.INCASSATO_M2 as INCASSATO_M2, ");
    SQL.append("  A.PERCENTUALE_M2 as PERCENTUALE_M2, ");
    SQL.append("  A.ACCERTATO_M1 as ACCERTATO_M1, ");
    SQL.append("  A.INCASSATO_M1 as INCASSATO_M1, ");
    SQL.append("  A.PERCENTUALE_M1 as PERCENTUALE_M1, ");
    SQL.append("  A.TIPO_CALCOLO as TIPO_CALCOLO, ");
    SQL.append("  A.PERC_MT as PERC_MT, ");
    SQL.append("  A.RECIPROCO_MT as RECIPROCO_MT, ");
    SQL.append("  A.RECIPROCO_RETTIF_MT as RECIPROCO_RETTIF_MT, ");
    SQL.append("  A.FONDO_ATTESO_MT as FONDO_ATTESO_MT, ");
    SQL.append("  A.PERC_APPLICATA_MT as PERC_APPLICATA_MT, ");
    SQL.append("  A.FONDO_CALCOLATO_MT as FONDO_CALCOLATO_MT, ");
    SQL.append("  A.PERC_MS as PERC_MS, ");
    SQL.append("  A.RECIPROCO_MS as RECIPROCO_MS, ");
    SQL.append("  A.RECIPROCO_RETTIF_MS as RECIPROCO_RETTIF_MS, ");
    SQL.append("  A.FONDO_ATTESO_MS as FONDO_ATTESO_MS, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.FONDO_CALCOLATO_MS as FONDO_CALCOLATO_MS, ");
    SQL.append("  A.PERC_APPLICATA_MS as PERC_APPLICATA_MS, ");
    SQL.append("  A.ACCERTATO_RIV_PA as ACCERTATO_RIV_PA, ");
    SQL.append("  A.INCASSATO_RIV_PA as INCASSATO_RIV_PA, ");
    SQL.append("  A.PERC_RIV_PA as PERC_RIV_PA, ");
    SQL.append("  A.RECIPROCO_PA as RECIPROCO_PA, ");
    SQL.append("  A.RECIPROCO_RETTIF_PA as RECIPROCO_RETTIF_PA, ");
    SQL.append("  A.FONDO_ATTESO_PA as FONDO_ATTESO_PA, ");
    SQL.append("  A.PERC_APPLICATA_PA as PERC_APPLICATA_PA, ");
    SQL.append("  A.FONDO_CALCOLATO_PA as FONDO_CALCOLATO_PA, ");
    SQL.append("  A.PERC_ACC_INC_RIV as PERC_ACC_INC_RIV, ");
    SQL.append("  A.RECIPROCO_PR as RECIPROCO_PR, ");
    SQL.append("  A.RECIPROCO_RETTIF_PR as RECIPROCO_RETTIF_PR, ");
    SQL.append("  A.FONDO_ATTESO_PR as FONDO_ATTESO_PR, ");
    SQL.append("  A.PERC_APPLICATA_PR as PERC_APPLICATA_PR, ");
    SQL.append("  A.FONDO_CALCOLATO_PR as FONDO_CALCOLATO_PR, ");
    SQL.append("  A.FONDO_FINALE as FONDO_FINALE, ");
    SQL.append("  A.ACCANT_EFF_BILANCIO as ACCANT_EFF_BILANCIO, ");
    SQL.append("  A.PREVISIONE + 0 as RECORDPREVIS, ");
    SQL.append("  A.PREVISIONE + 0 as RECORDPREVI2, ");
    SQL.append("  A.PREVISIONE + 0 as RECORDPREVI3, ");
    SQL.append("  A.ESERCIZIO_PLUR as ESERCIZIO_PLUR ");
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCIMPORTI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FSC_IMPORTI A ");
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCIMPORTI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ESERCIZIO_PLUR = ~~TBL_PARAFCDDPREV.NOMOGGESEPLU~~) ");
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCIMPORTI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCIMPORTI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCIMPORTI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPOLOGIA_CATEGORIA, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_FCDDEBILPREV.SetQuery(PPQRY_FSCIMPORTI, 5, SQL, -1, "");
    PAN_FCDDEBILPREV.SetQueryDB(PPQRY_FSCIMPORTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FCDDEBILPREV.SetMasterTable(0, "FSC_IMPORTI");
    PAN_FCDDEBILPREV.AddToSortList(PFL_FCDDEBILPREV_TIPOLOGIA, true);
    PAN_FCDDEBILPREV.AddToSortList(PFL_FCDDEBILPREV_CAPITOLO, true);
    PAN_FCDDEBILPREV.AddToSortList(PFL_FCDDEBILPREV_ART, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FCDDEBILPREV.Status() == 2)
    {
      int oldListQBE = PAN_FCDDEBILPREV.iUseListQBE;
      PAN_FCDDEBILPREV.iUseListQBE = 0;
      PAN_FCDDEBILPREV.PanelCommand(Glb.PCM_SEARCH);
      PAN_FCDDEBILPREV.PanelCommand(Glb.PCM_FIND);
      PAN_FCDDEBILPREV.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, "609555B0-7D0B-42EB-95FF-9BABA5D51235");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, "Esercizio Pluriennale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.VIS_NONNULLAFIEL);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Esercizio Pluriennale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 20, 8, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Esercizio Pluriennale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIPLUR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIPLUR, PPQRY_AD4PROGETTI, "A.NOMOGGESEPLU", "NOMOGGESEPLU", 1, 4, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where ((A.ESERCIZIO BETWEEN ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2)) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_PARAMETRI.SetQuery(PPQRY_ESERCIFINANZ, 0, SQL, PFL_PARAMETRI_ESERCIZIPLUR, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ESERCIFINANZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_AD4PROGETTI", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_AD4PROGETTI, IMDBDef11.PQRY_AD4PROGETTI_RS, IMDBDef3.TBL_PARAFCDDPREV);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIPLUR, IMDBDef3.FLD_PARAFCDDPREV_NOMOGGESEPLU);
    PAN_PARAMETRI.SetMasterTable(0, "PARAFCDDPREV");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FCDDEBILPREV) PAN_FCDDEBILPREV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FCDDEBILPREV) PAN_FCDDEBILPREV_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FCDDEBILPREV) PAN_FCDDEBILPREV_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FCDDEBILPREV) PAN_FCDDEBILPREV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FCDDEBILPREV) PAN_FCDDEBILPREV_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_FCDDEBILPREV) PAN_FCDDEBILPREV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
