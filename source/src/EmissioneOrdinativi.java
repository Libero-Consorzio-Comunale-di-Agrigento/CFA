// **********************************************
// Emissione Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneOrdinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EMISSIORDINA_DOCUMENTI = 0;
  private static int GRP_EMISSIORDINA_ORDINATIVI = 1;
  private static int GRP_EMISSIORDINA_ACCERTAMENTI = 2;

  private static int PFL_EMISSIORDINA_CAPITOLO = 0;
  private static int PFL_EMISSIORDINA_ARTICOLO = 1;
  private static int PFL_EMISSIORDINA_SLASH = 2;
  private static int PFL_EMISSIORDINA_ACCERTAMENTO = 3;
  private static int PFL_EMISSIORDINA_ANNOACC = 4;
  private static int PFL_EMISSIORDINA_SLASH1 = 5;
  private static int PFL_EMISSIORDINA_SCEGLVOCEPEG = 6;
  private static int PFL_EMISSIORDINA_INFOVOCEPEG = 7;
  private static int PFL_EMISSIORDINA_SCEGLIACC = 8;
  private static int PFL_EMISSIORDINA_INFOACC = 9;
  private static int PFL_EMISSIORDINA_BENDOC = 10;
  private static int PFL_EMISSIORDINA_CODICDEBIDOC = 11;
  private static int PFL_EMISSIORDINA_SCEDEBDOCBU1 = 12;
  private static int PFL_EMISSIORDINA_INFODEBITDO1 = 13;
  private static int PFL_EMISSIORDINA_ETICHELABEL1 = 14;
  private static int PFL_EMISSIORDINA_DATA1 = 15;
  private static int PFL_EMISSIORDINA_DESCRIZIONE = 16;
  private static int PFL_EMISSIORDINA_CAUSALE = 17;
  private static int PFL_EMISSIORDINA_BOLLO = 18;
  private static int PFL_EMISSIORDINA_UFFICIO = 19;
  private static int PFL_EMISSIORDINA_CONTABILE = 20;
  private static int PFL_EMISSIORDINA_DATA = 21;
  private static int PFL_EMISSIORDINA_DATAINCASCCP = 22;
  private static int PFL_EMISSIORDINA_DATAESTRACCP = 23;
  private static int PFL_EMISSIORDINA_QUIETANZA = 24;
  private static int PFL_EMISSIORDINA_QTNDESC = 25;
  private static int PFL_EMISSIORDINA_SPESE = 26;
  private static int PFL_EMISSIORDINA_COMMISSIONI = 27;
  private static int PFL_EMISSIORDINA_ALLEGATI = 28;
  private static int PFL_EMISSIORDINA_INFOTESORIER = 29;
  private static int PFL_EMISSIORDINA_NOTE2 = 30;
  private static int PFL_EMISSIORDINA_NOTE1 = 31;
  private static int PFL_EMISSIORDINA_LABELORDINSX = 32;
  private static int PFL_EMISSIORDINA_ETICHETLABEL = 33;
  private static int PFL_EMISSIORDINA_EMAUVPMDSASC = 34;
  private static int PFL_EMISSIORDINA_IMPUTAECONOM = 35;
  private static int PFL_EMISSIORDINA_DEBITOREACC = 36;
  private static int PFL_EMISSIORDINA_CODICDEBIACC = 37;
  private static int PFL_EMISSIORDINA_CONTROPAPATR = 38;
  private static int PFL_EMISSIORDINA_FATTORDESCRI = 39;
  private static int PFL_EMISSIORDINA_SCEDEBACCBU1 = 40;
  private static int PFL_EMISSIORDINA_INFDEBACCBU1 = 41;
  private static int PFL_EMISSIORDINA_ELABORA = 42;

  private static int PPQRY_ORDINDACORR1 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_QTN = 2;
  private static int PPQRY_BEN = 3;
  private static int PPQRY_BEN1 = 4;

  private static int PPQRY_T58 = 5;
  private static int PPQRY_T60 = 6;
  private static int PPQRY_T53 = 7;
  private static int PPQRY_TIPISPESMINF = 8;


  IDPanel PAN_EMISSIORDINA;

  // Definition of Global Variables
  private IDVariant END2 = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_EMISSIORDIN1(IMDB);
    Init_TBL_PAR78(IMDB);
    //
    //
    Init_PQRY_ORDINDACORR1(IMDB);
    Init_PQRY_ORDINDACORR1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_EMISSIORDIN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_EMISSIORDIN1, 24);
    IMDB.set_TblCode(IMDBDef6.TBL_EMISSIORDIN1, "TBL_EMISSIORDIN1");
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMERISOR, "ROWNAMERISOR");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMERISOR,1,7,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEDO, "ROWNAMCODEDO");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEDO,2,15,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_RONADAINCCCP, "RONADAINCCCP");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_RONADAINCCCP,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_RONADAESCCCP, "RONADAESCCCP");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_RONADAESCCCP,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECONTA, "ROWNAMECONTA");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECONTA,5,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMDATCON, "ROWNAMDATCON");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMDATCON,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET, "ROWNAMEQUIET");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEAC, "ROWNAMCODEAC");
    IMDB.SetFldParams(IMDBDef6.TBL_EMISSIORDIN1,IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEAC,2,15,0);
    IMDB.TblAddNew(IMDBDef6.TBL_EMISSIORDIN1, 0);
  }

  private static void Init_TBL_PAR78(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR78, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR78, "TBL_PAR78");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR78,IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, "ROWNAMDOCOAC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR78,IMDBDef6.FLD_PAR78_ROWNAMDOCOAC,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR78,IMDBDef6.FLD_PAR78_ROWNAMEPERS, "ROWNAMEPERS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR78,IMDBDef6.FLD_PAR78_ROWNAMEPERS,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR78,IMDBDef6.FLD_PAR78_ROWNAMTIPQUI, "ROWNAMTIPQUI");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR78,IMDBDef6.FLD_PAR78_ROWNAMTIPQUI,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR78, 0);
  }

  private static void Init_PQRY_ORDINDACORR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR1, 23);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR1, "PQRY_ORDINDACORR1");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, "ROWNAMCODEDO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_RONADAINCCCP, "RONADAINCCCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_RONADAINCCCP,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_RONADAESCCCP, "RONADAESCCCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_RONADAESCCCP,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECONTA, "ROWNAMECONTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECONTA,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMDATCON, "ROWNAMDATCON");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMDATCON,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEQUIET, "ROWNAMEQUIET");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEQUIET,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, "ROWNAMCODEAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC,2,15,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR1, 0);
  }

  private static void Init_PQRY_ORDINDACORR1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDACORR1_RS, 23);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDACORR1_RS, "PQRY_ORDINDACORR1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, "ROWNAMCODEDO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_RONADAINCCCP, "RONADAINCCCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_RONADAINCCCP,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_RONADAESCCCP, "RONADAESCCCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_RONADAESCCCP,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECONTA, "ROWNAMECONTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECONTA,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMDATCON, "ROWNAMDATCON");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMDATCON,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEQUIET, "ROWNAMEQUIET");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEQUIET,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEALLEG,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMINFTES,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, "ROWNAMCODEAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDACORR1_RS,IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneOrdinativi(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneOrdinativi()
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
    FormIdx = MyGlb.FRM_EMISSIORDINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AA338572-BB46-4DF4-B178-0FF770D29C8D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 706;
    set_Caption(new IDVariant("Emissione Ordinativi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 680;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Emissione Ordinativi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 680;
    PAN_EMISSIORDINA = new IDPanel(w, this, 1, "PAN_EMISSIORDINA");
    Frames[1].Content = PAN_EMISSIORDINA;
    PAN_EMISSIORDINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISSIORDINA.VS = MainFrm.VisualStyleList;
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 680-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BBC5E65E-3DDB-4F95-9DC8-F8CB2E648233");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3352, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISSIORDINA.InitStatus = 2;
    PAN_EMISSIORDINA_Init();
    PAN_EMISSIORDINA_InitFields();
    PAN_EMISSIORDINA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_EMISSIORDIN1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISSIORDINA_ORDINDACORR1();
      }
      PAN_EMISSIORDINA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_SCEGLVOCEPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_SCEGLIACC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_SCEDEBDOCBU1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEQUIDELSOG && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_QUIETANZA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_CONTROPAPATR) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_SCEDEBACCBU1) {
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
    return (obj instanceof EmissioneOrdinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneOrdinativi.class.getName() : (Glb.ClassWithPackage(EmissioneOrdinativi.class) ? EmissioneOrdinativi.class.getName().substring(EmissioneOrdinativi.class.getPackage().getName().length() + 1) : EmissioneOrdinativi.class.getName()));
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0))))
      {
        IDVariant v_RET1 = new IDVariant(0,IDVariant.INTEGER);
        v_RET1 = (new IDVariant(MainFrm.ControllaVocePEG(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")))));
        if (v_RET1.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Capitolo/Art. non trovato", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0, (new IDVariant()));
          return 0;
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0))))
      {
        IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);
        v_RET = MainFrm.ControllaAccertamenti(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0));
        if (v_RET.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Accertamento non trovato", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0, (new IDVariant()));
          return 0;
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDESCR, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Descrizione Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDATA, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data degli ordinativi non indicata o non appartenente all'esercizio del contesto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          IDVariant v_NORDDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NACCDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NORDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NACCA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SVARACC = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NSTATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SSTATOSIOPE = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.ORDEMISSCFA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDATA, 0)), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEDESCR, 0), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAUSA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAUSA, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEBOLLO, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEUFFIC, 0)), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_RNEAVPMDSASC, 0), v_NORDDA, v_NORDA, v_NACCDA, v_NACCA, v_SVARACC, IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0),(new IDVariant(-1))), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO, 0), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO, 0).equals((new IDVariant("SI")), true))?IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, 0):(new IDVariant())), ((IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO, 0).equals((new IDVariant("SI")), true))?IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO, 0):(new IDVariant())), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECONTA, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMDATCON, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEQUIET, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_RONADAINCCCP, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_RONADAESCCCP, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECOMMI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMINFTES, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMESPESE, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEALLEG, 0), v_NSTATOSIOPE, v_NSUPDISPPURO);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            IDVariant v_RETMSG = new IDVariant(0,IDVariant.STRING);
            IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
            v_MESSUPDISPUR = (new IDVariant("Sono stati emessi accertamenti che superano la disponibilità dello stanziamento puro"));
            v_RETMSG = IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>")));
            if (v_NSTATOSIOPE.equals((new IDVariant(1)), true))
            {
              IDVariant v_STATOCGE = new IDVariant(0,IDVariant.STRING);
              v_STATOCGE = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale", IDVariant.STRING));
              IDVariant v_STATOLIV5 = new IDVariant(0,IDVariant.STRING);
              v_STATOLIV5 = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello 5"));
              if (MainFrm.SIOPEATTIARM.booleanValue())
              {
                v_SSTATOSIOPE = IDL.Add(v_STATOLIV5, (new IDVariant("<BR/>")));
              }
              else
              {
                v_SSTATOSIOPE = IDL.Add(v_STATOCGE, (new IDVariant("<BR/>")));
              }
            }
            else
            {
              v_SSTATOSIOPE = (new IDVariant(""));
            }
            if (v_NORDDA.compareTo(v_NORDA, true)<=0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Emessi ordinativi da ", IDVariant.STRING));
              v_MSG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(v_NORDDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NORDA));
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            else
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Non sono stati emessi Ordinativi", IDVariant.STRING));
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            if (v_NACCDA.compareTo(v_NACCA, true)<=0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Emessi accertamenti da ", IDVariant.STRING));
              v_MSG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(v_NACCDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NACCA));
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            else
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Non sono stati emessi accertamenti", IDVariant.STRING));
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            if (v_SVARACC.compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Emesse Variazioni agli Accertamenti: ", IDVariant.STRING));
              v_MSG = IDL.Add(v_MSG, IDL.SubStr(v_SVARACC, (new IDVariant(2))));
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            if (v_SSTATOSIOPE.compareTo((new IDVariant("")), true)!=0)
            {
              v_RETMSG = IDL.Add(v_RETMSG, v_SSTATOSIOPE);
            }
            if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
            {
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
            }
            MainFrm.set_AlertMessage(v_RETMSG); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Soggetti Acc
  // **********************************************************************
  public int SelezionaSoggettiAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Soggetti Acc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "SelezionaSoggettiAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlla Visibilità
  // **********************************************************************
  public int ControllaVisibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_GESTECO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MODE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DACONTROLLAR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_EQUAS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RES = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DACONTROLLAR = (new IDVariant("w_ord_emiss_cfa_response", IDVariant.STRING));
      v_EQUAS = (new IDVariant("w_ord_emiss_cfa_response_bi", IDVariant.STRING));
      // 
      // Controlla Visibilità Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.GESTIONE_ECONOMICA as T99GESTIECON, ");
      SQL.append("  A.MODALITA_IMPUTAZIONE_E as T99MODAIMPUE ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_GESTECO = QV.Get("T99GESTIECON", IDVariant.INTEGER) ;
        v_MODE = QV.Get("T99MODAIMPUE", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_GESTECO.equals((new IDVariant()), true))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_MODE.equals((new IDVariant("AC")), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO, 0, (new IDVariant("SI")));
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO, 0, (new IDVariant()));
      }
      if (MainFrm.SPESE_DA_SOGGETTO.compareTo((new IDVariant()), true)!=0)
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      v_RES = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_DACONTROLLAR);
      if (v_RES.equals(v_EQUAS, true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMEPERS, 0, (new IDVariant("SI")));
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMEPERS, 0, (new IDVariant("NO")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ControllaVisibilità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Fattore
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ApriFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      END2 = (new IDVariant(0));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEALLEG, 0), (new IDVariant("Allegati")), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note 1
  // **********************************************************************
  public int ApriNote1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note 1 Body
      // Procedure Body
      // 
      END2 = (new IDVariant(1));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMINFTES, 0), (new IDVariant(PAN_EMISSIORDINA.Header(Glb.OBJ_FIELD,PFL_EMISSIORDINA_INFOTESORIER))), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ApriNote1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Licenza
  // **********************************************************************
  public int ControlloLicenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Licenza Body
      // Procedure Body
      // 
      if ((new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))))).equals((new IDVariant(-1)), true))
      {
        if (MainFrm.GESTIONSPESE.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOCOMMIS.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOALLEGA.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTINFOTESO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ControlloLicenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Soggetti
  // **********************************************************************
  public int InfoSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetti Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "InfoSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Soggetti 1
  // **********************************************************************
  public int InfoSoggetti1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetti 1 Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "InfoSoggetti1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Soggetti Doc
  // **********************************************************************
  public int SelezionaSoggettiDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Soggetti Doc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "SelezionaSoggettiDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri PEG
  // **********************************************************************
  public int ApriPEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri PEG Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ApriPEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // INFO PEG
  // **********************************************************************
  public int INFOPEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // INFO PEG Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "INFOPEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri ACC
  // **********************************************************************
  public int ApriACC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri ACC Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ApriACC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info ACC
  // **********************************************************************
  public int InfoACC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info ACC Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "InfoACC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Quietanze Da Soggetto
  // **********************************************************************
  public int QuietanzeDaSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quietanze Da Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, 0, new IDVariant(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESCADE, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCEQUIDELSOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "QuietanzeDaSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi QTN
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ProponiQTN ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi QTN Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMEPERS, 0).equals((new IDVariant("SI")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0))))
      {
        // IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET, 0, MainFrm.GetMinimaQuietanzaDaSoggetto(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0)));
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEQUIET, 0, MainFrm.GetMinimaQuietanzaDaSoggetto(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0)));
      }
      if (IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMEPERS, 0).equals((new IDVariant("SI")), true) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0)))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMDATCON, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAINCCCP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAESCCCP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECONTA, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "ProponiQTN", _e);
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
      LOADEVENT_EMIORDDELROW();
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDATA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RNEAVPMDSASC, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAUSA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
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
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMESPESE, 0, new IDVariant(v_SPESE));
      ControllaVisibilità();
      ControlloLicenza();
      PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_EMIORDDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMERISOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEDO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAINCCCP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAESCCCP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECONTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMDATCON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMESPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECOMMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RNEAVPMDSASC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEAC, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0).equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0).equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELFATTCONT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI2, IMDBDef7.PQSL_FATTORI2_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true) && END2.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true) && END2.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMERISOR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEQUIDELSOG)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET, 0, IMDB.Value(IMDBDef7.PQRY_QTN4, IMDBDef7.PQSL_QTN4_NUM_QUIETANZA, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMTIPQUI, 0, IMDB.Value(IMDBDef7.PQRY_QTN4, IMDBDef7.PQSL_QTN4_TIPO_QUIETANZA, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMEPERS, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMTIPQUI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0, (new IDVariant(0)));
      UNLOADEVENT_EMIORDDELROW();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_EMIORDDELROW() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMERISOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEDO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAINCCCP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAESCCCP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECONTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMDATCON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMESPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECOMMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RNEAVPMDSASC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEAC, 0, new IDVariant());
  }

  // **********************************************************************
  // Emissione Ordinativi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISSIORDINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_EMISSIORDINA);
      // 
      // Emissione Ordinativi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMIMPECO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEAC, 0))))
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_EMISSIORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISSIORDINA_FATTORDESCRI,(new IDVariant(PAN_EMISSIORDINA.FieldText(PFL_EMISSIORDINA_FATTORDESCRI))).stringValue()); 
      PAN_EMISSIORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISSIORDINA_ALLEGATI,(new IDVariant(PAN_EMISSIORDINA.FieldText(PFL_EMISSIORDINA_ALLEGATI))).stringValue()); 
      PAN_EMISSIORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISSIORDINA_INFOTESORIER,(new IDVariant(PAN_EMISSIORDINA.FieldText(PFL_EMISSIORDINA_INFOTESORIER))).stringValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0))))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0))))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0))) && IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMEPERS, 0).equals((new IDVariant("SI")), true))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0)) && IMDB.Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMEPERS, 0).equals((new IDVariant("SI")), true))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMCODEDO, 0))))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "EmissioneOrdinativiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_EMISSIORDINA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Ordinativi On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_EMISSIORDINA_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_EMISSIORDINA_ARTICOLO)), true))
      {
        if (FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0))))
          {
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_EMISSIORDINA_ACCERTAMENTO)), true) || Column.equals((new IDVariant(PFL_EMISSIORDINA_ANNOACC)), true))
      {
        if (FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMANNACC, 0))))
          {
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMECAPIT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEARTIC, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "EmissioneOrdinativiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_EMISSIORDINA_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Ordinativi On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_EMISSIORDINA_BENDOC)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0, (new IDVariant(1)));
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_EMISSIORDINA.FieldText(PFL_EMISSIORDINA_BENDOC))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
      if (FieldIndex.equals((new IDVariant(PFL_EMISSIORDINA_DEBITOREACC)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          IMDB.set_Value(IMDBDef6.TBL_PAR78, IMDBDef6.FLD_PAR78_ROWNAMDOCOAC, 0, (new IDVariant(0)));
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_EMISSIORDINA.FieldText(PFL_EMISSIORDINA_DEBITOREACC))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "EmissioneOrdinativiOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Contropartita Patr Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_EMISSIORDINA_CONTROPAPATR_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamenti Contropartita Patr Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  FATTORI A ");
        SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
        SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Fattore non presente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_STR); 
          IMDB.set_Value(IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef15.PQRY_ORDINDACORR1, IMDBDef15.PQSL_ORDINDACORR1_ROWNAMEFATTO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativi", "AccertamentiContropartitaPatrValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi
  // Primary record source for panel data
  // **********************************************************************
  private void EMISSIORDINA_ORDINDACORR1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ORDINDACORR1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_EMISSIORDIN1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_EMISSIORDIN1, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDACORR1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ORDINDACORR1_RS, 0, IMDBDef6.TBL_EMISSIORDIN1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 0, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 1, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 2, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 3, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 4, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEDO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 5, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 6, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAINCCCP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 7, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RONADAESCCCP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 8, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 9, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 10, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 11, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 12, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECONTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 13, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMDATCON, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 14, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 15, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMESPESE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 16, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECOMMI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 17, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 18, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 19, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_RNEAVPMDSASC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 20, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 21, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDACORR1_RS, 22, 0, IMDBDef6.TBL_EMISSIORDIN1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEAC, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_EMISSIORDIN1, 0);
      if (IMDB.Eof(IMDBDef6.TBL_EMISSIORDIN1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_EMISSIORDIN1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ORDINDACORR1_RS, 0);
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
  private void PAN_EMISSIORDINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISSIORDINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISSIORDINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISSIORDINA, Cancel);
    // Stub
  }

  private void PAN_EMISSIORDINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISSIORDINA_SCEGLVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      INFOPEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_SCEGLIACC)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriACC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_INFOACC)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoACC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_SCEDEBDOCBU1)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaSoggettiDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_INFODEBITDO1)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetti1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_QUIETANZA)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      QuietanzeDaSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_NOTE2)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_NOTE1)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_SCEDEBACCBU1)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaSoggettiAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_INFDEBACCBU1)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISSIORDINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_EMISSIORDINA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_EMISSIORDINA_CONTROPAPATR)
      {
        PFL_EMISSIORDINA_CONTROPAPATR_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_EMISSIORDINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISSIORDINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISSIORDINA_Init()
  {

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, "E9B8DCF6-E086-4075-AEC4-F5F29FE7571C");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, "Documenti");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, MyGlb.PANEL_LIST, 0, -9999, 404, 16, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, MyGlb.PANEL_FORM, 16, 3, 524, 97, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, 0, 61);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, 1, 4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_DOCUMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, "97DE78CF-1BC4-45E1-A3F6-F977A2839DEF");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, "Ordinativi");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 944, 16, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, MyGlb.PANEL_FORM, 16, 107, 524, 313, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 0, 55);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 1, 4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, "7C510413-9BBE-499C-B688-1466306AD859");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, "Accertamenti");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, -9999, 1064, 16, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, MyGlb.PANEL_FORM, 16, 427, 524, 145, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 0, 77);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 1, 4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_FIELD, 43);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, "64FD4F44-2EE3-4817-8781-6C1EDF909988");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, "Capitolo");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, "Capitolo/Art.");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, "935FAD90-1E22-4AB5-BC53-AEBE9A1B49CC");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, "Articolo");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, "BD5F5186-4EE3-48A5-B628-4483434AB06B");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, "/");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, "38197FFB-1D09-4167-92A1-D7B5FEB1F2C4");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, "Accertamento");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, "5B3A67DC-E6DB-445B-8A4E-E58330002D64");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, "Anno Acc");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, "B806867E-F49E-4941-82C2-A17380C1736B");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, "/");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, "F580BDD6-2CF7-47DF-8DA8-BBA6CC25C327");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, 0, "wsearch1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, "F6F89D17-56BB-4B6E-8B2A-8E4AF1C2BE18");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, 0, "info.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, "A482D31E-68DE-46CF-8B85-CD09CEC6F7A8");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, 0, "wsearch1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, "2AC91251-0287-43F0-82B1-9DB23EE1C365");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, 0, "info.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, "95512B4F-F2D9-4785-9685-74787CB637E3");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, "Debitore");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, "94B09E43-1E0F-4DDB-B497-1C526B621016");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, "Codice Debitore Doc");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, "32EBE8B0-0B88-443C-B6DB-404545C106A7");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, 0, "wsearch1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, "6BB11836-396E-4732-B16E-4FDB8C9472CE");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, 0, "info.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, "41636321-BB42-4809-B904-01A794FD01C6");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, MyGlb.VIS_LABELFIELD);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, "E9B8B817-CC91-4E06-AB42-85D5CABB76AA");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, "Data");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "CA28308B-4146-4264-9B32-E1B26C3AD103");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "Descrizione");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "AAD22DD4-3ED1-4D50-8374-D91FE869A81F");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "Causale");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, "5C959372-54A5-47B4-99CE-45F5664D7DD8");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, "Bollo");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "F5F3658B-ACAF-4DE2-8836-03A2F0A4B537");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "Ufficio");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, "E2CFE814-DA31-4942-8CCB-E43612B8E1E0");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, "Contabile");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, "B975E4ED-9365-4385-8E4C-1ECC04630FAC");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, "Data  ");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, "6AB5F0EB-1D37-4494-B184-844BC850A504");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, "Data Incasso c.c.p.");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, "A6AE14A1-A3F4-4C12-8491-FF3B9C066BDC");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, "Data Estratto c.c.p.");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, "7A247A31-FCF2-41BF-9CB9-D880531775CE");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, "Quietanza");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, "D2EB183B-3DB7-4BF4-9BDE-8500157B14FF");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, "QTN Desc");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, "34B273F7-5D3C-4ACD-BCF5-F66B0724129E");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, "Spese");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, "20444CE9-3651-4706-AF54-37F5F2163AA4");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, "Commissioni");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, "20FCD0C3-A37D-4039-9223-303D851536EA");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, "Allegati");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, "A9470140-7868-46B6-9A13-3D85982B90F2");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, "Info Tesoriere");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, "21AB4336-4C5E-40F3-BB74-1FB117D26A15");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, 0, "Testo.bmp", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, "4EE44EBE-CFDC-4DEB-BD1B-95698293DE9F");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, 0, "Testo.bmp", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, "36DFC092-D4AD-4CD3-B589-60EAD32EC2BF");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, "7EB619C0-E623-4011-AB82-BFD6A0C6CE2F");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, MyGlb.VIS_LABELFIELD);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, "E30A5E62-51F6-4F56-81FB-2AD91CC6DFD5");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenza)");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, "F38C468F-F3DC-45F8-97E1-67902B3BF83B");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, "Imputazione Economica");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, "DF0CE7F6-99EF-4535-A092-D57A3C3BDF8C");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, "Debitore");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, "275C77ED-0A6E-443E-A0FD-077651482BCF");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, "Codice Debitore Acc");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, "A31344D0-2B93-4307-818F-EE85945EA32E");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, "Contropartita Patr.");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, "BAA8E009-64FF-4D9E-855D-F1EA2BB20094");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, "EA8356DF-5723-4C70-A8B8-23E5263242E3");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, 0, "wsearch1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, "D1D82792-9014-41A3-8528-28132C72DEC6");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, 0, "info.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, "6B74F577-DFE1-44CC-9AAE-588280B1E48F");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, "Elabora");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, 0, "button1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_EMISSIORDINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_LIST, "Capit.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_FORM, 72, 28, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CAPITOLO, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CAPITOLO, PPQRY_ORDINDACORR1, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_LIST, "Artic.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_FORM, 288, 28, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_FORM, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ARTICOLO, MyGlb.PANEL_FORM, "Artic.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ARTICOLO, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ARTICOLO, PPQRY_ORDINDACORR1, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, MyGlb.PANEL_LIST, 160, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, MyGlb.PANEL_FORM, 272, 28, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_SLASH, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_LIST, 68);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accert.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_FORM, 20, 52, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accertamento");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ACCERTAMENTO, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ACCERTAMENTO, PPQRY_ORDINDACORR1, "A.ROWNAMNUMACC", "ROWNAMNUMACC", 1, 5, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_LIST, 56);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_LIST, "Ann. Acc");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_FORM, 220, 52, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_FORM, 56);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ANNOACC, MyGlb.PANEL_FORM, "Ann. Acc");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ANNOACC, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ANNOACC, PPQRY_ORDINDACORR1, "A.ROWNAMANNACC", "ROWNAMANNACC", 1, 4, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, MyGlb.PANEL_LIST, 168, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, MyGlb.PANEL_FORM, 204, 52, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SLASH1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_SLASH1, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_SLASH1, -1, "", "SLASH1", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, MyGlb.PANEL_FORM, 316, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_SCEGLVOCEPEG, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_SCEGLVOCEPEG, -1, "", "SCEGLVOCEPEG", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, MyGlb.PANEL_FORM, 332, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_INFOVOCEPEG, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, MyGlb.PANEL_FORM, 276, 56, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEGLIACC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_SCEGLIACC, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_SCEGLIACC, -1, "", "SCEGLIACC", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, MyGlb.PANEL_LIST, 328, 20, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, MyGlb.PANEL_FORM, 296, 56, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_INFOACC, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_INFOACC, -1, "", "INFOACC", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_LIST, 80);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_LIST, "Debitore");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_FORM, 56, 76, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_FORM, 80);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BENDOC, MyGlb.PANEL_FORM, "Debitore");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_BENDOC, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_BENDOC, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_LIST, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_LIST, "Codice Debitore Doc");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_FORM, 436, 76, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_FORM, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIDOC, MyGlb.PANEL_FORM, "C. D. D.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CODICDEBIDOC, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CODICDEBIDOC, PPQRY_ORDINDACORR1, "A.ROWNAMCODEDO", "ROWNAMCODEDO", 2, 15, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, MyGlb.PANEL_FORM, 500, 80, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBDOCBU1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_SCEDEBDOCBU1, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_SCEDEBDOCBU1, -1, "", "SCEDEBDOCBU1", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, MyGlb.PANEL_FORM, 520, 80, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFODEBITDO1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_INFODEBITDO1, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_INFODEBITDO1, -1, "", "INFODEBITDO1", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, MyGlb.PANEL_LIST, 44, 192, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, MyGlb.PANEL_FORM, 520, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHELABEL1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ETICHELABEL1, -1, GRP_EMISSIORDINA_DOCUMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ETICHELABEL1, -1, "", "ETICHELABEL1", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_LIST, 248, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_LIST, 32);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_FORM, 92, 132, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_FORM, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATA1, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATA1, PPQRY_ORDINDACORR1, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 60, 156, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DESCRIZIONE, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DESCRIZIONE, PPQRY_ORDINDACORR1, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 49, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 76, 180, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CAUSALE, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CAUSALE, PPQRY_ORDINDACORR1, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 4, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, 92, 204, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_BOLLO, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_BOLLO, PPQRY_ORDINDACORR1, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 84, 228, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_UFFICIO, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_UFFICIO, PPQRY_ORDINDACORR1, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_LIST, 56);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_LIST, "Contabile");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_FORM, 68, 252, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_FORM, 68);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILE, MyGlb.PANEL_FORM, "Contabile");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CONTABILE, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CONTABILE, PPQRY_ORDINDACORR1, "A.ROWNAMECONTA", "ROWNAMECONTA", 5, 10, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, "Data  ");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, 360, 252, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, 52);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, "Data  ");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATA, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATA, PPQRY_ORDINDACORR1, "A.ROWNAMDATCON", "ROWNAMDATCON", 6, 14, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_LIST, 112);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_LIST, "Data Incasso c.c.p.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_FORM, 20, 276, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAINCASCCP, MyGlb.PANEL_FORM, "Data Incasso c.c.p.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATAINCASCCP, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATAINCASCCP, PPQRY_ORDINDACORR1, "A.RONADAINCCCP", "RONADAINCCCP", 6, 14, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_LIST, 112);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_LIST, "Data Estratto c c p");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_FORM, 288, 276, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_FORM, 124);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAESTRACCP, MyGlb.PANEL_FORM, "Data Estratto c.c.p.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATAESTRACCP, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATAESTRACCP, PPQRY_ORDINDACORR1, "A.RONADAESCCCP", "RONADAESCCCP", 6, 14, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_LIST, 60);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_LIST, "Quiet.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_FORM, 64, 300, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_FORM, 72);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_QUIETANZA, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_QUIETANZA, PPQRY_ORDINDACORR1, "A.ROWNAMEQUIET", "ROWNAMEQUIET", 1, 6, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_LIST, 100);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_LIST, "QTN Desc");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_FORM, 224, 300, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_FORM, 100);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_QTNDESC, MyGlb.PANEL_FORM, "QTN Desc");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_QTNDESC, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_QTNDESC, PPQRY_QTN, "A.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_LIST, 472, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_FORM, 84, 324, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_FORM, 52);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_SPESE, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_SPESE, PPQRY_ORDINDACORR1, "A.ROWNAMESPESE", "ROWNAMESPESE", 1, 1, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_LIST, 512, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_FORM, 56, 348, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_COMMISSIONI, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_COMMISSIONI, PPQRY_ORDINDACORR1, "A.ROWNAMECOMMI", "ROWNAMECOMMI", 1, 1, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_LIST, 616, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_FORM, 80, 372, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ALLEGATI, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ALLEGATI, PPQRY_ORDINDACORR1, "A.ROWNAMEALLEG", "ROWNAMEALLEG", 5, 49, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, 824, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, 48, 396, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_INFOTESORIER, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_INFOTESORIER, PPQRY_ORDINDACORR1, "A.ROWNAMINFTES", "ROWNAMINFTES", 5, 49, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, MyGlb.PANEL_LIST, 476, 308, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, MyGlb.PANEL_FORM, 500, 372, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE2, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_NOTE2, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_NOTE2, -1, "", "NOTE2", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, MyGlb.PANEL_LIST, 484, 316, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, MyGlb.PANEL_FORM, 500, 400, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_NOTE1, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_NOTE1, -1, "", "NOTE1", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, MyGlb.PANEL_LIST, 496, 268, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, MyGlb.PANEL_FORM, 524, 268, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LABELORDINSX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_LABELORDINSX, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_LABELORDINSX, -1, "", "LABELORDINSX", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, MyGlb.PANEL_LIST, 36, 184, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, MyGlb.PANEL_FORM, 20, 184, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHETLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ETICHETLABEL, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ETICHETLABEL, -1, "", "ETICHETLABEL", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, 944, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, 452);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, "E. A. V. P. M. D. S. A. S. C.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, 176, 452, 320, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, 296);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenza)");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_EMAUVPMDSASC, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_EMAUVPMDSASC, PPQRY_ORDINDACORR1, "A.RNEAVPMDSASC", "RNEAVPMDSASC", 1, 1, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_EMAUVPMDSASC, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_EMAUVPMDSASC, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, 984, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, 120);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, "Im. E.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, 352, 492, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, 120);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imput. Economica");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_IMPUTAECONOM, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_IMPUTAECONOM, PPQRY_ORDINDACORR1, "A.ROWNAMIMPECO", "ROWNAMIMPECO", 5, 2, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_IMPUTAECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_LIST, 80);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_LIST, "Debitore");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_FORM, 56, 524, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_FORM, 80);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITOREACC, MyGlb.PANEL_FORM, "Debitore");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DEBITOREACC, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DEBITOREACC, PPQRY_BEN1, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_LIST, 60);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_LIST, "Cd. Db. A.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_FORM, 436, 524, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_FORM, 60);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICDEBIACC, MyGlb.PANEL_FORM, "Cd. Db. A.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CODICDEBIACC, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CODICDEBIACC, PPQRY_ORDINDACORR1, "A.ROWNAMCODEAC", "ROWNAMCODEAC", 2, 15, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, 1024, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, "Cn. P.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, 20, 548, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CONTROPAPATR, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CONTROPAPATR, PPQRY_ORDINDACORR1, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 8, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, 212, 548, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_FATTORDESCRI, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, MyGlb.PANEL_FORM, 500, 528, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_SCEDEBACCBU1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_SCEDEBACCBU1, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_SCEDEBACCBU1, -1, "", "SCEDEBACCBU1", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, MyGlb.PANEL_FORM, 520, 528, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFDEBACCBU1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_INFDEBACCBU1, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_INFDEBACCBU1, -1, "", "INFDEBACCBU1", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 400, 480, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 464, 584, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ELABORA, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_EMISSIORDINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  T02 A, ");
    SQL.append("  QTN B ");
    SQL.append("where (B.CODICE = ~~ROWNAMCODEDO~~) ");
    SQL.append("and   (B.NUM_QUIETANZA = ~~ROWNAMEQUIET~~) ");
    SQL.append("and   (B.TIPO_QUIETANZA = A.CODICE(+)) ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_QTN, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_QTN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_QTN, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODEDO~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_BEN, PFL_EMISSIORDINA_CODICDEBIDOC, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODEAC~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_BEN1, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_BEN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_BEN1, "BEN");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_BEN1, PFL_EMISSIORDINA_CODICDEBIACC, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_BEN1, 1, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN1, "DEBITORE", "Debitore");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN1, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN1, "PARTITA_IVA", "BEN PARTITA IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECAUSA~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMECAUSA~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T58, 0, SQL, PFL_EMISSIORDINA_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T58, 1, SQL, PFL_EMISSIORDINA_CAUSALE, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_EMISSIORDINA.SetQuery(PPQRY_T60, 0, SQL, PFL_EMISSIORDINA_BOLLO, "");
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
    PAN_EMISSIORDINA.SetQuery(PPQRY_T60, 1, SQL, PFL_EMISSIORDINA_BOLLO, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_EMISSIORDINA.SetQuery(PPQRY_T53, 0, SQL, PFL_EMISSIORDINA_UFFICIO, "");
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
    PAN_EMISSIORDINA.SetQuery(PPQRY_T53, 1, SQL, PFL_EMISSIORDINA_UFFICIO, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~ROWNAMESPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_EMISSIORDINA_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_EMISSIORDINA_SPESE, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetIMDB(IMDB, "PQRY_ORDINDACORR1", true);
    PAN_EMISSIORDINA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_EMISSIORDINA.SetQueryIMDB(PPQRY_ORDINDACORR1, IMDBDef15.PQRY_ORDINDACORR1_RS, IMDBDef6.TBL_EMISSIORDIN1);
    JustLoaded = true;
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CAPITOLO, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAPIT);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_ARTICOLO, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEARTIC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_ACCERTAMENTO, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMNUMACC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_ANNOACC, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMANNACC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CODICDEBIDOC, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEDO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATA1, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDATA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DESCRIZIONE, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEDESCR);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CAUSALE, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECAUSA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_BOLLO, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEBOLLO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_UFFICIO, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEUFFIC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CONTABILE, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECONTA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATA, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMDATCON);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATAINCASCCP, IMDBDef6.FLD_EMISSIORDIN1_RONADAINCCCP);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATAESTRACCP, IMDBDef6.FLD_EMISSIORDIN1_RONADAESCCCP);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_QUIETANZA, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEQUIET);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_SPESE, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMESPESE);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_COMMISSIONI, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMECOMMI);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_ALLEGATI, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEALLEG);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_INFOTESORIER, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMINFTES);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_EMAUVPMDSASC, IMDBDef6.FLD_EMISSIORDIN1_RNEAVPMDSASC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_IMPUTAECONOM, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMIMPECO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CODICDEBIACC, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMCODEAC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CONTROPAPATR, IMDBDef6.FLD_EMISSIORDIN1_ROWNAMEFATTO);
    PAN_EMISSIORDINA.SetMasterTable(0, "EMISSIORDIN1");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISSIORDINA.Status() == 2)
    {
      int oldListQBE = PAN_EMISSIORDINA.iUseListQBE;
      PAN_EMISSIORDINA.iUseListQBE = 0;
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_FIND);
      PAN_EMISSIORDINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
