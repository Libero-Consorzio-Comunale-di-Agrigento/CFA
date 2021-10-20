// **********************************************
// Chiusura Ordini
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ChiusuraOrdini extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DATA = 0;
  private static int GRP_PARAMETRI_NUMERO = 1;

  private static int PFL_PARAMETRI_DAL1 = 0;
  private static int PFL_PARAMETRI_AL2 = 1;
  private static int PFL_PARAMETRI_ANNO = 2;
  private static int PFL_PARAMETRI_NUMERODAL = 3;
  private static int PFL_PARAMETRI_NUMEROAL = 4;
  private static int PFL_PARAMETRI_PROGUNITORGA = 5;
  private static int PFL_PARAMETRI_IMPEGNOLABEL = 6;
  private static int PFL_PARAMETRI_NUMEROIMP1 = 7;
  private static int PFL_PARAMETRI_BARRAIMPEGNO = 8;
  private static int PFL_PARAMETRI_ANNOIMP1 = 9;
  private static int PFL_PARAMETRI_SCELTAIMPEGN = 10;
  private static int PFL_PARAMETRI_SUBIMPEGLABE = 11;
  private static int PFL_PARAMETRI_NUMEROSUBIM1 = 12;
  private static int PFL_PARAMETRI_BARRASUBIMPE = 13;
  private static int PFL_PARAMETRI_ANNOSUBIMP2 = 14;
  private static int PFL_PARAMETRI_SCELTSUBIMPE = 15;
  private static int PFL_PARAMETRI_CAPITOLLABEL = 16;
  private static int PFL_PARAMETRI_CAPITOLO = 17;
  private static int PFL_PARAMETRI_BARRACAPITOL = 18;
  private static int PFL_PARAMETRI_ARTICOLO = 19;
  private static int PFL_PARAMETRI_SCELTVOCEPEG = 20;

  private static int PPQRY_PARAMETRI154 = 0;

  private static int PPQRY_CF4WEBSTRUTT = 1;


  IDPanel PAN_PARAMETRI;
  private static int GRP_ELENBUONAPER_ORDINE = 0;
  private static int GRP_ELENBUONAPER_DETTAGLIO = 1;

  private static int PFL_ELENBUONAPER_NUMEROBUONO = 0;
  private static int PFL_ELENBUONAPER_ANNOBUONO = 1;
  private static int PFL_ELENBUONAPER_DATAEMBUONO = 2;
  private static int PFL_ELENBUONAPER_INFOORDINE = 3;
  private static int PFL_ELENBUONAPER_PROGRESBUONO = 4;
  private static int PFL_ELENBUONAPER_CATEGOPRODOT = 5;
  private static int PFL_ELENBUONAPER_DESCRIZIONE = 6;
  private static int PFL_ELENBUONAPER_IMPORTO1 = 7;
  private static int PFL_ELENBUONAPER_FATTURATO = 8;
  private static int PFL_ELENBUONAPER_RESIDUO = 9;
  private static int PFL_ELENBUONAPER_IMPORTO = 10;
  private static int PFL_ELENBUONAPER_CHIUSO = 11;

  private static int PPQRY_DETTAGLBUON6 = 0;

  private static int PPQRY_DUAL = 1;
  private static int PPQRY_IMPORTO = 2;
  private static int PPQRY_FATTURATO = 3;
  private static int PPQRY_RESIDUO = 4;

  private static int PPQRY_CATEGPRODOOD = 5;


  IDPanel PAN_ELENBUONAPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI1(IMDB);
    //
    //
    Init_PQRY_PARAMETRI154(IMDB);
    Init_PQRY_PARAMETRI154_RS(IMDB);
    Init_PQRY_DETTAGLBUON6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI1, 21);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI1, "TBL_PARAMETRI1");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMDATDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMDADAOL, "ROWNAMDADAOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMDADAOL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMEDATAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMDAALOL, "ROWNAMDAALOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMDAALOL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMDAL, "ROWNAMNUMDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMDAL,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUDAOL, "ROWNAMNUDAOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUDAOL,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMENUMAL, "ROWNAMENUMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMENUMAL,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUALOL, "ROWNAMNUALOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUALOL,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUIMOL, "ROWNAMNUIMOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUIMOL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANIMOL, "ROWNAMANIMOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANIMOL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUSUIM, "ROWNAMNUSUIM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMNUSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_RONANUSUIMOL, "RONANUSUIMOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_RONANUSUIMOL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANSUIM, "ROWNAMANSUIM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANSUIM,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_RONAANSUIMOL, "RONAANSUIMOL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_RONAANSUIMOL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMECAPIT,2,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMPRUNOR, "ROWNAMPRUNOR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANNVAR, "ROWNAMANNVAR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI1,IMDBDef5.FLD_PARAMETRI1_ROWNAMANNVAR,1,4,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI1, 0);
  }

  private static void Init_PQRY_PARAMETRI154(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI154, 12);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI154, "PQRY_PARAMETRI154");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, "ROWNAMANSUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, "ROWNAMNUSUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMECAPIT,2,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMDAL, "ROWNAMNUMDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMDAL,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMENUMAL, "ROWNAMENUMAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMENUMAL,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMPRUNOR, "ROWNAMPRUNOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154,IMDBDef14.PQSL_PARAMETRI154_ROWNAMPRUNOR,1,8,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI154, 0);
  }

  private static void Init_PQRY_PARAMETRI154_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI154_RS, 12);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI154_RS, "PQRY_PARAMETRI154_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, "ROWNAMANSUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, "ROWNAMNUSUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMECAPIT,2,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMDAL, "ROWNAMNUMDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMDAL,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMENUMAL, "ROWNAMENUMAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMENUMAL,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMPRUNOR, "ROWNAMPRUNOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI154_RS,IMDBDef14.PQSL_PARAMETRI154_ROWNAMPRUNOR,1,8,0);
  }

  private static void Init_PQRY_DETTAGLBUON6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_DETTAGLBUON6, 8);
    IMDB.set_TblCode(IMDBDef14.PQRY_DETTAGLBUON6, "PQRY_DETTAGLBUON6");
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUOANNBUO, "DETBUOANNBUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUOANNBUO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUONUMBUO, "DETBUONUMBUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUONUMBUO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUODAEMBU, "DETBUODAEMBU");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUODAEMBU,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUOPROBUO, "DETBUOPROBUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUOPROBUO,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETTBUONCHIU, "DETTBUONCHIU");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETTBUONCHIU,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUOCATPRO, "DETBUOCATPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETBUOCATPRO,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETTBUONDESC, "DETTBUONDESC");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETTBUONDESC,5,2000,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETTBUONIMPO, "DETTBUONIMPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_DETTAGLBUON6,IMDBDef14.PQSL_DETTAGLBUON6_DETTBUONIMPO,3,14,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_DETTAGLBUON6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ChiusuraOrdini(MyWebEntryPoint w, IMDBObj imdb)
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
  public ChiusuraOrdini()
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
    FormIdx = MyGlb.FRM_CHIUSUORDINI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F536782C-1195-4D74-A1EF-5A4F0D6CCDB9";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 940;
    DesignHeight = 510;
    set_Caption(new IDVariant("Chiusura Ordini"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 940;
    Frames[1].Height = 484;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.214876;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 940;
    Frames[2].Height = 104;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 940;
    Frames[2].FixedHeight = 104;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 940-MyGlb.PAN_OFFS_X, 104-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9F4EAEAB-F97F-48A1-B6D2-0394002787A7");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 940;
    Frames[3].Height = 380;
    Frames[3].Caption = "Elenco Buoni Aperti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 380;
    PAN_ELENBUONAPER = new IDPanel(w, this, 3, "PAN_ELENBUONAPER");
    Frames[3].Content = PAN_ELENBUONAPER;
    PAN_ELENBUONAPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENBUONAPER.VS = MainFrm.VisualStyleList;
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 940-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C6D2C8D8-6E70-4A40-81B5-79B304CF9146");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 892, 296, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENBUONAPER.InitStatus = 1;
    PAN_ELENBUONAPER_Init();
    PAN_ELENBUONAPER_InitFields();
    PAN_ELENBUONAPER_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI22+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGIU3+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI22+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUMASSORDI+BaseCmdLinIdx)
      {
        ChiusuraMassivaOrdini();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CHIUSUORDINI_PARAMETRI154();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_ELENBUONAPER.UpdatePanel(MainFrm);
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
    return (obj instanceof ChiusuraOrdini);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ChiusuraOrdini.class.getName() : (Glb.ClassWithPackage(ChiusuraOrdini.class) ? ChiusuraOrdini.class.getName().substring(ChiusuraOrdini.class.getPackage().getName().length() + 1) : ChiusuraOrdini.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDATDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDADAOL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMEDATAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDAALOL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMPRUNOR, 0, (new IDVariant(-1)));
      PAN_ELENBUONAPER.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENBUONAPER.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "Load", _e);
    }
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
    int CurPos=0;
    IDCachedRowSet C9;

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTIMPEGUT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_ANNO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_SUBIMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMECAPIT, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0),IDVariant.FLOAT));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMECAPIT, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0),IDVariant.FLOAT));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_CHIUMASSORDI)), true) && Result.booleanValue())
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant I = null;
        I = (new IDVariant(1));
        C9 = PAN_ELENBUONAPER.MasterRS();
        if (C9.size()>0) CurPos = C9.getRow(); else CurPos = 0;
        if (!C9.Bof()) PAN_ELENBUONAPER.GotoFirst();
        while (!PAN_ELENBUONAPER.RSEOF())
        {
          if (PAN_ELENBUONAPER.IsRowSelected(I.intValue()))
          {
            v_SELEZIONATO = (new IDVariant(-1));
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.CHIUSURADETTAGLIOORDINE(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANNVAR, 0), C9.Get("DETBUOANNBUO"), C9.Get("DETBUONUMBUO"), C9.Get("DETBUOPROBUO"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.Cf4armDBObject.RollbackTrans();
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              return;
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI562, IMDBDef14.PQSL_PARAMETRI562_PARCHIUORDCF, 0).equals((new IDVariant("SI")), true))
            {
              MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
              MainFrm.Cf4armDBObject.CHIUSURADETTAGLIOORDINECF4(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), C9.Get("DETBUOANNBUO"), C9.Get("DETBUONUMBUO"), C9.Get("DETBUOPROBUO"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                MainFrm.Cf4armDBObject.RollbackTrans();
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                return;
              }
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ELENBUONAPER.GotoNext();
        }
        if (CurPos>0) C9.absolute(CurPos);
        MainFrm.Cf4armDBObject.CommitTrans();
        if (v_SELEZIONATO.booleanValue())
        {
          IDVariant v_CONFERMA = new IDVariant(0,IDVariant.STRING);
          v_CONFERMA = (new IDVariant("Elaborazione eseguita"));
          MainFrm.set_AlertMessage(v_CONFERMA); 
          PAN_ELENBUONAPER.PanelCommand(Glb.PCM_REQUERY);
        }
        else
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Non è stato selezionato nessun dettagli ordine"));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "EndModal", _e);
    }
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PROGUNITORGA)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMPRUNOR, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMPRUNOR, 0, (new IDVariant(-1)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODAL)), true)) || (Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROAL)), true)))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMDAL, 0),(new IDVariant(0))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUDAOL, 0),(new IDVariant(0))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMENUMAL, 0),(new IDVariant(0))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUALOL, 0),(new IDVariant(0))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMDAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMENUMAL, 0))))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDADAOL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDAALOL, 0, (new IDVariant()));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDADAOL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDAALOL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DAL1)), true)) || (Column.equals((new IDVariant(PFL_PARAMETRI_AL2)), true)))
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDADAOL, 0), true)!=0 || IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDAALOL, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMDATDAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMEDATAL, 0))))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMDAL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUDAOL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMENUMAL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUALOL, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_ANNOIMP1)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROIMP1)), true)) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANIMOL, 0), true)!=0 || IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUIMOL, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUIMOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANIMOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP, 0));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_ANNOSUBIMP2)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROSUBIM1)), true)) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_RONAANSUIMOL, 0), true)!=0 || IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_RONANUSUIMOL, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, 0))))
          {
            IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.ANNO_IMP as SUBIMANNOIMP, ");
            SQL.append("  A.NUMERO_IMP as SUBIMNUMEIMP ");
            SQL.append("from ");
            SQL.append("  SUBIMP A ");
            SQL.append("where (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_ANNOIMP = QV.Get("SUBIMANNOIMP", IDVariant.INTEGER) ;
              v_NUMEROIMP = QV.Get("SUBIMNUMEIMP", IDVariant.INTEGER) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUMIMP, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANNIMP, 0, new IDVariant(v_ANNOIMP));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUIMOL, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANIMOL, 0, new IDVariant(v_ANNOIMP));
          }
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_RONANUSUIMOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMNUSUIM, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_RONAANSUIMOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI154, IMDBDef14.PQSL_PARAMETRI154_ROWNAMANSUIM, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Elenco Buoni Aperti On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENBUONAPER_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENBUONAPER);
      // 
      // Elenco Buoni Aperti On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ELENBUONAPER.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENBUONAPER_CATEGOPRODOT,(new IDVariant(PAN_ELENBUONAPER.FieldText(PFL_ELENBUONAPER_CATEGOPRODOT))).stringValue()); 
      PAN_ELENBUONAPER.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENBUONAPER_DESCRIZIONE,(new IDVariant(PAN_ELENBUONAPER.FieldText(PFL_ELENBUONAPER_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "ElencoBuoniApertiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Elenco Buoni Aperti On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_ELENBUONAPER_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Buoni Aperti On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_ELENBUONAPER.Status()).equals((new IDVariant(1)), true))
      {
        PAN_ELENBUONAPER.Freezed = (new IDVariant(-1)).booleanValue();
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET10+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_ELENBUONAPER.Freezed = (new IDVariant(0)).booleanValue();
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET10+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "ElencoBuoniApertiOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Selezione Impegno Parametri
  // **********************************************************************
  public int SelezioneImpegnoParametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Impegno Parametri Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI680, IMDBDef1.FLD_PARAMETRI680_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_SCELTIMPEGUT, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "SelezioneImpegnoParametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Sub Impegno Parametri
  // **********************************************************************
  public int SelezioneSubImpegnoParametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Sub Impegno Parametri Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_SCELSUBIMPUT, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "SelezioneSubImpegnoParametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Capitolo
  // **********************************************************************
  public int SelezionaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Capitolo Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
        MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "SelezionaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Ordine
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoOrdine ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Ordine Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_ANNO_BUONO, 0, IMDB.Value(IMDBDef14.PQRY_DETTAGLBUON6, IMDBDef14.PQSL_DETTAGLBUON6_DETBUOANNBUO, 0));
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_NUMERO_BUONO, 0, IMDB.Value(IMDBDef14.PQRY_DETTAGLBUON6, IMDBDef14.PQSL_DETTAGLBUON6_DETBUONUMBUO, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "InfoOrdine", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Chiusura Massiva Ordini
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ChiusuraMassivaOrdini ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Chiusura Massiva Ordini Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI157, IMDBDef5.FLD_PARAMETRI157_PARANNOVARIA, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANNVAR, 0));
      MainFrm.Show(MyGlb.FRM_CHIUMASSORDI, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraOrdini", "ChiusuraMassivaOrdini", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void CHIUSUORDINI_PARAMETRI154() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI154_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI1, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI154_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI154_RS, 0, IMDBDef5.TBL_PARAMETRI1, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 0, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMEANNO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 1, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDATDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 2, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMEDATAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 3, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANNIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 4, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 5, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANSUIM, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 6, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUSUIM, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 7, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 8, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 9, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 10, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMENUMAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI154_RS, 11, 0, IMDBDef5.TBL_PARAMETRI1, IMDBDef5.FLD_PARAMETRI1_ROWNAMPRUNOR, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI1, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI154_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneImpegnoParametri();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELTSUBIMPE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneSubImpegnoParametri();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELTVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
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
  private void PAN_ELENBUONAPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENBUONAPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENBUONAPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENBUONAPER, Cancel);
    // Stub
  }

  private void PAN_ELENBUONAPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENBUONAPER_INFOORDINE)
    {
      this.IdxPanelActived = this.PAN_ELENBUONAPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOrdine();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENBUONAPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENBUONAPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENBUONAPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "4003C5DB-D84C-4E31-9E20-AB2AD24B768B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_LIST, 40, -9999, 136, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_FORM, 36, 11, 228, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 27);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "15067983-6B25-4705-A389-086E1C76EA88");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "Numero");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 0, -9999, 56, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 268, 11, 240, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 44);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "82BA7AD9-C054-4945-98F4-F6937F94D0C3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "4B36713A-DEB8-4C84-8BCF-2EA9B7368992");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, "771B9A32-F04F-41AA-85C8-89219F30BE65");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, "Anno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, "690F72C1-9560-4143-8C7F-4694DBFEA8B8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, "da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, "ED387BEE-EB03-4C25-95B2-C6C420B5D67B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, "a");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, "EABB6425-A04D-46C5-A2CC-FC8A0E4A1747");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, "Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, "12BED482-878D-454B-B20A-78117427C8C0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, "Impegno");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, "3A141CF4-05A5-467D-91D4-F904197861EB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, "Numero Imp");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, "2A4C77C4-CDE0-499A-904B-44EE073588DE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, "EAF7A29B-A7F8-4E1A-8A82-1D0FB818BDE8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, "Anno Imp");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, "CB734B41-4BD1-4F4E-AD5A-44E477CF2D9A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, "67A83BED-8512-4EDB-8355-FDF7DD0A6517");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, "Sub-Impegno");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, "833B6D89-F75B-4699-AC53-1B0B8AE56E7F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, "Numero Sub Imp");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, "AF865F28-ECDB-4158-B6F1-B355414F6D2D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, "0331EDED-A5F0-42FF-B3C5-E3A631C28431");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, "Anno Sub Imp");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, "45B8541C-5D85-4ABC-B9A2-53086F92D616");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, "9AE9F717-1DE6-4A90-9C3C-146DDE7A524E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, "Capitolo");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "E1BF4260-9C7D-4588-8D76-0B6580C0D689");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "Capitolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, "76268CA5-EDF8-4DD7-88C6-5ABD02B924E8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "44A211FF-6412-481E-A158-9FA1B9205A25");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "Articolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, "1C1D9442-C00C-4B63-9C17-0A956750287B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 40, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 40, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI154, "A.ROWNAMDATDAL", "ROWNAMDATDAL", 6, 14, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 112, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, "al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 156, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, "al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL2, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL2, PPQRY_PARAMETRI154, "A.ROWNAMEDATAL", "ROWNAMEDATAL", 6, 14, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, 272, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNO, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNO, PPQRY_PARAMETRI154, "A.ROWNAMEANNO", "ROWNAMEANNO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_LIST, "da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_FORM, 352, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODAL, MyGlb.PANEL_FORM, "da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODAL, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODAL, PPQRY_PARAMETRI154, "A.ROWNAMNUMDAL", "ROWNAMNUMDAL", 1, 9, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_LIST, "a");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_FORM, 432, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROAL, MyGlb.PANEL_FORM, "a");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROAL, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROAL, PPQRY_PARAMETRI154, "A.ROWNAMENUMAL", "ROWNAMENUMAL", 1, 9, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_LIST, 148);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_FORM, 520, 36, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_FORM, 148);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGUNITORGA, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROGUNITORGA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROGUNITORGA, PPQRY_PARAMETRI154, "A.ROWNAMPRUNOR", "ROWNAMPRUNOR", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 20, 140, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 8, 68, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPEGNOLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_LIST, "Numero Imp");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_FORM, 72, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROIMP1, MyGlb.PANEL_FORM, "Num. I.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROIMP1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROIMP1, PPQRY_PARAMETRI154, "A.ROWNAMNUMIMP", "ROWNAMNUMIMP", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 184, 152, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 116, 68, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRAIMPEGNO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRAIMPEGNO, -1, "", "BARRAIMPEGNO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_LIST, "Anno Imp");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_FORM, 136, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_FORM, 12);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOIMP1, MyGlb.PANEL_FORM, "A. I.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOIMP1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOIMP1, PPQRY_PARAMETRI154, "A.ROWNAMANNIMP", "ROWNAMANNIMP", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 700, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 180, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELTAIMPEGN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 28, 148, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 200, 68, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUBIMPEGLABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_LIST, "Numero Sub Imp");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_FORM, 292, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROSUBIM1, MyGlb.PANEL_FORM, "Num. S. Im.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROSUBIM1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROSUBIM1, PPQRY_PARAMETRI154, "A.ROWNAMNUSUIM", "ROWNAMNUSUIM", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, MyGlb.PANEL_LIST, 192, 160, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, MyGlb.PANEL_FORM, 336, 68, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRASUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRASUBIMPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRASUBIMPE, -1, "", "BARRASUBIMPE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_LIST, "Anno Sub Imp");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_FORM, 356, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_FORM, 12);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOSUBIMP2, MyGlb.PANEL_FORM, "A. S. I.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOSUBIMP2, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOSUBIMP2, PPQRY_PARAMETRI154, "A.ROWNAMANSUIM", "ROWNAMANSUIM", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, MyGlb.PANEL_LIST, 708, 48, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, MyGlb.PANEL_FORM, 400, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELTSUBIMPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELTSUBIMPE, -1, "", "SCELTSUBIMPE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, MyGlb.PANEL_LIST, 12, 132, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, MyGlb.PANEL_FORM, 432, 68, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLLABEL, -1, "", "CAPITOLLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, "Capit.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 504, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 12);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, "C.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLO, PPQRY_PARAMETRI154, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 2, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_LIST, 176, 144, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_FORM, 632, 68, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRACAPITOL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRACAPITOL, -1, "", "BARRACAPITOL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, "Artic.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 652, 68, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 12);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, "A.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTICOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTICOLO, PPQRY_PARAMETRI154, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, MyGlb.PANEL_LIST, 716, 56, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, MyGlb.PANEL_FORM, 688, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELTVOCEPEG, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELTVOCEPEG, -1, "", "SCELTVOCEPEG", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.PROGRESSIVO as CF4WSTRUPROG, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as CF4WSTRUDESC ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~ROWNAMPRUNOR~~) ");
    SQL.append("and   (A.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte le UO di competenza' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (-1 = ~~ROWNAMPRUNOR~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CF4WEBSTRUTT, 0, SQL, PFL_PARAMETRI_PROGUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.PROGRESSIVO as CF4WSTRUPROG, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as CF4WSTRUDESC ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte le UO di competenza' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    PAN_PARAMETRI.SetQuery(PPQRY_CF4WEBSTRUTT, 1, SQL, PFL_PARAMETRI_PROGUNITORGA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CF4WEBSTRUTT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI154", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI154, IMDBDef14.PQRY_PARAMETRI154_RS, IMDBDef5.TBL_PARAMETRI1);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef5.FLD_PARAMETRI1_ROWNAMDATDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL2, IMDBDef5.FLD_PARAMETRI1_ROWNAMEDATAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNO, IMDBDef5.FLD_PARAMETRI1_ROWNAMEANNO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODAL, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROAL, IMDBDef5.FLD_PARAMETRI1_ROWNAMENUMAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROGUNITORGA, IMDBDef5.FLD_PARAMETRI1_ROWNAMPRUNOR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROIMP1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUMIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOIMP1, IMDBDef5.FLD_PARAMETRI1_ROWNAMANNIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROSUBIM1, IMDBDef5.FLD_PARAMETRI1_ROWNAMNUSUIM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOSUBIMP2, IMDBDef5.FLD_PARAMETRI1_ROWNAMANSUIM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOLO, IMDBDef5.FLD_PARAMETRI1_ROWNAMECAPIT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ARTICOLO, IMDBDef5.FLD_PARAMETRI1_ROWNAMEARTIC);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI1");
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

  private void PAN_ELENBUONAPER_Init()
  {

    PAN_ELENBUONAPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENBUONAPER.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, "7EDED8E3-E90C-43EB-AB45-98F9940091E0");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, "Ordine");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, MyGlb.PANEL_LIST, 0, -9999, 180, 16, 0, 0);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, MyGlb.PANEL_FORM, 0, -21, 328, 385, 0, 0);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, 0, 37);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, 1, 13);
    PAN_ELENBUONAPER.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, 0, 4);
    PAN_ELENBUONAPER.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, 1, 4);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_ORDINE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, "90C3FB02-EBEC-4349-A022-B6B4F0327F94");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, "Dettaglio");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, MyGlb.PANEL_LIST, 180, -9999, 712, 16, 0, 0);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, MyGlb.PANEL_FORM, 0, -21, 528, 457, 0, 0);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, 0, 52);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, 1, 13);
    PAN_ELENBUONAPER.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, 0, 4);
    PAN_ELENBUONAPER.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, 1, 4);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENBUONAPER_DETTAGLIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENBUONAPER.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, "5E4366EA-A9CB-4A17-B5CD-9B59E7B911D5");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, "Numero");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, "77B0D2B2-2F71-4845-A8A1-095E3C53B776");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, "Anno");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, "37F2925E-BA24-4A1F-A9B0-C01A1383B68F");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, "Data");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, "1DFDA6E7-D51A-4A85-948B-6538CC88CAA9");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, " ");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, "35A5880C-5338-493D-9D6A-5D1BBCC80FAA");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, "Progr. ");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, "D9336A98-9F00-47C2-9C99-4AC54D996435");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, "Categoria/Prodotto");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, "1BD5974A-6FF1-4E7F-B1F5-701101E92BE1");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, "Descrizione");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, "BFDFA908-0504-4E91-8B66-BC9A1D8F0425");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, "Importo");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, "6FDE7D01-C13C-4DF0-B82F-434A90B245C6");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, "Fatturato");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, "4B1FE61E-67DE-46A7-86EB-CF6B7AB78D0C");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, "Residuo");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, "393BB491-9FAC-4588-8E0D-C7448BAB9BEC");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, "Importo");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENBUONAPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, "48389167-CD50-4E4E-9D7B-F49781CDEEC5");
    PAN_ELENBUONAPER.set_Header(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, "Chiuso");
    PAN_ELENBUONAPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, "");
    PAN_ELENBUONAPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENBUONAPER.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENBUONAPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_LIST, 96);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_FORM, 172, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_FORM, 112);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_NUMEROBUONO, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_NUMEROBUONO, -1, GRP_ELENBUONAPER_ORDINE);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_NUMEROBUONO, PPQRY_DETTAGLBUON6, "B.NUMERO_BUONO", "DETBUONUMBUO", 1, 6, 0, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_LIST, 52, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_LIST, 80);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_FORM, 96);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_ANNOBUONO, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_ANNOBUONO, -1, GRP_ELENBUONAPER_ORDINE);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_ANNOBUONO, PPQRY_DETTAGLBUON6, "B.ANNO_BUONO", "DETBUOANNBUO", 1, 4, 0, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_LIST, 92, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_LIST, 100);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_LIST, "Data");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_FORM, 100);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DATAEMBUONO, MyGlb.PANEL_FORM, "Data");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_DATAEMBUONO, -1, GRP_ELENBUONAPER_ORDINE);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_DATAEMBUONO, PPQRY_DETTAGLBUON6, "A.DATA_EM_BUONO", "DETBUODAEMBU", 6, 19, 0, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_LIST, 160, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_LIST, 104);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_LIST, " ");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_FORM, 4, 340, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_FORM, 104);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_INFOORDINE, MyGlb.PANEL_FORM, " ");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_INFOORDINE, -1, GRP_ELENBUONAPER_ORDINE);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_INFOORDINE, PPQRY_DUAL, "'I'", "INFOORDINE", 5, 1, 0, -13997);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_INFOORDINE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_LIST, 180, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_LIST, 128);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_LIST, "Progr. ");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_FORM, 332, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_FORM, 144);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_PROGRESBUONO, MyGlb.PANEL_FORM, "Progr. ");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_PROGRESBUONO, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_PROGRESBUONO, PPQRY_DETTAGLBUON6, "B.PROGRESSIVO_BUONO", "DETBUOPROBUO", 1, 3, 0, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_LIST, 228, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_LIST, 120);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_LIST, "Categoria/Prodotto");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_FORM, 4, 244, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_FORM, 140);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CATEGOPRODOT, MyGlb.PANEL_FORM, "Categoria/Prodotto");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_CATEGOPRODOT, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_CATEGOPRODOT, PPQRY_DETTAGLBUON6, "B.CATEGORIA_PRODOTTO", "DETBUOCATPRO", 5, 10, 0, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_LIST, 368, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 268, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_DESCRIZIONE, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_DESCRIZIONE, PPQRY_DETTAGLBUON6, "B.DESCRIZIONE", "DETTBUONDESC", 5, 2000, 0, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_LIST, 508, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_LIST, 204);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_FORM, 4, 364, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_FORM, 204);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_IMPORTO1, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_IMPORTO1, PPQRY_IMPORTO, "~~DETTBUONIMPO~~ + NVL(SUM(A.VARIAZIONI), 0)", "IMPORTO", 3, 28, 6, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_LIST, 620, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_LIST, 212);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_LIST, "Fatturato");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_FORM, 4, 388, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_FORM, 212);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_FATTURATO, MyGlb.PANEL_FORM, "Fatturato");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_FATTURATO, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_FATTURATO, PPQRY_FATTURATO, "DECODE(~~DETBUOANNBUO~~, to_number(NULL), to_number(NULL), NVL(SUM(A.FATTURATO), 0))", "FATTURATO", 3, 28, 6, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_LIST, 732, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_LIST, 200);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_LIST, "Residuo");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_FORM, 4, 412, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_FORM, 200);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_RESIDUO, MyGlb.PANEL_FORM, "Residuo");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_RESIDUO, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_RESIDUO, PPQRY_RESIDUO, "~~DETTBUONIMPO~~ + NVL(SUM(A.VARIAZIONI), 0) - NVL(SUM(A.FATTURATO), 0)", "RESIDUO", 3, 28, 6, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_LIST, 712, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_FORM, 4, 316, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_IMPORTO, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_IMPORTO, PPQRY_DETTAGLBUON6, "B.IMPORTO", "DETTBUONIMPO", 3, 14, 2, -13997);
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_LIST, 844, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_LIST, 52);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_LIST, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_LIST, "Chiuso");
    PAN_ELENBUONAPER.SetRect(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENBUONAPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_FORM, 96);
    PAN_ELENBUONAPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_FORM, 1);
    PAN_ELENBUONAPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENBUONAPER_CHIUSO, MyGlb.PANEL_FORM, "Chiuso");
    PAN_ELENBUONAPER.SetFieldPage(PFL_ELENBUONAPER_CHIUSO, -1, GRP_ELENBUONAPER_DETTAGLIO);
    PAN_ELENBUONAPER.SetFieldPanel(PFL_ELENBUONAPER_CHIUSO, PPQRY_DETTAGLBUON6, "B.CHIUSO", "DETTBUONCHIU", 5, 2, 0, -13997);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_CHIUSO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENBUONAPER.SetValueListItem(PFL_ELENBUONAPER_CHIUSO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_ELENBUONAPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENBUONAPER.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOORDINE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~DETBUONUMBUO~~ IS NULL))) ");
    SQL.append("and   (NOT ((~~DETBUOANNBUO~~ IS NULL))) ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_ELENBUONAPER.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENBUONAPER.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~DETTBUONIMPO~~ + NVL(SUM(A.VARIAZIONI), 0) as IMPORTO ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI A ");
    SQL.append("where (A.ANNO_BUONO = ~~DETBUOANNBUO~~) ");
    SQL.append("and   (A.NUMERO_BUONO = ~~DETBUONUMBUO~~) ");
    SQL.append("and   (A.PROGRESSIVO_BUONO = ~~DETBUOPROBUO~~) ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_IMPORTO, 0, SQL, -1, "");
    PAN_ELENBUONAPER.SetQueryDB(PPQRY_IMPORTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENBUONAPER.SetMasterTable(PPQRY_IMPORTO, "DETTAGLI_IMPEGNI_BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~DETBUOANNBUO~~, to_number(NULL), to_number(NULL), NVL(SUM(A.FATTURATO), 0)) as FATTURATO ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI A ");
    SQL.append("where (A.ANNO_BUONO = ~~DETBUOANNBUO~~) ");
    SQL.append("and   (A.NUMERO_BUONO = ~~DETBUONUMBUO~~) ");
    SQL.append("and   (A.PROGRESSIVO_BUONO = ~~DETBUOPROBUO~~) ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_FATTURATO, 0, SQL, -1, "");
    PAN_ELENBUONAPER.SetQueryDB(PPQRY_FATTURATO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENBUONAPER.SetMasterTable(PPQRY_FATTURATO, "DETTAGLI_IMPEGNI_BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~DETTBUONIMPO~~ + NVL(SUM(A.VARIAZIONI), 0) - NVL(SUM(A.FATTURATO), 0) as RESIDUO ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI A ");
    SQL.append("where (A.ANNO_BUONO = ~~DETBUOANNBUO~~) ");
    SQL.append("and   (A.NUMERO_BUONO = ~~DETBUONUMBUO~~) ");
    SQL.append("and   (A.PROGRESSIVO_BUONO = ~~DETBUOPROBUO~~) ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_RESIDUO, 0, SQL, -1, "");
    PAN_ELENBUONAPER.SetQueryDB(PPQRY_RESIDUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENBUONAPER.SetMasterTable(PPQRY_RESIDUO, "DETTAGLI_IMPEGNI_BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CATEPROODCOD, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_PRODOTTI_OD A ");
    SQL.append("where (A.CODICE = ~~DETBUOCATPRO~~) ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_CATEGPRODOOD, 0, SQL, PFL_ELENBUONAPER_CATEGOPRODOT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CATEPROODCOD, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_PRODOTTI_OD A ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_CATEGPRODOOD, 1, SQL, PFL_ELENBUONAPER_CATEGOPRODOT, "");
    PAN_ELENBUONAPER.SetQueryDB(PPQRY_CATEGPRODOOD, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENBUONAPER.SetIMDB(IMDB, "PQRY_DETTAGLBUON6", true);
    PAN_ELENBUONAPER.set_SetString(MyGlb.MASTER_ROWNAME, "DETTAGLI BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.ANNO_BUONO as DETBUOANNBUO, ");
    SQL.append("  B.NUMERO_BUONO as DETBUONUMBUO, ");
    SQL.append("  A.DATA_EM_BUONO as DETBUODAEMBU, ");
    SQL.append("  B.PROGRESSIVO_BUONO as DETBUOPROBUO, ");
    SQL.append("  B.CHIUSO as DETTBUONCHIU, ");
    SQL.append("  B.CATEGORIA_PRODOTTO as DETBUOCATPRO, ");
    SQL.append("  B.DESCRIZIONE as DETTBUONDESC, ");
    SQL.append("  B.IMPORTO as DETTBUONIMPO ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_DETTAGLBUON6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BUONI A, ");
    SQL.append("  DETTAGLI_BUONI B ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_DETTAGLBUON6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_BUONO = A.ANNO_BUONO) ");
    SQL.append("and   (B.NUMERO_BUONO = A.NUMERO_BUONO) ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' OR (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) OR A.PROGR_UNITA_ORGANIZZATIVA IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA C ");
    SQL.append("where (C.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (C.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = DECODE(~~PQRY_PARAMETRI154.ROWNAMPRUNOR~~, -1, C.PROGR_UNITA_ORGANIZZATIVA, ~~PQRY_PARAMETRI154.ROWNAMPRUNOR~~)) ");
    SQL.append(")) ");
    SQL.append("and   (NVL(B.CHIUSO, 'NO') <> 'SI') ");
    SQL.append("and   (B.IMPORTO > NVL(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(D.FATTURATO), 0) - NVL(SUM(D.VARIAZIONI), 0) ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI D ");
    SQL.append("where (D.PROGRESSIVO_BUONO = B.PROGRESSIVO_BUONO) ");
    SQL.append("and   (D.NUMERO_BUONO = B.NUMERO_BUONO) ");
    SQL.append("and   (D.ANNO_BUONO = B.ANNO_BUONO) ");
    SQL.append("), 0)) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  E.NUMERO_BUONO ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI E, ");
    SQL.append("  IMP F ");
    SQL.append("where (E.ANNO_BUONO = B.ANNO_BUONO) ");
    SQL.append("and   (E.NUMERO_BUONO = B.NUMERO_BUONO) ");
    SQL.append("and   (E.PROGRESSIVO_BUONO = B.PROGRESSIVO_BUONO) ");
    SQL.append("and   (F.NUMERO_IMP = E.NUMERO_IMP) ");
    SQL.append("and   (F.ANNO_IMP = E.ANNO_IMP) ");
    SQL.append("and   (F.CAPITOLO = NVL(~~PQRY_PARAMETRI154.ROWNAMECAPIT~~, F.CAPITOLO)) ");
    SQL.append("and   (F.ARTICOLO = NVL(~~PQRY_PARAMETRI154.ROWNAMEARTIC~~, F.ARTICOLO)) ");
    SQL.append("and   (E.ANNO_IMP = NVL(~~PQRY_PARAMETRI154.ROWNAMANNIMP~~, E.ANNO_IMP)) ");
    SQL.append("and   (E.NUMERO_IMP = NVL(~~PQRY_PARAMETRI154.ROWNAMNUMIMP~~, E.NUMERO_IMP)) ");
    SQL.append("and   (NVL(E.ANNO_SUBIMP, -1) = NVL(~~PQRY_PARAMETRI154.ROWNAMANSUIM~~, NVL(E.ANNO_SUBIMP, -1))) ");
    SQL.append("and   (NVL(E.NUMERO_SUBIMP, -1) = NVL(~~PQRY_PARAMETRI154.ROWNAMNUSUIM~~, NVL(E.NUMERO_SUBIMP, -1))) ");
    SQL.append(")) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  G.NUMERO_BUONO ");
    SQL.append("from ");
    SQL.append("  DETTAGLI_IMPEGNI_BUONI G, ");
    SQL.append("  SUBIMP H ");
    SQL.append("where (G.ANNO_BUONO = B.ANNO_BUONO) ");
    SQL.append("and   (G.NUMERO_BUONO = B.NUMERO_BUONO) ");
    SQL.append("and   (G.PROGRESSIVO_BUONO = B.PROGRESSIVO_BUONO) ");
    SQL.append("and   (H.NUMERO_SUBIMP = G.NUMERO_SUBIMP) ");
    SQL.append("and   (H.ANNO_SUBIMP = G.ANNO_SUBIMP) ");
    SQL.append("and   (H.CAPITOLO = NVL(~~PQRY_PARAMETRI154.ROWNAMECAPIT~~, H.CAPITOLO)) ");
    SQL.append("and   (H.ARTICOLO = NVL(~~PQRY_PARAMETRI154.ROWNAMEARTIC~~, H.ARTICOLO)) ");
    SQL.append("and   (NVL(G.ANNO_IMP, -1) = NVL(~~PQRY_PARAMETRI154.ROWNAMANNIMP~~, G.ANNO_IMP)) ");
    SQL.append("and   (NVL(G.NUMERO_IMP, -1) = NVL(~~PQRY_PARAMETRI154.ROWNAMNUMIMP~~, G.NUMERO_IMP)) ");
    SQL.append("and   (G.ANNO_SUBIMP = NVL(~~PQRY_PARAMETRI154.ROWNAMANSUIM~~, G.ANNO_SUBIMP)) ");
    SQL.append("and   (G.NUMERO_SUBIMP = NVL(~~PQRY_PARAMETRI154.ROWNAMNUSUIM~~, G.NUMERO_SUBIMP)) ");
    SQL.append("))) ");
    SQL.append("and   ((A.NUMERO_BUONO BETWEEN NVL(~~PQRY_PARAMETRI154.ROWNAMNUMDAL~~, 0) AND NVL(~~PQRY_PARAMETRI154.ROWNAMENUMAL~~, 999999))) ");
    SQL.append("and   ((A.DATA_EM_BUONO BETWEEN DECODE(~~PQRY_PARAMETRI154.ROWNAMDATDAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMETRI154.ROWNAMDATDAL~~) AND DECODE(~~PQRY_PARAMETRI154.ROWNAMEDATAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~PQRY_PARAMETRI154.ROWNAMEDATAL~~))) ");
    SQL.append("and   (A.ANNO_BUONO = NVL(~~PQRY_PARAMETRI154.ROWNAMEANNO~~, A.ANNO_BUONO)) ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_DETTAGLBUON6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENBUONAPER.SetQuery(PPQRY_DETTAGLBUON6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENBUONAPER.SetQuery(PPQRY_DETTAGLBUON6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_BUONO, ");
    SQL.append("  B.NUMERO_BUONO, ");
    SQL.append("  B.PROGRESSIVO_BUONO ");
    PAN_ELENBUONAPER.SetQuery(PPQRY_DETTAGLBUON6, 5, SQL, -1, "");
    PAN_ELENBUONAPER.SetQueryDB(PPQRY_DETTAGLBUON6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENBUONAPER.SetMasterTable(0, "BUONI");
    PAN_ELENBUONAPER.AddToSortList(PFL_ELENBUONAPER_ANNOBUONO, true);
    PAN_ELENBUONAPER.AddToSortList(PFL_ELENBUONAPER_NUMEROBUONO, true);
    PAN_ELENBUONAPER.AddToSortList(PFL_ELENBUONAPER_PROGRESBUONO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENBUONAPER.Status() == 2)
    {
      int oldListQBE = PAN_ELENBUONAPER.iUseListQBE;
      PAN_ELENBUONAPER.iUseListQBE = 0;
      PAN_ELENBUONAPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENBUONAPER.PanelCommand(Glb.PCM_FIND);
      PAN_ELENBUONAPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELENBUONAPER) PAN_ELENBUONAPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_ELENBUONAPER) PAN_ELENBUONAPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_ELENBUONAPER) PAN_ELENBUONAPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELENBUONAPER) PAN_ELENBUONAPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENBUONAPER) PAN_ELENBUONAPER_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ELENBUONAPER) PAN_ELENBUONAPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
