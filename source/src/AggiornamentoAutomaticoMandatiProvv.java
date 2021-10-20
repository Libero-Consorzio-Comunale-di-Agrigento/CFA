// **********************************************
// Aggiornamento Automatico Mandati Provv
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoAutomaticoMandatiProvv extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_AGGIORAUTOMA_CAPITOLO = 0;
  private static int PFL_AGGIORAUTOMA_ARTICOLO = 1;
  private static int PFL_AGGIORAUTOMA_SLASH = 2;
  private static int PFL_AGGIORAUTOMA_IMPEGNO = 3;
  private static int PFL_AGGIORAUTOMA_ANNOIMPEGNO = 4;
  private static int PFL_AGGIORAUTOMA_NUMEROSUBIMP = 5;
  private static int PFL_AGGIORAUTOMA_ANNOSUBIMP = 6;
  private static int PFL_AGGIORAUTOMA_DESCRIZIONE = 7;
  private static int PFL_AGGIORAUTOMA_SLASH1 = 8;
  private static int PFL_AGGIORAUTOMA_SCEGLVOCEPEG = 9;
  private static int PFL_AGGIORAUTOMA_INFOVOCEPEG = 10;
  private static int PFL_AGGIORAUTOMA_SCEGLIACC = 11;
  private static int PFL_AGGIORAUTOMA_INFOACC = 12;
  private static int PFL_AGGIORAUTOMA_VOCEECON = 13;
  private static int PFL_AGGIORAUTOMA_VOCIECONDESC = 14;
  private static int PFL_AGGIORAUTOMA_CGU = 15;
  private static int PFL_AGGIORAUTOMA_CODIGESTDESC = 16;
  private static int PFL_AGGIORAUTOMA_TIPOVINCOLO = 17;
  private static int PFL_AGGIORAUTOMA_BENBENEFICIA = 18;
  private static int PFL_AGGIORAUTOMA_CODICECREDIT = 19;
  private static int PFL_AGGIORAUTOMA_SCEDEBDOCBUT = 20;
  private static int PFL_AGGIORAUTOMA_INFODEBITDOC = 21;
  private static int PFL_AGGIORAUTOMA_NUMQUIETANZA = 22;
  private static int PFL_AGGIORAUTOMA_DESCIZQUIETA = 23;
  private static int PFL_AGGIORAUTOMA_BOLLO = 24;
  private static int PFL_AGGIORAUTOMA_UFFICIO = 25;
  private static int PFL_AGGIORAUTOMA_ELABORA = 26;
  private static int PFL_AGGIORAUTOMA_CODVLIVELLO = 27;
  private static int PFL_AGGIORAUTOMA_DESCCODVLIVE = 28;
  private static int PFL_AGGIORAUTOMA_PRCOVISTRIDE = 29;
  private static int PFL_AGGIORAUTOMA_CODICECOFOG = 30;
  private static int PFL_AGGIORAUTOMA_CODEUROPEO = 31;
  private static int PFL_AGGIORAUTOMA_MOTIVESCLCIG = 32;
  private static int PFL_AGGIORAUTOMA_CAPTITOLO = 33;
  private static int PFL_AGGIORAUTOMA_CAPCATEGORIA = 34;
  private static int PFL_AGGIORAUTOMA_CAPCODINTERV = 35;
  private static int PFL_AGGIORAUTOMA_CAPCODTERZI = 36;
  private static int PFL_AGGIORAUTOMA_CAPVOCEECON = 37;
  private static int PFL_AGGIORAUTOMA_ETICATTEVERR = 38;
  private static int PFL_AGGIORAUTOMA_SCEGLISUB = 39;
  private static int PFL_AGGIORAUTOMA_INFOSUB = 40;

  private static int PPQRY_ORDINDACORR8 = 0;

  private static int PPQRY_VISTSTRURICL = 1;
  private static int PPQRY_QTN = 2;
  private static int PPQRY_VOCIECONOMIC = 3;
  private static int PPQRY_CODICIGESTIO = 4;
  private static int PPQRY_CAP = 5;
  private static int PPQRY_BEN = 6;
  private static int PPQRY_COFOG = 7;

  private static int PPQRY_VINCOLI = 8;
  private static int PPQRY_T60 = 9;
  private static int PPQRY_T53 = 10;
  private static int PPQRY_ATTRIBUTIOPI = 11;


  IDPanel PAN_AGGIORAUTOMA;

  // Definition of Global Variables
  public IDVariant VOCEECON = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_EMISSIORDIN4(IMDB);
    Init_TBL_PARAMETRIO11(IMDB);
    Init_TBL_PARAMETRI524(IMDB);
    //
    //
    Init_PQRY_ORDINDACORR8(IMDB);
    Init_PQRY_ORDINDACORR8_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_EMISSIORDIN4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_EMISSIORDIN4, 20);
    IMDB.set_TblCode(IMDBDef5.TBL_EMISSIORDIN4, "TBL_EMISSIORDIN4");
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI6, "ROWNAMCODLI6");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI6,3,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEU1, "ROWNAMCODEU1");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEU1,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI5, "ROWNAMCODLI5");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEUR, "ROWNAMCODEUR");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEUR,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMQUI, "ROWNAMNUMQUI");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMQUI,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO, "ROWNAMVOCECO");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECGE, "ROWNAMECGE");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECGE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEDESCR,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef5.TBL_EMISSIORDIN4,IMDBDef5.FLD_EMISSIORDIN4_CODICE_COFOG,1,3,0);
    IMDB.TblAddNew(IMDBDef5.TBL_EMISSIORDIN4, 0);
  }

  private static void Init_TBL_PARAMETRIO11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRIO11, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRIO11, "TBL_PARAMETRIO11");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD, "CAPITOLOOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD, "ARTICOLOOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_NUMEROACCOLD, "NUMEROACCOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_NUMEROACCOLD,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_ANNOACCOLD, "ANNOACCOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_ANNOACCOLD,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD, "DEBITOREOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIO11,IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD,5,60,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRIO11, 0);
  }

  private static void Init_TBL_PARAMETRI524(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI524, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI524, "TBL_PARAMETRI524");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI524,IMDBDef5.FLD_PARAMETRI524_NOMOGGLIV4CA, "NOMOGGLIV4CA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI524,IMDBDef5.FLD_PARAMETRI524_NOMOGGLIV4CA,1,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI524, 0);
  }

  private static void Init_PQRY_ORDINDACORR8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR8, 18);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR8, "PQRY_ORDINDACORR8");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMQUI, "ROWNAMNUMQUI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMQUI,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODLI6, "ROWNAMCODLI6");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODLI6,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODEU1, "ROWNAMCODEU1");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODEU1,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMVOCECO, "ROWNAMVOCECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMVOCECO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECGE, "ROWNAMECGE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECGE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEDESCR,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8,IMDBDef15.PQSL_ORDINDACORR8_CODICE_COFOG,1,3,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR8, 0);
  }

  private static void Init_PQRY_ORDINDACORR8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR8_RS, 18);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR8_RS, "PQRY_ORDINDACORR8_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMQUI, "ROWNAMNUMQUI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMQUI,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODLI6, "ROWNAMCODLI6");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODLI6,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODEU1, "ROWNAMCODEU1");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODEU1,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMVOCECO, "ROWNAMVOCECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMVOCECO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECGE, "ROWNAMECGE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECGE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEDESCR,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR8_RS,IMDBDef15.PQSL_ORDINDACORR8_CODICE_COFOG,1,3,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoAutomaticoMandatiProvv(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoAutomaticoMandatiProvv()
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
    FormIdx = MyGlb.FRM_AGGAUTMANPRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1C3E8992-D28B-4408-A5D5-F20D29F5B1FA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 576;
    DesignHeight = 546;
    set_Caption(new IDVariant("Aggiornamento Automatico"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 576;
    Frames[1].Height = 520;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Aggiornamento Automatico";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 520;
    PAN_AGGIORAUTOMA = new IDPanel(w, this, 1, "PAN_AGGIORAUTOMA");
    Frames[1].Content = PAN_AGGIORAUTOMA;
    PAN_AGGIORAUTOMA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_AGGIORAUTOMA.VS = MainFrm.VisualStyleList;
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 576-MyGlb.PAN_OFFS_X, 520-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E33785F3-77A3-4E7C-8282-E902FA4BE093");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2836, 292, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_AGGIORAUTOMA.InitStatus = 2;
    PAN_AGGIORAUTOMA_Init();
    PAN_AGGIORAUTOMA_InitFields();
    PAN_AGGIORAUTOMA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_EMISSIORDIN4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGAUTMANPRO_ORDINDACORR8();
      }
      PAN_AGGIORAUTOMA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_SCEGLVOCEPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_SCEGLIACC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEVOCECCOFI && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_VOCEECON) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECODGECOFI && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_CGU) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_SCEDEBDOCBUT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEQUIDELSOG && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_NUMQUIETANZA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_CODVLIVELLO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACOFOG && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_CODICECOFOG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUO && flRis && IdxPanelActived == PAN_AGGIORAUTOMA.FrIndex)
    {
      if (IdxFieldActived ==PFL_AGGIORAUTOMA_SCEGLISUB) {
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
    return (obj instanceof AggiornamentoAutomaticoMandatiProvv);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoAutomaticoMandatiProvv.class.getName() : (Glb.ClassWithPackage(AggiornamentoAutomaticoMandatiProvv.class) ? AggiornamentoAutomaticoMandatiProvv.class.getName().substring(AggiornamentoAutomaticoMandatiProvv.class.getPackage().getName().length() + 1) : AggiornamentoAutomaticoMandatiProvv.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Debitore
  // **********************************************************************
  public int InfoDebitore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Debitore Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "InfoDebitore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Debitore
  // **********************************************************************
  public int SelezionaDebitore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Debitore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "SelezionaDebitore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce Peg
  // **********************************************************************
  public int ApriVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "ApriVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Imp
  // **********************************************************************
  public int ApriImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Imp Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "ApriImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Imp
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
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0));
        if (IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        }
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "InfoImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Cod V Livello
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriCodVLivello ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Cod V Livello Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI524, IMDBDef5.FLD_PARAMETRI524_NOMOGGLIV4CA, 0, MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMETRI524, IMDBDef5.FLD_PARAMETRI524_NOMOGGLIV4CA, 0),IDVariant.DECIMAL));
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "ApriCodVLivello", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Quietanza
  // **********************************************************************
  public int SceltaQuietanza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Quietanza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, 0, new IDVariant(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESCADE, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCEQUIDELSOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "SceltaQuietanza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Imp
  // **********************************************************************
  public int ProponiDaImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Imp Body
      // Procedure Body
      // 
      IDVariant v_ICODEUROPEO = null;
      v_ICODEUROPEO = (new IDVariant());
      IDVariant v_ICODLIVELLO5 = null;
      v_ICODLIVELLO5 = (new IDVariant());
      IDVariant v_VACCVOCEECON = null;
      v_VACCVOCEECON = (new IDVariant());
      IDVariant v_VIMPCODICOFO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VIMPTIPOVINC = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
      SQL.append("  A.ARTICOLO as IMPARTICOLO, ");
      SQL.append("  A.CODICE_EUROPEO as IMPCODICEURO, ");
      SQL.append("  A.COD_LIVELLO_5 as IMPCODLIVEL5, ");
      SQL.append("  A.VOCE_ECON as IMPVOCEECON, ");
      SQL.append("  A.CODICE_COFOG as IMPCODICCOFO, ");
      SQL.append("  A.TIPO_VINCOLO as IMPTIPOVINCO ");
      SQL.append("from ");
      SQL.append("  IMP A ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPITOLO = QV.Get("IMPCAPITOLO", IDVariant.DECIMAL) ;
        v_ARTICOLO = QV.Get("IMPARTICOLO", IDVariant.INTEGER) ;
        v_ICODEUROPEO = QV.Get("IMPCODICEURO", IDVariant.INTEGER) ;
        v_ICODLIVELLO5 = QV.Get("IMPCODLIVEL5", IDVariant.INTEGER) ;
        v_VACCVOCEECON = QV.Get("IMPVOCEECON", IDVariant.INTEGER) ;
        v_VIMPCODICOFO = QV.Get("IMPCODICCOFO", IDVariant.INTEGER) ;
        v_VIMPTIPOVINC = QV.Get("IMPTIPOVINCO", IDVariant.INTEGER) ;
      }
      QV.Close();
      // 
      // 
      // 
      // 
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODLI6, 0, new IDVariant(new IDVariant(v_ICODLIVELLO5),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODEU1, 0, new IDVariant(v_ICODEUROPEO));
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_CODICE_COFOG, 0, new IDVariant(v_VIMPCODICOFO));
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_TIPO_VINCOLO, 0, new IDVariant(v_VIMPTIPOVINC));
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO, 0, new IDVariant(v_VACCVOCEECON));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "ProponiDaImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Voce Peg
  // **********************************************************************
  public int ProponiDaVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Voce Peg Body
      // Procedure Body
      // 
      IDVariant v_ICODEUROPEO = null;
      v_ICODEUROPEO = (new IDVariant());
      IDVariant v_VLIVELLO5 = null;
      v_VLIVELLO5 = (new IDVariant());
      IDVariant v_VCAPVOCEECON = null;
      v_VCAPVOCEECON = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE_EUROPEO as CAPCODICEURO, ");
      SQL.append("  A.VOCE_ECON as CAPVOCEECON ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ICODEUROPEO = QV.Get("CAPCODICEURO", IDVariant.INTEGER) ;
        v_VCAPVOCEECON = QV.Get("CAPVOCEECON", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ANNOACCOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_NUMEROACCOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODEU1, 0, new IDVariant(v_ICODEUROPEO));
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO, 0, new IDVariant(v_VCAPVOCEECON));
      }
      // 
      // porpongo il riclassificato di livello 5
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as VISRICCAPCOD ");
      SQL.append("from ");
      SQL.append("  VISTA_RICLASSIFICAZIONI_CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VLIVELLO5 = QV.Get("VISRICCAPCOD", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODLI6, 0, new IDVariant(new IDVariant(v_VLIVELLO5),IDVariant.DECIMAL));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "ProponiDaVocePeg", _e);
      return -1;
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
    IDVariant v_SPESE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      LOADEVENT_EMISORDIDELE();
      LOADEVENT_PARAMOLDDELE();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPSPEMINCOD ");
      SQL.append("from ");
      SQL.append("  TIPI_SPESA_MINF A ");
      SQL.append("where (A.DEFAULT_E = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SPESE = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
      PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.TIPO_MINF.equals((new IDVariant("OPI")), true))
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_EMISORDIDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODDEB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI6, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEU1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI5, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEUR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMQUI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_MOTIVO_ESCLUSIONE_CIG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_TIPO_VINCOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_CODICE_COFOG, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Old: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARAMOLDDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_NUMEROACCOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ANNOACCOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_RAGIONE_SOCIALE_ESTESA, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        ProponiDaVocePeg();
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        ProponiDaImp();
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_IMP, 0));
        ProponiDaImp();
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODLI6, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEQUIDELSOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMQUI, 0, IMDB.Value(IMDBDef7.PQRY_QTN4, IMDBDef7.PQSL_QTN4_NUM_QUIETANZA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVOCECCOFI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMVOCECO, 0, IMDB.Value(IMDBDef7.PQRY_VOCIECONOMI4, IMDBDef7.PQSL_VOCIECONOMI4_CODICE, 0));
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECGE, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECODGECOFI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECGE, 0, IMDB.Value(IMDBDef7.PQRY_RICLASSIGEST, IMDBDef7.PQSL_RICLASSIGEST_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACOFOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_CODICE_COFOG, 0, IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC3, IMDBDef7.PQSL_VISTSTRURIC3_VISSTRRIPRCO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "EndModalEvent", _e);
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
      if (Confirm.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0))))
        {
          IDVariant v_RET1 = new IDVariant(0,IDVariant.INTEGER);
          v_RET1 = (new IDVariant(MainFrm.ControllaVocePEG(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")))));
          if (v_RET1.equals((new IDVariant(0)), true))
          {
            IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            v_ERR = (new IDVariant("Capitolo/Articolo non trovato", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERR); 
            IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECAPIT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEARTIC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0, (new IDVariant()));
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0))))
        {
          IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);
          v_RET = (new IDVariant(MainFrm.ControlloImpegnoValido(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0))));
          if (v_RET.equals((new IDVariant(0)), true))
          {
            IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
            v_ERR = (new IDVariant("Impegno non trovato", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERR); 
            IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0, (new IDVariant()));
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
      }
      PAN_AGGIORAUTOMA.PanelCommand(Glb.PCM_UPDATE);
      UNLOADEVENT_EMISORDIDELE();
      UNLOADEVENT_PARAMOLDDELE();
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI318, IMDBDef5.FLD_PARAMETRI318_PARAVOCEECON, 0, ((IDL.NullValue((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPVOCEECON))),(new IDVariant(""))).equals((new IDVariant("")), true))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPVOCEECON))))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_EMISORDIDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODDEB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI6, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEU1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI5, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEUR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMQUI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_MOTIVO_ESCLUSIONE_CIG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_TIPO_VINCOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_CODICE_COFOG, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Old: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMOLDDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_NUMEROACCOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ANNOACCOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_DEBITOREOLD, 0, new IDVariant());
  }

  // **********************************************************************
  // Aggiornamento Automatico On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_AGGIORAUTOMA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_AGGIORAUTOMA);
      // 
      // Aggiornamento Automatico On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0))))
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0))))
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0))))
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, 0))))
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AGGIORAUTOMA.SetFlags (Glb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_AGGIORAUTOMA.set_ToolTip(Glb.OBJ_FIELD,PFL_AGGIORAUTOMA_VOCIECONDESC,(new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_VOCIECONDESC))).stringValue()); 
      PAN_AGGIORAUTOMA.set_ToolTip(Glb.OBJ_FIELD,PFL_AGGIORAUTOMA_CODIGESTDESC,(new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CODIGESTDESC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "AggiornamentoAutomaticoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento Automatico On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_AGGIORAUTOMA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento Automatico On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_AGGIORAUTOMA_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_AGGIORAUTOMA_ARTICOLO)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD, 0), true)!=0 || IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD, 0), true)!=0)
        {
          if (FieldWasModified.booleanValue())
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0))))
            {
              ProponiDaVocePeg();
              IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECGE, 0, (new IDVariant()));
            }
            else
            {
              IMDB.set_Value(IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO, 0, (new IDVariant()));
            }
          }
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0));
        }
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI524, IMDBDef5.FLD_PARAMETRI524_NOMOGGLIV4CA, 0, MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0)));
      }
      if (Column.equals((new IDVariant(PFL_AGGIORAUTOMA_IMPEGNO)), true) || Column.equals((new IDVariant(PFL_AGGIORAUTOMA_ANNOIMPEGNO)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_NUMEROACCOLD, 0), true)!=0 || IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ANNOACCOLD, 0), true)!=0)
        {
          if (FieldWasModified.booleanValue())
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0))))
            {
              if (MainFrm.ControlloImpegnoValido(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0)))
              {
                ProponiDaImp();
              }
              else
              {
                IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                v_AVVISO = (new IDVariant("Impegno non previsto in Bilancio"));
                MainFrm.set_AlertMessage(v_AVVISO); 
                IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0, (new IDVariant()));
              }
            }
          }
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_NUMEROACCOLD, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ANNOACCOLD, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_CAPITOLOOLD, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIO11, IMDBDef5.FLD_PARAMETRIO11_ARTICOLOOLD, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0));
        }
      }
      if ((Column.equals((new IDVariant(PFL_AGGIORAUTOMA_NUMEROSUBIMP)), true) || Column.equals((new IDVariant(PFL_AGGIORAUTOMA_ANNOSUBIMP)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, 0))))
        {
          IDVariant v_ANNOIMP = null;
          v_ANNOIMP = (new IDVariant());
          IDVariant v_NUMEROIMP = null;
          v_NUMEROIMP = (new IDVariant());
          if (MainFrm.ControlloSubimpegnoValido(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB, 0), v_ANNOIMP, v_NUMEROIMP))
          {
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMIMP, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0, new IDVariant(v_ANNOIMP));
            ProponiDaImp();
          }
          else
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("SubImpegno inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNIMP, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_AGGIORAUTOMA_NUMQUIETANZA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMQUI, 0))) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMCODDEB, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMQUI, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "AggiornamentoAutomaticoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Aggiornamento Automatico On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_AGGIORAUTOMA_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento Automatico On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_AGGIORAUTOMA_BENBENEFICIA)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_BENBENEFICIA))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "AggiornamentoAutomaticoOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Voce Econ
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VoceEcon ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voce Econ Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMTITOLO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODINTE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCATEGOR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODTERZ, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCEVOCECCOFI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "VoceEcon", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cge
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Cge ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cge Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMTITOLO, 0, ((IDL.NullValue((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPTITOLO))),(new IDVariant(""))).equals((new IDVariant("")), true))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPTITOLO))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCATEGOR, 0, ((IDL.NullValue((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPCATEGORIA))),(new IDVariant(""))).equals((new IDVariant("")), true))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPCATEGORIA))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCODINTE, 0, ((IDL.NullValue((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPCODINTERV))),(new IDVariant(""))).equals((new IDVariant("")), true))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPCODINTERV))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCODTERZ, 0, ((IDL.NullValue((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPCODTERZI))),(new IDVariant(""))).equals((new IDVariant("")), true))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPCODTERZI))))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAVOCEECON, 0, ((IDL.NullValue((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPVOCEECON))),(new IDVariant(""))).equals((new IDVariant("")), true))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_AGGIORAUTOMA.FieldText(PFL_AGGIORAUTOMA_CAPVOCEECON))))));
      MainFrm.Show(MyGlb.FRM_SCECODGECOFI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "Cge", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Sub
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScegliSub ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Sub Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMPROUNI, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "ScegliSub", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoSub ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMNUMSUB, 0));
      if (IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMANNSUB, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "InfoSub", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta COFOG
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaCOFOG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta COFOG Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_SCELTACOFOG,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMECAPIT, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR8, IMDBDef15.PQSL_ORDINDACORR8_ROWNAMEARTIC, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACOFOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoMandatiProvv", "SceltaCOFOG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi
  // Primary record source for panel data
  // **********************************************************************
  private void AGGAUTMANPRO_ORDINDACORR8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ORDINDACORR8_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_EMISSIORDIN4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_EMISSIORDIN4, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR8_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ORDINDACORR8_RS, 0, IMDBDef5.TBL_EMISSIORDIN4, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 0, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 1, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 2, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMIMP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 3, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNIMP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 4, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODDEB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 5, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMQUI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 6, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 7, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 8, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI6, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 9, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEU1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 10, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 11, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECGE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 12, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 13, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMSUB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 14, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNSUB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 15, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_MOTIVO_ESCLUSIONE_CIG, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 16, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_TIPO_VINCOLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR8_RS, 17, 0, IMDBDef5.TBL_EMISSIORDIN4, IMDBDef5.FLD_EMISSIORDIN4_CODICE_COFOG, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_EMISSIORDIN4, 0);
      if (IMDB.Eof(IMDBDef5.TBL_EMISSIORDIN4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_EMISSIORDIN4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ORDINDACORR8_RS, 0);
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
  private void PAN_AGGIORAUTOMA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_AGGIORAUTOMA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_AGGIORAUTOMA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_AGGIORAUTOMA, Cancel);
    // Stub
  }

  private void PAN_AGGIORAUTOMA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_SCEGLVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_SCEGLIACC)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_INFOACC)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_VOCEECON)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VoceEcon();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_CGU)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Cge();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_SCEDEBDOCBUT)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_INFODEBITDOC)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_NUMQUIETANZA)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaQuietanza();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_CODVLIVELLO)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCodVLivello();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_CODICECOFOG)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCOFOG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_SCEGLISUB)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliSub();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AGGIORAUTOMA_INFOSUB)
    {
      this.IdxPanelActived = this.PAN_AGGIORAUTOMA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSub();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_AGGIORAUTOMA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_AGGIORAUTOMA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_AGGIORAUTOMA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_AGGIORAUTOMA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_AGGIORAUTOMA_Init()
  {

    PAN_AGGIORAUTOMA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_AGGIORAUTOMA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_AGGIORAUTOMA.SetSize(MyGlb.OBJ_FIELD, 41);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, "BFDFF3C2-1C9E-43C5-A7A7-092CC3CEE957");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, "Capitolo/Articolo");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, "3BA5E788-4616-4F89-B5CD-B5198E93096D");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, "Articolo");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, "4ED5831E-ED76-4138-AF87-6251286F82E6");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, "/");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, "02A7DC61-C645-444F-A201-FDDECF00F9F3");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, "Impegno");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, "4C5A0E39-5510-4370-9EE4-878DAB7CD158");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, "Anno Impegno");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, "F36B425D-D10C-4B43-B55B-4F1F27664D1A");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, "Subimpegno");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, "34869CF2-BD65-41FE-A268-5D49A8B1AE87");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, "/");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, "A5FD7DBF-4000-4641-8D41-F27414B5007D");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, "Descrizione");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, "6898031F-F654-4065-B4C9-E19921D63B8B");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, "/");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, "361C3C87-36CF-47EE-A346-9E17251C5399");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, 0, "wsearch1.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, "40F75E60-9F86-435E-984E-0AB1BC3592B2");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, 0, "info.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, "DB79E9B7-A60E-48C8-B2F0-2D0095A3B6D7");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, 0, "wsearch1.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, "01EE5073-5104-4F27-9266-4ECAC3432187");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, 0, "info.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, "21B5CD5B-8F01-4DE6-B1FD-23C2C01CCF84");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, "Voce Economica");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, "64929741-DE73-4F98-89F1-F5914854879C");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, "D2A97E0F-8873-424B-9C18-EB084C17D80E");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, "Cgu");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.VIS_NORMFIELPADR);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, "4200D501-67E9-4851-87EC-0BEEDA9F706A");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, "788D3288-1A41-42F7-81B2-C0450F2A060F");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, "Tipo Vincolo");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, "B92F8D5D-3ED2-4399-9B4E-E28DCE0AA6EF");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, "Beneficiario");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, "48CE1495-21DA-4E1B-AAF8-FC3EFBC859F1");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, "Codice Creditore");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, "77C56D59-871F-470D-A700-7CDF8EDCA4DA");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, 0, "wsearch1.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, "79E2CA4D-FD97-41DD-A2E3-AAA7056D36A9");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, 0, "info.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, "9DCB513F-AC1F-41A5-A3F9-B9DEF6FEB799");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, "Quietanza");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, "FE1BD25E-2614-4753-ADB9-2B4876926BB8");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, "Descizione quietanza");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, "32973F0B-2F28-468C-BAD2-8423C205092B");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, "Bollo");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, "454C2326-B091-4ACD-BF12-DDFBC15D061C");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, "Ufficio");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, "6FFDC54F-A8B8-4B89-8BA2-F9B3B6932E32");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, "Elabora");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, 0, "button1.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, "2BD3978E-0FED-4FEB-A6A4-868C1E557DC7");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, "Cod. V Livello");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.VIS_INTE10NORFIE);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, "48DADB7A-3D41-43AA-B488-07C5AE1021A1");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, "Descrizione Cod V Livello");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.VIS_VISULOOUPCF4);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, "0790F151-1AA6-4950-8825-9C4250A1519B");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, " ");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.VIS_LOOKUPFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, "81283E9D-4BBF-4EB1-B4EF-321FCB9D1EB1");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, "Cod. Cofog");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.VIS_NORMFIELPADR);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, "AD04F201-9B43-47A7-9A47-695DDBF394DC");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, "Cod. Europeo");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, "Cod. Europeo");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, "50E6F4F5-E168-431C-9B7A-5D4C97B7F148");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, "Esclusione Cig");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, "ED2B07B4-6BE8-4ADC-BC54-A6F9EDFC368D");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, "CAP TITOLO");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, "55450D41-385E-4D8F-8A07-32BC1A0168FD");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, "CAP CATEGORIA");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, "57774318-3B1E-41D2-A5B3-4D65A61B0722");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, "CAP COD INTERVENTO");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.VIS_LOOKUPFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, "6AA564C1-A328-4CD9-8CB6-CADFA1D45A5D");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, "CAP COD TERZI");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.VIS_LOOKUPFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, "A5114B46-28FE-47F7-9F8C-E1B4A7081379");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, "CAP VOCE ECON");
    PAN_AGGIORAUTOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.VIS_LOOKUPFIELDS);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, "F10CB64A-6778-4FA0-BA42-F445B2D61CA1");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, "Attenzione, verranno sovrascritti tutti gli attributi dei record selezionati, anche di quelli con dettagli preesistenti");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, MyGlb.VIS_ETICHEGRASSE);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, "9D48270D-D01F-4C8B-B730-8ABF5AE9ADBA");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, 0, "wsearch1.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AGGIORAUTOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, "BCE5BF07-DE3E-4E7D-BEB9-528827B338EE");
    PAN_AGGIORAUTOMA.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, "");
    PAN_AGGIORAUTOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AGGIORAUTOMA.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, 0, "info.gif", false);
    PAN_AGGIORAUTOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_AGGIORAUTOMA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_LIST, "Capit. Artic.");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_FORM, 4, 92, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_FORM, 104);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Articolo");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CAPITOLO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CAPITOLO, PPQRY_ORDINDACORR8, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_LIST, "Artic.");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_FORM, 260, 92, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_FORM, 44);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ARTICOLO, MyGlb.PANEL_FORM, "Artic.");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_ARTICOLO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_ARTICOLO, PPQRY_ORDINDACORR8, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, MyGlb.PANEL_LIST, 160, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, MyGlb.PANEL_FORM, 244, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_SLASH, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_LIST, 68);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_FORM, 4, 116, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_IMPEGNO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_IMPEGNO, PPQRY_ORDINDACORR8, "A.ROWNAMNUMIMP", "ROWNAMNUMIMP", 1, 5, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_LIST, 56);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_LIST, "Ann. Imp.");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_FORM, 192, 116, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_FORM, 56);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOIMPEGNO, MyGlb.PANEL_FORM, "An. Imp.");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_ANNOIMPEGNO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_ANNOIMPEGNO, PPQRY_ORDINDACORR8, "A.ROWNAMANNIMP", "ROWNAMANNIMP", 1, 4, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 100);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Subimpegno");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 8, 140, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 100);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Subimpegno");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_NUMEROSUBIMP, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_NUMEROSUBIMP, PPQRY_ORDINDACORR8, "A.ROWNAMNUMSUB", "ROWNAMNUMSUB", 1, 5, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_LIST, 84);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_LIST, "/");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_FORM, 172, 140, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_FORM, 16);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ANNOSUBIMP, MyGlb.PANEL_FORM, "/");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_ANNOSUBIMP, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_ANNOSUBIMP, PPQRY_ORDINDACORR8, "A.ROWNAMANNSUB", "ROWNAMANNSUB", 1, 4, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 164, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_DESCRIZIONE, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_DESCRIZIONE, PPQRY_ORDINDACORR8, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 140, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, MyGlb.PANEL_LIST, 168, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, MyGlb.PANEL_FORM, 176, 116, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SLASH1, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_SLASH1, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_SLASH1, -1, "", "SLASH1", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, MyGlb.PANEL_FORM, 288, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_SCEGLVOCEPEG, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_SCEGLVOCEPEG, -1, "", "SCEGLVOCEPEG", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, MyGlb.PANEL_FORM, 308, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_INFOVOCEPEG, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, MyGlb.PANEL_FORM, 244, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLIACC, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_SCEGLIACC, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_SCEGLIACC, -1, "", "SCEGLIACC", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, MyGlb.PANEL_LIST, 328, 20, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, MyGlb.PANEL_FORM, 264, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_INFOACC, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_INFOACC, -1, "", "INFOACC", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_LIST, 64);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_LIST, "Vc. Econ.");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_FORM, 8, 68, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_FORM, 100);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCEECON, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_VOCEECON, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_VOCEECON, PPQRY_ORDINDACORR8, "A.ROWNAMVOCECO", "ROWNAMVOCECO", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_LIST, 0, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_LIST, 188);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_LIST, "V. E. D.");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_FORM, 156, 68, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_FORM, 188);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_VOCIECONDESC, MyGlb.PANEL_FORM, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_VOCIECONDESC, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_VOCIECONDESC, PPQRY_VOCIECONOMIC, "A.DESCRIZIONE", "VOCIECONDESC", 5, 140, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_LIST, 32);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_FORM, 76, 188, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_FORM, 32);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CGU, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CGU, PPQRY_ORDINDACORR8, "A.ROWNAMECGE", "ROWNAMECGE", 1, 4, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_LIST, 196);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_LIST, 2);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_FORM, 176, 188, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_FORM, 196);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODIGESTDESC, MyGlb.PANEL_FORM, "CODICI GESTIONALI DESCRIZIONE");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CODIGESTDESC, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CODIGESTDESC, PPQRY_CODICIGESTIO, "A.DESCRIZIONE", "CODIGESTDESC", 5, 200, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_FORM, 24, 212, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_FORM, 84);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_TIPOVINCOLO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_TIPOVINCOLO, PPQRY_ORDINDACORR8, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_LIST, 0, 36, 412, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_LIST, 100);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_LIST, 2);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_FORM, 8, 236, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_FORM, 100);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BENBENEFICIA, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_BENBENEFICIA, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_BENBENEFICIA, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENEFICIARIO", 5, 162, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_LIST, 40);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_LIST, "Codice Creditore");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_FORM, 384, 212, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_FORM, 40);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECREDIT, MyGlb.PANEL_FORM, "C. Cr.");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CODICECREDIT, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CODICECREDIT, PPQRY_ORDINDACORR8, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, MyGlb.PANEL_FORM, 492, 240, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEDEBDOCBUT, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_SCEDEBDOCBUT, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_SCEDEBDOCBUT, -1, "", "SCEDEBDOCBUT", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, MyGlb.PANEL_FORM, 512, 240, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFODEBITDOC, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_INFODEBITDOC, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_INFODEBITDOC, -1, "", "INFODEBITDOC", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_LIST, 96);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_FORM, 12, 260, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_FORM, 96);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_NUMQUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_NUMQUIETANZA, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_NUMQUIETANZA, PPQRY_ORDINDACORR8, "A.ROWNAMNUMQUI", "ROWNAMNUMQUI", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_LIST, 108);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_LIST, "Descizione quietanza");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_FORM, 160, 260, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_FORM, 108);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCIZQUIETA, MyGlb.PANEL_FORM, "Desciz. quietanza");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_DESCIZQUIETA, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_DESCIZQUIETA, PPQRY_QTN, "B.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_FORM, 68, 284, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_BOLLO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_BOLLO, PPQRY_ORDINDACORR8, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_FORM, 60, 308, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_FORM, 48);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_UFFICIO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_UFFICIO, PPQRY_ORDINDACORR8, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, MyGlb.PANEL_LIST, 400, 480, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, MyGlb.PANEL_FORM, 408, 444, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_ELABORA, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_LIST, 80);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_LIST, "Cod. V Livello");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_FORM, 12, 332, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_FORM, 96);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODVLIVELLO, MyGlb.PANEL_FORM, "Cod. V Livello");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CODVLIVELLO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CODVLIVELLO, PPQRY_ORDINDACORR8, "A.ROWNAMCODLI6", "ROWNAMCODLI6", 3, 10, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_LIST, 220);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_LIST, 2);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_LIST, "Descrizione Cod V Livello");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_FORM, 204, 332, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_FORM, 220);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_DESCCODVLIVE, MyGlb.PANEL_FORM, "Descrizione Cod V Livello");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_DESCCODVLIVE, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_DESCCODVLIVE, PPQRY_VISTSTRURICL, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_LIST, 336);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_LIST, " ");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_FORM, 176, 356, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_FORM, 12);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_PRCOVISTRIDE, MyGlb.PANEL_FORM, " ");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_PRCOVISTRIDE, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_PRCOVISTRIDE, PPQRY_COFOG, "GET_DESCR_COD_COFOG(A.COFOG,B.ESERCIZIO,B.E_S)", "PRCOVISTRIDE", 5, 99, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_LIST, "Cod. Cofog");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_FORM, 16, 356, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODICECOFOG, MyGlb.PANEL_FORM, "Cod. Cofog");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CODICECOFOG, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CODICECOFOG, PPQRY_ORDINDACORR8, "A.CODICE_COFOG", "CODICE_COFOG", 1, 3, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_LIST, 80);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_FORM, 12, 380, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_FORM, 96);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CODEUROPEO, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CODEUROPEO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CODEUROPEO, PPQRY_ORDINDACORR8, "A.ROWNAMCODEU1", "ROWNAMCODEU1", 1, 1, 0, -13997);
    PAN_AGGIORAUTOMA.SetValueListItem(PFL_AGGIORAUTOMA_CODEUROPEO, (new IDVariant(3)), "3 - spese finanziate dalla UE", "", "", -1);
    PAN_AGGIORAUTOMA.SetValueListItem(PFL_AGGIORAUTOMA_CODEUROPEO, (new IDVariant(4)), "4 - spese finanziate dallo Stato e correlate ai finanziamenti della UE", "", "", -1);
    PAN_AGGIORAUTOMA.SetValueListItem(PFL_AGGIORAUTOMA_CODEUROPEO, (new IDVariant(5)), "5 - spese finanziate dalla regione e correlate ai finanziamenti della UE", "", "", -1);
    PAN_AGGIORAUTOMA.SetValueListItem(PFL_AGGIORAUTOMA_CODEUROPEO, (new IDVariant(6)), "6 - spese finanziate da latri soggetti e correlate ai finanziamenti della UE", "", "", -1);
    PAN_AGGIORAUTOMA.SetValueListItem(PFL_AGGIORAUTOMA_CODEUROPEO, (new IDVariant(7)), "7 - spese finanziate da risorse proprie dell'ente e correlate ai finanziamenti della UE", "", "", -1);
    PAN_AGGIORAUTOMA.SetValueListItem(PFL_AGGIORAUTOMA_CODEUROPEO, (new IDVariant(8)), "8 - spese non correlate ai finanziamenti della UE", "", "", -1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_LIST, 128);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_LIST, "Esclusione Cig");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_FORM, 20, 404, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_FORM, 88);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_MOTIVESCLCIG, MyGlb.PANEL_FORM, "Esclusione Cig");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_MOTIVESCLCIG, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_MOTIVESCLCIG, PPQRY_ORDINDACORR8, "A.MOTIVO_ESCLUSIONE_CIG", "MOTIVO_ESCLUSIONE_CIG", 5, 50, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_LIST, 76);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_LIST, "CAP TITOLO");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_FORM, 4, 308, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_FORM, 76);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPTITOLO, MyGlb.PANEL_FORM, "CAP TITOLO");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CAPTITOLO, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CAPTITOLO, PPQRY_CAP, "A.TITOLO", "CAPTITOLO", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_LIST, 100);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_LIST, "CAP CATEGORIA");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_FORM, 4, 332, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_FORM, 100);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCATEGORIA, MyGlb.PANEL_FORM, "CAP CATEGORIA");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CAPCATEGORIA, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CAPCATEGORIA, PPQRY_CAP, "A.CATEGORIA", "CAPCATEGORIA", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_LIST, 128);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_LIST, "CAP COD INTERVENTO");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_FORM, 4, 356, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_FORM, 128);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODINTERV, MyGlb.PANEL_FORM, "CAP COD INTERVENTO");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CAPCODINTERV, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CAPCODINTERV, PPQRY_CAP, "A.COD_INTERVENTO", "CAPCODINTERV", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_LIST, 92);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_LIST, "CAP COD TERZI");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_FORM, 4, 380, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_FORM, 92);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPCODTERZI, MyGlb.PANEL_FORM, "CAP COD TERZI");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CAPCODTERZI, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CAPCODTERZI, PPQRY_CAP, "A.COD_TERZI", "CAPCODTERZI", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_LIST, 92);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_LIST, "CAP VOCE ECON");
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_FORM, 4, 296, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_FORM, 92);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_CAPVOCEECON, MyGlb.PANEL_FORM, "CAP VOCE ECON");
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_CAPVOCEECON, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_CAPVOCEECON, PPQRY_CAP, "A.VOCE_ECON", "CAPVOCEECON", 1, 2, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, MyGlb.PANEL_LIST, 8, 12, 528, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, MyGlb.PANEL_LIST, 4);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, MyGlb.PANEL_FORM, 8, 32, 528, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_ETICATTEVERR, MyGlb.PANEL_FORM, 2);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_ETICATTEVERR, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_ETICATTEVERR, -1, "", "ETICATTEVERR", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, MyGlb.PANEL_LIST, 328, 20, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, MyGlb.PANEL_FORM, 244, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_SCEGLISUB, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_SCEGLISUB, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_SCEGLISUB, -1, "", "SCEGLISUB", 0, 0, 0, -13997);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, MyGlb.PANEL_LIST, 336, 28, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORAUTOMA.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, MyGlb.PANEL_FORM, 264, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORAUTOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORAUTOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORAUTOMA_INFOSUB, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORAUTOMA.SetFieldPage(PFL_AGGIORAUTOMA_INFOSUB, -1, -1);
    PAN_AGGIORAUTOMA.SetFieldPanel(PFL_AGGIORAUTOMA_INFOSUB, -1, "", "INFOSUB", 0, 0, 0, -13997);
  }

  private void PAN_AGGIORAUTOMA_InitQueries()
  {
    StringBuffer SQL;

    PAN_AGGIORAUTOMA.SetSize(MyGlb.OBJ_QUERY, 12);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~ROWNAMCODLI6~~) ");
    SQL.append("and   (NVL(~~TBL_PARAMETRI524.NOMOGGLIV4CA~~, 0) = 0 OR A.CODICE_PADRE = ~~TBL_PARAMETRI524.NOMOGGLIV4CA~~) ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetMasterTable(PPQRY_VISTSTRURICL, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (A.NUM_QUIETANZA = ~~ROWNAMNUMQUI~~) ");
    SQL.append("and   (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("and   (B.CODICE = A.TIPO_QUIETANZA) ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_QTN, 0, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_QTN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetMasterTable(PPQRY_QTN, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VOCIECONDESC ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A ");
    SQL.append("where (A.E_S = 'E') ");
    SQL.append("and   (A.CODICE = ~~ROWNAMVOCECO~~) ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_VOCIECONOMIC, 0, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_VOCIECONOMIC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetMasterTable(PPQRY_VOCIECONOMIC, "VOCI_ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCRIZIONE as CODIGESTDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A, ");
    SQL.append("  RICLASSIFICAZIONI_GEST B, ");
    SQL.append("  RICLASSIFICAZIONI C, ");
    SQL.append("  CAP D ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("and   (NVL(A.SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CODICE_GESTIONALE = A.CODICE) ");
    SQL.append("and   (NVL(C.TITOLO, -1) = NVL(D.TITOLO, -1)) ");
    SQL.append("and   (NVL(C.CATEGORIA, -1) = NVL(D.CATEGORIA, -1)) ");
    SQL.append("and   (NVL(C.COD_INTERVENTO, -1) = NVL(D.COD_INTERVENTO, -1)) ");
    SQL.append("and   (NVL(C.COD_TERZI, -1) = NVL(D.COD_TERZI, -1)) ");
    SQL.append("and   (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.E_S = 'S') ");
    SQL.append("and   (D.ARTICOLO = ~~ROWNAMEARTIC~~) ");
    SQL.append("and   (D.CAPITOLO = ~~ROWNAMECAPIT~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = B.E_S) ");
    SQL.append("and   (B.PROGR_RICLASSIFICAZIONI = C.PROGRESSIVO) ");
    SQL.append("and   (C.VOCE_ECON = NVL(~~TBL_EMISSIORDIN4.ROWNAMVOCECO~~, C.VOCE_ECON)) ");
    SQL.append("and   (A.CODICE = ~~ROWNAMECGE~~) ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_CODICIGESTIO, 0, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_CODICIGESTIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetMasterTable(PPQRY_CODICIGESTIO, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as CAPTITOLO, ");
    SQL.append("  A.CATEGORIA as CAPCATEGORIA, ");
    SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
    SQL.append("  A.COD_TERZI as CAPCODTERZI, ");
    SQL.append("  A.VOCE_ECON as CAPVOCEECON ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ROWNAMEARTIC~~) ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENEFICIARIO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_AGGIORAUTOMA.SetQueryLKE(PPQRY_BEN, PFL_AGGIORAUTOMA_CODICECREDIT, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENEFICIARIO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryHeaderColumn(PPQRY_BEN, "BENEFICIARIO", "Beneficiario");
    PAN_AGGIORAUTOMA.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_AGGIORAUTOMA.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_DESCR_COD_COFOG(A.COFOG,B.ESERCIZIO,B.E_S) as PRCOVISTRIDE ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI_COFOG A, ");
    SQL.append("  CAP B ");
    SQL.append("where (B.E_S = 'S') ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CODICE_STRUTTURA = A.PROGRAMMA) ");
    SQL.append("and   (A.COFOG = ~~CODICE_COFOG~~) ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_COFOG, 0, SQL, -1, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_COFOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetMasterTable(PPQRY_COFOG, "PROGRAMMI_COFOG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_AGGIORAUTOMA_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_AGGIORAUTOMA_TIPOVINCOLO, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_T60, 0, SQL, PFL_AGGIORAUTOMA_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_T60, 1, SQL, PFL_AGGIORAUTOMA_BOLLO, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_T53, 0, SQL, PFL_AGGIORAUTOMA_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_T53, 1, SQL, PFL_AGGIORAUTOMA_UFFICIO, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.CODICE = ~~MOTIVO_ESCLUSIONE_CIG~~) ");
    SQL.append("and   (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_ATTRIBUTIOPI, 0, SQL, PFL_AGGIORAUTOMA_MOTIVESCLCIG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AGGIORAUTOMA.SetQuery(PPQRY_ATTRIBUTIOPI, 1, SQL, PFL_AGGIORAUTOMA_MOTIVESCLCIG, "");
    PAN_AGGIORAUTOMA.SetQueryDB(PPQRY_ATTRIBUTIOPI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AGGIORAUTOMA.SetIMDB(IMDB, "PQRY_ORDINDACORR8", true);
    PAN_AGGIORAUTOMA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_AGGIORAUTOMA.SetQueryIMDB(PPQRY_ORDINDACORR8, IMDBDef15.PQRY_ORDINDACORR8_RS, IMDBDef5.TBL_EMISSIORDIN4);
    JustLoaded = true;
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_CAPITOLO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECAPIT);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_ARTICOLO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEARTIC);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_IMPEGNO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMIMP);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_ANNOIMPEGNO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNIMP);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_NUMEROSUBIMP, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMSUB);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_ANNOSUBIMP, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMANNSUB);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_DESCRIZIONE, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEDESCR);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_VOCEECON, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMVOCECO);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_CGU, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMECGE);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_TIPOVINCOLO, IMDBDef5.FLD_EMISSIORDIN4_TIPO_VINCOLO);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_CODICECREDIT, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODDEB);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_NUMQUIETANZA, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMNUMQUI);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_BOLLO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEBOLLO);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_UFFICIO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMEUFFIC);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_CODVLIVELLO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODLI6);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_CODICECOFOG, IMDBDef5.FLD_EMISSIORDIN4_CODICE_COFOG);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_CODEUROPEO, IMDBDef5.FLD_EMISSIORDIN4_ROWNAMCODEU1);
    PAN_AGGIORAUTOMA.SetFieldPrimaryIndex(PFL_AGGIORAUTOMA_MOTIVESCLCIG, IMDBDef5.FLD_EMISSIORDIN4_MOTIVO_ESCLUSIONE_CIG);
    PAN_AGGIORAUTOMA.SetMasterTable(0, "EMISSIORDIN4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_AGGIORAUTOMA.Status() == 2)
    {
      int oldListQBE = PAN_AGGIORAUTOMA.iUseListQBE;
      PAN_AGGIORAUTOMA.iUseListQBE = 0;
      PAN_AGGIORAUTOMA.PanelCommand(Glb.PCM_SEARCH);
      PAN_AGGIORAUTOMA.PanelCommand(Glb.PCM_FIND);
      PAN_AGGIORAUTOMA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_AGGIORAUTOMA) PAN_AGGIORAUTOMA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIORAUTOMA) PAN_AGGIORAUTOMA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_AGGIORAUTOMA) PAN_AGGIORAUTOMA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIORAUTOMA) PAN_AGGIORAUTOMA_CellActivated(ColIndex, Cancel);
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
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_AGGIORAUTOMA) PAN_AGGIORAUTOMA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_AGGIORAUTOMA) PAN_AGGIORAUTOMA_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
