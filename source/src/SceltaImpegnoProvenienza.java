// **********************************************
// Scelta Impegno Provenienza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaImpegnoProvenienza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCELTAIMPEGN_IMPEGNO = 0;
  private static int GRP_SCELTAIMPEGN_PROPOSTA = 1;
  private static int GRP_SCELTAIMPEGN_DELIBERA = 2;

  private static int PFL_SCELTAIMPEGN_NUMEROIMP = 0;
  private static int PFL_SCELTAIMPEGN_ANNOIMP = 1;
  private static int PFL_SCELTAIMPEGN_CAPITOLO = 2;
  private static int PFL_SCELTAIMPEGN_ARTICOLO = 3;
  private static int PFL_SCELTAIMPEGN_DDATAREG = 4;
  private static int PFL_SCELTAIMPEGN_DESCRIZIONE = 5;
  private static int PFL_SCELTAIMPEGN_TIPOVAR = 6;
  private static int PFL_SCELTAIMPEGN_ANNOENTRATA = 7;
  private static int PFL_SCELTAIMPEGN_UNITAPROPONE = 8;
  private static int PFL_SCELTAIMPEGN_NUMEROPROPOS = 9;
  private static int PFL_SCELTAIMPEGN_ANNOPROPOSTA = 10;
  private static int PFL_SCELTAIMPEGN_SEDEDEL = 11;
  private static int PFL_SCELTAIMPEGN_NUMERODEL = 12;
  private static int PFL_SCELTAIMPEGN_ANNODEL = 13;
  private static int PFL_SCELTAIMPEGN_IMPORTO = 14;
  private static int PFL_SCELTAIMPEGN_VOCEECON = 15;
  private static int PFL_SCELTAIMPEGN_CODICEGESTIO = 16;
  private static int PFL_SCELTAIMPEGN_CODICECOFOG = 17;
  private static int PFL_SCELTAIMPEGN_CODICEEUROPE = 18;
  private static int PFL_SCELTAIMPEGN_CODLIVELLO5 = 19;
  private static int PFL_SCELTAIMPEGN_BENEFICIARIO = 20;
  private static int PFL_SCELTAIMPEGN_CAUSALE = 21;
  private static int PFL_SCELTAIMPEGN_IMPEGNOBBLIG = 22;
  private static int PFL_SCELTAIMPEGN_ESERCISCADEN = 23;
  private static int PFL_SCELTAIMPEGN_TIPOVINCOLO = 24;
  private static int PFL_SCELTAIMPEGN_TIPOAVANZO = 25;
  private static int PFL_SCELTAIMPEGN_INVESTIMENTO = 26;
  private static int PFL_SCELTAIMPEGN_REGOLACONT = 27;
  private static int PFL_SCELTAIMPEGN_CONTRIBSTR = 28;
  private static int PFL_SCELTAIMPEGN_TITOLOGIURID = 29;
  private static int PFL_SCELTAIMPEGN_ANNOPLUR = 30;
  private static int PFL_SCELTAIMPEGN_NUMEROPLUR = 31;
  private static int PFL_SCELTAIMPEGN_CENTRO = 32;
  private static int PFL_SCELTAIMPEGN_FATTORE = 33;
  private static int PFL_SCELTAIMPEGN_COMPETENZDAL = 34;
  private static int PFL_SCELTAIMPEGN_COMPETENZAAL = 35;
  private static int PFL_SCELTAIMPEGN_NOTE = 36;
  private static int PFL_SCELTAIMPEGN_RILEVANTEECO = 37;
  private static int PFL_SCELTAIMPEGN_CODIMPECO = 38;
  private static int PFL_SCELTAIMPEGN_PROGETTOID = 39;
  private static int PFL_SCELTAIMPEGN_OPERA = 40;
  private static int PFL_SCELTAIMPEGN_COMUNEZONA = 41;
  private static int PFL_SCELTAIMPEGN_PROVINCIZONA = 42;
  private static int PFL_SCELTAIMPEGN_OBIETTIVO = 43;
  private static int PFL_SCELTAIMPEGN_CUP = 44;
  private static int PFL_SCELTAIMPEGN_PROGUNITORGA = 45;
  private static int PFL_SCELTAIMPEGN_SCHEDOBIETID = 46;
  private static int PFL_SCELTAIMPEGN_CIG = 47;
  private static int PFL_SCELTAIMPEGN_CODMONITORAG = 48;
  private static int PFL_SCELTAIMPEGN_FINANZIAMENT = 49;
  private static int PFL_SCELTAIMPEGN_PROGRESSIVO = 50;

  private static int PPQRY_VARIMP9 = 0;

  private static int PPQRY_T55 = 1;


  IDPanel PAN_SCELTAIMPEGN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM125(IMDB);
    //
    //
    Init_PQRY_VARIMP9(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM125(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM125, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM125, "TBL_PARAM125");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM125,IMDBDef1.FLD_PARAM125_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM125,IMDBDef1.FLD_PARAM125_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM125, 0);
  }

  private static void Init_PQRY_VARIMP9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VARIMP9, 51);
    IMDB.set_TblCode(IMDBDef7.PQRY_VARIMP9, "PQRY_VARIMP9");
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMNUMEIMP, "VARIMNUMEIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMANNOIMP, "VARIMANNOIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPCAPI, "VARIMIMPCAPI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPARTI, "VARIMIMPARTI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIDDATAREG, "VARIDDATAREG");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIDDATAREG,6,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPDESCRI, "VARIMPDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMTIPOVAR, "VARIMTIPOVAR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMTIPOVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIUNITPROP, "VARIUNITPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARINUMEPROP, "VARINUMEPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARINUMEPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIANNOPROP, "VARIANNOPROP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMSEDEDEL, "VARIMSEDEDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMNUMEDEL, "VARIMNUMEDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMANNODEL, "VARIMANNODEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPORT, "VARIMPIMPORT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPVOCECO, "VARIMPVOCECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPVOCECO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODGES, "VARIMPCODGES");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODGES,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODCOF, "VARIMPCODCOF");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODCOF,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODEUR, "VARIMPCODEUR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODEUR,1,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODLI5, "VARIMPCODLI5");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPBENE, "VARIMIMPBENE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPCAUS, "VARIMIMPCAUS");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPCAUS,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPOBB, "VARIMPIMPOBB");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPOBB,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPESESCA, "VARIMPESESCA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPESESCA,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPTIPVIN, "VARIMPTIPVIN");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPTIPAVA, "VARIMPTIPAVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPTIPAVA,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPINVE, "VARIMIMPINVE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPINVE,5,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPREGCON, "VARIMPREGCON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPREGCON,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCONSTR, "VARIMPCONSTR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCONSTR,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPTITGIU, "VARIMPTITGIU");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPTITGIU,5,60,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPANNPLU, "VARIMPANNPLU");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPANNPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPNUMPLU, "VARIMPNUMPLU");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPNUMPLU,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPCENT, "VARIMIMPCENT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPCENT,5,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPFATT, "VARIMIMPFATT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPFATT,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCOMDAL, "VARIMPCOMDAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCOMDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIIMPCOMAL, "VARIIMPCOMAL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIIMPCOMAL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPNOTE, "VARIMIMPNOTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPNOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPRILECO, "VARIMPRILECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPRILECO,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARCODIMPECO, "VARCODIMPECO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARCODIMPECO,5,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIIMPPROID, "VARIIMPPROID");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIIMPPROID,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPOPER, "VARIMIMPOPER");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPOPER,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCOMZON, "VARIMPCOMZON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCOMZON,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPPROZON, "VARIMPPROZON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPPROZON,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPOBIE, "VARIMIMPOBIE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMIMPOBIE,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPCUP, "VARIMPIMPCUP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPCUP,5,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPPRUNOR, "VARIMPPRUNOR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPSCOBID, "VARIMPSCOBID");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPSCOBID,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPCIG, "VARIMPIMPCIG");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPIMPCIG,5,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODMON, "VARIMPCODMON");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPCODMON,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPFINANZ, "VARIMPFINANZ");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPFINANZ,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPPROGRE, "VARIMPPROGRE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIMPPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIANNOENTR, "VARIANNOENTR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VARIMP9,IMDBDef7.PQSL_VARIMP9_VARIANNOENTR,1,4,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VARIMP9, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaImpegnoProvenienza(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaImpegnoProvenienza()
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
    FormIdx = MyGlb.FRM_SCELIMPEPROV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F5330BE6-8E27-4677-9804-C81B456A3741";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1056;
    DesignHeight = 358;
    set_Caption(new IDVariant("Scelta Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1056;
    Frames[1].Height = 332;
    Frames[1].Caption = "Scelta Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_SCELTAIMPEGN = new IDPanel(w, this, 1, "PAN_SCELTAIMPEGN");
    Frames[1].Content = PAN_SCELTAIMPEGN;
    PAN_SCELTAIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1056-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DB5B8238-0350-471A-8D37-AD9BD41F4482");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 992, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAIMPEGN.InitStatus = 1;
    PAN_SCELTAIMPEGN_Init();
    PAN_SCELTAIMPEGN_InitFields();
    PAN_SCELTAIMPEGN_InitQueries();
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
      PAN_SCELTAIMPEGN.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaImpegnoProvenienza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaImpegnoProvenienza.class.getName() : (Glb.ClassWithPackage(SceltaImpegnoProvenienza.class) ? SceltaImpegnoProvenienza.class.getName().substring(SceltaImpegnoProvenienza.class.getPackage().getName().length() + 1) : SceltaImpegnoProvenienza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Impegno On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_SCELTAIMPEGN_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Impegno On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_SCELTAIMPEGN.Status()).equals((new IDVariant(1)), true))
      {
        PAN_SCELTAIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_SCELTAIMPEGN.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoProvenienza", "SceltaImpegnoOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Scelta Impegno On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTAIMPEGN);
      // 
      // Scelta Impegno On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELTAIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAIMPEGN_DESCRIZIONE,(new IDVariant(PAN_SCELTAIMPEGN.FieldText(PFL_SCELTAIMPEGN_DESCRIZIONE))).stringValue()); 
      PAN_SCELTAIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAIMPEGN_TIPOVAR,(new IDVariant(PAN_SCELTAIMPEGN.FieldText(PFL_SCELTAIMPEGN_TIPOVAR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoProvenienza", "SceltaImpegnoOnDynamicProperties", _e);
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
      PAN_SCELTAIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoProvenienza", "Load", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    // Stub
  }

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
  private void PAN_SCELTAIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAIMPEGN, Cancel);
    // Stub
  }

  private void PAN_SCELTAIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTAIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_VARIMP9, IMDBDef7.PQSL_VARIMP9_VARIDDATAREG, 0)))
      {
        IMDB.set_Value(IMDBDef7.PQRY_VARIMP9, IMDBDef7.PQSL_VARIMP9_VARIDDATAREG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_SCELTAIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAIMPEGN_Init()
  {

    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, "864E6A7D-DC0F-443F-9C7F-2B4DA5A924F6");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, "Impegno");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 0, 39, 132, 73, 0, 0);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, 0, 51);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, 1, 13);
    PAN_SCELTAIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, 0, 4);
    PAN_SCELTAIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, 1, 4);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, "14B95A8F-64BB-4108-A5EE-A406AEF94A3F");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, "Proposta");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 656, -9999, 200, 16, 0, 0);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 0, 159, 172, 97, 0, 0);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, 0, 51);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, 1, 13);
    PAN_SCELTAIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, 0, 4);
    PAN_SCELTAIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, 1, 4);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, "80CC9E2E-61A8-402D-A836-AC6E9CCACD03");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, "Delibera");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 856, -9999, 136, 16, 0, 0);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 0, 231, 132, 97, 0, 0);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, 0, 47);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, 1, 13);
    PAN_SCELTAIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, 0, 4);
    PAN_SCELTAIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, 1, 4);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTAIMPEGN_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_FIELD, 51);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, "62D31DCA-2CF4-43AD-85AA-953C0AA1D636");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, "Numero");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, "EA7CEE85-54CD-4B54-BC7B-34138941ACF5");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, "Anno");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "1DF31BEB-CD02-401A-8D31-14DA078A17DA");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "Capitolo");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, "39F12A38-234F-4B43-BD26-3580FEF35922");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, "Art.");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, "5F8CC0AA-6445-4C9E-9978-41D4E0A21FD6");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, "Data Reg.");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "1AF3E558-18EF-4A5D-969A-3AB2670D8886");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, "EF78A677-6821-4CF1-A535-094A204AE9CE");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, "Tipo Variazione");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, "D6436C36-0460-4C5A-AC9B-C5E63C3D12FD");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, "Anno Entrata");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, "5A4A3039-B45C-401F-80D0-91DF9B33B59C");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, "Unità Prop.");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, "57B18656-3829-4AED-A329-7089BD815DE3");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, "Numero");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, "1F53FD78-0BFD-405E-832A-2157E341B6EF");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, "Anno");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, "98F4F127-1062-447F-A79C-545367549829");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, "Sede");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, "576A63DD-2888-4983-87B3-A685614F4747");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, "Numero");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, "F2FBE288-AD3B-4D70-8216-BAC4F26B2914");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, "Anno");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, "61A0C6BA-4D05-48D6-8EA6-4D74F972C812");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, "IMPORTO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, 0, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, "BF5487B8-61A7-4B64-9798-C1AFFE12098E");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, "VOCE ECON");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, 0, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, "FDEBEFCF-320D-4E11-A0B4-D5350790BC36");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, "CODICE GESTIONALE");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, "4CB50A81-3C70-4C3B-8D81-304053B3FF4A");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, "Cod. Cofog");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, "E0659617-6F78-4E3E-9DD1-6B5217BADF06");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, "Cod. Europeo");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, "86DF6482-ACCC-4B82-AF8B-37DD32C3B10C");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, "Cod. V livello");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, "2D52AAE6-D0EB-495B-AD45-356A2153EE3C");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, "BENEFICIARIO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, "A45F2E71-FF8E-42FB-9F91-E740D51C5507");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, "CAUSALE");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, "8DE1E968-4937-4C0B-9CB4-B21BF43E1798");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, "IMPEGNO OBBLIG");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, "D4BDE851-F02B-421E-954B-5DB646A6080F");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, "ESERCIZIO SCADENZA");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, "9CF9C06E-0BE3-4C08-B4A7-0DAFDB8CB0F6");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, "58B6FD04-27EE-43FE-947B-AAC84C7FE134");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, "Tipo Avanzo");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, "310E9663-F74E-4390-9A32-5A46C44F9AEF");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, "INVESTIMENTO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, "F03147E0-56B6-49DE-AF2B-6077F19CDCBD");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, "REGOLA CONT");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, "A1A48195-7FEC-41C7-A1D1-C7FB72F465B2");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, "CONTRIB STR");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, "C291A591-1F58-4F8B-9F46-3B5E6E41CBC0");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, "TITOLO GIURIDICO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, "8E2CDAB5-84B7-42F7-851D-A4E2FF870230");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, "ANNO PLUR");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, "07DEDDD3-AE0E-43CA-A3EC-F83D813317D8");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, "NUMERO PLUR");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, "7830B9D8-F8F4-4E25-8194-E146F4A26545");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, "CENTRO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, "D7FB2224-E7E0-413B-9F77-FDC34EB61038");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, "FATTORE");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, "B675F5F3-7039-4022-8C23-AE9D2D7998A2");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, "COMPETENZA DAL");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, "A8A18198-81F0-4C13-BFE4-1C2A3633D1C0");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, "COMPETENZA AL");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, "ECC55DB6-03BD-40E0-9500-E57AB8B34026");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, "NOTE");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, "12878866-4DEB-43A5-AF60-971D5673C961");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, "RILEVANTE ECO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, "2ACE33EE-602C-470D-9EB3-3197B8C0554B");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, "COD IMP ECO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, "AE66BE06-3135-4E84-8A19-5047FBF5E786");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, "PROGETTO ID");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, "F788EE9E-BA43-418D-B9B6-576D9A6EDEAA");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, "OPERA");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, "1AED7147-749F-4357-A161-7179D04FE892");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, "COMUNE ZONA");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, "A8F0CF27-D941-4157-82B6-6394A5ADA536");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, "PROVINCIA ZONA");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, "93CBE4BF-42F3-4431-984C-C4AC932E8B94");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, "OBIETTIVO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, "C9FBEE1D-3472-4A47-932B-883B8CE782EB");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, "CUP");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, "673F6392-579D-4F6B-9338-D541A3E4DE4B");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, "CFD41544-0EDF-40CE-A6DA-FB0A56BE6F87");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, "0CE7D3A7-6D1D-438F-ABBA-9951FB7DCE79");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, "CIG");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, "8F7DFF54-8F86-4ACE-A083-F90CCE2E4209");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, "COD MONITORAGGIO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, "DC42C785-C029-4D90-B7DD-E3176F9C74FD");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, "FINANZIAMENTO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, "21AAB60E-1E2B-44FE-82B0-0C4858FA1675");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, "PROGRESSIVO");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_SCELTAIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 4, 64, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMEROIMP, -1, GRP_SCELTAIMPEGN_IMPEGNO);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMEROIMP, PPQRY_VARIMP9, "B.NUMERO_IMP", "VARIMNUMEIMP", 1, 5, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 60, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 4, 88, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNOIMP, -1, GRP_SCELTAIMPEGN_IMPEGNO);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNOIMP, PPQRY_VARIMP9, "B.ANNO_IMP", "VARIMANNOIMP", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 100, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CAPITOLO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CAPITOLO, PPQRY_VARIMP9, "B.CAPITOLO", "VARIMIMPCAPI", 3, 16, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 212, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 4, 136, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ARTICOLO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ARTICOLO, PPQRY_VARIMP9, "B.ARTICOLO", "VARIMIMPARTI", 1, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_LIST, 240, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_FORM, 4, 160, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DDATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_DDATAREG, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_DDATAREG, PPQRY_VARIMP9, "A.D_DATA_REG", "VARIDDATAREG", 6, 10, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 312, 36, 152, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_DESCRIZIONE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_DESCRIZIONE, PPQRY_VARIMP9, "A.DESCRIZIONE", "VARIMPDESCRI", 5, 140, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, 464, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, 4, 328, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, "Tp. Variaz.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_TIPOVAR, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_TIPOVAR, PPQRY_VARIMP9, "A.TIPO_VAR", "VARIMTIPOVAR", 1, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, 604, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNOENTRATA, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNOENTRATA, PPQRY_VARIMP9, "A.ANNO_ENTRATA", "VARIANNOENTR", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 656, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità Prop.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 184, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, "Unità Prop.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_UNITAPROPONE, -1, GRP_SCELTAIMPEGN_PROPOSTA);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_UNITAPROPONE, PPQRY_VARIMP9, "A.UNITA_PROPONENTE", "VARIUNITPROP", 5, 8, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 764, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 208, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMEROPROPOS, -1, GRP_SCELTAIMPEGN_PROPOSTA);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMEROPROPOS, PPQRY_VARIMP9, "A.NUMERO_PROPOSTA", "VARINUMEPROP", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 816, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 232, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNOPROPOSTA, -1, GRP_SCELTAIMPEGN_PROPOSTA);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNOPROPOSTA, PPQRY_VARIMP9, "A.ANNO_PROPOSTA", "VARIANNOPROP", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 856, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 4, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_SEDEDEL, -1, GRP_SCELTAIMPEGN_DELIBERA);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_SEDEDEL, PPQRY_VARIMP9, "A.SEDE_DEL", "VARIMSEDEDEL", 5, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 896, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 4, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMERODEL, -1, GRP_SCELTAIMPEGN_DELIBERA);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMERODEL, PPQRY_VARIMP9, "A.NUMERO_DEL", "VARIMNUMEDEL", 1, 6, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 952, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 4, 304, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNODEL, -1, GRP_SCELTAIMPEGN_DELIBERA);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNODEL, PPQRY_VARIMP9, "A.ANNO_DEL", "VARIMANNODEL", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 812, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_LIST, "IMPORTO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 4, 328, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPORTO, MyGlb.PANEL_FORM, "IMPORTO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_IMPORTO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_IMPORTO, PPQRY_VARIMP9, "A.IMPORTO", "VARIMPIMPORT", 3, 14, 2, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_LIST, 812, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_LIST, "VOCE ECON");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_FORM, 4, 352, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_VOCEECON, MyGlb.PANEL_FORM, "VOCE ECON");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_VOCEECON, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_VOCEECON, PPQRY_VARIMP9, "B.VOCE_ECON", "VARIMPVOCECO", 1, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_LIST, 812, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_LIST, 120);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_LIST, "CODICE GESTIONALE");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 376, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_FORM, 120);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEGESTIO, MyGlb.PANEL_FORM, "CODICE GESTIONALE");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CODICEGESTIO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CODICEGESTIO, PPQRY_VARIMP9, "B.CODICE_GESTIONALE", "VARIMPCODGES", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 812, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, "Cod. Cofog");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 4, 400, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, "Cod. Cofog");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CODICECOFOG, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CODICECOFOG, PPQRY_VARIMP9, "B.CODICE_COFOG", "VARIMPCODCOF", 1, 3, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 812, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 424, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CODICEEUROPE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CODICEEUROPE, PPQRY_VARIMP9, "B.CODICE_EUROPEO", "VARIMPCODEUR", 1, 1, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 448, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CODLIVELLO5, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CODLIVELLO5, PPQRY_VARIMP9, "B.COD_LIVELLO_5", "VARIMPCODLI5", 3, 10, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFICIARIO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 328, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFICIARIO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_BENEFICIARIO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_BENEFICIARIO, PPQRY_VARIMP9, "B.BENEFICIARIO", "VARIMIMPBENE", 2, 15, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_LIST, 900, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_LIST, "CAUSALE");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAUSALE, MyGlb.PANEL_FORM, "CAUSALE");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CAUSALE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CAUSALE, PPQRY_VARIMP9, "B.CAUSALE", "VARIMIMPCAUS", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 960, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_LIST, "IMPEGNO OBBLIG");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 4, 376, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_IMPEGNOBBLIG, MyGlb.PANEL_FORM, "IMPEGNO OBBLIG");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_IMPEGNOBBLIG, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_IMPEGNOBBLIG, PPQRY_VARIMP9, "B.IMPEGNO_OBBLIG", "VARIMPIMPOBB", 5, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_IMPEGNOBBLIG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_IMPEGNOBBLIG, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_LIST, 1064, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_LIST, 128);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_LIST, "ESERCIZIO SCADENZA");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_FORM, 4, 400, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_FORM, 128);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ESERCISCADEN, MyGlb.PANEL_FORM, "ESERCIZIO SCADENZA");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ESERCISCADEN, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ESERCISCADEN, PPQRY_VARIMP9, "B.ESERCIZIO_SCADENZA", "VARIMPESESCA", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_LIST, 1192, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_LIST, "TIPO VINCOLO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 424, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOVINCOLO, MyGlb.PANEL_FORM, "TIPO VINCOLO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_TIPOVINCOLO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_TIPOVINCOLO, PPQRY_VARIMP9, "B.TIPO_VINCOLO", "VARIMPTIPVIN", 1, 6, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_LIST, 656, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_FORM, 4, 376, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_TIPOAVANZO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_TIPOAVANZO, PPQRY_VARIMP9, "B.TIPO_AVANZO", "VARIMPTIPAVA", 3, 10, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_LIST, 1280, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_LIST, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_LIST, "INVESTIMENTO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_FORM, 4, 448, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_FORM, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_INVESTIMENTO, MyGlb.PANEL_FORM, "INVESTIMENTO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_INVESTIMENTO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_INVESTIMENTO, PPQRY_VARIMP9, "B.INVESTIMENTO", "VARIMIMPINVE", 5, 6, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_LIST, 1372, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_LIST, "REGOLA CONT");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_FORM, 4, 472, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_REGOLACONT, MyGlb.PANEL_FORM, "REGOLA CONT");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_REGOLACONT, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_REGOLACONT, PPQRY_VARIMP9, "B.REGOLA_CONT", "VARIMPREGCON", 5, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_REGOLACONT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_REGOLACONT, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_LIST, 1456, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_LIST, "CONTRIB STR");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_FORM, 4, 496, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CONTRIBSTR, MyGlb.PANEL_FORM, "CONTRIB STR");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CONTRIBSTR, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CONTRIBSTR, PPQRY_VARIMP9, "B.CONTRIB_STR", "VARIMPCONSTR", 1, 3, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_LIST, 1540, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_LIST, 116);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_LIST, "TITOLO GIURIDICO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_FORM, 4, 520, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_FORM, 116);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_TITOLOGIURID, MyGlb.PANEL_FORM, "TITOLO GIURIDICO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_TITOLOGIURID, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_TITOLOGIURID, PPQRY_VARIMP9, "B.TITOLO_GIURIDICO", "VARIMPTITGIU", 5, 60, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_LIST, 1848, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_LIST, 72);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_LIST, "ANNO PLUR");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_FORM, 4, 544, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_FORM, 72);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNOPLUR, MyGlb.PANEL_FORM, "ANNO PLUR");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNOPLUR, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNOPLUR, PPQRY_VARIMP9, "B.ANNO_PLUR", "VARIMPANNPLU", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_LIST, 1920, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_LIST, "NUMERO PLUR");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_FORM, 4, 568, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMEROPLUR, MyGlb.PANEL_FORM, "NUMERO PLUR");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMEROPLUR, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMEROPLUR, PPQRY_VARIMP9, "B.NUMERO_PLUR", "VARIMPNUMPLU", 1, 5, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_LIST, 2008, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_FORM, 4, 592, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CENTRO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CENTRO, PPQRY_VARIMP9, "B.CENTRO", "VARIMIMPCENT", 5, 8, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_LIST, 2060, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_FORM, 4, 616, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_FATTORE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_FATTORE, PPQRY_VARIMP9, "B.FATTORE", "VARIMIMPFATT", 5, 16, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_LIST, 2120, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_LIST, 108);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_LIST, "COMPETENZA DAL");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 640, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_FORM, 108);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZDAL, MyGlb.PANEL_FORM, "COMPETENZA DAL");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_COMPETENZDAL, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_COMPETENZDAL, PPQRY_VARIMP9, "B.COMPETENZA_DAL", "VARIMPCOMDAL", 6, 19, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_LIST, 2228, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_LIST, 100);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_LIST, "COMPETENZA AL");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 664, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_FORM, 100);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMPETENZAAL, MyGlb.PANEL_FORM, "COMPETENZA AL");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_COMPETENZAAL, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_COMPETENZAAL, PPQRY_VARIMP9, "B.COMPETENZA_AL", "VARIIMPCOMAL", 6, 19, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_LIST, 2332, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_FORM, 4, 688, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_FORM, 36);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NOTE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NOTE, PPQRY_VARIMP9, "B.NOTE", "VARIMIMPNOTE", 5, 2000, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_LIST, 2764, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_LIST, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_LIST, "RILEVANTE ECO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_FORM, 4, 736, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_FORM, 92);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_RILEVANTEECO, MyGlb.PANEL_FORM, "RILEVANTE ECO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_RILEVANTEECO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_RILEVANTEECO, PPQRY_VARIMP9, "B.RILEVANTE_ECO", "VARIMPRILECO", 5, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_RILEVANTEECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTAIMPEGN.SetValueListItem(PFL_SCELTAIMPEGN_RILEVANTEECO, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_LIST, 2856, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_LIST, 80);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_LIST, "COD IMP ECO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_FORM, 4, 760, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_FORM, 80);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODIMPECO, MyGlb.PANEL_FORM, "COD IMP ECO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CODIMPECO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CODIMPECO, PPQRY_VARIMP9, "B.COD_IMP_ECO", "VARCODIMPECO", 5, 16, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, 2936, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, 4, 784, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, 84);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, "PROGETTO ID");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_PROGETTOID, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_PROGETTOID, PPQRY_VARIMP9, "B.PROGETTO_ID", "VARIIMPPROID", 5, 9, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_LIST, 3020, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_FORM, 4, 808, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_OPERA, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_OPERA, PPQRY_VARIMP9, "B.OPERA", "VARIMIMPOPER", 1, 5, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_LIST, 3068, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_LIST, "COMUNE ZONA");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_FORM, 4, 832, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_COMUNEZONA, MyGlb.PANEL_FORM, "COMUNE ZONA");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_COMUNEZONA, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_COMUNEZONA, PPQRY_VARIMP9, "B.COMUNE_ZONA", "VARIMPCOMZON", 1, 3, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_LIST, 3156, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_LIST, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_LIST, "PROVINCIA ZONA");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_FORM, 4, 856, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_FORM, 104);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROVINCIZONA, MyGlb.PANEL_FORM, "PROVINCIA ZONA");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_PROVINCIZONA, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_PROVINCIZONA, PPQRY_VARIMP9, "B.PROVINCIA_ZONA", "VARIMPPROZON", 1, 3, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_LIST, 3260, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_LIST, "OBIETTIVO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_FORM, 4, 880, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_FORM, 68);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_OBIETTIVO, MyGlb.PANEL_FORM, "OBIETTIVO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_OBIETTIVO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_OBIETTIVO, PPQRY_VARIMP9, "B.OBIETTIVO", "VARIMIMPOBIE", 5, 9, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_LIST, 3328, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_LIST, 32);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_LIST, "CUP");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_FORM, 4, 904, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_FORM, 32);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CUP, MyGlb.PANEL_FORM, "CUP");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CUP, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CUP, PPQRY_VARIMP9, "B.CUP", "VARIMPIMPCUP", 5, 15, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, 3412, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 928, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_PROGUNITORGA, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_PROGUNITORGA, PPQRY_VARIMP9, "B.PROGR_UNITA_ORGANIZZATIVA", "VARIMPPRUNOR", 1, 8, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, 3596, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, 132);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 952, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, 132);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCHEDA OBIETTIVO ID");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_SCHEDOBIETID, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_SCHEDOBIETID, PPQRY_VARIMP9, "B.SCHEDA_OBIETTIVO_ID", "VARIMPSCOBID", 1, 10, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_LIST, 3728, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_LIST, 28);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_LIST, "CIG");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_FORM, 4, 976, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_FORM, 28);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CIG, MyGlb.PANEL_FORM, "CIG");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CIG, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CIG, PPQRY_VARIMP9, "B.CIG", "VARIMPIMPCIG", 5, 15, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_LIST, 3812, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_LIST, 124);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_LIST, "COD MONITORAGGIO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_FORM, 4, 1000, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_FORM, 124);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CODMONITORAG, MyGlb.PANEL_FORM, "COD MONITORAGGIO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CODMONITORAG, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CODMONITORAG, PPQRY_VARIMP9, "B.COD_MONITORAGGIO", "VARIMPCODMON", 5, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_LIST, 812, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 328, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_FINANZIAMENT, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_FINANZIAMENT, PPQRY_VARIMP9, "A.FINANZIAMENTO", "VARIMPFINANZ", 1, 5, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, 812, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 328, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_PROGRESSIVO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_PROGRESSIVO, PPQRY_VARIMP9, "A.PROGRESSIVO", "VARIMPPROGRE", 3, 10, 0, -13997);
  }

  private void PAN_SCELTAIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRTIPOVAR ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~VARIMTIPOVAR~~) ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_T55, 0, SQL, PFL_SCELTAIMPEGN_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRTIPOVAR ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_T55, 1, SQL, PFL_SCELTAIMPEGN_TIPOVAR, "");
    PAN_SCELTAIMPEGN.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAIMPEGN.SetIMDB(IMDB, "PQRY_VARIMP9", true);
    PAN_SCELTAIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "VARIMP");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  B.NUMERO_IMP as VARIMNUMEIMP, ");
    SQL.append("  B.ANNO_IMP as VARIMANNOIMP, ");
    SQL.append("  B.CAPITOLO as VARIMIMPCAPI, ");
    SQL.append("  B.ARTICOLO as VARIMIMPARTI, ");
    SQL.append("  A.D_DATA_REG as VARIDDATAREG, ");
    SQL.append("  A.DESCRIZIONE as VARIMPDESCRI, ");
    SQL.append("  A.TIPO_VAR as VARIMTIPOVAR, ");
    SQL.append("  A.UNITA_PROPONENTE as VARIUNITPROP, ");
    SQL.append("  A.NUMERO_PROPOSTA as VARINUMEPROP, ");
    SQL.append("  A.ANNO_PROPOSTA as VARIANNOPROP, ");
    SQL.append("  A.SEDE_DEL as VARIMSEDEDEL, ");
    SQL.append("  A.NUMERO_DEL as VARIMNUMEDEL, ");
    SQL.append("  A.ANNO_DEL as VARIMANNODEL, ");
    SQL.append("  A.IMPORTO as VARIMPIMPORT, ");
    SQL.append("  B.VOCE_ECON as VARIMPVOCECO, ");
    SQL.append("  B.CODICE_GESTIONALE as VARIMPCODGES, ");
    SQL.append("  B.CODICE_COFOG as VARIMPCODCOF, ");
    SQL.append("  B.CODICE_EUROPEO as VARIMPCODEUR, ");
    SQL.append("  B.COD_LIVELLO_5 as VARIMPCODLI5, ");
    SQL.append("  B.BENEFICIARIO as VARIMIMPBENE, ");
    SQL.append("  B.CAUSALE as VARIMIMPCAUS, ");
    SQL.append("  B.IMPEGNO_OBBLIG as VARIMPIMPOBB, ");
    SQL.append("  B.ESERCIZIO_SCADENZA as VARIMPESESCA, ");
    SQL.append("  B.TIPO_VINCOLO as VARIMPTIPVIN, ");
    SQL.append("  B.TIPO_AVANZO as VARIMPTIPAVA, ");
    SQL.append("  B.INVESTIMENTO as VARIMIMPINVE, ");
    SQL.append("  B.REGOLA_CONT as VARIMPREGCON, ");
    SQL.append("  B.CONTRIB_STR as VARIMPCONSTR, ");
    SQL.append("  B.TITOLO_GIURIDICO as VARIMPTITGIU, ");
    SQL.append("  B.ANNO_PLUR as VARIMPANNPLU, ");
    SQL.append("  B.NUMERO_PLUR as VARIMPNUMPLU, ");
    SQL.append("  B.CENTRO as VARIMIMPCENT, ");
    SQL.append("  B.FATTORE as VARIMIMPFATT, ");
    SQL.append("  B.COMPETENZA_DAL as VARIMPCOMDAL, ");
    SQL.append("  B.COMPETENZA_AL as VARIIMPCOMAL, ");
    SQL.append("  B.NOTE as VARIMIMPNOTE, ");
    SQL.append("  B.RILEVANTE_ECO as VARIMPRILECO, ");
    SQL.append("  B.COD_IMP_ECO as VARCODIMPECO, ");
    SQL.append("  B.PROGETTO_ID as VARIIMPPROID, ");
    SQL.append("  B.OPERA as VARIMIMPOPER, ");
    SQL.append("  B.COMUNE_ZONA as VARIMPCOMZON, ");
    SQL.append("  B.PROVINCIA_ZONA as VARIMPPROZON, ");
    SQL.append("  B.OBIETTIVO as VARIMIMPOBIE, ");
    SQL.append("  B.CUP as VARIMPIMPCUP, ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as VARIMPPRUNOR, ");
    SQL.append("  B.SCHEDA_OBIETTIVO_ID as VARIMPSCOBID, ");
    SQL.append("  B.CIG as VARIMPIMPCIG, ");
    SQL.append("  B.COD_MONITORAGGIO as VARIMPCODMON, ");
    SQL.append("  A.FINANZIAMENTO as VARIMPFINANZ, ");
    SQL.append("  A.PROGRESSIVO as VARIMPPROGRE, ");
    SQL.append("  A.ANNO_ENTRATA as VARIANNOENTR ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VARIMP9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARIMP A, ");
    SQL.append("  IMP B ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VARIMP9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   ((A.IMP_GENERATO IS NULL)) ");
    SQL.append("and   (A.ANNO_ESIGIBILITA = ~~TBL_PARAM125.PARAMESERCIZ~~) ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VARIMP9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VARIMP9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VARIMP9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VARIMP9, 5, SQL, -1, "");
    PAN_SCELTAIMPEGN.SetQueryDB(PPQRY_VARIMP9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAIMPEGN.SetMasterTable(0, "VARIMP");
    PAN_SCELTAIMPEGN.AddToSortList(PFL_SCELTAIMPEGN_ANNOIMP, true);
    PAN_SCELTAIMPEGN.AddToSortList(PFL_SCELTAIMPEGN_NUMEROIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAIMPEGN.iUseListQBE;
      PAN_SCELTAIMPEGN.iUseListQBE = 0;
      PAN_SCELTAIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
