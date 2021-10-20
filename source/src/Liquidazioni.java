// **********************************************
// Liquidazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Liquidazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_DELIBERA = 0;
  private static int PFL_PARAM_NUMERODEL = 1;
  private static int PFL_PARAM_ANNODEL = 2;
  private static int PFL_PARAM_PROPOSTA = 3;
  private static int PFL_PARAM_NUMEROPRO = 4;
  private static int PFL_PARAM_ANNOPRO = 5;
  private static int PFL_PARAM_DESCRIZIONE = 6;
  private static int PFL_PARAM_UFFICIO = 7;
  private static int PFL_PARAM_CAUSALE = 8;
  private static int PFL_PARAM_BOLLO = 9;
  private static int PFL_PARAM_SPESE = 10;
  private static int PFL_PARAM_COMMISSIONI = 11;
  private static int PFL_PARAM_SCADENZA = 12;
  private static int PFL_PARAM_INEMISSIONE = 13;
  private static int PFL_PARAM_ALLEGATI = 14;
  private static int PFL_PARAM_INFOTESORIER = 15;
  private static int PFL_PARAM_MOTIVESCLCIG = 16;
  private static int PFL_PARAM_TRATTIDELIBE = 17;
  private static int PFL_PARAM_BARRADELIBER = 18;
  private static int PFL_PARAM_TRATTIPROPOS = 19;
  private static int PFL_PARAM_BARRAPROPOST = 20;
  private static int PFL_PARAM_OK = 21;
  private static int PFL_PARAM_ANNULLA = 22;
  private static int PFL_PARAM_SELEZIDELIBE = 23;
  private static int PFL_PARAM_INFODELIBERE = 24;
  private static int PFL_PARAM_SELEZIPROPOS = 25;
  private static int PFL_PARAM_INFOPROPOSTE = 26;
  private static int PFL_PARAM_INFOALLEGATI = 27;
  private static int PFL_PARAM_INFOTESORIE1 = 28;

  private static int PPQRY_PARAM31 = 0;

  private static int PPQRY_T53 = 1;
  private static int PPQRY_T58 = 2;
  private static int PPQRY_T60 = 3;
  private static int PPQRY_TIPISPESMINF = 4;
  private static int PPQRY_ATTRIBUTIOPI = 5;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM19(IMDB);
    //
    //
    Init_PQRY_PARAM31(IMDB);
    Init_PQRY_PARAM31_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM19, 27);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM19, "TBL_PARAM19");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNPR1, "ROWNAMANNPR1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMPR1, "ROWNAMNUMPR1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMECAUSA,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEBOLLO,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMESCADE, "ROWNAMESCADE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMESCADE,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMESPESE,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMECOMMI,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEQUALI, "ROWNAMEQUALI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEQUALI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEINEMI, "ROWNAMEINEMI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEPROGR,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMCODDOC, "ROWNAMCODDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMCODDOC,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMDOC, "ROWNAMNUMDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMDATDOC, "ROWNAMDATDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMDATDOC,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNDOC, "ROWNAMANNDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMANNDOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMCODFOR, "ROWNAMCODFOR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMCODFOR,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEQUIET, "ROWNAMEQUIET");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_ROWNAMEQUIET,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM19,IMDBDef2.FLD_PARAM19_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM19, 0);
  }

  private static void Init_PQRY_PARAM31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM31, 17);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM31, "PQRY_PARAM31");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, "ROWNAMANNPR1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, "ROWNAMNUMPR1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMECAUSA,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEBOLLO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMESCADE, "ROWNAMESCADE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMESCADE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMESPESE,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMECOMMI,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEINEMI, "ROWNAMEINEMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_ROWNAMEINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31,IMDBDef10.PQSL_PARAM31_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM31, 0);
  }

  private static void Init_PQRY_PARAM31_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM31_RS, 17);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM31_RS, "PQRY_PARAM31_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, "ROWNAMANNPR1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, "ROWNAMNUMPR1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMECAUSA,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEBOLLO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMESCADE, "ROWNAMESCADE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMESCADE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMESPESE,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMECOMMI,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEINEMI, "ROWNAMEINEMI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_ROWNAMEINEMI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM31_RS,IMDBDef10.PQSL_PARAM31_MOTIVO_ESCLUSIONE_CIG,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Liquidazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public Liquidazioni()
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
    FormIdx = MyGlb.FRM_LIQUIDAZIONI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "35216362-9A94-4003-884B-FE8565F8CEB2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 716;
    DesignHeight = 374;
    set_Caption(new IDVariant("Liquidazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 716;
    Frames[1].Height = 348;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 716-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F084E51B-E48A-47DB-8652-849874195B87");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1888, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM19, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQUIDAZIONI_PARAM31();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SELEZIDELIBE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SELEZIPROPOS) {
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
    return (obj instanceof Liquidazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Liquidazioni.class.getName() : (Glb.ClassWithPackage(Liquidazioni.class) ? Liquidazioni.class.getName().substring(Liquidazioni.class.getPackage().getName().length() + 1) : Liquidazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OK
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SPESE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_COMMISSIONE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ALLEGATI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INFOTESO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NOFINANZIAME = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANTICIPAZION = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ULTIMALIQUID = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOMANDATO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NLIQUIDATE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SSTATOSIOPE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGE1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGE2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // OK Body
      // Procedure Body
      // 
      v_SPESE = (new IDVariant());
      v_COMMISSIONE = (new IDVariant());
      v_ALLEGATI = (new IDVariant());
      v_INFOTESO = (new IDVariant());
      v_STATOSIOPE = (new IDVariant());
      v_NOFINANZIAME = (new IDVariant());
      v_ANTICIPAZION = (new IDVariant());
      v_ULTIMALIQUID = (new IDVariant());
      v_NLIQUIDATE = (new IDVariant());
      if (IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMEINEMI, 0).equals((new IDVariant("SI")), true))
      {
        v_ANNOMANDATO = IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0);
      }
      else
      {
        v_ANNOMANDATO = (new IDVariant());
      }
      if (MainFrm.Licenza((new IDVariant("MIF"))))
      {
        v_SPESE = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMESPESE, 0);
        v_COMMISSIONE = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMECOMMI, 0);
        v_ALLEGATI = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMEALLEG, 0);
        v_INFOTESO = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMINFTES, 0);
      }
      else
      {
        v_SPESE = (new IDVariant());
        v_COMMISSIONE = (new IDVariant());
        v_ALLEGATI = (new IDVariant());
        v_INFOTESO = (new IDVariant());
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.LIQUIDAFATTURA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMNUMDOC, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMEDESCR, 0), IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMCODFOR, 0), IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMANNDOC, 0), IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEQUIET, 0), v_ANNOMANDATO, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMEUFFIC, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMECAUSA, 0), v_NLIQUIDATE, v_ULTIMALIQUID, IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEPROGR, 0), IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMEBOLLO, 0), v_ANTICIPAZION, v_NOFINANZIAME, v_COMMISSIONE, v_INFOTESO, v_SPESE, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMESCADE, 0), v_ALLEGATI, v_STATOSIOPE, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_MOTIVO_ESCLUSIONE_CIG, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      if (v_STATOSIOPE.equals((new IDVariant(1)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Attenzione: sono stati emesse liquidazioni senza Codice Gestionale.", IDVariant.STRING));
        IDVariant v_SMSLIV5 = new IDVariant(0,IDVariant.STRING);
        v_SMSLIV5 = (new IDVariant("Attenzione: sono stati emesse liquidazioni senza Codice Livello 5."));
        if (MainFrm.SIOPEATTIARM.booleanValue())
        {
          v_SSTATOSIOPE = new IDVariant(v_SMSLIV5);
        }
        else
        {
          v_SSTATOSIOPE = new IDVariant(v_SMS);
        }
      }
      else
      {
        v_SSTATOSIOPE = (new IDVariant(""));
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        if (v_ANTICIPAZION.compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant(" Sono presenti casi di anticipazione sui finanziamenti.", IDVariant.STRING));
          v_MESSAGE1 = new IDVariant(v_SMS);
        }
        else
        {
          v_MESSAGE1 = (new IDVariant(" "));
        }
        if (v_NOFINANZIAME.compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant(" Sono state emesse liquidazioni senza finanziamento.", IDVariant.STRING));
          v_MESSAGE2 = new IDVariant(v_SMS);
        }
        else
        {
          v_MESSAGE2 = (new IDVariant(" "));
        }
      }
      else
      {
        v_MESSAGE1 = (new IDVariant(" "));
        v_MESSAGE2 = (new IDVariant(" "));
      }
      if (v_NLIQUIDATE.equals((new IDVariant(1)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Emessa liquidazione numero ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(v_ULTIMALIQUID)), (new IDVariant("."))), v_MESSAGE1), v_MESSAGE2), v_SSTATOSIOPE)); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        if (v_NLIQUIDATE.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Nessuna liquidazione emessa. ", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
        else
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Emesse n° ", IDVariant.STRING));
          IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
          v_SMS1 = (new IDVariant(" liquidazioni. Dalla numero ", IDVariant.STRING));
          IDVariant v_SMS2 = new IDVariant(0,IDVariant.STRING);
          v_SMS2 = (new IDVariant(" alla numero ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(v_NLIQUIDATE)), v_SMS1), IDL.ToString(IDL.Add(IDL.Sub(v_ULTIMALIQUID, v_NLIQUIDATE), (new IDVariant(1))))), v_SMS2), IDL.ToString(v_ULTIMALIQUID)), v_MESSAGE1), v_MESSAGE2), v_SSTATOSIOPE)); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Allegati
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoAllegati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Allegati", IDVariant.STRING));
      // 
      // Info Allegati Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEQUALI, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMEALLEG, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "InfoAllegati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Tesoriere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoTesoriere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Tesoriere", IDVariant.STRING));
      // 
      // Info Tesoriere Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEQUALI, 0, (new IDVariant(2)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMINFTES, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "InfoTesoriere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
      // 
      // Param On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0))))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0));
        v_NUMERODEL = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0, new IDVariant(v_ANNODEL));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0))))
      {
        IDVariant v_PROPOSTA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMEROPRO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNOPRO = new IDVariant(0,IDVariant.INTEGER);
        v_PROPOSTA = IDL.Upper(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0));
        v_NUMEROPRO = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0);
        v_ANNOPRO = IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0);
        MainFrm.ControlloProposte(v_PROPOSTA, v_ANNOPRO, v_NUMEROPRO);
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0, new IDVariant(v_PROPOSTA));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0, new IDVariant(v_NUMEROPRO));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0, new IDVariant(v_ANNOPRO));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "ParamOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "ParamOnDynamicPropertiesEvent", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEUFFIC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      if (!(MainFrm.Licenza((new IDVariant("MIF")))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        IDVariant v_VMIN = null;
        v_VMIN = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.CODICE) as MINTIPSPMICO ");
        SQL.append("from ");
        SQL.append("  TIPI_SPESA_MINF A ");
        SQL.append("where (A.DEFAULT_S = 'SI') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VMIN = QV.Get("MINTIPSPMICO", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMESPESE, 0, new IDVariant(v_VMIN));
        IMDB.set_Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMESPESE, 0, new IDVariant(v_VMIN));
        if (MainFrm.GESTIOALLEGA.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTINFOTESO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOCOMMIS.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIONSPESE.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMNUMPR1, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMANNPR1, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue() && IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEQUALI, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMEALLEG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue() && IMDB.Value(IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEQUALI, 0).equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAM31, IMDBDef10.PQSL_PARAM31_ROWNAMINFTES, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Liquidazioni", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void LIQUIDAZIONI_PARAM31() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM31_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM19, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM19, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM31_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM31_RS, 0, IMDBDef2.TBL_PARAM19, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 0, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 1, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 2, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 3, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMANNPR1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 4, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMNUMPR1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 5, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 6, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 7, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 8, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 9, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 10, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMESCADE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 11, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMESPESE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 12, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMECOMMI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 13, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEALLEG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 14, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMINFTES, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 15, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_ROWNAMEINEMI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM31_RS, 16, 0, IMDBDef2.TBL_PARAM19, IMDBDef2.FLD_PARAM19_MOTIVO_ESCLUSIONE_CIG, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM19, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM19, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM19, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM31_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_OK)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SELEZIDELIBE)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFODELIBERE)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SELEZIPROPOS)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOPROPOSTE)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOALLEGATI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAllegati();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOTESORIE1)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoTesoriere();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "382FEDCF-04FC-4FCD-B083-8AF0AEA1E9F7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "Delibera");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, "DC9AF8E6-367F-4A84-8797-F3C22188F74D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, "Numero Del");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, "18059DD9-A2A9-4273-B7D3-340B4749746C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, "Anno Del");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "852DC9C1-A759-45B3-ADEE-11B64256E328");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, "31D3D382-FA61-4F4D-AA5A-F4482920DDA1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, "Numero Pro");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, "C8EA51BB-6827-499B-A31A-DD76E973ED11");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, "Anno Pro");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "7961FC42-BF70-4BE1-BF19-F357E6A88E4E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "Descrizione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, "721347CF-30EA-4040-A53E-E960AF948D2F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, "Ufficio");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "53586570-8F8C-4457-A83A-3F7D9961406C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "Causale");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, "5405AD71-E201-44BF-925C-7BDF4C6148F7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, "Bollo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, "A8496C84-3525-4D27-83D9-33804B129A1A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, "Spese");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, "E725FA38-431C-4E95-8C61-748533DD3FC7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, "Commissioni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, "AB464690-3497-42DE-B20E-1509F1F6C4E2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, "Scadenza");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, "86487D86-C86E-42BD-B8D6-7402332C3162");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, "In emissione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, "4E1C8067-6F95-4A1F-9570-DB6A7656DEAA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, "Allegati");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, "5E35505D-F99A-44D0-ACB2-87C0C8573570");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, "Info Tesoriere");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, "588C3DDF-BE67-4152-9E6E-985A2A9D9894");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, "Esclusione Cig");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, "272D680A-78D2-46AC-A739-DC9A25819EEB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, "C286850E-667D-4EEE-AF41-790C5A42D5B9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, "B27CD7EF-C5F1-41C4-9E86-4828EBF58E81");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, "C4CFEF70-CCD9-4385-AF20-262822F14AAF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "14D2EDE2-B3E2-44E4-B46A-549DBD2327AA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "OK");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, "F08F3876-08CF-4748-89DB-2681649A72CA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, "Annulla");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, "1793A840-758F-4F1A-A3A6-B220A039444C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, "5574346C-5BDD-4C84-80BB-5D2EC1D5C873");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, "2C1A7E96-DFF7-4A9D-B04E-EAE157251EAE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, "88903591-CB90-457F-BD53-72ECA2165C24");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, "FB041B57-04D8-4288-B0FF-F5E27CD1194B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, 0, "nota scritta.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, "712836DA-A0C9-49C4-AA87-FC8781992191");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, 0, "nota scritta.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 32, 16, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DELIBERA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DELIBERA, PPQRY_PARAM31, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_LIST, "Num. Del");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, 164, 16, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMERODEL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMERODEL, PPQRY_PARAM31, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_LIST, "Anno Del");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, 228, 16, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODEL, MyGlb.PANEL_FORM, "Anno Del");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNODEL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNODEL, PPQRY_PARAM31, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, "Prop.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 304, 16, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROPOSTA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROPOSTA, PPQRY_PARAM31, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_LIST, "Num. Pro");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_FORM, 500, 16, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPRO, MyGlb.PANEL_FORM, "Numero Pro");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMEROPRO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMEROPRO, PPQRY_PARAM31, "A.ROWNAMNUMPR1", "ROWNAMNUMPR1", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_LIST, "Anno Pro");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_FORM, 568, 16, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPRO, MyGlb.PANEL_FORM, "Anno Pro");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOPRO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOPRO, PPQRY_PARAM31, "A.ROWNAMANNPR1", "ROWNAMANNPR1", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 252, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 16, 40, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESCRIZIONE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESCRIZIONE, PPQRY_PARAM31, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, 40, 64, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAM.SetFieldPage(PFL_PARAM_UFFICIO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_UFFICIO, PPQRY_PARAM31, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 32, 88, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CAUSALE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CAUSALE, PPQRY_PARAM31, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, 36, 112, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_BOLLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BOLLO, PPQRY_PARAM31, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, 48, 136, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SPESE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SPESE, PPQRY_PARAM31, "A.ROWNAMESPESE", "ROWNAMESPESE", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_LIST, "Commis.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, 408, 136, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARAM.SetFieldPage(PFL_PARAM_COMMISSIONI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_COMMISSIONI, PPQRY_PARAM31, "A.ROWNAMECOMMI", "ROWNAMECOMMI", 1, 10, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_LIST, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_FORM, 28, 160, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCADENZA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCADENZA, PPQRY_PARAM31, "A.ROWNAMESCADE", "ROWNAMESCADE", 6, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_LIST, "In emissione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, 496, 160, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INEMISSIONE, MyGlb.PANEL_FORM, "In emissione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_INEMISSIONE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INEMISSIONE, PPQRY_PARAM31, "A.ROWNAMEINEMI", "ROWNAMEINEMI", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_INEMISSIONE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, 36, 184, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ALLEGATI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ALLEGATI, PPQRY_PARAM31, "A.ROWNAMEALLEG", "ROWNAMEALLEG", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, 4, 208, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOTESORIER, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOTESORIER, PPQRY_PARAM31, "A.ROWNAMINFTES", "ROWNAMINFTES", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_LIST, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_LIST, "Esclusione Cig");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_FORM, 4, 232, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MOTIVESCLCIG, MyGlb.PANEL_FORM, "Esclusione Cig");
    PAN_PARAM.SetFieldPage(PFL_PARAM_MOTIVESCLCIG, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_MOTIVESCLCIG, PPQRY_PARAM31, "A.MOTIVO_ESCLUSIONE_CIG", "MOTIVO_ESCLUSIONE_CIG", 5, 50, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_LIST, 116, 16, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_FORM, 144, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TRATTIDELIBE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_LIST, 124, 24, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_FORM, 212, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARRADELIBER, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_LIST, 124, 24, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_FORM, 480, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TRATTIPROPOS, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_LIST, 132, 32, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_FORM, 548, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARRAPROPOST, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 172, 196, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 432, 268, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_OK, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 180, 204, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 520, 268, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNULLA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_LIST, 248, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_FORM, 264, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SELEZIDELIBE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SELEZIDELIBE, -1, "", "SELEZIDELIBE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_LIST, 256, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_FORM, 284, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFODELIBERE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFODELIBERE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFODELIBERE, -1, "", "INFODELIBERE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_LIST, 256, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_FORM, 604, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SELEZIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SELEZIPROPOS, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SELEZIPROPOS, -1, "", "SELEZIPROPOS", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, MyGlb.PANEL_LIST, 264, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, MyGlb.PANEL_FORM, 624, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPROPOSTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOPROPOSTE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOPROPOSTE, -1, "", "INFOPROPOSTE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_LIST, 264, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_FORM, 604, 188, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOALLEGATI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOALLEGATI, -1, "", "INFOALLEGATI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_LIST, 272, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_FORM, 604, 212, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTESORIE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOTESORIE1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOTESORIE1, -1, "", "INFOTESORIE1", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAM_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAM_UFFICIO, "");
    PAN_PARAM.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECAUSA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAM_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAM_CAUSALE, "");
    PAN_PARAM.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAM_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAM_BOLLO, "");
    PAN_PARAM.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~ROWNAMESPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARAM_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARAM_SPESE, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_PARAM.SetQuery(PPQRY_ATTRIBUTIOPI, 0, SQL, PFL_PARAM_MOTIVESCLCIG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_ATTRIBUTIOPI, 1, SQL, PFL_PARAM_MOTIVESCLCIG, "");
    PAN_PARAM.SetQueryDB(PPQRY_ATTRIBUTIOPI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM31", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM31, IMDBDef10.PQRY_PARAM31_RS, IMDBDef2.TBL_PARAM19);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DELIBERA, IMDBDef2.FLD_PARAM19_ROWNAMSEDDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMERODEL, IMDBDef2.FLD_PARAM19_ROWNAMNUMDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNODEL, IMDBDef2.FLD_PARAM19_ROWNAMANNDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROPOSTA, IMDBDef2.FLD_PARAM19_ROWNAMUNIPRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMEROPRO, IMDBDef2.FLD_PARAM19_ROWNAMNUMPR1);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOPRO, IMDBDef2.FLD_PARAM19_ROWNAMANNPR1);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DESCRIZIONE, IMDBDef2.FLD_PARAM19_ROWNAMEDESCR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_UFFICIO, IMDBDef2.FLD_PARAM19_ROWNAMEUFFIC);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CAUSALE, IMDBDef2.FLD_PARAM19_ROWNAMECAUSA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_BOLLO, IMDBDef2.FLD_PARAM19_ROWNAMEBOLLO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SPESE, IMDBDef2.FLD_PARAM19_ROWNAMESPESE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_COMMISSIONI, IMDBDef2.FLD_PARAM19_ROWNAMECOMMI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SCADENZA, IMDBDef2.FLD_PARAM19_ROWNAMESCADE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_INEMISSIONE, IMDBDef2.FLD_PARAM19_ROWNAMEINEMI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ALLEGATI, IMDBDef2.FLD_PARAM19_ROWNAMEALLEG);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_INFOTESORIER, IMDBDef2.FLD_PARAM19_ROWNAMINFTES);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_MOTIVESCLCIG, IMDBDef2.FLD_PARAM19_MOTIVO_ESCLUSIONE_CIG);
    PAN_PARAM.SetMasterTable(0, "PARAM19");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
