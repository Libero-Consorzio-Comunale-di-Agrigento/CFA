// **********************************************
// Situazione Cassa Per Vincolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneCassaPerVincolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPOVINCOLO = 0;
  private static int PFL_PARAMETRI_AL = 1;
  private static int PFL_PARAMETRI_VINCOLDESCRI = 2;

  private static int PPQRY_PARAMETRI379 = 0;

  private static int PPQRY_VINCOLI = 1;


  IDPanel PAN_PARAMETRI;
  private static int GRP_SITCASPERVIN_SALDOINIZIAL = 0;
  private static int GRP_SITCASPERVIN_MANDATI = 1;
  private static int GRP_SITCASPERVIN_ORDINATIVI = 2;
  private static int GRP_SITCASPERVIN_SALDOFINALE = 3;

  private static int PFL_SITCASPERVIN_ETICHELBLGR3 = 0;
  private static int PFL_SITCASPERVIN_SALDINIZCASS = 1;
  private static int PFL_SITCASPERVIN_ETICHELBLGR5 = 2;
  private static int PFL_SITCASPERVIN_SALDINIZTESO = 3;
  private static int PFL_SITCASPERVIN_RESIDUI = 4;
  private static int PFL_SITCASPERVIN_MANDRESIPAGA = 5;
  private static int PFL_SITCASPERVIN_COMPETENZA1 = 6;
  private static int PFL_SITCASPERVIN_MANDCOMPPAGA = 7;
  private static int PFL_SITCASPERVIN_ETICHELBLGRP = 8;
  private static int PFL_SITCASPERVIN_MANDATI = 9;
  private static int PFL_SITCASPERVIN_TOTAMANDPAGA = 10;
  private static int PFL_SITCASPERVIN_ETICHELBLGR1 = 11;
  private static int PFL_SITCASPERVIN_RESIDUO = 12;
  private static int PFL_SITCASPERVIN_ORDIRESIRISC = 13;
  private static int PFL_SITCASPERVIN_COMPETENZA = 14;
  private static int PFL_SITCASPERVIN_ORDICOMPRISC = 15;
  private static int PFL_SITCASPERVIN_TOTALE = 16;
  private static int PFL_SITCASPERVIN_TOTAORDIRISC = 17;
  private static int PFL_SITCASPERVIN_ETICHELBLGR2 = 18;
  private static int PFL_SITCASPERVIN_EMESSI = 19;
  private static int PFL_SITCASPERVIN_PAGATI = 20;
  private static int PFL_SITCASPERVIN_EMESSI1 = 21;
  private static int PFL_SITCASPERVIN_RISCOSSI = 22;
  private static int PFL_SITCASPERVIN_ETICHETTA = 23;
  private static int PFL_SITCASPERVIN_SALDFINACASS = 24;
  private static int PFL_SITCASPERVIN_ETICHELBLGR4 = 25;
  private static int PFL_SITCASPERVIN_SALDFINATESO = 26;

  private static int PPQRY_PANNELLO4 = 0;


  IDPanel PAN_SITCASPERVIN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI390(IMDB);
    Init_TBL_PANNELLO7(IMDB);
    //
    //
    Init_PQRY_PARAMETRI379(IMDB);
    Init_PQRY_PARAMETRI379_RS(IMDB);
    Init_PQRY_PANNELLO4(IMDB);
    Init_PQRY_PANNELLO4_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI390(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI390, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI390, "TBL_PARAMETRI390");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI390,IMDBDef6.FLD_PARAMETRI390_ROWNAMTIDIVI, "ROWNAMTIDIVI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI390,IMDBDef6.FLD_PARAMETRI390_ROWNAMTIDIVI,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI390,IMDBDef6.FLD_PARAMETRI390_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI390,IMDBDef6.FLD_PARAMETRI390_ROWNAMEAL,6,14,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI390, 0);
  }

  private static void Init_TBL_PANNELLO7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PANNELLO7, 17);
    IMDB.set_TblCode(IMDBDef6.TBL_PANNELLO7, "TBL_PANNELLO7");
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAINCA, "ROWNAMSAINCA");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAINCA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAINTE, "ROWNAMSAINTE");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAINTE,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAFICA, "ROWNAMSAFICA");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAFICA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAFITE, "ROWNAMSAFITE");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMSAFITE,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMAREEM, "ROWNAMMAREEM");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMAREEM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMAREPA, "ROWNAMMAREPA");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMAREPA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMACOEM, "ROWNAMMACOEM");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMACOEM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMACOPA, "ROWNAMMACOPA");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMMACOPA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAEM, "ROWNAMTOMAEM");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAEM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAPA, "ROWNAMTOMAPA");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAPA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORREEM, "ROWNAMORREEM");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORREEM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORRERI, "ROWNAMORRERI");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORRERI,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORCOEM, "ROWNAMORCOEM");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORCOEM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORCORI, "ROWNAMORCORI");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMORCORI,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOOREM, "ROWNAMTOOREM");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOOREM,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOORRI, "ROWNAMTOORRI");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMTOORRI,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMESSAVI, "ROWNAMESSAVI");
    IMDB.SetFldParams(IMDBDef6.TBL_PANNELLO7,IMDBDef6.FLD_PANNELLO7_ROWNAMESSAVI,1,4,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PANNELLO7, 0);
  }

  private static void Init_PQRY_PARAMETRI379(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMETRI379, 2);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMETRI379, "PQRY_PARAMETRI379");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI379,IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, "ROWNAMTIDIVI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI379,IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI379,IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI379,IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL,6,14,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAMETRI379, 0);
  }

  private static void Init_PQRY_PARAMETRI379_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMETRI379_RS, 2);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMETRI379_RS, "PQRY_PARAMETRI379_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI379_RS,IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, "ROWNAMTIDIVI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI379_RS,IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI379_RS,IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI379_RS,IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL,6,14,0);
  }

  private static void Init_PQRY_PANNELLO4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PANNELLO4, 16);
    IMDB.set_TblCode(IMDBDef16.PQRY_PANNELLO4, "PQRY_PANNELLO4");
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINCA, "ROWNAMSAINCA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINCA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINTE, "ROWNAMSAINTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINTE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFICA, "ROWNAMSAFICA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFICA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFITE, "ROWNAMSAFITE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFITE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESI1, "ROWNAMERESI1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESI1,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMMAREPA, "ROWNAMMAREPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMMAREPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMPE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMMACOPA, "ROWNAMMACOPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMMACOPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMEMANDA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOMAPA, "ROWNAMTOMAPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOMAPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESID,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMORRERI, "ROWNAMORRERI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMORRERI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMP1, "ROWNAMECOMP1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMP1,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMORCORI, "ROWNAMORCORI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMORCORI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMETOTAL, "ROWNAMETOTAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMETOTAL,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOORRI, "ROWNAMTOORRI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOORRI,3,14,2);
    IMDB.TblAddNew(IMDBDef16.PQRY_PANNELLO4, 0);
  }

  private static void Init_PQRY_PANNELLO4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PANNELLO4_RS, 16);
    IMDB.set_TblCode(IMDBDef16.PQRY_PANNELLO4_RS, "PQRY_PANNELLO4_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINCA, "ROWNAMSAINCA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINCA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINTE, "ROWNAMSAINTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINTE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFICA, "ROWNAMSAFICA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFICA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFITE, "ROWNAMSAFITE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMSAFITE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESI1, "ROWNAMERESI1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESI1,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMMAREPA, "ROWNAMMAREPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMMAREPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMPE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMMACOPA, "ROWNAMMACOPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMMACOPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMEMANDA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOMAPA, "ROWNAMTOMAPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOMAPA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMERESID,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMORRERI, "ROWNAMORRERI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMORRERI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMP1, "ROWNAMECOMP1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMECOMP1,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMORCORI, "ROWNAMORCORI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMORCORI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMETOTAL, "ROWNAMETOTAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMETOTAL,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOORRI, "ROWNAMTOORRI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PANNELLO4_RS,IMDBDef16.PQSL_PANNELLO4_ROWNAMTOORRI,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneCassaPerVincolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneCassaPerVincolo()
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
    FormIdx = MyGlb.FRM_SITCASPERVIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4FDBD0F5-69D9-432E-86E3-914C6EC5651A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 584;
    DesignHeight = 502;
    set_Caption(new IDVariant("Situazione Cassa Per Vincolo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 584;
    Frames[1].Height = 476;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.12605;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 584;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 584-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7119803E-41D6-4A9F-8720-CC4A51DFFDB4");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 404, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 584;
    Frames[3].Height = 416;
    Frames[3].Caption = "Situazione Cassa Per Vincolo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 416;
    PAN_SITCASPERVIN = new IDPanel(w, this, 3, "PAN_SITCASPERVIN");
    Frames[3].Content = PAN_SITCASPERVIN;
    PAN_SITCASPERVIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITCASPERVIN.VS = MainFrm.VisualStyleList;
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 584-MyGlb.PAN_OFFS_X, 416-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "83C52DC9-F9FD-451D-9D0B-7B8A6B5C7D74");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1024, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITCASPERVIN.InitStatus = 2;
    PAN_SITCASPERVIN_Init();
    PAN_SITCASPERVIN_InitFields();
    PAN_SITCASPERVIN_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI94+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI79+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI94+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALDIVINCOLI+BaseCmdLinIdx)
      {
        ApriSaldiVincoli();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI390, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITCASPERVIN_PARAMETRI379();
      }
      if (IMDB.TblModified(IMDBDef6.TBL_PANNELLO7, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITCASPERVIN_PANNELLO4();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_SITCASPERVIN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAVINCOL && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_TIPOVINCOLO) {
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
    return (obj instanceof SituazioneCassaPerVincolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneCassaPerVincolo.class.getName() : (Glb.ClassWithPackage(SituazioneCassaPerVincolo.class) ? SituazioneCassaPerVincolo.class.getName().substring(SituazioneCassaPerVincolo.class.getPackage().getName().length() + 1) : SituazioneCassaPerVincolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CODICE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI390, IMDBDef6.FLD_PARAMETRI390_ROWNAMEAL, 0, IDL.Today());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as VINCOLCODICE ");
      SQL.append("from ");
      SQL.append("  VINCOLI A ");
      SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA >= TRUNC( SYSDATE )) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICE = QV.Get("VINCOLCODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI390, IMDBDef6.FLD_PARAMETRI390_ROWNAMTIDIVI, 0, new IDVariant(v_CODICE));
      PAN_SITCASPERVIN.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0, new IDVariant(v_CODICE));
      IMDB.set_Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0, IDL.Today());
      Riempi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAVINCOL)), true) && Result.equals((new IDVariant(-1)), true))
      {
        // IMDB.set_Value(IMDBDef6.TBL_PARAMETRI390, IMDBDef6.FLD_PARAMETRI390_ROWNAMTIDIVI, 0, IMDB.Value(IMDBDef7.PQRY_VINCOLI2, IMDBDef7.PQSL_VINCOLI2_CODICE, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0, IMDB.Value(IMDBDef7.PQRY_VINCOLI2, IMDBDef7.PQSL_VINCOLI2_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI390, IMDBDef6.FLD_PARAMETRI390_ROWNAMTIDIVI, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Cassa Per Vincolo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SITCASPERVIN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Situazione Cassa Per Vincolo After Find Event Body
      // Procedure Body
      // 
      // Riempi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "SituazioneCassaPerVincoloAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Vincolo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVincolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Vincolo Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAVINCOL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "ApriVincolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("TIPO_VINCOLO")), IDL.NullValue(IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0)),(new IDVariant("-1"))));
      MainFrm.SetParametroStampaJasper((new IDVariant("AL")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0)));
      // MainFrm.SetParametroStampaJasper((new IDVariant("DESCR_VINCOLO")), (new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_VINCOLDESCRI))));
      // MainFrm.SetParametroStampaJasper((new IDVariant("SALDO_INIZIALE1")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PANNELLO4, IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINCA, 0)));
      // MainFrm.SetParametroStampaJasper((new IDVariant("SALDO_INIZIALE2")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PANNELLO4, IMDBDef16.PQSL_PANNELLO4_ROWNAMSAINTE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO_VINCOLO")), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMESSAVI, 0)));
      MainFrm.LanciaStampaJasper((new IDVariant("Situazione_Vincolo_Cassa")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi
  // **********************************************************************
  public int Riempi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MANDATIEMESS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_MANCOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MANDEMESRESI = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_MANRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PAGAMECOMPET = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PAGCOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PAGAMERESIDU = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PAGRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDIEMESCOMP = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ORDCOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDIEMESRESI = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ORDRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INCASSRESIDU = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_INCASSICOMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INCASSCOMPET = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_INCASSIRES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SALDOINCASSA = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SALDOITESORE = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SINICASSA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SINITESO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDPREC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDPRECEDENT = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_MANPREC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MANDATPRECED = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_INCPREC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INCASSPRECED = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PAGPREC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PAGAMEPRECED = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      v_MANCOMP = (new IDVariant("MAN_COMP", IDVariant.STRING));
      v_MANRES = (new IDVariant("MAN_RES", IDVariant.STRING));
      v_PAGCOMP = (new IDVariant("PAG_COMP", IDVariant.STRING));
      v_PAGRES = (new IDVariant("PAG_RES", IDVariant.STRING));
      v_ORDCOMP = (new IDVariant("ORD_COMP", IDVariant.STRING));
      v_ORDRES = (new IDVariant("ORD_RES", IDVariant.STRING));
      v_INCASSICOMP = (new IDVariant("INCASSI_COMP", IDVariant.STRING));
      v_INCASSIRES = (new IDVariant("INCASSI_RES", IDVariant.STRING));
      v_SINICASSA = (new IDVariant("SINI_CASSA", IDVariant.STRING));
      v_SINITESO = (new IDVariant("SINI_TESO", IDVariant.STRING));
      v_ORDPREC = (new IDVariant("ORD_PREC", IDVariant.STRING));
      v_MANPREC = (new IDVariant("MAN_PREC", IDVariant.STRING));
      v_INCPREC = (new IDVariant("INC_PREC", IDVariant.STRING));
      v_PAGPREC = (new IDVariant("PAG_PREC", IDVariant.STRING));
      // 
      // Riempi Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_MANCOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MANDATIEMESS = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_MANRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MANDEMESRESI = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_PAGCOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PAGAMECOMPET = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'S'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_PAGRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PAGAMERESIDU = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_ORDCOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ORDIEMESCOMP = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_ORDRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ORDIEMESRESI = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_INCASSICOMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_INCASSCOMPET = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_CASSA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMEAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_INCASSIRES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSCSERNA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_INCASSRESIDU = QV.Get("CDCGDSCSERNA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOEM, 0, IDL.NullValue(v_MANDATIEMESS,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREEM, 0, IDL.NullValue(v_MANDEMESRESI,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOPA, 0, IDL.NullValue(v_PAGAMECOMPET,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREPA, 0, IDL.NullValue(v_PAGAMERESIDU,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAEM, 0, IDL.Add(IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREEM, 0), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOEM, 0)));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAPA, 0, IDL.Add(IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREPA, 0), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOPA, 0)));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORCOEM, 0, IDL.NullValue(v_ORDIEMESCOMP,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORREEM, 0, IDL.NullValue(v_ORDIEMESRESI,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORCORI, 0, IDL.NullValue(v_INCASSCOMPET,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORRERI, 0, IDL.NullValue(v_INCASSRESIDU,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOOREM, 0, IDL.Add(IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORREEM, 0), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORCOEM, 0)));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOORRI, 0, IDL.Add(IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORRERI, 0), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORCORI, 0)));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_VINCOLO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(v_SINICASSA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSVSERNT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SALDOINCASSA = QV.Get("CDCGDSVSERNT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_VINCOLO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(v_ORDPREC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSVSERNT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ORDPRECEDENT = QV.Get("CDCGDSVSERNT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_VINCOLO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(v_MANPREC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSVSERNT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MANDATPRECED = QV.Get("CDCGDSVSERNT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_VINCOLO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(v_SINITESO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSVSERNT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SALDOITESORE = QV.Get("CDCGDSVSERNT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_VINCOLO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(v_INCPREC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSVSERNT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_INCASSPRECED = QV.Get("CDCGDSVSERNT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CF4WEB_GET_DATI_SITUAZ_VINCOLO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'E'," + IDL.CSql(v_PAGPREC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CDCGDSVSERNT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PAGAMEPRECED = QV.Get("CDCGDSVSERNT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINCA, 0, IDL.Sub(IDL.Add(v_SALDOINCASSA, v_ORDPRECEDENT), v_MANDATPRECED));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAFICA, 0, IDL.Sub(IDL.Add(IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINCA, 0), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOOREM, 0)), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAEM, 0)));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINTE, 0, IDL.Sub(IDL.Add(v_SALDOITESORE, v_INCASSPRECED), v_PAGAMEPRECED));
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAFITE, 0, IDL.Sub(IDL.Add(IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINTE, 0), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOORRI, 0)), IMDB.Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAPA, 0)));
      // 
      // Calcolo max esercizio
      // 
      IDVariant v_VESERCIZIO = null;
      v_VESERCIZIO = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A_GET_MAX_ESERCIZIO_VINCOLO(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMETRI379, IMDBDef16.PQSL_PARAMETRI379_ROWNAMTIDIVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CDAGMEVSERNT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VESERCIZIO = QV.Get("CDAGMEVSERNT", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VESERCIZIO.equals((new IDVariant(0)), true))
      {
        PAN_SITCASPERVIN.set_Header(Glb.OBJ_GROUP,GRP_SITCASPERVIN_SALDOINIZIAL,(new IDVariant("Saldo Iniziale ")).stringValue()); 
      }
      else
      {
        PAN_SITCASPERVIN.set_Header(Glb.OBJ_GROUP,GRP_SITCASPERVIN_SALDOINIZIAL,IDL.Add((new IDVariant("Saldo Iniziale da Esercizio ")), IDL.ToString(v_VESERCIZIO)).stringValue()); 
      }
      IMDB.set_Value(IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMESSAVI, 0, new IDVariant(v_VESERCIZIO));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "Riempi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
      // 
      // Parametri On Validate Row Event Body
      // Procedure Body
      // 
      Riempi();
      PAN_SITCASPERVIN.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "ParametriOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Saldi Vincoli
  // **********************************************************************
  public int ApriSaldiVincoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Saldi Vincoli Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SALDIVINCOLI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneCassaPerVincolo", "ApriSaldiVincoli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SITCASPERVIN_PARAMETRI379() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAMETRI379_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI390, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI390, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAMETRI379_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAMETRI379_RS, 0, IMDBDef6.TBL_PARAMETRI390, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMETRI379_RS, 0, 0, IMDBDef6.TBL_PARAMETRI390, IMDBDef6.FLD_PARAMETRI390_ROWNAMTIDIVI, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMETRI379_RS, 1, 0, IMDBDef6.TBL_PARAMETRI390, IMDBDef6.FLD_PARAMETRI390_ROWNAMEAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI390, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI390, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI390, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAMETRI379_RS, 0);
  }

  // **********************************************************************
  // Pannello
  // Primary record source for panel data
  // **********************************************************************
  private void SITCASPERVIN_PANNELLO4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PANNELLO4_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PANNELLO7, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PANNELLO7, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PANNELLO4_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PANNELLO4_RS, 0, IMDBDef6.TBL_PANNELLO7, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 0, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINCA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 1, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINTE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 2, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAFICA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 3, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMSAFITE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 4, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREEM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 5, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREPA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 6, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOEM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 7, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOPA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 8, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAEM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 9, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAPA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 10, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORREEM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 11, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORRERI, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 12, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORCOEM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 13, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMORCORI, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 14, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOOREM, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PANNELLO4_RS, 15, 0, IMDBDef6.TBL_PANNELLO7, IMDBDef6.FLD_PANNELLO7_ROWNAMTOORRI, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PANNELLO7, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PANNELLO7, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PANNELLO7, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PANNELLO4_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_TIPOVINCOLO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVincolo();
      Cancel.set(IDVariant.TRUE);
    }
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
  private void PAN_SITCASPERVIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITCASPERVIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITCASPERVIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITCASPERVIN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITCASPERVIN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SITCASPERVIN);
    // Stub
  }

  private void PAN_SITCASPERVIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SITCASPERVIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITCASPERVIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITCASPERVIN_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "71FED6C2-91B2-4FB4-AD3E-D5F08B80BB38");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "9F822AFC-A183-4614-B293-8693782DCBF8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, "5488A8CE-4646-4615-A432-F366CB6C6E91");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, "VINCOLI DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tp. Vinc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 24, 8, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVINCOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVINCOLO, PPQRY_PARAMETRI379, "A.ROWNAMTIDIVI", "ROWNAMTIDIVI", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 40, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 436, 8, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI379, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_LIST, "VINCOLI DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_FORM, 180, 8, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VINCOLDESCRI, MyGlb.PANEL_FORM, "VINC. DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VINCOLDESCRI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VINCOLDESCRI, PPQRY_VINCOLI, "A.DESCRIZIONE", "VINCOLDESCRI", 5, 50, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIDIVI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VINCOLI, "VINCOLI");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI379", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI379, IMDBDef16.PQRY_PARAMETRI379_RS, IMDBDef6.TBL_PARAMETRI390);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVINCOLO, IMDBDef6.FLD_PARAMETRI390_ROWNAMTIDIVI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef6.FLD_PARAMETRI390_ROWNAMEAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI390");
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

  private void PAN_SITCASPERVIN_Init()
  {

    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, "032EFBAB-00FC-4D9E-BBA7-200D363DCB9C");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, "Saldo iniziale");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, MyGlb.VIS_GROUPSTYLE);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, MyGlb.PANEL_LIST, 0, -9999, 128, 16, 0, 0);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, MyGlb.PANEL_FORM, 32, 7, 524, 53, 0, 0);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, 0, 78);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, 1, 13);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, 0, 4);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, 1, 4);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOINIZIAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, "7192692A-4363-4AB1-8880-889ADA9C7201");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, "Mandati");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, MyGlb.PANEL_LIST, 256, -9999, 384, 16, 0, 0);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, MyGlb.PANEL_FORM, 32, 67, 524, 97, 0, 0);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, 0, 46);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, 1, 13);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, 0, 4);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, 1, 4);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, "82EB4EAD-A731-465F-B5EA-87680607B822");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, "Ordinativi");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, MyGlb.PANEL_LIST, 640, -9999, 384, 16, 0, 0);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, MyGlb.PANEL_FORM, 32, 175, 524, 97, 0, 0);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, 0, 55);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, 1, 13);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, 0, 4);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, 1, 4);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, "A433E45B-CA9E-44FB-9E2C-C5491BCC3AC8");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, "Saldo Finale");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, MyGlb.VIS_GROUPSTYLE);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, MyGlb.PANEL_LIST, 128, -9999, 128, 16, 0, 0);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, MyGlb.PANEL_FORM, 32, 291, 524, 53, 0, 0);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, 0, 70);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, 1, 13);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, 0, 4);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, 1, 4);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_SALDOFINALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, "A25663AA-A940-4DB5-8895-1EF569491548");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, " ");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, "lblgrp");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, "9DD75785-8BDB-47E4-BE96-EC92A0A9953B");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, "Cassa");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, "24436AD4-4422-49A8-A378-59B2E0B1CF7F");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, " ");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, "lblgrp");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, "7503547A-0DDB-46E0-924A-ED0F88387791");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, "Tesoreria");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, "B4841C8B-4103-4990-AF3F-B15738176F98");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, "Residui");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, "31B266E5-DC42-49EA-A45A-38D98B73D894");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, "Mandati Residui Pagati");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, "8D0844BE-736D-4E30-89E8-6B204DCB99A5");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, "Competenza");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, "59A0298C-3E2F-47D9-BA27-05D440585753");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, "Mandati Competenza Pagati");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, "B46BA7BA-965F-4F5C-985E-20E0BD596741");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, " ");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, "lblgrp");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, "B87A3517-1F73-488D-95C6-58BEE8C135E0");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, "Mandati");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, "DA542FC4-6C4C-4DE4-8090-E46716CAF2D0");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, "Totale Mandati Pagati");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, "F038B229-134C-4A9D-B558-4A21250AF402");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, " ");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, "lblgrp");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, "0A2F6414-8595-4C69-845D-723C4A8BC29A");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, "Residuo");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, "94493E23-6C91-4478-949D-8876D359C109");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, "Ordinativi Residuo Riscossi");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, "542CA280-DE22-4427-9C17-B8E237D654E3");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, "Competenza");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, "02B0656E-1877-452C-83FC-8E399ECEF778");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, "Ordinativi Competenza Riscossi");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, "96CB9845-D9D8-4712-BF7D-601ED6500ED5");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, "Totale");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, "5A3552EC-3848-41F3-9FE1-A4B965E4012E");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, "Totale Ordinativi Riscossi");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, "E45ECB44-88CB-4155-A3F7-770B1BDA24DD");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, " ");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, "lblgrp");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, "89514E8C-7507-4008-885A-C4661D66F8F8");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, "Emessi");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, "8C3FD463-F6DC-4EF5-9D3A-FBC41A6EE15E");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, "Pagati");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, "A0497B5A-FDEB-4AD8-8470-4721A560D65E");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, "Emessi");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, "E9D2E9CC-67A3-46DE-B2FF-F1697F92CF03");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, "Riscossi");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, "1CBFBF48-833C-47D4-BB89-2B411826AF91");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, " ");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, "lblgrp");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, "807E197E-235B-4136-9938-264B20355C16");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, "Cassa");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, "31A28E61-B408-4BE1-BCA2-F90F0A8B18F4");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, " ");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, "lblgrp");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, MyGlb.VIS_VUOTONORMALE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, "54F1CB02-1980-40F8-877C-6E49CD33824C");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, "Tesoreria");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SITCASPERVIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, MyGlb.PANEL_LIST, 524, 144, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, MyGlb.PANEL_FORM, 36, 40, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR3, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ETICHELBLGR3, -1, GRP_SITCASPERVIN_SALDOINIZIAL);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ETICHELBLGR3, -1, "", "ETICHELBLGR3", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_LIST, 72);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_LIST, "Cassa");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_FORM, 40, 36, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_FORM, 100);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZCASS, MyGlb.PANEL_FORM, "Cassa");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_SALDINIZCASS, -1, GRP_SITCASPERVIN_SALDOINIZIAL);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_SALDINIZCASS, PPQRY_PANNELLO4, "A.ROWNAMSAINCA", "ROWNAMSAINCA", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, MyGlb.PANEL_LIST, 516, 136, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, MyGlb.PANEL_FORM, 532, 32, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR5, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ETICHELBLGR5, -1, GRP_SITCASPERVIN_SALDOINIZIAL);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ETICHELBLGR5, -1, "", "ETICHELBLGR5", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_LIST, 64, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_LIST, 80);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_LIST, "Tesoreria");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_FORM, 336, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_FORM, 68);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDINIZTESO, MyGlb.PANEL_FORM, "Tesoreria");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_SALDINIZTESO, -1, GRP_SITCASPERVIN_SALDOINIZIAL);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_SALDINIZTESO, PPQRY_PANNELLO4, "A.ROWNAMSAINTE", "ROWNAMSAINTE", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_LIST, 256, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_LIST, 120);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_FORM, 36, 92, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_FORM, 104);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_RESIDUI, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_RESIDUI, PPQRY_PANNELLO4, "A.ROWNAMMAREEM", "ROWNAMERESI1", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_LIST, 320, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_LIST, 116);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_LIST, "Mn. Rs. P.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_FORM, 408, 92, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_FORM, 96);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDRESIPAGA, MyGlb.PANEL_FORM, "Mand. Res. Pag.");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_MANDRESIPAGA, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_MANDRESIPAGA, PPQRY_PANNELLO4, "A.ROWNAMMAREPA", "ROWNAMMAREPA", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_LIST, 384, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_LIST, 144);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_LIST, "Compet.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_FORM, 36, 116, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_FORM, 104);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA1, MyGlb.PANEL_FORM, "Competenza");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_COMPETENZA1, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_COMPETENZA1, PPQRY_PANNELLO4, "A.ROWNAMMACOEM", "ROWNAMECOMPE", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_LIST, 448, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_LIST, 144);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_LIST, "Mn. Cm. P.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_FORM, 408, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_FORM, 96);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDCOMPPAGA, MyGlb.PANEL_FORM, "Mnd. Cmp. Pag.");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_MANDCOMPPAGA, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_MANDCOMPPAGA, PPQRY_PANNELLO4, "A.ROWNAMMACOPA", "ROWNAMMACOPA", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, MyGlb.PANEL_LIST, 500, 120, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, MyGlb.PANEL_FORM, 536, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGRP, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ETICHELBLGRP, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ETICHELBLGRP, -1, "", "ETICHELBLGRP", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_LIST, 512, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_LIST, 116);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_FORM, 36, 140, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_FORM, 104);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_MANDATI, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_MANDATI, PPQRY_PANNELLO4, "A.ROWNAMTOMAEM", "ROWNAMEMANDA", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_LIST, 576, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_LIST, 112);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_LIST, "Tt. Mn. Pg.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_FORM, 408, 140, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_FORM, 96);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAMANDPAGA, MyGlb.PANEL_FORM, "Tot. Mand. Pag.");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_TOTAMANDPAGA, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_TOTAMANDPAGA, PPQRY_PANNELLO4, "A.ROWNAMTOMAPA", "ROWNAMTOMAPA", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, MyGlb.PANEL_LIST, 508, 128, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, MyGlb.PANEL_FORM, 312, 128, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR1, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ETICHELBLGR1, -1, GRP_SITCASPERVIN_MANDATI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ETICHELBLGR1, -1, "", "ETICHELBLGR1", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_LIST, 640, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_LIST, 132);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_LIST, "Residuo");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_FORM, 36, 200, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_FORM, 104);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RESIDUO, MyGlb.PANEL_FORM, "Residuo");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_RESIDUO, -1, GRP_SITCASPERVIN_ORDINATIVI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_RESIDUO, PPQRY_PANNELLO4, "A.ROWNAMORREEM", "ROWNAMERESID", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_LIST, 704, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_LIST, 136);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_LIST, "Or. Rs. Rs.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_FORM, 408, 200, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_FORM, 96);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDIRESIRISC, MyGlb.PANEL_FORM, "Ordin. Res. Risc.");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ORDIRESIRISC, -1, GRP_SITCASPERVIN_ORDINATIVI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ORDIRESIRISC, PPQRY_PANNELLO4, "A.ROWNAMORRERI", "ROWNAMORRERI", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_LIST, 768, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_LIST, 152);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_LIST, "Compet.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_FORM, 36, 224, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_FORM, 104);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_COMPETENZA, MyGlb.PANEL_FORM, "Competenza");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_COMPETENZA, -1, GRP_SITCASPERVIN_ORDINATIVI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_COMPETENZA, PPQRY_PANNELLO4, "A.ROWNAMORCOEM", "ROWNAMECOMP1", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_LIST, 832, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_LIST, 160);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_LIST, "Or. Cm. R.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_FORM, 408, 224, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_FORM, 96);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ORDICOMPRISC, MyGlb.PANEL_FORM, "Ord. Comp. Risc.");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ORDICOMPRISC, -1, GRP_SITCASPERVIN_ORDINATIVI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ORDICOMPRISC, PPQRY_PANNELLO4, "A.ROWNAMORCORI", "ROWNAMORCORI", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_LIST, 896, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_LIST, 124);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_LIST, "Totale");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_FORM, 36, 248, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_FORM, 104);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTALE, MyGlb.PANEL_FORM, "Totale");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_TOTALE, -1, GRP_SITCASPERVIN_ORDINATIVI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_TOTALE, PPQRY_PANNELLO4, "A.ROWNAMTOOREM", "ROWNAMETOTAL", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_LIST, 960, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_LIST, 128);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_LIST, "T. Ord. Rs.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_FORM, 408, 248, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_FORM, 96);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TOTAORDIRISC, MyGlb.PANEL_FORM, "Tot. Ordin. Risc.");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_TOTAORDIRISC, -1, GRP_SITCASPERVIN_ORDINATIVI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_TOTAORDIRISC, PPQRY_PANNELLO4, "A.ROWNAMTOORRI", "ROWNAMTOORRI", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, MyGlb.PANEL_LIST, 508, 128, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, MyGlb.PANEL_FORM, 540, 248, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR2, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ETICHELBLGR2, -1, GRP_SITCASPERVIN_ORDINATIVI);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ETICHELBLGR2, -1, "", "ETICHELBLGR2", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, MyGlb.PANEL_LIST, 180, 40, 52, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, MyGlb.PANEL_FORM, 172, 72, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_EMESSI, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_EMESSI, -1, "", "EMESSI", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, MyGlb.PANEL_LIST, 188, 48, 52, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, MyGlb.PANEL_FORM, 388, 72, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_PAGATI, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_PAGATI, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_PAGATI, -1, "", "PAGATI", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, MyGlb.PANEL_LIST, 188, 148, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, MyGlb.PANEL_FORM, 172, 180, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_EMESSI1, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_EMESSI1, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_EMESSI1, -1, "", "EMESSI1", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, MyGlb.PANEL_LIST, 196, 156, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, MyGlb.PANEL_FORM, 384, 180, 56, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_RISCOSSI, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_RISCOSSI, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_RISCOSSI, -1, "", "RISCOSSI", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, MyGlb.PANEL_LIST, 532, 152, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, MyGlb.PANEL_FORM, 36, 320, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHETTA, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ETICHETTA, -1, GRP_SITCASPERVIN_SALDOFINALE);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ETICHETTA, -1, "", "ETICHETTA", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_LIST, 128, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_LIST, 68);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_LIST, "Cassa");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_FORM, 56, 316, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_FORM, 84);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINACASS, MyGlb.PANEL_FORM, "Cassa");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_SALDFINACASS, -1, GRP_SITCASPERVIN_SALDOFINALE);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_SALDFINACASS, PPQRY_PANNELLO4, "A.ROWNAMSAFICA", "ROWNAMSAFICA", 3, 14, 2, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, MyGlb.PANEL_LIST, 524, 144, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, MyGlb.PANEL_FORM, 540, 324, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ETICHELBLGR4, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ETICHELBLGR4, -1, GRP_SITCASPERVIN_SALDOFINALE);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ETICHELBLGR4, -1, "", "ETICHELBLGR4", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_LIST, 192, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_LIST, 76);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_LIST, "Tesoreria");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_FORM, 340, 316, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_FORM, 64);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_SALDFINATESO, MyGlb.PANEL_FORM, "Tesoreria");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_SALDFINATESO, -1, GRP_SITCASPERVIN_SALDOFINALE);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_SALDFINATESO, PPQRY_PANNELLO4, "A.ROWNAMSAFITE", "ROWNAMSAFITE", 3, 14, 2, -13997);
  }

  private void PAN_SITCASPERVIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITCASPERVIN.SetIMDB(IMDB, "PQRY_PANNELLO4", true);
    PAN_SITCASPERVIN.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SITCASPERVIN.SetQueryIMDB(PPQRY_PANNELLO4, IMDBDef16.PQRY_PANNELLO4_RS, IMDBDef6.TBL_PANNELLO7);
    JustLoaded = true;
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_SALDINIZCASS, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINCA);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_SALDINIZTESO, IMDBDef6.FLD_PANNELLO7_ROWNAMSAINTE);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_RESIDUI, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREEM);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_MANDRESIPAGA, IMDBDef6.FLD_PANNELLO7_ROWNAMMAREPA);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_COMPETENZA1, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOEM);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_MANDCOMPPAGA, IMDBDef6.FLD_PANNELLO7_ROWNAMMACOPA);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_MANDATI, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAEM);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_TOTAMANDPAGA, IMDBDef6.FLD_PANNELLO7_ROWNAMTOMAPA);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_RESIDUO, IMDBDef6.FLD_PANNELLO7_ROWNAMORREEM);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_ORDIRESIRISC, IMDBDef6.FLD_PANNELLO7_ROWNAMORRERI);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_COMPETENZA, IMDBDef6.FLD_PANNELLO7_ROWNAMORCOEM);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_ORDICOMPRISC, IMDBDef6.FLD_PANNELLO7_ROWNAMORCORI);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_TOTALE, IMDBDef6.FLD_PANNELLO7_ROWNAMTOOREM);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_TOTAORDIRISC, IMDBDef6.FLD_PANNELLO7_ROWNAMTOORRI);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_SALDFINACASS, IMDBDef6.FLD_PANNELLO7_ROWNAMSAFICA);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_SALDFINATESO, IMDBDef6.FLD_PANNELLO7_ROWNAMSAFITE);
    PAN_SITCASPERVIN.SetMasterTable(0, "PANNELLO7");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITCASPERVIN.Status() == 2)
    {
      int oldListQBE = PAN_SITCASPERVIN.iUseListQBE;
      PAN_SITCASPERVIN.iUseListQBE = 0;
      PAN_SITCASPERVIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITCASPERVIN.PanelCommand(Glb.PCM_FIND);
      PAN_SITCASPERVIN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_AfterFind(CmdFind);
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
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
